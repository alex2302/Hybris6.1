/*****************************************************************************
    Class:        DefaultAbstractOaaRestService
    Copyright (c) 2015, SAP SE, Germany, All rights reserved.
 *****************************************************************************/
package com.sap.retail.oaa.commerce.services.rest.impl;

import org.springframework.web.client.RestTemplate;

import com.sap.retail.oaa.commerce.services.rest.util.RestInitializationStrategy;


/**
 * Base Class for OAA REST Service classes.
 */
public abstract class DefaultAbstractOaaRestService
{
	protected String user;
	protected String password;
	protected String targetUrl;
	protected String sapCarClient;
	protected RestInitializationStrategy restInitializationStrategy;
	protected RestTemplate restTemplate;


	/**
	 * Set the REST initialization Strategy
	 *
	 * @param restInitializationStrategy
	 *           the restInitializationStrategy to set
	 */

	public void setRestInitializationStrategy(final RestInitializationStrategy restInitializationStrategy)
	{
		this.restInitializationStrategy = restInitializationStrategy;
	}

	/**
	 * Set the REST template
	 *
	 * @param restTemplate
	 *           the restTemplate to set
	 */
	public void setRestTemplate(final RestTemplate restTemplate)
	{
		this.restTemplate = restTemplate;
	}

	/**
	 * Set the user, used for the REST Service calls
	 *
	 * @param user
	 *           the user to set
	 */
	public void setUser(final String user)
	{
		this.user = user;
	}

	/**
	 * Set the password, used for the REST Service calls
	 *
	 * @param password
	 *           the password to set
	 */
	public void setPassword(final String password)
	{
		this.password = password;
	}

	/**
	 * Set the URL, used for the REST Service calls
	 *
	 * @param targetUrl
	 *           the targetUrl to set
	 */
	public void setTargetUrl(final String targetUrl)
	{
		this.targetUrl = targetUrl;
	}

	/**
	 * Set the client of the SAP System, used for the REST Service calls
	 *
	 * @param sapCarClient
	 *           the sapCarClient to set
	 */
	public void setSapCarClient(final String sapCarClient)
	{
		this.sapCarClient = sapCarClient;
	}

}
