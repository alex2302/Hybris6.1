/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 31, 2016 4:07:33 PM                     ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 *  
 */
package de.hybris.platform.sap.core.configuration.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.sap.core.configuration.enums.HTTPAuthenticationType;
import de.hybris.platform.sap.core.configuration.model.SAPGlobalConfigurationModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type SAPHTTPDestination first defined at extension sapcoreconfiguration.
 */
@SuppressWarnings("all")
public class SAPHTTPDestinationModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SAPHTTPDestination";
	
	/**<i>Generated relation code constant for relation <code>SapCarHttpDestinationForGlobalConfiguration</code> defining source attribute <code>sapoaa_globalConfigurations</code> in extension <code>sapoaamodel</code>.</i>*/
	public final static String _SAPCARHTTPDESTINATIONFORGLOBALCONFIGURATION = "SapCarHttpDestinationForGlobalConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPHTTPDestination.httpDestinationName</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String HTTPDESTINATIONNAME = "httpDestinationName";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPHTTPDestination.targetURL</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String TARGETURL = "targetURL";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPHTTPDestination.authenticationType</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String AUTHENTICATIONTYPE = "authenticationType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPHTTPDestination.userid</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String USERID = "userid";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPHTTPDestination.password</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String PASSWORD = "password";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPHTTPDestination.sapoaa_globalConfigurations</code> attribute defined at extension <code>sapoaamodel</code>. */
	public static final String SAPOAA_GLOBALCONFIGURATIONS = "sapoaa_globalConfigurations";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPHTTPDestinationModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPHTTPDestinationModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public SAPHTTPDestinationModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPHTTPDestination.authenticationType</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the authenticationType - Authentication type
	 */
	@Accessor(qualifier = "authenticationType", type = Accessor.Type.GETTER)
	public HTTPAuthenticationType getAuthenticationType()
	{
		return getPersistenceContext().getPropertyValue(AUTHENTICATIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPHTTPDestination.httpDestinationName</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the httpDestinationName - HTTP Destination name
	 */
	@Accessor(qualifier = "httpDestinationName", type = Accessor.Type.GETTER)
	public String getHttpDestinationName()
	{
		return getPersistenceContext().getPropertyValue(HTTPDESTINATIONNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPHTTPDestination.password</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the password - Password for the logon to the SAP system
	 */
	@Accessor(qualifier = "password", type = Accessor.Type.GETTER)
	public String getPassword()
	{
		return getPersistenceContext().getPropertyValue(PASSWORD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPHTTPDestination.sapoaa_globalConfigurations</code> attribute defined at extension <code>sapoaamodel</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sapoaa_globalConfigurations
	 */
	@Accessor(qualifier = "sapoaa_globalConfigurations", type = Accessor.Type.GETTER)
	public Collection<SAPGlobalConfigurationModel> getSapoaa_globalConfigurations()
	{
		return getPersistenceContext().getPropertyValue(SAPOAA_GLOBALCONFIGURATIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPHTTPDestination.targetURL</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the targetURL - URL of the target system
	 */
	@Accessor(qualifier = "targetURL", type = Accessor.Type.GETTER)
	public String getTargetURL()
	{
		return getPersistenceContext().getPropertyValue(TARGETURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPHTTPDestination.userid</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the userid - User ID for the logon to the SAP system
	 */
	@Accessor(qualifier = "userid", type = Accessor.Type.GETTER)
	public String getUserid()
	{
		return getPersistenceContext().getPropertyValue(USERID);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPHTTPDestination.authenticationType</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the authenticationType - Authentication type
	 */
	@Accessor(qualifier = "authenticationType", type = Accessor.Type.SETTER)
	public void setAuthenticationType(final HTTPAuthenticationType value)
	{
		getPersistenceContext().setPropertyValue(AUTHENTICATIONTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPHTTPDestination.httpDestinationName</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the httpDestinationName - HTTP Destination name
	 */
	@Accessor(qualifier = "httpDestinationName", type = Accessor.Type.SETTER)
	public void setHttpDestinationName(final String value)
	{
		getPersistenceContext().setPropertyValue(HTTPDESTINATIONNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPHTTPDestination.password</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the password - Password for the logon to the SAP system
	 */
	@Accessor(qualifier = "password", type = Accessor.Type.SETTER)
	public void setPassword(final String value)
	{
		getPersistenceContext().setPropertyValue(PASSWORD, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPHTTPDestination.sapoaa_globalConfigurations</code> attribute defined at extension <code>sapoaamodel</code>. 
	 *  
	 * @param value the sapoaa_globalConfigurations
	 */
	@Accessor(qualifier = "sapoaa_globalConfigurations", type = Accessor.Type.SETTER)
	public void setSapoaa_globalConfigurations(final Collection<SAPGlobalConfigurationModel> value)
	{
		getPersistenceContext().setPropertyValue(SAPOAA_GLOBALCONFIGURATIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPHTTPDestination.targetURL</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the targetURL - URL of the target system
	 */
	@Accessor(qualifier = "targetURL", type = Accessor.Type.SETTER)
	public void setTargetURL(final String value)
	{
		getPersistenceContext().setPropertyValue(TARGETURL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPHTTPDestination.userid</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the userid - User ID for the logon to the SAP system
	 */
	@Accessor(qualifier = "userid", type = Accessor.Type.SETTER)
	public void setUserid(final String value)
	{
		getPersistenceContext().setPropertyValue(USERID, value);
	}
	
}
