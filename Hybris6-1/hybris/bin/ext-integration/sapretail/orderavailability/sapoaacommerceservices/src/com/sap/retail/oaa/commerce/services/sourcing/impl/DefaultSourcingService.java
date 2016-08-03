/*****************************************************************************
    Class:        DefaultSourcingService
    Copyright (c) 2015, SAP SE, Germany, All rights reserved.

 *****************************************************************************/
package com.sap.retail.oaa.commerce.services.sourcing.impl;

import de.hybris.platform.core.model.order.AbstractOrderModel;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import com.sap.retail.oaa.commerce.services.rest.impl.DefaultAbstractOaaRestService;
import com.sap.retail.oaa.commerce.services.rest.util.HttpEntityBuilder;
import com.sap.retail.oaa.commerce.services.rest.util.HttpHeaderProvider;
import com.sap.retail.oaa.commerce.services.rest.util.OaaRestServiceConsumer;
import com.sap.retail.oaa.commerce.services.rest.util.URLProvider;
import com.sap.retail.oaa.commerce.services.rest.util.exception.AuthenticationServiceException;
import com.sap.retail.oaa.commerce.services.rest.util.impl.AuthenticationResult;
import com.sap.retail.oaa.commerce.services.rest.util.impl.AuthenticationService;
import com.sap.retail.oaa.commerce.services.sourcing.SourcingRequestMapper;
import com.sap.retail.oaa.commerce.services.sourcing.SourcingResultHandler;
import com.sap.retail.oaa.commerce.services.sourcing.SourcingService;
import com.sap.retail.oaa.commerce.services.sourcing.exception.SourcingException;
import com.sap.retail.oaa.commerce.services.sourcing.jaxb.pojos.request.SourcingAbapRequest;
import com.sap.retail.oaa.commerce.services.sourcing.jaxb.pojos.response.SourcingResponse;


/**
 * Default Sourcing Service
 */
public class DefaultSourcingService extends DefaultAbstractOaaRestService implements SourcingService, OaaRestServiceConsumer
{
	private static final Logger LOG = Logger.getLogger(DefaultSourcingService.class);

	private static final String SERVICE_RESOURCE_PATH = "/sap/car/rest/oaa/sourcing";

	private SourcingResultHandler sourcingResultHandler;
	private SourcingRequestMapper cartMapper;
	private HttpHeaderProvider httpHeaderProvider;
	private AuthenticationService authenticationService;
	private URLProvider urlProvider;
	private HttpEntityBuilder httpEntityBuilder;

	private AuthenticationResult authenticationResult;


	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.sap.retail.oaa.commerce.services.sourcing.SourcingService#callRestService(de.hybris.platform.commerceservices
	 * .service.data.CommerceCheckoutParameter)
	 */
	@Override
	public void callRestServiceAndPersistResult(final AbstractOrderModel cartModel) throws SourcingException
	{
		// call REST Service
		final SourcingResponse response = this.callRestService(cartModel, false);
		sourcingResultHandler.persistSourcingResultInCart(response, cartModel);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.sap.retail.oaa.commerce.services.sourcing.SourcingService#callRestService(de.hybris.platform.core.model.order
	 * .CartModel, boolean)
	 */
	@Override
	public SourcingResponse callRestService(final AbstractOrderModel cartModel, final boolean execAllStrategies)
			throws SourcingException
	{
		SourcingResponse sourcingResponse = null;

		initializeConfiguration();

		try
		{
			try
			{
				sourcingResponse = callSourcingRestService(cartModel, execAllStrategies);
			}
			catch (final HttpClientErrorException e)
			{
				if (e.getStatusCode().equals(HttpStatus.FORBIDDEN))
				{
					authenticationResult = null;
					sourcingResponse = callSourcingRestService(cartModel, execAllStrategies);
				}
				else
				{
					LOG.error("Error when calling sourcing web service.");
					throw new SourcingException(e);
				}
			}

			return sourcingResponse;
		}

		catch (RestClientException | AuthenticationServiceException | URISyntaxException | SourcingException e)
		{
			authenticationResult = null;
			LOG.error("Error when calling sourcing web service.");
			throw new SourcingException(e);
		}

	}

	/**
	 * @param cartModel
	 * @param execAllStrategies
	 * @return sourcingResponse
	 * @throws URISyntaxException
	 */
	private SourcingResponse callSourcingRestService(final AbstractOrderModel cartModel, final boolean execAllStrategies)
			throws URISyntaxException
	{
		//only execute authentication in case it wasn't executed before
		if (authenticationResult == null)
		{
			authenticationResult = authenticationService.execute(user, password, targetUrl, SERVICE_RESOURCE_PATH, sapCarClient);
		}

		HttpEntity<SourcingAbapRequest> entity;
		final HttpHeaders header = compileHTTPHeader(authenticationResult);
		final SourcingAbapRequest abap = cartMapper.mapCartToSourcingRequest(cartModel, execAllStrategies);
		entity = httpEntityBuilder.createHttpEntityForSourcing(header, abap);


		final ResponseEntity<SourcingResponse> response = restTemplate.exchange(
				urlProvider.compileURI(targetUrl, SERVICE_RESOURCE_PATH, sapCarClient), HttpMethod.PUT, entity,
				SourcingResponse.class);


		if (response != null)
		{
			return response.getBody();
		}
		return null;
	}


	/**
	 * @param sourcingResultHandler
	 *           the sourcingResultHandler to set
	 */
	public void setSourcingResultHandler(final SourcingResultHandler sourcingResultHandler)
	{
		this.sourcingResultHandler = sourcingResultHandler;
	}

	/**
	 * @return the sourcingResultHandler
	 */
	protected SourcingResultHandler getSourcingResultHandler()
	{
		return sourcingResultHandler;
	}

	/**
	 * @param cartMapper
	 *           the cartMapper to set
	 */
	public void setCartMapper(final SourcingRequestMapper cartMapper)
	{
		this.cartMapper = cartMapper;
	}

	/**
	 * @return the cartMapper
	 */
	protected SourcingRequestMapper getCartMapper()
	{
		return cartMapper;
	}

	/**
	 * @param httpHeaderProvider
	 *           the httpHeaderProvider to set
	 */
	public void setHttpHeaderProvider(final HttpHeaderProvider httpHeaderProvider)
	{
		this.httpHeaderProvider = httpHeaderProvider;
	}

	/**
	 * @return the httpHeaderProvider
	 */
	protected HttpHeaderProvider getHttpHeaderProvider()
	{
		return httpHeaderProvider;
	}


	/**
	 * @param urlProvider
	 *           the urlProvider to set
	 */
	public void setUrlProvider(final URLProvider urlProvider)
	{
		this.urlProvider = urlProvider;
	}

	/**
	 * @return the urlProvider
	 */
	protected URLProvider getUrlProvider()
	{
		return urlProvider;
	}

	/**
	 * @param authenticationService
	 *           the authenticationService to set
	 */
	public void setAuthenticationService(final AuthenticationService authenticationService)
	{
		this.authenticationService = authenticationService;
	}

	/**
	 * @return the authenticationService
	 */
	protected AuthenticationService getAuthenticationService()
	{
		return authenticationService;
	}

	/**
	 * @param httpEntityBuilder
	 *           the httpEntityBuilder to set
	 */
	public void setHttpEntityBuilder(final HttpEntityBuilder httpEntityBuilder)
	{
		this.httpEntityBuilder = httpEntityBuilder;
	}

	/**
	 * @return the httpEntityBuilder
	 */
	protected HttpEntityBuilder getHttpEntityBuilder()
	{
		return httpEntityBuilder;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.sap.retail.oaa.commerce.services.rest.util.OaaRestServiceConsumer#setOaaProfile(java.lang.String)
	 */
	@Override
	public void setOaaProfile(final String oaaProfileId)
	{
		// not implemented
	}

	/**
	 *
	 */
	private void initializeConfiguration()
	{
		restInitializationStrategy.initializeConfigurationWithBaseStore(this);
	}


	/**
	 * @param authenticationResult
	 * @return HttpHeaders
	 */
	private HttpHeaders compileHTTPHeader(final AuthenticationResult authenticationResult)
	{
		final HttpHeaders header = httpHeaderProvider.compileHttpHeader(user, password);
		httpHeaderProvider.appendCsrfToHeader(header, authenticationResult.getResponseHeader());
		httpHeaderProvider.appendCookieToHeader(header, authenticationResult.getResponseHeader());
		final List<MediaType> acceptList = new ArrayList<>();
		acceptList.add(MediaType.APPLICATION_XML);
		header.setAccept(acceptList);
		header.setContentType(MediaType.APPLICATION_XML);
		return header;
	}

}
