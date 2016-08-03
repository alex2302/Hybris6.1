/*****************************************************************************
    Inerface:    SapOaaCartAdjustmentStrategy
    Copyright (c) 2015, SAP SE, Germany, All rights reserved.

 *****************************************************************************/
package com.sap.retail.oaa.commerce.services.order;

import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.storelocator.model.PointOfServiceModel;


/**
 * Cart Adjustment Strategy for Omni Channel Availability
 */
public interface SapOaaCartAdjustmentStrategy
{

	/**
	 * Get allowed cart adjustment for product considering aggregated stock availability
	 *
	 * @param cartModel
	 * @param productModel
	 * @param quantityToAdd
	 * @param cartItemQty
	 * @param pointOfServiceModel
	 * @return new total quantity after stock limit
	 */
	public Long determineAllowedCartAdjustmentForProduct(final CartModel cartModel, final ProductModel productModel,
			final long quantityToAdd, final long cartItemQty, final PointOfServiceModel pointOfServiceModel);

}
