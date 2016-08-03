/*****************************************************************************
    Interface:    SourcingService
    Copyright (c) 2015, SAP SE, Germany, All rights reserved.

 *****************************************************************************/
package com.sap.retail.oaa.commerce.services.sourcing;

import de.hybris.platform.core.model.order.AbstractOrderModel;

import com.sap.retail.oaa.commerce.services.sourcing.exception.SourcingException;
import com.sap.retail.oaa.commerce.services.sourcing.jaxb.pojos.response.SourcingResponse;


/**
 * Service for Sourcing
 */
public interface SourcingService
{

	/**
	 * Call the REST Service in Customer Activity Repository (CAR) and persist the result (Schedule Lines) in the given
	 * cart.
	 *
	 * @param cartModel
	 *           A parameter object
	 * @throws SourcingException
	 */
	void callRestServiceAndPersistResult(AbstractOrderModel cartModel) throws SourcingException;

	/**
	 * Call the REST Service in Customer Activity Repository (CAR) and return the service call response without
	 * persisting in hybris to the method invoker.
	 *
	 * @param cartModel
	 *           A parameter object
	 * @param execAllStrategies
	 *           Flag which indicates if a all Sourcing Strategies should be executed.
	 * @throws SourcingException
	 */
	SourcingResponse callRestService(final AbstractOrderModel cartModel, boolean execAllStrategies) throws SourcingException;
}
