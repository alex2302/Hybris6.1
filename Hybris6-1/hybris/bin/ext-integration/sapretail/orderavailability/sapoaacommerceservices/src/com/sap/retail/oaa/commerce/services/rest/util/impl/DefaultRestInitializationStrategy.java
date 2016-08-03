/*****************************************************************************
    Class:        DefaultRestInitializationStrategy
    Copyright (c) 2015, SAP SE, Germany, All rights reserved.
 *****************************************************************************/
package com.sap.retail.oaa.commerce.services.rest.util.impl;

import de.hybris.platform.sap.core.configuration.ConfigurationPropertyAccess;
import de.hybris.platform.sap.core.configuration.SAPConfigurationService;
import de.hybris.platform.sap.core.configuration.model.SAPHTTPDestinationModel;

import com.sap.retail.oaa.commerce.services.rest.util.OaaRestServiceConsumer;
import com.sap.retail.oaa.commerce.services.rest.util.RestInitializationStrategy;
import com.sap.retail.oaa.commerce.services.rest.util.exception.RestInitializationException;
import com.sap.retail.oaa.model.constants.SapoaamodelConstants;


/**
 * Default implementation of RestInitializationStrategy.
 */
public class DefaultRestInitializationStrategy implements RestInitializationStrategy
{

	private ConfigurationPropertyAccess sapGlobalConfigurationService;
	private SAPConfigurationService sapCoreConfigurationService;

	@Override
	public void initializeConfigurationWithoutBaseStore(final OaaRestServiceConsumer oaaRestServiceConsumer)
			throws RestInitializationException
	{
		oaaRestServiceConsumer.setSapCarClient((String) sapGlobalConfigurationService
				.getProperty(SapoaamodelConstants.SAPOAA_CARCLIENT));

		final String name = SapoaamodelConstants.SAPOAA_CARHTTPDESTINATION;
		final ConfigurationPropertyAccess configurationPropertyAccess = sapGlobalConfigurationService.getAllPropertyAccesses().get(
				name);

		if (configurationPropertyAccess == null)
		{
			throw new RestInitializationException("No Http Destination maintained for REST Services");
		}

		if ((String) configurationPropertyAccess.getProperty(SAPHTTPDestinationModel.TARGETURL) == null
				|| (String) configurationPropertyAccess.getProperty(SAPHTTPDestinationModel.USERID) == null
				|| (String) configurationPropertyAccess.getProperty(SAPHTTPDestinationModel.PASSWORD) == null)
		{
			throw new RestInitializationException("Http Destination for REST Services is not maintained properly");
		}

		oaaRestServiceConsumer.setUser((String) configurationPropertyAccess.getProperty(SAPHTTPDestinationModel.USERID));
		oaaRestServiceConsumer.setTargetUrl((String) configurationPropertyAccess.getProperty(SAPHTTPDestinationModel.TARGETURL));
		oaaRestServiceConsumer.setPassword((String) configurationPropertyAccess.getProperty(SAPHTTPDestinationModel.PASSWORD));
	}

	@Override
	public void initializeConfigurationWithBaseStore(final OaaRestServiceConsumer oaaRestServiceConsumer)
			throws RestInitializationException
	{
		initializeConfigurationWithoutBaseStore(oaaRestServiceConsumer);

		oaaRestServiceConsumer.setOaaProfile((String) sapCoreConfigurationService
				.getProperty(SapoaamodelConstants.PROPERTY_SAPOAA_OAAPROFILE));
	}


	/**
	 * @param sapGlobalConfigurationService
	 *           the sapGlobalConfigurationService to set
	 */
	public void setSapGlobalConfigurationService(final ConfigurationPropertyAccess sapGlobalConfigurationService)
	{
		this.sapGlobalConfigurationService = sapGlobalConfigurationService;
	}

	/**
	 * @param sapCoreConfigurationService
	 *           the sapCoreConfigurationService to set
	 */
	public void setSapCoreConfigurationService(final SAPConfigurationService sapCoreConfigurationService)
	{
		this.sapCoreConfigurationService = sapCoreConfigurationService;
	}

	/**
	 * @return the sapGlobalConfigurationService
	 */
	protected ConfigurationPropertyAccess getSapGlobalConfigurationService()
	{
		return sapGlobalConfigurationService;
	}

	/**
	 * @return the sapCoreConfigurationService
	 */
	protected SAPConfigurationService getSapCoreConfigurationService()
	{
		return sapCoreConfigurationService;
	}

}
