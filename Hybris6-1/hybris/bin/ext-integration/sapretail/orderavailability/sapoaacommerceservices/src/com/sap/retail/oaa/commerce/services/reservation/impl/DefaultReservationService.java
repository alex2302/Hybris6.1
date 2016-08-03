/*****************************************************************************
    Class:        DefaultReservationService
    Copyright (c) 2015, SAP SE, Germany, All rights reserved.
 *****************************************************************************/
package com.sap.retail.oaa.commerce.services.reservation.impl;

import de.hybris.platform.core.model.order.OrderModel;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;

import com.sap.retail.oaa.commerce.services.reservation.ReservationRequestMapper;
import com.sap.retail.oaa.commerce.services.reservation.ReservationService;
import com.sap.retail.oaa.commerce.services.reservation.exception.ReservationException;
import com.sap.retail.oaa.commerce.services.reservation.jaxb.pojos.request.ReservationAbapRequest;
import com.sap.retail.oaa.commerce.services.reservation.jaxb.pojos.response.ReservationResponse;
import com.sap.retail.oaa.commerce.services.rest.impl.DefaultAbstractOaaRestService;
import com.sap.retail.oaa.commerce.services.rest.util.HttpEntityBuilder;
import com.sap.retail.oaa.commerce.services.rest.util.HttpHeaderProvider;
import com.sap.retail.oaa.commerce.services.rest.util.OaaRestServiceConsumer;
import com.sap.retail.oaa.commerce.services.rest.util.URLProvider;
import com.sap.retail.oaa.commerce.services.rest.util.exception.AuthenticationServiceException;
import com.sap.retail.oaa.commerce.services.rest.util.impl.AuthenticationResult;
import com.sap.retail.oaa.commerce.services.rest.util.impl.AuthenticationService;


/**
 * Default Reservation Service.
 */
public class DefaultReservationService extends DefaultAbstractOaaRestService implements ReservationService, OaaRestServiceConsumer
{
	private static final Logger LOG = Logger.getLogger(DefaultReservationService.class);
	private static final String SERVICE_PATH = "/sap/car/rest/oaa/reservation/";

	private AuthenticationService authenticationService;
	private HttpHeaderProvider httpHeaderProvider;
	private URLProvider urlProvider;
	private HttpEntityBuilder httpEntityBuilder;
	private ReservationRequestMapper requestMapper;


	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.sap.retail.oaa.commerce.services.reservation.ReservationService#callRestService(de.hybris.platform.core.model
	 * .order.OrderModel)
	 */
	@Override
	public ReservationResponse callRestService(final OrderModel order) throws ReservationException
	{
		ReservationResponse reservationResult = null;
		HttpEntity<ReservationAbapRequest> entity = null;
		initializeConfiguration();

		final String reservationServicePath = SERVICE_PATH + order.getGuid().replace("-", "").toUpperCase();
		try
		{
			final AuthenticationResult authenticationResult = authenticationService.execute(user, password, targetUrl,
					reservationServicePath, sapCarClient);

			final HttpHeaders header = compileHTTPHeader(authenticationResult);
			final ReservationAbapRequest abap = requestMapper.mapOrderToReservationRequest(order);
			entity = httpEntityBuilder.createHttpEntity(header, abap);

			final ResponseEntity<ReservationResponse> response = restTemplate.exchange(
					urlProvider.compileURI(targetUrl, reservationServicePath, sapCarClient), HttpMethod.PUT, entity,
					ReservationResponse.class);

			if (response != null)
			{
				reservationResult = response.getBody();
			}
			return reservationResult;
		}
		catch (final RestClientException | AuthenticationServiceException | URISyntaxException | ReservationException e)
		{
			LOG.error("Error when calling reservation web service.");
			throw new ReservationException(e);
		}
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
	 * @param requestMapper
	 *           the requestMapper to set
	 */
	public void setRequestMapper(final ReservationRequestMapper requestMapper)
	{
		this.requestMapper = requestMapper;
	}

	/**
	 * @return the requestMapper
	 */
	protected ReservationRequestMapper getRequestMapper()
	{
		return requestMapper;
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

	/**
	 * Set OAA profileId
	 */
	@Override
	public void setOaaProfile(final String oaaProfileId)
	{
		//
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



	/**
	 * Initialize the Configuration of the REST configuration
	 */
	private void initializeConfiguration()
	{
		restInitializationStrategy.initializeConfigurationWithoutBaseStore(this);
	}

}
