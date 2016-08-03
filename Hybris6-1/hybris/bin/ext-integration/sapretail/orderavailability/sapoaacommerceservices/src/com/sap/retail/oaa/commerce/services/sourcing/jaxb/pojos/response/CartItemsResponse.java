/*****************************************************************************
    Class:        CartItemsResponse
    Copyright (c) 2015, SAP SE, Germany, All rights reserved.

 *****************************************************************************/
package com.sap.retail.oaa.commerce.services.sourcing.jaxb.pojos.response;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;


/**
 * Jaxb Pojo for XML reading
 */
public class CartItemsResponse
{
	private List<SourcingResultCartItemResponse> sourcingResultCartItems;

	public CartItemsResponse()
	{
		super();
		this.sourcingResultCartItems = new ArrayList<>();
	}


	@XmlElement(name = "SOURCING_RESULT_CART_ITEM")
	public List<SourcingResultCartItemResponse> getSourcingResultCartItems()
	{
		return sourcingResultCartItems;
	}

	/**
	 * @param sourcingResultCartItems
	 *           the sourcingResultCartItems to set
	 */
	public void setSourcingResultCartItems(final List<SourcingResultCartItemResponse> sourcingResultCartItems)
	{
		this.sourcingResultCartItems = sourcingResultCartItems;
	}
}
