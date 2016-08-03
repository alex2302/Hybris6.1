/**
 *
 */
package com.sap.retail.oaa.commerce.services.rest.util;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.sap.core.configuration.ConfigurationPropertyAccess;
import de.hybris.platform.sap.core.configuration.SAPConfigurationService;
import de.hybris.platform.sap.core.configuration.model.SAPHTTPDestinationModel;

import java.util.HashMap;
import java.util.Map;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.sap.retail.oaa.commerce.services.rest.util.impl.DefaultRestInitializationStrategy;
import com.sap.retail.oaa.model.constants.SapoaamodelConstants;


/**
 * @author SAP
 *
 */
@UnitTest
public class DefaultRestInitializationStrategyTest
{
	private static final String SAP_CAR_CLIENT = "sapCarClient";
	private static final String TARGETURL = "http://www.sap.com";
	private static final String USERID = "user";
	private static final String PASSWORD = "password";
	private static final String SAP_OAA_PROFILE = "SapOaaProfileId";

	private DefaultRestInitializationStrategy classUnderTest;
	private DefaultOaaRestServiceConsumerStub oaaRestServiceConsumer;

	@Before
	public void setup()
	{
		classUnderTest = new DefaultRestInitializationStrategy();
		oaaRestServiceConsumer = new DefaultOaaRestServiceConsumerStub();
	}

	@Test
	public void initializeConfigurationWithoutBaseStoreTest()
	{
		// Build mock for SAP HTTP Destination
		final Map<String, ConfigurationPropertyAccess> configMap = new HashMap<>();
		final ConfigurationPropertyAccess carHttpDestinationMock = EasyMock.createNiceMock(ConfigurationPropertyAccess.class);
		EasyMock.expect(carHttpDestinationMock.getProperty(SAPHTTPDestinationModel.USERID)).andReturn(USERID).anyTimes();
		EasyMock.expect(carHttpDestinationMock.getProperty(SAPHTTPDestinationModel.TARGETURL)).andReturn(TARGETURL).anyTimes();
		EasyMock.expect(carHttpDestinationMock.getProperty(SAPHTTPDestinationModel.PASSWORD)).andReturn(PASSWORD).anyTimes();
		EasyMock.replay(carHttpDestinationMock);
		configMap.put(SapoaamodelConstants.SAPOAA_CARHTTPDESTINATION, carHttpDestinationMock);

		final ConfigurationPropertyAccess sapGlobalConfigurationServiceMock = EasyMock
				.createNiceMock(ConfigurationPropertyAccess.class);
		EasyMock.expect(sapGlobalConfigurationServiceMock.getProperty(SapoaamodelConstants.SAPOAA_CARCLIENT)).andReturn(
				SAP_CAR_CLIENT);
		EasyMock.expect(sapGlobalConfigurationServiceMock.getAllPropertyAccesses()).andReturn(configMap);
		EasyMock.replay(sapGlobalConfigurationServiceMock);
		classUnderTest.setSapGlobalConfigurationService(sapGlobalConfigurationServiceMock);


		classUnderTest.initializeConfigurationWithoutBaseStore(oaaRestServiceConsumer);

		Assert.assertEquals(SAP_CAR_CLIENT, oaaRestServiceConsumer.sapCarClient);
		Assert.assertEquals(PASSWORD, oaaRestServiceConsumer.password);
		Assert.assertEquals(USERID, oaaRestServiceConsumer.user);
		Assert.assertEquals(TARGETURL, oaaRestServiceConsumer.targetUrl);
	}

	@Test
	public void initializeConfigurationWithoutBaseStoreExceptionTest()
	{
		// Build mock for SAP HTTP Destination
		final Map<String, ConfigurationPropertyAccess> configMap = new HashMap<>();
		configMap.put(SapoaamodelConstants.SAPOAA_CARHTTPDESTINATION, null);

		final ConfigurationPropertyAccess sapGlobalConfigurationServiceMock = EasyMock
				.createNiceMock(ConfigurationPropertyAccess.class);
		EasyMock.expect(sapGlobalConfigurationServiceMock.getProperty(SapoaamodelConstants.SAPOAA_CARCLIENT)).andReturn(
				SAP_CAR_CLIENT);
		EasyMock.expect(sapGlobalConfigurationServiceMock.getAllPropertyAccesses()).andReturn(configMap).anyTimes();
		classUnderTest.setSapGlobalConfigurationService(sapGlobalConfigurationServiceMock);

		// No ConfigurationPropertyAccess found
		EasyMock.replay(sapGlobalConfigurationServiceMock);
		assertInitializeConfigurationWithoutBaseStoreException(oaaRestServiceConsumer);

		// No TargetUrl provided
		ConfigurationPropertyAccess carHttpDestinationMock = EasyMock.createNiceMock(ConfigurationPropertyAccess.class);
		configMap.put(SapoaamodelConstants.SAPOAA_CARHTTPDESTINATION, carHttpDestinationMock);
		EasyMock.expect(carHttpDestinationMock.getProperty(SAPHTTPDestinationModel.USERID)).andReturn(USERID).anyTimes();
		EasyMock.expect(carHttpDestinationMock.getProperty(SAPHTTPDestinationModel.PASSWORD)).andReturn(PASSWORD).anyTimes();
		EasyMock.replay(carHttpDestinationMock);
		assertInitializeConfigurationWithoutBaseStoreException(oaaRestServiceConsumer);

		// No Password provided
		carHttpDestinationMock = EasyMock.createNiceMock(ConfigurationPropertyAccess.class);
		configMap.put(SapoaamodelConstants.SAPOAA_CARHTTPDESTINATION, carHttpDestinationMock);
		EasyMock.expect(carHttpDestinationMock.getProperty(SAPHTTPDestinationModel.USERID)).andReturn(USERID).anyTimes();
		EasyMock.expect(carHttpDestinationMock.getProperty(SAPHTTPDestinationModel.TARGETURL)).andReturn(TARGETURL).anyTimes();
		EasyMock.replay(carHttpDestinationMock);
		assertInitializeConfigurationWithoutBaseStoreException(oaaRestServiceConsumer);

		// No UserId provided
		carHttpDestinationMock = EasyMock.createNiceMock(ConfigurationPropertyAccess.class);
		configMap.put(SapoaamodelConstants.SAPOAA_CARHTTPDESTINATION, carHttpDestinationMock);
		EasyMock.expect(carHttpDestinationMock.getProperty(SAPHTTPDestinationModel.PASSWORD)).andReturn(PASSWORD).anyTimes();
		EasyMock.expect(carHttpDestinationMock.getProperty(SAPHTTPDestinationModel.TARGETURL)).andReturn(TARGETURL).anyTimes();
		EasyMock.replay(carHttpDestinationMock);
		assertInitializeConfigurationWithoutBaseStoreException(oaaRestServiceConsumer);
	}

	@Test
	public void initializeConfigurationWithBaseStoreTest()
	{
		classUnderTest = EasyMock.createMockBuilder(DefaultRestInitializationStrategy.class)
				.addMockedMethod("initializeConfigurationWithoutBaseStore").createMock();
		classUnderTest.initializeConfigurationWithoutBaseStore(EasyMock.anyObject(OaaRestServiceConsumer.class));
		EasyMock.expectLastCall();
		EasyMock.replay(classUnderTest);


		final SAPConfigurationService sapCoreConfigurationServiceMock = EasyMock.createNiceMock(SAPConfigurationService.class);
		EasyMock.expect(sapCoreConfigurationServiceMock.getProperty(SapoaamodelConstants.PROPERTY_SAPOAA_OAAPROFILE)).andReturn(
				SAP_OAA_PROFILE);
		classUnderTest.setSapCoreConfigurationService(sapCoreConfigurationServiceMock);
		EasyMock.replay(sapCoreConfigurationServiceMock);

		classUnderTest.initializeConfigurationWithBaseStore(oaaRestServiceConsumer);

		Assert.assertEquals(SAP_OAA_PROFILE, oaaRestServiceConsumer.oaaProfileId);
	}


	private void assertInitializeConfigurationWithoutBaseStoreException(final OaaRestServiceConsumer oaaRestServiceConsumer)
	{
		try
		{
			classUnderTest.initializeConfigurationWithoutBaseStore(oaaRestServiceConsumer);
			Assert.fail("Exception expected, but no Exception was thrown.");
		}
		catch (final Exception e)
		{
			Assert.assertNotNull(e.getMessage());
		}
	}

	class DefaultOaaRestServiceConsumerStub implements OaaRestServiceConsumer
	{
		public String password;
		public String user;
		public String sapCarClient;
		public String targetUrl;
		public String oaaProfileId;

		@Override
		public void setPassword(final String password)
		{
			this.password = password;
		}

		@Override
		public void setUser(final String user)
		{
			this.user = user;
		}

		@Override
		public void setSapCarClient(final String sapCarClient)
		{
			this.sapCarClient = sapCarClient;
		}

		@Override
		public void setTargetUrl(final String targetUrl)
		{
			this.targetUrl = targetUrl;
		}

		@Override
		public void setOaaProfile(final String oaaProfileId)
		{
			this.oaaProfileId = oaaProfileId;
		}
	}
}
