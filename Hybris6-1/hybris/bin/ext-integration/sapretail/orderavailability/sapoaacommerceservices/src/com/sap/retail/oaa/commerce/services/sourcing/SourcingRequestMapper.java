/*****************************************************************************
    Interface:    CartToSourcingRequestMapper
    Copyright (c) 2015, SAP SE, Germany, All rights reserved.

 *****************************************************************************/
package com.sap.retail.oaa.commerce.services.sourcing;

import de.hybris.platform.core.model.order.AbstractOrderModel;

import com.sap.retail.oaa.commerce.services.sourcing.exception.SourcingException;
import com.sap.retail.oaa.commerce.services.sourcing.jaxb.pojos.request.SourcingAbapRequest;


/**
 * Maps Hybris Cart to Sourcing Result
 */
public interface SourcingRequestMapper
{
	/**
	 * Map Hybris Cart to Sourcing request
	 *
	 * @param cart
	 *           Hybris Cart
	 * @param execAllStrategies
	 *           execute all strategies
	 * @return Abap Sourcing request
	 * @throws SourcingException
	 */
	SourcingAbapRequest mapCartToSourcingRequest(AbstractOrderModel cart, boolean execAllStrategies) throws SourcingException;
}
