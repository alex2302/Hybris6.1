/*****************************************************************************
    Class:    DefaultSapOaaCommerceUpdateCartEntryStrategy
    Copyright (c) 2015, SAP SE, Germany, All rights reserved.

 *****************************************************************************/
package com.sap.retail.oaa.commerce.services.order.impl;

import de.hybris.platform.commerceservices.order.impl.DefaultCommerceUpdateCartEntryStrategy;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.storelocator.model.PointOfServiceModel;

import org.apache.log4j.Logger;

import com.sap.retail.oaa.commerce.services.order.SapOaaCartAdjustmentStrategy;


/**
 * Update Cart Entry Strategy for Omni Channel Availability. Check Allowed quantity on cart update
 */
public class DefaultSapOaaCommerceUpdateCartEntryStrategy extends DefaultCommerceUpdateCartEntryStrategy
{
	private static final Logger LOG = Logger.getLogger(DefaultSapOaaCommerceUpdateCartEntryStrategy.class);

	private SapOaaCartAdjustmentStrategy oaaCartAdjustmentStrategy;

	@Override
	protected long getAllowedCartAdjustmentForProduct(final CartModel cartModel, final ProductModel productModel,
			final long quantityToAdd, final PointOfServiceModel pointOfServiceModel)
	{
		LOG.debug("Get allowed Cart Adjustment for Product: " + productModel.getCode()
				+ " according SapOaaCartAdjustmenStrategy...");

		final long cartLevel = super.checkCartLevel(productModel, cartModel, pointOfServiceModel);

		return oaaCartAdjustmentStrategy.determineAllowedCartAdjustmentForProduct(cartModel, productModel, quantityToAdd,
				cartLevel, pointOfServiceModel).longValue();
	}

	/**
	 * @param oaaCartAdjustmentStrategy
	 *           the oaaCartAdjustmentStrategy to set
	 */
	public void setOaaCartAdjustmentStrategy(final SapOaaCartAdjustmentStrategy oaaCartAdjustmentStrategy)
	{
		this.oaaCartAdjustmentStrategy = oaaCartAdjustmentStrategy;
	}

	/**
	 * @return the oaaCartAdjustmentStrategy
	 */
	protected SapOaaCartAdjustmentStrategy getOaaCartAdjustmentStrategy()
	{
		return oaaCartAdjustmentStrategy;
	}
}
