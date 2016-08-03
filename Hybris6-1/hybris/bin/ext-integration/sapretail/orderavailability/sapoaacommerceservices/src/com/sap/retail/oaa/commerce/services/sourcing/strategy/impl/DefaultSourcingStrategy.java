/*****************************************************************************
    Class:        DefaultSourcingStrategy
    Copyright (c) 2015, SAP SE, Germany, All rights reserved.

 *****************************************************************************/
package com.sap.retail.oaa.commerce.services.sourcing.strategy.impl;

import de.hybris.platform.core.model.order.CartModel;

import org.apache.log4j.Logger;

import com.sap.retail.oaa.commerce.services.sourcing.SourcingService;
import com.sap.retail.oaa.commerce.services.sourcing.exception.SourcingException;
import com.sap.retail.oaa.commerce.services.sourcing.strategy.SourcingStrategy;


/**
 * Default Implementation for SourcingStrategy
 */
public class DefaultSourcingStrategy implements SourcingStrategy
{

	private static final Logger LOG = Logger.getLogger(DefaultSourcingStrategy.class);

	private SourcingService sourcingService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sap.retail.oaa.commerce.services.sourcing.strategy.OaaSourcingStrategy#doSourcing(de.hybris.platform.
	 * commerceservices.service.data.CommerceCheckoutParameter)
	 */
	@Override
	public boolean doSourcing(final CartModel cartModel)
	{
		try
		{
			sourcingService.callRestServiceAndPersistResult(cartModel);
		}
		catch (final SourcingException e)
		{
			LOG.error(e);
			return false;
		}
		return true;
	}

	/**
	 * @return the sourcingService
	 */
	protected SourcingService getSourcingService()
	{
		return sourcingService;
	}

	/**
	 * @param sourcingService
	 *           the sourcingService to set
	 */
	public void setSourcingService(final SourcingService sourcingService)
	{
		this.sourcingService = sourcingService;
	}

}
