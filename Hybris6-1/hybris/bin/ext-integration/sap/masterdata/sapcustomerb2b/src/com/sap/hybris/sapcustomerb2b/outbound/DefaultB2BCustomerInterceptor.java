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

import de.hybris.platform.b2b.model.B2BCustomerModel;
import de.hybris.platform.commercefacades.storesession.impl.DefaultStoreSessionFacade;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.sap.core.configuration.model.SAPConfigurationModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import de.hybris.platform.servicelayer.keygenerator.impl.PersistentKeyGenerator;
import de.hybris.platform.store.BaseStoreModel;
import de.hybris.platform.store.services.BaseStoreService;

import org.apache.log4j.Logger;


/**
 * If B2B customer has changes regarding name, title or session language trigger export of customer to Data Hub
 */
public class DefaultB2BCustomerInterceptor implements ValidateInterceptor<B2BCustomerModel>
{
	private static final Logger LOGGER = Logger
			.getLogger(com.sap.hybris.sapcustomerb2b.outbound.DefaultB2BCustomerInterceptor.class.getName());
	private B2BCustomerExportService b2bCustomerExportService;
	private BaseStoreService baseStoreService;
	private PersistentKeyGenerator sapContactIdGenerator;
	private DefaultStoreSessionFacade storeSessionFacade;

	@Override
	public void onValidate(final B2BCustomerModel customerModel, final InterceptorContext ctx) throws InterceptorException
	{
		// only if replication of user is requested start publishing to Data Hub process
		final BaseStoreModel basestore = getBaseStoreService().getCurrentBaseStore();
		final SAPConfigurationModel sapConfigurationModel = (basestore != null) ? basestore.getSAPConfiguration() : null;
		final boolean replicateb2bCustomer = (sapConfigurationModel != null) ? sapConfigurationModel.getReplicateregisteredb2buser()
				: false;
		if (replicateb2bCustomer)
		{
			// Send the changes to The Data Hub only when the change is done from store front or back office . Do not send the changes when SAP to Hybris push happens
			// !ctx.isModified(customerModel, "sapIsReplicated") is added to avoid sending the changes to The Data Hub when SAP changes are pushed to hybris
			if ((customerModel instanceof B2BCustomerModel) && !ctx.isNew(customerModel)
					&& !ctx.isModified(customerModel, "sapIsReplicated"))
			{
				LOGGER.debug("Sending Modified contact details to datahub...");
				if (ctx.isModified(customerModel, CustomerModel.NAME) || ctx.isModified(customerModel, CustomerModel.TITLE)
						|| ctx.isModified(customerModel, CustomerModel.UID)
						|| ctx.isModified(customerModel, CustomerModel.DEFAULTSHIPMENTADDRESS))
				{
					final String sessionLanguage = getStoreSessionFacade().getCurrentLanguage() != null
							? getStoreSessionFacade().getCurrentLanguage().getIsocode() : "en";
					getB2bCustomerExportService().prepareAndSend(customerModel, sessionLanguage);
				}
			}
		}
		else if (LOGGER.isDebugEnabled())
		{
			LOGGER.debug("Customer " + customerModel.getUid() + " was not send to Data Hub.");
			LOGGER.debug("Customer Default shipment address modified =  "
					+ ctx.isModified(customerModel, CustomerModel.DEFAULTSHIPMENTADDRESS));
			LOGGER.debug("Customer name modified = " + ctx.isModified(customerModel, CustomerModel.NAME));
			LOGGER.debug("Customer title modified = " + ctx.isModified(customerModel, CustomerModel.TITLE));
			LOGGER.debug("Customer sapContactId =  " + customerModel.getSapContactID());
		}
	}

	protected void generateCustomerId(final B2BCustomerModel customerModel)
	{
		customerModel.setCustomerID((String) getSapContactIdGenerator().generate());
	}

	public PersistentKeyGenerator getSapContactIdGenerator()
	{
		return sapContactIdGenerator;
	}

	public void setSapContactIdGenerator(final PersistentKeyGenerator sapContactIdGenerator)
	{
		this.sapContactIdGenerator = sapContactIdGenerator;
	}

	public DefaultStoreSessionFacade getStoreSessionFacade()
	{
		return storeSessionFacade;
	}

	public void setStoreSessionFacade(final DefaultStoreSessionFacade storeSessionFacade)
	{
		this.storeSessionFacade = storeSessionFacade;
	}

	public BaseStoreService getBaseStoreService()
	{
		return baseStoreService;
	}

	public void setBaseStoreService(final BaseStoreService baseStoreService)
	{
		this.baseStoreService = baseStoreService;
	}

	public B2BCustomerExportService getB2bCustomerExportService()
	{
		return b2bCustomerExportService;
	}

	public void setB2bCustomerExportService(final B2BCustomerExportService b2bCustomerExportService)
	{
		this.b2bCustomerExportService = b2bCustomerExportService;
	}
}
