/*****************************************************************************
    Interface:		HttpHeaderProvider
    Copyright (c) 2015, SAP SE, Germany, All rights reserved.
 *****************************************************************************/
package com.sap.retail.oaa.commerce.services.rest.util;

import org.springframework.http.HttpHeaders;


/**
 * Provides HTTP header for REST Service calls. Takes care of cookies, CSRF token and validation.
 */
public interface HttpHeaderProvider
{

	/**
	 * Get Header with User and Password
	 *
	 * @param password
	 * @param user
	 * @return HttpHeaders
	 */
	HttpHeaders compileHttpHeader(String password, String user);

	/**
	 * Add Cookie to HTTP Header
	 *
	 * @param header
	 * @param responseHeader
	 * @return HttpHeaders
	 */
	HttpHeaders appendCookieToHeader(HttpHeaders header, HttpHeaders responseHeader);

	/**
	 * Add CSRF Token to HTTP Header
	 *
	 * @param header
	 * @param responseHeader
	 * @return HttpHeaders
	 */
	HttpHeaders appendCsrfToHeader(HttpHeaders header, HttpHeaders responseHeader);

}
