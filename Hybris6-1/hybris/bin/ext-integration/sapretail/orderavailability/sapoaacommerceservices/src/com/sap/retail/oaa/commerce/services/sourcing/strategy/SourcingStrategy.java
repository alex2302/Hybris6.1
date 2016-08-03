/*****************************************************************************
    Interface:    SourcingStrategy
    Copyright (c) 2015, SAP SE, Germany, All rights reserved.

 *****************************************************************************/
package com.sap.retail.oaa.commerce.services.sourcing.strategy;

import de.hybris.platform.core.model.order.CartModel;


/**
 * Strategy for Omni Channel Availability Sourcing
 */
public interface SourcingStrategy
{
	/**
	 * Call the Sourcing Service with given Parameters
	 *
	 * @param cartModel
	 *
	 */
	boolean doSourcing(CartModel cartModel);

}
