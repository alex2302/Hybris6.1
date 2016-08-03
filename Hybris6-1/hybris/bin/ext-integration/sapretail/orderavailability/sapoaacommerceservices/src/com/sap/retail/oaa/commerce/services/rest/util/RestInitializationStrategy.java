/*****************************************************************************
    Interface:    RestInitializationStrategy
    Copyright (c) 2015, SAP SE, Germany, All rights reserved.
 *****************************************************************************/
package com.sap.retail.oaa.commerce.services.rest.util;

import com.sap.retail.oaa.commerce.services.rest.util.exception.RestInitializationException;


/**
 * Initialization Strategy for REST calls
 */
public interface RestInitializationStrategy
{

	/**
	 * Initialize Configuration
	 *
	 * @param oaaRestServiceConsumer
	 * @throws RestInitializationException
	 */
	void initializeConfigurationWithoutBaseStore(OaaRestServiceConsumer oaaRestServiceConsumer) throws RestInitializationException;

	/**
	 * Initialize Configuration
	 *
	 * @param oaaRestServiceConsumer
	 * @throws RestInitializationException
	 */
	void initializeConfigurationWithBaseStore(OaaRestServiceConsumer oaaRestServiceConsumer) throws RestInitializationException;

}
