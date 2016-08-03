/*****************************************************************************
    Class:        DefaultSourcingRequestMapper
    Copyright (c) 2015, SAP SE, Germany, All rights reserved.

 *****************************************************************************/
package com.sap.retail.oaa.commerce.services.sourcing.impl;

import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.order.delivery.DeliveryModeModel;
import de.hybris.platform.jalo.order.delivery.DeliveryMode;
import de.hybris.platform.sap.core.configuration.ConfigurationPropertyAccess;
import de.hybris.platform.sap.core.configuration.SAPConfigurationService;
import de.hybris.platform.sap.sapmodel.jalo.SAPDeliveryMode;

import java.util.Collection;

import org.apache.commons.codec.DecoderException;

import com.sap.retail.oaa.commerce.services.common.jaxb.pojos.request.CartItem;
import com.sap.retail.oaa.commerce.services.common.jaxb.pojos.request.CartItems;
import com.sap.retail.oaa.commerce.services.common.util.ServiceUtils;
import com.sap.retail.oaa.commerce.services.constants.SapoaacommerceservicesConstants;
import com.sap.retail.oaa.commerce.services.sourcing.SourcingRequestMapper;
import com.sap.retail.oaa.commerce.services.sourcing.exception.SourcingException;
import com.sap.retail.oaa.commerce.services.sourcing.jaxb.pojos.request.CartRequest;
import com.sap.retail.oaa.commerce.services.sourcing.jaxb.pojos.request.DeliveryAddressRequest;
import com.sap.retail.oaa.commerce.services.sourcing.jaxb.pojos.request.SourcingAbapRequest;
import com.sap.retail.oaa.commerce.services.sourcing.jaxb.pojos.request.SourcingRequest;
import com.sap.retail.oaa.commerce.services.sourcing.jaxb.pojos.request.Values;
import com.sap.retail.oaa.model.constants.SapoaamodelConstants;


/**
 * DefaultcartToSourcingRequestMapper
 */
public class DefaultSourcingRequestMapper implements SourcingRequestMapper
{
	/** ABAP true flag */
	private static final String ABAP_TRUE = "X";
	/** SAP delivery modes configuration property */
	private static final String CONFIG_PROPERTY_SAP_DELIVERY_MODES = "sapDeliveryModes";
	/** SAP access delivery mode configuration property */
	private static final String CONFIG_PROPERTY_ACCESS_DELIVERY_MODE = "deliveryMode";

	private SAPConfigurationService sapCoreConfigurationService;
	private ServiceUtils serviceUtils;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.sap.retail.oaa.commerce.services.sourcing.CartToSourcingRequestMapper#mapCartToSourcingRequest(de.hybris.
	 * platform .core.model.order.CartModel)
	 */
	@Override
	public SourcingAbapRequest mapCartToSourcingRequest(final AbstractOrderModel cartModel, final boolean execAllStrategies)
			throws SourcingException
	{
		final SourcingAbapRequest abap = new SourcingAbapRequest();
		final Values values = new Values();
		final SourcingRequest sourcing = new SourcingRequest();
		final CartRequest cart = new CartRequest();

		sourcing.setConsumerId((String) sapCoreConfigurationService.getProperty(SapoaamodelConstants.PROPERTY_SAPOAA_CONSUMERID));
		sourcing.setOaaProfileId((String) sapCoreConfigurationService.getProperty(SapoaamodelConstants.PROPERTY_SAPOAA_OAAPROFILE));
		sourcing.setReservationStatus(SapoaacommerceservicesConstants.RESERVATION_STATUS_CART);
		if (execAllStrategies)
		{
			sourcing.setExecAllStrategies(ABAP_TRUE);
		}

		if (sourcing.getConsumerId() == null || sourcing.getOaaProfileId() == null)
		{
			throw new SourcingException("Oaa Consumer Id or Oaa Profile are not maintained");
		}

		try
		{
			cart.setExternalId(serviceUtils.convertGuidToBase64(cartModel.getGuid()));
		}
		catch (final DecoderException e)
		{
			throw new SourcingException(e);
		}

		cart.setShippingMethod(convertHybrisDelModeToSapShippingMethod(cartModel.getDeliveryMode()));
		cart.setTotalPrice(cartModel.getTotalPrice());
		cart.setDeliveryCost(cartModel.getDeliveryCost());
		cart.setCurrencyIsoCode(cartModel.getCurrency().getIsocode());
		cart.setItems(setAllCartItems(cartModel));

		if (cartModel.getDeliveryAddress() != null)
		{
			final DeliveryAddressRequest deliveryAddress = new DeliveryAddressRequest();
			deliveryAddress.setCountry(cartModel.getDeliveryAddress().getCountry().getSapCode());
			deliveryAddress.setCity2(cartModel.getDeliveryAddress().getDistrict());
			deliveryAddress.setPoBox(cartModel.getDeliveryAddress().getPobox());
			deliveryAddress.setPostCode1(cartModel.getDeliveryAddress().getPostalcode());
			if (cartModel.getDeliveryAddress().getRegion() != null)
			{
				deliveryAddress.setRegion(cartModel.getDeliveryAddress().getRegion().getIsocodeShort());
			}
			deliveryAddress.setStreet(cartModel.getDeliveryAddress().getStreetname());
			deliveryAddress.setHouseNum1(cartModel.getDeliveryAddress().getStreetnumber());
			deliveryAddress.setCity1(cartModel.getDeliveryAddress().getTown());

			cart.setDeliveryAddress(deliveryAddress);
		}
		sourcing.setCart(cart);
		values.setSourcing(sourcing);
		abap.setValues(values);

		return abap;
	}

	/**
	 * @param serviceUtils
	 *           the serviceUtils to set
	 */
	public void setServiceUtils(final ServiceUtils serviceUtils)
	{
		this.serviceUtils = serviceUtils;
	}

	/**
	 * @return the serviceUtils
	 */
	protected ServiceUtils getServiceUtils()
	{
		return serviceUtils;
	}

	/**
	 * @param sapCoreConfigurationService
	 *           the sapCoreConfigurationService to set
	 */
	public void setSapCoreConfigurationService(final SAPConfigurationService sapCoreConfigurationService)
	{
		this.sapCoreConfigurationService = sapCoreConfigurationService;
	}

	/**
	 * @return the sapCoreConfigurationService
	 */
	protected SAPConfigurationService getSapCoreConfigurationService()
	{
		return sapCoreConfigurationService;
	}

	/**
	 * Converts an hybris delivery mode into a SAP shipping condition
	 *
	 * @param deliveryMode
	 * @return the code for the sap shipping condition
	 */
	protected String convertHybrisDelModeToSapShippingMethod(final DeliveryModeModel deliveryMode)
	{

		final Collection<ConfigurationPropertyAccess> collection = sapCoreConfigurationService
				.getPropertyAccessCollection(CONFIG_PROPERTY_SAP_DELIVERY_MODES);

		for (final ConfigurationPropertyAccess configurationPropertyAccess : collection)
		{
			final ConfigurationPropertyAccess hybrisDeliveryMode = configurationPropertyAccess
					.getPropertyAccess(CONFIG_PROPERTY_ACCESS_DELIVERY_MODE);
			final String hybrisDeliveryModeCode = hybrisDeliveryMode.getProperty(DeliveryMode.CODE);

			if (deliveryMode.getCode().equals(hybrisDeliveryModeCode))
			{
				return configurationPropertyAccess.getProperty(SAPDeliveryMode.DELIVERYVALUE);
			}
		}
		return null;
	}

	/**
	 * Maps CartModel to CartItems.
	 *
	 * @param cartModel
	 * @return CartItems
	 */
	private CartItems setAllCartItems(final AbstractOrderModel cartModel)
	{
		final CartItems cartItems = new CartItems();
		for (final AbstractOrderEntryModel entryModel : cartModel.getEntries())
		{
			final CartItem cartItem = new CartItem();
			cartItem.setArticleId(entryModel.getProduct().getCode());
			cartItem
					.setExternalId(serviceUtils.createExternalIdForItem(entryModel.getEntryNumber().toString(), cartModel.getGuid()));
			cartItem.setQuantity(entryModel.getQuantity().toString());
			cartItem.setUnitIso(entryModel.getUnit().getCode().substring(0, 2)); //Only 3 letter iso code
			cartItem.setUnit(entryModel.getUnit().getSapCode());
			cartItem.setItemTotalPrice(entryModel.getTotalPrice());
			cartItem.setCurrencyIsoCode(cartModel.getCurrency().getIsocode());

			//Set source in case of click and collect
			if (entryModel.getDeliveryPointOfService() != null)
			{
				cartItem.setSource(entryModel.getDeliveryPointOfService().getName());
				cartItem.setSourcePreselected(ABAP_TRUE);
			}
			cartItems.addItem(cartItem);
		}
		return cartItems;
	}
}
