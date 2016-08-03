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
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;


/**
 * If B2B customer has changes regarding name, title or session language trigger export of customer to Data Hub
 */
public class DefaultB2BCustomerAddressInterceptor implements ValidateInterceptor<AddressModel>
{
	private B2BCustomerExportService b2bCustomerExportService;
	private DefaultStoreSessionFacade storeSessionFacade;

	@Override
	public void onValidate(final AddressModel addressModel, final InterceptorContext ctx) throws InterceptorException
	{
		B2BCustomerModel b2bCustomerModel = null;

		//get the customer related to the address
		final ItemModel owner = addressModel.getOwner();
		if (owner instanceof B2BCustomerModel)
		{
			b2bCustomerModel = (B2BCustomerModel) owner;

			// check if customer if is null or empty
			if (b2bCustomerModel.getCustomerID() == null || b2bCustomerModel.getCustomerID().isEmpty())
			{
				return;
			}
			// check if either name, title or sessionLanguage is modified

			if (b2bCustomerModel.getDefaultShipmentAddress() != null
					&& ctx.isModified(b2bCustomerModel.getDefaultShipmentAddress(), AddressModel.PHONE1))
			{
				final String sessionLanguage = getStoreSessionFacade().getCurrentLanguage() != null
						? getStoreSessionFacade().getCurrentLanguage().getIsocode() : "en";
				getB2bCustomerExportService().prepareAndSend(b2bCustomerModel, sessionLanguage);
			}
		}
	}

	public DefaultStoreSessionFacade getStoreSessionFacade()
	{
		return storeSessionFacade;
	}

	public void setStoreSessionFacade(final DefaultStoreSessionFacade storeSessionFacade)
	{
		this.storeSessionFacade = storeSessionFacade;
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
