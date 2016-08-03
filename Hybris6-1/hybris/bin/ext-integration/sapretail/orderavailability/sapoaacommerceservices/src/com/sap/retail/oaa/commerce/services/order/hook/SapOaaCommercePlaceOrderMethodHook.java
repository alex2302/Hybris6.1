/**
 *
 */
package com.sap.retail.oaa.commerce.services.order.hook;

import de.hybris.platform.commerceservices.order.hook.CommercePlaceOrderMethodHook;
import de.hybris.platform.commerceservices.service.data.CommerceCheckoutParameter;
import de.hybris.platform.commerceservices.service.data.CommerceOrderResult;
import de.hybris.platform.order.InvalidCartException;

import org.apache.log4j.Logger;

import com.sap.retail.oaa.commerce.services.sourcing.SourcingService;
import com.sap.retail.oaa.commerce.services.sourcing.exception.SourcingException;


/**
 * This hook is used to call sourcing again before submit order. We want to ensure that that the requested article
 * quantity is still available for the case that the customer is waiting some time in the checkout after the sourcing
 * call.
 */
public class SapOaaCommercePlaceOrderMethodHook implements CommercePlaceOrderMethodHook
{
	private static final Logger LOG = Logger.getLogger(SapOaaCommercePlaceOrderMethodHook.class);

	private SourcingService sourcingService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hybris.platform.commerceservices.order.hook.CommercePlaceOrderMethodHook#afterPlaceOrder(de.hybris.platform.
	 * commerceservices.service.data.CommerceCheckoutParameter,
	 * de.hybris.platform.commerceservices.service.data.CommerceOrderResult)
	 */
	@Override
	public void afterPlaceOrder(final CommerceCheckoutParameter parameter, final CommerceOrderResult orderModel)
			throws InvalidCartException
	{
		// implement logic if needed
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hybris.platform.commerceservices.order.hook.CommercePlaceOrderMethodHook#beforePlaceOrder(de.hybris.platform.
	 * commerceservices.service.data.CommerceCheckoutParameter)
	 */
	@Override
	public void beforePlaceOrder(final CommerceCheckoutParameter parameter) throws InvalidCartException
	{
		// implement logic if needed
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hybris.platform.commerceservices.order.hook.CommercePlaceOrderMethodHook#beforeSubmitOrder(de.hybris.platform.
	 * commerceservices.service.data.CommerceCheckoutParameter,
	 * de.hybris.platform.commerceservices.service.data.CommerceOrderResult)
	 */
	@Override
	public void beforeSubmitOrder(final CommerceCheckoutParameter parameter, final CommerceOrderResult result)
			throws InvalidCartException
	{
		try
		{
			sourcingService.callRestServiceAndPersistResult(result.getOrder());
		}
		catch (final SourcingException e)
		{
			LOG.error("Error when calling sourcing", e);
			throw new InvalidCartException(e);
		}
	}

	/**
	 * @param sourcingService
	 *           the sourcingService to set
	 */
	public void setSourcingService(final SourcingService sourcingService)
	{
		this.sourcingService = sourcingService;
	}

	/**
	 * @return the sourcingService
	 */
	protected SourcingService getSourcingService()
	{
		return sourcingService;
	}

}
