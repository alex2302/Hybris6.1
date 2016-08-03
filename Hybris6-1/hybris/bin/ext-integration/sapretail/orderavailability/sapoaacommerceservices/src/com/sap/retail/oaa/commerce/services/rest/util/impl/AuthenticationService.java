/*****************************************************************************
    Class:        AuthenticationService
    Copyright (c) 2015, SAP SE, Germany, All rights reserved.
 *****************************************************************************/
package com.sap.retail.oaa.commerce.services.rest.util.impl;

import java.net.URISyntaxException;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.sap.retail.oaa.commerce.services.rest.util.HttpEntityBuilder;
import com.sap.retail.oaa.commerce.services.rest.util.HttpHeaderProvider;
import com.sap.retail.oaa.commerce.services.rest.util.URLProvider;
import com.sap.retail.oaa.commerce.services.rest.util.exception.AuthenticationServiceException;


/**
 * Authentication Service calls Service and Fetch x-CSRF token and cookies
 */
public class AuthenticationService
{

	private HttpHeaderProvider httpHeaderProvider;
	private URLProvider urlProvider;
	private RestTemplate restTemplate;
	private HttpEntityBuilder httpEntityBuilder;

	/**
	 * Fetch X-csrf Token and retrieve the authentication results.
	 *
	 * @param user
	 * @param password
	 * @param url
	 * @param servicePath
	 * @param client
	 * @return AuthenticationResult
	 * @throws AuthenticationServiceException
	 */
	public AuthenticationResult execute(final String user, final String password, final String url, final String servicePath,
			final String client) throws AuthenticationServiceException
	{
		AuthenticationResult authenticationResult = null;

		final HttpHeaders httpHeader = httpHeaderProvider.compileHttpHeader(password, user);
		httpHeader.add("X-CSRF-TOKEN", "Fetch");

		final HttpEntity<String> entity = httpEntityBuilder.createHttpEntity(httpHeader, "");

		ResponseEntity<String> response;
		try
		{
			response = restTemplate.exchange(urlProvider.compileURI(url, servicePath, client), HttpMethod.GET, entity, String.class);
			authenticationResult = new AuthenticationResult();
			authenticationResult.setResponseHeader(response.getHeaders());
		}
		catch (final URISyntaxException | RestClientException e)
		{
			throw new AuthenticationServiceException(e);
		}
		return authenticationResult;
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
	 * @param restTemplate
	 */
	public void setRestTemplate(final RestTemplate restTemplate)
	{
		this.restTemplate = restTemplate;
	}

	/**
	 * @return the restTemplate
	 */
	protected RestTemplate getRestTemplate()
	{
		return restTemplate;
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

}
