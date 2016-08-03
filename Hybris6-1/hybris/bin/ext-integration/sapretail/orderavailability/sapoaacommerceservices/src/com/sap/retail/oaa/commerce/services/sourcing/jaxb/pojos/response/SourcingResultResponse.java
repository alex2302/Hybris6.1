/*****************************************************************************
    Class:        SourcingResultResponse
    Copyright (c) 2015, SAP SE, Germany, All rights reserved.

 *****************************************************************************/
package com.sap.retail.oaa.commerce.services.sourcing.jaxb.pojos.response;

import javax.xml.bind.annotation.XmlElement;


/**
 * Jaxb Pojo for XML reading
 */
public class SourcingResultResponse
{
	private String sourcingStrategyId;
	private CartItemsResponse cartItems;

	@XmlElement(name = "CART_ITEMS")
	public CartItemsResponse getCartItems()
	{
		return cartItems;
	}

	/**
	 * @param cartItems
	 *           the cartItems to set
	 */
	public void setCartItems(final CartItemsResponse cartItems)
	{
		this.cartItems = cartItems;
	}

	@XmlElement(name = "SOURCING_STRATEGY_ID")
	public String getSourcingStrategyId()
	{
		return sourcingStrategyId;
	}

	/**
	 * @param sourcingStrategyId
	 *           the sourcingStrategyId to set
	 */
	public void setSourcingStrategyId(final String sourcingStrategyId)
	{
		this.sourcingStrategyId = sourcingStrategyId;
	}
}
