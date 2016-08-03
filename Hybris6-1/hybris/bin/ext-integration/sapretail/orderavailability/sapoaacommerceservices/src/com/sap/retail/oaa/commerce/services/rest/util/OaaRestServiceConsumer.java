/*****************************************************************************
    Interface:    OaaRestServiceConsumer
    Copyright (c) 2015, SAP SE, Germany, All rights reserved.
 *****************************************************************************/
package com.sap.retail.oaa.commerce.services.rest.util;

/**
 * Container used for REST calls. It contains all base information needed for OAA REST calls
 */
public interface OaaRestServiceConsumer
{

	/**
	 * Set Password for REST Call
	 *
	 * @param password
	 */
	void setPassword(String password);

	/**
	 * Ser User for REST Call
	 *
	 * @param user
	 */
	void setUser(String user);

	/**
	 * Set SAP System Client for REST Call
	 *
	 * @param sapCarClient
	 */
	void setSapCarClient(String sapCarClient);

	/**
	 * Set URL for REST Calls
	 *
	 * @param targetUrl
	 */
	void setTargetUrl(String targetUrl);

	/**
	 * Set OAA Profile for REST Call
	 *
	 * @param oaaProfileId
	 */
	void setOaaProfile(String oaaProfileId);
}
