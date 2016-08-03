/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE or an SAP affiliate company.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package com.sap.hybris.sapcustomerb2b.outbound;

import static com.sap.hybris.sapcustomerb2b.CustomerB2BConstantsUtils.CUSTOMER_ID;
import static com.sap.hybris.sapcustomerb2b.CustomerB2BConstantsUtils.SESSION_LANGUAGE;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.b2b.model.B2BCustomerModel;
import de.hybris.platform.commercefacades.storesession.impl.DefaultStoreSessionFacade;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.sap.core.configuration.global.impl.SAPGlobalConfigurationServiceImpl;
import de.hybris.platform.sap.core.configuration.model.SAPConfigurationModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.store.BaseStoreModel;
import de.hybris.platform.store.services.BaseStoreService;
import de.hybris.platform.store.services.impl.DefaultBaseStoreService;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


/**
 * JUnit Test for class DefaultCustomerInterceptor check if the CustomerExportService will only be called in a specific
 * situation.
 *
 */
@UnitTest
public class DefaultB2BCustomerInterceptorTest
{
	@InjectMocks
	private final DefaultB2BCustomerInterceptor defaultCustomerInterceptor = new DefaultB2BCustomerInterceptor();

	@Mock
	private final B2BCustomerModel b2bCustomerModel = mock(B2BCustomerModel.class);
	@Mock
	private final InterceptorContext ctx = mock(InterceptorContext.class);

	final DefaultB2BCustomerInterceptor spyDefaultB2BCustomerInterceptor = spy(defaultCustomerInterceptor);

	final DefaultBaseStoreService defaultBaseStoreService = mock(DefaultBaseStoreService.class);

	@Mock
	final DefaultStoreSessionFacade storeSessionFacade = mock(DefaultStoreSessionFacade.class);


	@Mock
	private final B2BCustomerExportService b2bCustomerExportService = mock(B2BCustomerExportService.class);

	public static final String REPLICATEREGISTEREDB2BUSER = "replicateregisteredb2buser";



	@Before
	public void setUp() throws Exception
	{
		MockitoAnnotations.initMocks(this);


		// given
		final SAPGlobalConfigurationServiceImpl sapCoreSAPGlobalConfigurationService = mock(
				SAPGlobalConfigurationServiceImpl.class);

		given(sapCoreSAPGlobalConfigurationService.getProperty(REPLICATEREGISTEREDB2BUSER)).willReturn(false);

		defaultCustomerInterceptor.setB2bCustomerExportService(b2bCustomerExportService);

		final BaseStoreService baseStoreService = mock(BaseStoreService.class);
		defaultCustomerInterceptor.setBaseStoreService(baseStoreService);

		final BaseStoreModel currentBaseStore = mock(BaseStoreModel.class);
		given(baseStoreService.getCurrentBaseStore()).willReturn(currentBaseStore);

		final SAPConfigurationModel configurationModel = mock(SAPConfigurationModel.class);
		given(currentBaseStore.getSAPConfiguration()).willReturn(configurationModel);
		given(currentBaseStore.getSAPConfiguration().getReplicateregisteredb2buser()).willReturn(Boolean.TRUE);

	}

	/**
	 * Check if the interceptor call the customerExportService exactly one time
	 * <ul>
	 * <li>REPLICATEREGISTEREDUSER is set to true</li>
	 * <li>defaultShipmentAddress is not null</li>
	 * <li>defaultShipmentAddress modified</li>
	 * </ul>
	 *
	 * @throws InterceptorException
	 */
	@Test
	public void testExportData() throws InterceptorException
	{
		// given
		given(b2bCustomerModel.getCustomerID()).willReturn(CUSTOMER_ID);
		final String sessionLanguage = SESSION_LANGUAGE;
		final LanguageModel languageModel = mock(LanguageModel.class);
		given(b2bCustomerModel.getSessionLanguage()).willReturn(languageModel);
		given(ctx.isModified(b2bCustomerModel, CustomerModel.SESSIONLANGUAGE)).willReturn(true);
		defaultCustomerInterceptor.setB2bCustomerExportService(b2bCustomerExportService);

		given(ctx.isModified(b2bCustomerModel, CustomerModel.UID)).willReturn(true);

		// when
		defaultCustomerInterceptor.onValidate(b2bCustomerModel, ctx);

		// then

		verify(b2bCustomerExportService, times(1)).prepareAndSend(b2bCustomerModel, "en");

	}

	/**
	 * Check if the interceptor call the customerExportService
	 * <ul>
	 * <li>sapContactID is not null</li>
	 * </ul>
	 *
	 * @throws InterceptorException
	 */
	@Test
	public void testExportCustomerIDNotNull() throws InterceptorException
	{
		// given
		given(b2bCustomerModel.getCustomerID()).willReturn(CUSTOMER_ID);

		given(ctx.isModified(b2bCustomerModel, CustomerModel.TITLE)).willReturn(true);
		given(ctx.isModified(b2bCustomerModel, CustomerModel.SAPISREPLICATED)).willReturn(false);
		given(ctx.isModified(b2bCustomerModel, CustomerModel.UID)).willReturn(true);
		defaultCustomerInterceptor.setB2bCustomerExportService(b2bCustomerExportService);


		// when
		defaultCustomerInterceptor.onValidate(b2bCustomerModel, ctx);


		verify(b2bCustomerExportService, times(1)).prepareAndSend(b2bCustomerModel, "en");

	}

	/**
	 * Check if the interceptor call the customerExportService
	 * <ul>
	 * <li>title is modified</li>
	 * </ul>
	 *
	 * @throws InterceptorException
	 */
	@Test
	public void testExportTitleModified() throws InterceptorException
	{
		// given
		given(ctx.isModified(b2bCustomerModel, CustomerModel.SAPISREPLICATED)).willReturn(false);
		given(ctx.isModified(b2bCustomerModel, CustomerModel.TITLE)).willReturn(true);
		// when
		defaultCustomerInterceptor.onValidate(b2bCustomerModel, ctx);
		// then
		verify(ctx, times(1)).isModified(b2bCustomerModel, CustomerModel.TITLE);
		verify(b2bCustomerExportService, times(1)).prepareAndSend(b2bCustomerModel, "en");
	}


	/**
	 * Check if the interceptor call the customerExportService
	 * <ul>
	 * <li>name is modified</li>
	 * </ul>
	 *
	 * @throws InterceptorException
	 */
	@Test
	public void testExportNameModified() throws InterceptorException
	{
		// given
		given(ctx.isModified(b2bCustomerModel, CustomerModel.SAPISREPLICATED)).willReturn(false);
		given(ctx.isModified(b2bCustomerModel, CustomerModel.NAME)).willReturn(true);
		defaultCustomerInterceptor.setB2bCustomerExportService(b2bCustomerExportService);
		// when
		defaultCustomerInterceptor.onValidate(b2bCustomerModel, ctx);
		// then
		verify(ctx, times(1)).isModified(b2bCustomerModel, CustomerModel.NAME);
		verify(b2bCustomerExportService, times(1)).prepareAndSend(b2bCustomerModel, "en");
	}
}
