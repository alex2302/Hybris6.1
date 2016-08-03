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
package de.hybris.platform.sap.core.configuration.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.sap.core.configuration.constants.SapcoreconfigurationConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem SAPHTTPDestination}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSAPHTTPDestination extends GenericItem
{
	/** Qualifier of the <code>SAPHTTPDestination.httpDestinationName</code> attribute **/
	public static final String HTTPDESTINATIONNAME = "httpDestinationName";
	/** Qualifier of the <code>SAPHTTPDestination.targetURL</code> attribute **/
	public static final String TARGETURL = "targetURL";
	/** Qualifier of the <code>SAPHTTPDestination.authenticationType</code> attribute **/
	public static final String AUTHENTICATIONTYPE = "authenticationType";
	/** Qualifier of the <code>SAPHTTPDestination.userid</code> attribute **/
	public static final String USERID = "userid";
	/** Qualifier of the <code>SAPHTTPDestination.password</code> attribute **/
	public static final String PASSWORD = "password";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(HTTPDESTINATIONNAME, AttributeMode.INITIAL);
		tmp.put(TARGETURL, AttributeMode.INITIAL);
		tmp.put(AUTHENTICATIONTYPE, AttributeMode.INITIAL);
		tmp.put(USERID, AttributeMode.INITIAL);
		tmp.put(PASSWORD, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPHTTPDestination.authenticationType</code> attribute.
	 * @return the authenticationType - Authentication type
	 */
	public EnumerationValue getAuthenticationType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, AUTHENTICATIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPHTTPDestination.authenticationType</code> attribute.
	 * @return the authenticationType - Authentication type
	 */
	public EnumerationValue getAuthenticationType()
	{
		return getAuthenticationType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPHTTPDestination.authenticationType</code> attribute. 
	 * @param value the authenticationType - Authentication type
	 */
	public void setAuthenticationType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, AUTHENTICATIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPHTTPDestination.authenticationType</code> attribute. 
	 * @param value the authenticationType - Authentication type
	 */
	public void setAuthenticationType(final EnumerationValue value)
	{
		setAuthenticationType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPHTTPDestination.httpDestinationName</code> attribute.
	 * @return the httpDestinationName - HTTP Destination name
	 */
	public String getHttpDestinationName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HTTPDESTINATIONNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPHTTPDestination.httpDestinationName</code> attribute.
	 * @return the httpDestinationName - HTTP Destination name
	 */
	public String getHttpDestinationName()
	{
		return getHttpDestinationName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPHTTPDestination.httpDestinationName</code> attribute. 
	 * @param value the httpDestinationName - HTTP Destination name
	 */
	public void setHttpDestinationName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HTTPDESTINATIONNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPHTTPDestination.httpDestinationName</code> attribute. 
	 * @param value the httpDestinationName - HTTP Destination name
	 */
	public void setHttpDestinationName(final String value)
	{
		setHttpDestinationName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPHTTPDestination.password</code> attribute.
	 * @return the password - Password for the logon to the SAP system
	 */
	public String getPassword(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PASSWORD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPHTTPDestination.password</code> attribute.
	 * @return the password - Password for the logon to the SAP system
	 */
	public String getPassword()
	{
		return getPassword( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPHTTPDestination.password</code> attribute. 
	 * @param value the password - Password for the logon to the SAP system
	 */
	public void setPassword(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PASSWORD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPHTTPDestination.password</code> attribute. 
	 * @param value the password - Password for the logon to the SAP system
	 */
	public void setPassword(final String value)
	{
		setPassword( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPHTTPDestination.targetURL</code> attribute.
	 * @return the targetURL - URL of the target system
	 */
	public String getTargetURL(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TARGETURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPHTTPDestination.targetURL</code> attribute.
	 * @return the targetURL - URL of the target system
	 */
	public String getTargetURL()
	{
		return getTargetURL( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPHTTPDestination.targetURL</code> attribute. 
	 * @param value the targetURL - URL of the target system
	 */
	public void setTargetURL(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TARGETURL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPHTTPDestination.targetURL</code> attribute. 
	 * @param value the targetURL - URL of the target system
	 */
	public void setTargetURL(final String value)
	{
		setTargetURL( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPHTTPDestination.userid</code> attribute.
	 * @return the userid - User ID for the logon to the SAP system
	 */
	public String getUserid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, USERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPHTTPDestination.userid</code> attribute.
	 * @return the userid - User ID for the logon to the SAP system
	 */
	public String getUserid()
	{
		return getUserid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPHTTPDestination.userid</code> attribute. 
	 * @param value the userid - User ID for the logon to the SAP system
	 */
	public void setUserid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, USERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPHTTPDestination.userid</code> attribute. 
	 * @param value the userid - User ID for the logon to the SAP system
	 */
	public void setUserid(final String value)
	{
		setUserid( getSession().getSessionContext(), value );
	}
	
}
