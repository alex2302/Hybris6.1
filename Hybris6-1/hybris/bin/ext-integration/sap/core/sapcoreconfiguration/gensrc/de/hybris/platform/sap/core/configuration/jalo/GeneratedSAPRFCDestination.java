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
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.sap.core.configuration.constants.SapcoreconfigurationConstants;
import de.hybris.platform.sap.core.configuration.jalo.RFCDestinationAttribute;
import de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem SAPRFCDestination}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSAPRFCDestination extends GenericItem
{
	/** Qualifier of the <code>SAPRFCDestination.rfcDestinationName</code> attribute **/
	public static final String RFCDESTINATIONNAME = "rfcDestinationName";
	/** Qualifier of the <code>SAPRFCDestination.offlineMode</code> attribute **/
	public static final String OFFLINEMODE = "offlineMode";
	/** Qualifier of the <code>SAPRFCDestination.sid</code> attribute **/
	public static final String SID = "sid";
	/** Qualifier of the <code>SAPRFCDestination.client</code> attribute **/
	public static final String CLIENT = "client";
	/** Qualifier of the <code>SAPRFCDestination.messageServer</code> attribute **/
	public static final String MESSAGESERVER = "messageServer";
	/** Qualifier of the <code>SAPRFCDestination.targetHost</code> attribute **/
	public static final String TARGETHOST = "targetHost";
	/** Qualifier of the <code>SAPRFCDestination.connectionType</code> attribute **/
	public static final String CONNECTIONTYPE = "connectionType";
	/** Qualifier of the <code>SAPRFCDestination.group</code> attribute **/
	public static final String GROUP = "group";
	/** Qualifier of the <code>SAPRFCDestination.instance</code> attribute **/
	public static final String INSTANCE = "instance";
	/** Qualifier of the <code>SAPRFCDestination.userid</code> attribute **/
	public static final String USERID = "userid";
	/** Qualifier of the <code>SAPRFCDestination.password</code> attribute **/
	public static final String PASSWORD = "password";
	/** Qualifier of the <code>SAPRFCDestination.pooledConnectionMode</code> attribute **/
	public static final String POOLEDCONNECTIONMODE = "pooledConnectionMode";
	/** Qualifier of the <code>SAPRFCDestination.maxConnections</code> attribute **/
	public static final String MAXCONNECTIONS = "maxConnections";
	/** Qualifier of the <code>SAPRFCDestination.poolSize</code> attribute **/
	public static final String POOLSIZE = "poolSize";
	/** Qualifier of the <code>SAPRFCDestination.maxWaitTime</code> attribute **/
	public static final String MAXWAITTIME = "maxWaitTime";
	/** Qualifier of the <code>SAPRFCDestination.jcoMsServ</code> attribute **/
	public static final String JCOMSSERV = "jcoMsServ";
	/** Qualifier of the <code>SAPRFCDestination.jcoSAPRouter</code> attribute **/
	public static final String JCOSAPROUTER = "jcoSAPRouter";
	/** Qualifier of the <code>SAPRFCDestination.jcoTraceLevel</code> attribute **/
	public static final String JCOTRACELEVEL = "jcoTraceLevel";
	/** Qualifier of the <code>SAPRFCDestination.jcoTracePath</code> attribute **/
	public static final String JCOTRACEPATH = "jcoTracePath";
	/** Qualifier of the <code>SAPRFCDestination.jcoRFCTrace</code> attribute **/
	public static final String JCORFCTRACE = "jcoRFCTrace";
	/** Qualifier of the <code>SAPRFCDestination.jcoCPICTrace</code> attribute **/
	public static final String JCOCPICTRACE = "jcoCPICTrace";
	/** Qualifier of the <code>SAPRFCDestination.jcoClientDelta</code> attribute **/
	public static final String JCOCLIENTDELTA = "jcoClientDelta";
	/** Qualifier of the <code>SAPRFCDestination.backendType</code> attribute **/
	public static final String BACKENDTYPE = "backendType";
	/** Qualifier of the <code>SAPRFCDestination.sncMode</code> attribute **/
	public static final String SNCMODE = "sncMode";
	/** Qualifier of the <code>SAPRFCDestination.sncQoP</code> attribute **/
	public static final String SNCQOP = "sncQoP";
	/** Qualifier of the <code>SAPRFCDestination.sncPartnerName</code> attribute **/
	public static final String SNCPARTNERNAME = "sncPartnerName";
	/** Qualifier of the <code>SAPRFCDestination.SAPConfigurations</code> attribute **/
	public static final String SAPCONFIGURATIONS = "SAPConfigurations";
	/** Qualifier of the <code>SAPRFCDestination.AdditionalAttributes</code> attribute **/
	public static final String ADDITIONALATTRIBUTES = "AdditionalAttributes";
	/**
	* {@link OneToManyHandler} for handling 1:n SAPCONFIGURATIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SAPConfiguration> SAPCONFIGURATIONSHANDLER = new OneToManyHandler<SAPConfiguration>(
	SapcoreconfigurationConstants.TC.SAPCONFIGURATION,
	false,
	"SAPRFCDestination",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ADDITIONALATTRIBUTES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<RFCDestinationAttribute> ADDITIONALATTRIBUTESHANDLER = new OneToManyHandler<RFCDestinationAttribute>(
	SapcoreconfigurationConstants.TC.RFCDESTINATIONATTRIBUTE,
	false,
	"SAPRFCDestination",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(RFCDESTINATIONNAME, AttributeMode.INITIAL);
		tmp.put(OFFLINEMODE, AttributeMode.INITIAL);
		tmp.put(SID, AttributeMode.INITIAL);
		tmp.put(CLIENT, AttributeMode.INITIAL);
		tmp.put(MESSAGESERVER, AttributeMode.INITIAL);
		tmp.put(TARGETHOST, AttributeMode.INITIAL);
		tmp.put(CONNECTIONTYPE, AttributeMode.INITIAL);
		tmp.put(GROUP, AttributeMode.INITIAL);
		tmp.put(INSTANCE, AttributeMode.INITIAL);
		tmp.put(USERID, AttributeMode.INITIAL);
		tmp.put(PASSWORD, AttributeMode.INITIAL);
		tmp.put(POOLEDCONNECTIONMODE, AttributeMode.INITIAL);
		tmp.put(MAXCONNECTIONS, AttributeMode.INITIAL);
		tmp.put(POOLSIZE, AttributeMode.INITIAL);
		tmp.put(MAXWAITTIME, AttributeMode.INITIAL);
		tmp.put(JCOMSSERV, AttributeMode.INITIAL);
		tmp.put(JCOSAPROUTER, AttributeMode.INITIAL);
		tmp.put(JCOTRACELEVEL, AttributeMode.INITIAL);
		tmp.put(JCOTRACEPATH, AttributeMode.INITIAL);
		tmp.put(JCORFCTRACE, AttributeMode.INITIAL);
		tmp.put(JCOCPICTRACE, AttributeMode.INITIAL);
		tmp.put(JCOCLIENTDELTA, AttributeMode.INITIAL);
		tmp.put(BACKENDTYPE, AttributeMode.INITIAL);
		tmp.put(SNCMODE, AttributeMode.INITIAL);
		tmp.put(SNCQOP, AttributeMode.INITIAL);
		tmp.put(SNCPARTNERNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.AdditionalAttributes</code> attribute.
	 * @return the AdditionalAttributes
	 */
	public Collection<RFCDestinationAttribute> getAdditionalAttributes(final SessionContext ctx)
	{
		return ADDITIONALATTRIBUTESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.AdditionalAttributes</code> attribute.
	 * @return the AdditionalAttributes
	 */
	public Collection<RFCDestinationAttribute> getAdditionalAttributes()
	{
		return getAdditionalAttributes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.AdditionalAttributes</code> attribute. 
	 * @param value the AdditionalAttributes
	 */
	public void setAdditionalAttributes(final SessionContext ctx, final Collection<RFCDestinationAttribute> value)
	{
		ADDITIONALATTRIBUTESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.AdditionalAttributes</code> attribute. 
	 * @param value the AdditionalAttributes
	 */
	public void setAdditionalAttributes(final Collection<RFCDestinationAttribute> value)
	{
		setAdditionalAttributes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to AdditionalAttributes. 
	 * @param value the item to add to AdditionalAttributes
	 */
	public void addToAdditionalAttributes(final SessionContext ctx, final RFCDestinationAttribute value)
	{
		ADDITIONALATTRIBUTESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to AdditionalAttributes. 
	 * @param value the item to add to AdditionalAttributes
	 */
	public void addToAdditionalAttributes(final RFCDestinationAttribute value)
	{
		addToAdditionalAttributes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from AdditionalAttributes. 
	 * @param value the item to remove from AdditionalAttributes
	 */
	public void removeFromAdditionalAttributes(final SessionContext ctx, final RFCDestinationAttribute value)
	{
		ADDITIONALATTRIBUTESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from AdditionalAttributes. 
	 * @param value the item to remove from AdditionalAttributes
	 */
	public void removeFromAdditionalAttributes(final RFCDestinationAttribute value)
	{
		removeFromAdditionalAttributes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.backendType</code> attribute.
	 * @return the backendType - Backend Type
	 */
	public EnumerationValue getBackendType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, BACKENDTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.backendType</code> attribute.
	 * @return the backendType - Backend Type
	 */
	public EnumerationValue getBackendType()
	{
		return getBackendType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.backendType</code> attribute. 
	 * @param value the backendType - Backend Type
	 */
	public void setBackendType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, BACKENDTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.backendType</code> attribute. 
	 * @param value the backendType - Backend Type
	 */
	public void setBackendType(final EnumerationValue value)
	{
		setBackendType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.client</code> attribute.
	 * @return the client - Client number (000-999)
	 */
	public String getClient(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CLIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.client</code> attribute.
	 * @return the client - Client number (000-999)
	 */
	public String getClient()
	{
		return getClient( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.client</code> attribute. 
	 * @param value the client - Client number (000-999)
	 */
	public void setClient(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CLIENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.client</code> attribute. 
	 * @param value the client - Client number (000-999)
	 */
	public void setClient(final String value)
	{
		setClient( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.connectionType</code> attribute.
	 * @return the connectionType - Way to connect to the SAP system (server or group connection)
	 */
	public Boolean isConnectionType(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, CONNECTIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.connectionType</code> attribute.
	 * @return the connectionType - Way to connect to the SAP system (server or group connection)
	 */
	public Boolean isConnectionType()
	{
		return isConnectionType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.connectionType</code> attribute. 
	 * @return the connectionType - Way to connect to the SAP system (server or group connection)
	 */
	public boolean isConnectionTypeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isConnectionType( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.connectionType</code> attribute. 
	 * @return the connectionType - Way to connect to the SAP system (server or group connection)
	 */
	public boolean isConnectionTypeAsPrimitive()
	{
		return isConnectionTypeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.connectionType</code> attribute. 
	 * @param value the connectionType - Way to connect to the SAP system (server or group connection)
	 */
	public void setConnectionType(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, CONNECTIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.connectionType</code> attribute. 
	 * @param value the connectionType - Way to connect to the SAP system (server or group connection)
	 */
	public void setConnectionType(final Boolean value)
	{
		setConnectionType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.connectionType</code> attribute. 
	 * @param value the connectionType - Way to connect to the SAP system (server or group connection)
	 */
	public void setConnectionType(final SessionContext ctx, final boolean value)
	{
		setConnectionType( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.connectionType</code> attribute. 
	 * @param value the connectionType - Way to connect to the SAP system (server or group connection)
	 */
	public void setConnectionType(final boolean value)
	{
		setConnectionType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.group</code> attribute.
	 * @return the group - Name of the logon group (only relevant for group
	 * 						connect)
	 */
	public String getGroup(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GROUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.group</code> attribute.
	 * @return the group - Name of the logon group (only relevant for group
	 * 						connect)
	 */
	public String getGroup()
	{
		return getGroup( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.group</code> attribute. 
	 * @param value the group - Name of the logon group (only relevant for group
	 * 						connect)
	 */
	public void setGroup(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GROUP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.group</code> attribute. 
	 * @param value the group - Name of the logon group (only relevant for group
	 * 						connect)
	 */
	public void setGroup(final String value)
	{
		setGroup( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.instance</code> attribute.
	 * @return the instance - Instance number of the application server (only
	 * 						relevant for server connect)
	 */
	public String getInstance(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INSTANCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.instance</code> attribute.
	 * @return the instance - Instance number of the application server (only
	 * 						relevant for server connect)
	 */
	public String getInstance()
	{
		return getInstance( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.instance</code> attribute. 
	 * @param value the instance - Instance number of the application server (only
	 * 						relevant for server connect)
	 */
	public void setInstance(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INSTANCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.instance</code> attribute. 
	 * @param value the instance - Instance number of the application server (only
	 * 						relevant for server connect)
	 */
	public void setInstance(final String value)
	{
		setInstance( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.jcoClientDelta</code> attribute.
	 * @return the jcoClientDelta - Enable/disable table parameter delta management (1 - enable [default] or 0 - disable)
	 */
	public Boolean isJcoClientDelta(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, JCOCLIENTDELTA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.jcoClientDelta</code> attribute.
	 * @return the jcoClientDelta - Enable/disable table parameter delta management (1 - enable [default] or 0 - disable)
	 */
	public Boolean isJcoClientDelta()
	{
		return isJcoClientDelta( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.jcoClientDelta</code> attribute. 
	 * @return the jcoClientDelta - Enable/disable table parameter delta management (1 - enable [default] or 0 - disable)
	 */
	public boolean isJcoClientDeltaAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isJcoClientDelta( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.jcoClientDelta</code> attribute. 
	 * @return the jcoClientDelta - Enable/disable table parameter delta management (1 - enable [default] or 0 - disable)
	 */
	public boolean isJcoClientDeltaAsPrimitive()
	{
		return isJcoClientDeltaAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.jcoClientDelta</code> attribute. 
	 * @param value the jcoClientDelta - Enable/disable table parameter delta management (1 - enable [default] or 0 - disable)
	 */
	public void setJcoClientDelta(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, JCOCLIENTDELTA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.jcoClientDelta</code> attribute. 
	 * @param value the jcoClientDelta - Enable/disable table parameter delta management (1 - enable [default] or 0 - disable)
	 */
	public void setJcoClientDelta(final Boolean value)
	{
		setJcoClientDelta( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.jcoClientDelta</code> attribute. 
	 * @param value the jcoClientDelta - Enable/disable table parameter delta management (1 - enable [default] or 0 - disable)
	 */
	public void setJcoClientDelta(final SessionContext ctx, final boolean value)
	{
		setJcoClientDelta( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.jcoClientDelta</code> attribute. 
	 * @param value the jcoClientDelta - Enable/disable table parameter delta management (1 - enable [default] or 0 - disable)
	 */
	public void setJcoClientDelta(final boolean value)
	{
		setJcoClientDelta( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.jcoCPICTrace</code> attribute.
	 * @return the jcoCPICTrace - Enable/disable CPIC trace (-1 [take over environment value 'CPIC_TRACE'], 0 no trace, 1,2,3 different trace levels)
	 */
	public EnumerationValue getJcoCPICTrace(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, JCOCPICTRACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.jcoCPICTrace</code> attribute.
	 * @return the jcoCPICTrace - Enable/disable CPIC trace (-1 [take over environment value 'CPIC_TRACE'], 0 no trace, 1,2,3 different trace levels)
	 */
	public EnumerationValue getJcoCPICTrace()
	{
		return getJcoCPICTrace( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.jcoCPICTrace</code> attribute. 
	 * @param value the jcoCPICTrace - Enable/disable CPIC trace (-1 [take over environment value 'CPIC_TRACE'], 0 no trace, 1,2,3 different trace levels)
	 */
	public void setJcoCPICTrace(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, JCOCPICTRACE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.jcoCPICTrace</code> attribute. 
	 * @param value the jcoCPICTrace - Enable/disable CPIC trace (-1 [take over environment value 'CPIC_TRACE'], 0 no trace, 1,2,3 different trace levels)
	 */
	public void setJcoCPICTrace(final EnumerationValue value)
	{
		setJcoCPICTrace( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.jcoMsServ</code> attribute.
	 * @return the jcoMsServ - SAP message server service or port number
	 */
	public String getJcoMsServ(final SessionContext ctx)
	{
		return (String)getProperty( ctx, JCOMSSERV);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.jcoMsServ</code> attribute.
	 * @return the jcoMsServ - SAP message server service or port number
	 */
	public String getJcoMsServ()
	{
		return getJcoMsServ( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.jcoMsServ</code> attribute. 
	 * @param value the jcoMsServ - SAP message server service or port number
	 */
	public void setJcoMsServ(final SessionContext ctx, final String value)
	{
		setProperty(ctx, JCOMSSERV,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.jcoMsServ</code> attribute. 
	 * @param value the jcoMsServ - SAP message server service or port number
	 */
	public void setJcoMsServ(final String value)
	{
		setJcoMsServ( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.jcoRFCTrace</code> attribute.
	 * @return the jcoRFCTrace - JCo RFC Trace
	 */
	public Boolean isJcoRFCTrace(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, JCORFCTRACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.jcoRFCTrace</code> attribute.
	 * @return the jcoRFCTrace - JCo RFC Trace
	 */
	public Boolean isJcoRFCTrace()
	{
		return isJcoRFCTrace( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.jcoRFCTrace</code> attribute. 
	 * @return the jcoRFCTrace - JCo RFC Trace
	 */
	public boolean isJcoRFCTraceAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isJcoRFCTrace( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.jcoRFCTrace</code> attribute. 
	 * @return the jcoRFCTrace - JCo RFC Trace
	 */
	public boolean isJcoRFCTraceAsPrimitive()
	{
		return isJcoRFCTraceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.jcoRFCTrace</code> attribute. 
	 * @param value the jcoRFCTrace - JCo RFC Trace
	 */
	public void setJcoRFCTrace(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, JCORFCTRACE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.jcoRFCTrace</code> attribute. 
	 * @param value the jcoRFCTrace - JCo RFC Trace
	 */
	public void setJcoRFCTrace(final Boolean value)
	{
		setJcoRFCTrace( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.jcoRFCTrace</code> attribute. 
	 * @param value the jcoRFCTrace - JCo RFC Trace
	 */
	public void setJcoRFCTrace(final SessionContext ctx, final boolean value)
	{
		setJcoRFCTrace( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.jcoRFCTrace</code> attribute. 
	 * @param value the jcoRFCTrace - JCo RFC Trace
	 */
	public void setJcoRFCTrace(final boolean value)
	{
		setJcoRFCTrace( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.jcoSAPRouter</code> attribute.
	 * @return the jcoSAPRouter - SAP router string to use for networks being protected by a firewall
	 */
	public String getJcoSAPRouter(final SessionContext ctx)
	{
		return (String)getProperty( ctx, JCOSAPROUTER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.jcoSAPRouter</code> attribute.
	 * @return the jcoSAPRouter - SAP router string to use for networks being protected by a firewall
	 */
	public String getJcoSAPRouter()
	{
		return getJcoSAPRouter( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.jcoSAPRouter</code> attribute. 
	 * @param value the jcoSAPRouter - SAP router string to use for networks being protected by a firewall
	 */
	public void setJcoSAPRouter(final SessionContext ctx, final String value)
	{
		setProperty(ctx, JCOSAPROUTER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.jcoSAPRouter</code> attribute. 
	 * @param value the jcoSAPRouter - SAP router string to use for networks being protected by a firewall
	 */
	public void setJcoSAPRouter(final String value)
	{
		setJcoSAPRouter( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.jcoTraceLevel</code> attribute.
	 * @return the jcoTraceLevel - Turns on the JCo trace. Allowed levels are [0 .. 8].
	 */
	public EnumerationValue getJcoTraceLevel(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, JCOTRACELEVEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.jcoTraceLevel</code> attribute.
	 * @return the jcoTraceLevel - Turns on the JCo trace. Allowed levels are [0 .. 8].
	 */
	public EnumerationValue getJcoTraceLevel()
	{
		return getJcoTraceLevel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.jcoTraceLevel</code> attribute. 
	 * @param value the jcoTraceLevel - Turns on the JCo trace. Allowed levels are [0 .. 8].
	 */
	public void setJcoTraceLevel(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, JCOTRACELEVEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.jcoTraceLevel</code> attribute. 
	 * @param value the jcoTraceLevel - Turns on the JCo trace. Allowed levels are [0 .. 8].
	 */
	public void setJcoTraceLevel(final EnumerationValue value)
	{
		setJcoTraceLevel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.jcoTracePath</code> attribute.
	 * @return the jcoTracePath - As path value null, stdout, stderr or an existing path are allowed.
	 */
	public String getJcoTracePath(final SessionContext ctx)
	{
		return (String)getProperty( ctx, JCOTRACEPATH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.jcoTracePath</code> attribute.
	 * @return the jcoTracePath - As path value null, stdout, stderr or an existing path are allowed.
	 */
	public String getJcoTracePath()
	{
		return getJcoTracePath( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.jcoTracePath</code> attribute. 
	 * @param value the jcoTracePath - As path value null, stdout, stderr or an existing path are allowed.
	 */
	public void setJcoTracePath(final SessionContext ctx, final String value)
	{
		setProperty(ctx, JCOTRACEPATH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.jcoTracePath</code> attribute. 
	 * @param value the jcoTracePath - As path value null, stdout, stderr or an existing path are allowed.
	 */
	public void setJcoTracePath(final String value)
	{
		setJcoTracePath( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.maxConnections</code> attribute.
	 * @return the maxConnections - Maximal number of connections
	 */
	public String getMaxConnections(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MAXCONNECTIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.maxConnections</code> attribute.
	 * @return the maxConnections - Maximal number of connections
	 */
	public String getMaxConnections()
	{
		return getMaxConnections( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.maxConnections</code> attribute. 
	 * @param value the maxConnections - Maximal number of connections
	 */
	public void setMaxConnections(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MAXCONNECTIONS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.maxConnections</code> attribute. 
	 * @param value the maxConnections - Maximal number of connections
	 */
	public void setMaxConnections(final String value)
	{
		setMaxConnections( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.maxWaitTime</code> attribute.
	 * @return the maxWaitTime - Maximal wait time in ms
	 */
	public String getMaxWaitTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MAXWAITTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.maxWaitTime</code> attribute.
	 * @return the maxWaitTime - Maximal wait time in ms
	 */
	public String getMaxWaitTime()
	{
		return getMaxWaitTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.maxWaitTime</code> attribute. 
	 * @param value the maxWaitTime - Maximal wait time in ms
	 */
	public void setMaxWaitTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MAXWAITTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.maxWaitTime</code> attribute. 
	 * @param value the maxWaitTime - Maximal wait time in ms
	 */
	public void setMaxWaitTime(final String value)
	{
		setMaxWaitTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.messageServer</code> attribute.
	 * @return the messageServer - Message server (for group login)
	 */
	public String getMessageServer(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MESSAGESERVER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.messageServer</code> attribute.
	 * @return the messageServer - Message server (for group login)
	 */
	public String getMessageServer()
	{
		return getMessageServer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.messageServer</code> attribute. 
	 * @param value the messageServer - Message server (for group login)
	 */
	public void setMessageServer(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MESSAGESERVER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.messageServer</code> attribute. 
	 * @param value the messageServer - Message server (for group login)
	 */
	public void setMessageServer(final String value)
	{
		setMessageServer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.offlineMode</code> attribute.
	 * @return the offlineMode - Offline mode
	 */
	public Boolean isOfflineMode(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, OFFLINEMODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.offlineMode</code> attribute.
	 * @return the offlineMode - Offline mode
	 */
	public Boolean isOfflineMode()
	{
		return isOfflineMode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.offlineMode</code> attribute. 
	 * @return the offlineMode - Offline mode
	 */
	public boolean isOfflineModeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isOfflineMode( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.offlineMode</code> attribute. 
	 * @return the offlineMode - Offline mode
	 */
	public boolean isOfflineModeAsPrimitive()
	{
		return isOfflineModeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.offlineMode</code> attribute. 
	 * @param value the offlineMode - Offline mode
	 */
	public void setOfflineMode(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, OFFLINEMODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.offlineMode</code> attribute. 
	 * @param value the offlineMode - Offline mode
	 */
	public void setOfflineMode(final Boolean value)
	{
		setOfflineMode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.offlineMode</code> attribute. 
	 * @param value the offlineMode - Offline mode
	 */
	public void setOfflineMode(final SessionContext ctx, final boolean value)
	{
		setOfflineMode( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.offlineMode</code> attribute. 
	 * @param value the offlineMode - Offline mode
	 */
	public void setOfflineMode(final boolean value)
	{
		setOfflineMode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.password</code> attribute.
	 * @return the password - Password for the logon to the SAP system
	 */
	public String getPassword(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PASSWORD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.password</code> attribute.
	 * @return the password - Password for the logon to the SAP system
	 */
	public String getPassword()
	{
		return getPassword( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.password</code> attribute. 
	 * @param value the password - Password for the logon to the SAP system
	 */
	public void setPassword(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PASSWORD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.password</code> attribute. 
	 * @param value the password - Password for the logon to the SAP system
	 */
	public void setPassword(final String value)
	{
		setPassword( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.pooledConnectionMode</code> attribute.
	 * @return the pooledConnectionMode - Pooled connection mode
	 */
	public Boolean isPooledConnectionMode(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, POOLEDCONNECTIONMODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.pooledConnectionMode</code> attribute.
	 * @return the pooledConnectionMode - Pooled connection mode
	 */
	public Boolean isPooledConnectionMode()
	{
		return isPooledConnectionMode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.pooledConnectionMode</code> attribute. 
	 * @return the pooledConnectionMode - Pooled connection mode
	 */
	public boolean isPooledConnectionModeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPooledConnectionMode( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.pooledConnectionMode</code> attribute. 
	 * @return the pooledConnectionMode - Pooled connection mode
	 */
	public boolean isPooledConnectionModeAsPrimitive()
	{
		return isPooledConnectionModeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.pooledConnectionMode</code> attribute. 
	 * @param value the pooledConnectionMode - Pooled connection mode
	 */
	public void setPooledConnectionMode(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, POOLEDCONNECTIONMODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.pooledConnectionMode</code> attribute. 
	 * @param value the pooledConnectionMode - Pooled connection mode
	 */
	public void setPooledConnectionMode(final Boolean value)
	{
		setPooledConnectionMode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.pooledConnectionMode</code> attribute. 
	 * @param value the pooledConnectionMode - Pooled connection mode
	 */
	public void setPooledConnectionMode(final SessionContext ctx, final boolean value)
	{
		setPooledConnectionMode( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.pooledConnectionMode</code> attribute. 
	 * @param value the pooledConnectionMode - Pooled connection mode
	 */
	public void setPooledConnectionMode(final boolean value)
	{
		setPooledConnectionMode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.poolSize</code> attribute.
	 * @return the poolSize - Pool size
	 */
	public String getPoolSize(final SessionContext ctx)
	{
		return (String)getProperty( ctx, POOLSIZE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.poolSize</code> attribute.
	 * @return the poolSize - Pool size
	 */
	public String getPoolSize()
	{
		return getPoolSize( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.poolSize</code> attribute. 
	 * @param value the poolSize - Pool size
	 */
	public void setPoolSize(final SessionContext ctx, final String value)
	{
		setProperty(ctx, POOLSIZE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.poolSize</code> attribute. 
	 * @param value the poolSize - Pool size
	 */
	public void setPoolSize(final String value)
	{
		setPoolSize( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.rfcDestinationName</code> attribute.
	 * @return the rfcDestinationName - RFC Destination name
	 */
	public String getRfcDestinationName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RFCDESTINATIONNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.rfcDestinationName</code> attribute.
	 * @return the rfcDestinationName - RFC Destination name
	 */
	public String getRfcDestinationName()
	{
		return getRfcDestinationName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.rfcDestinationName</code> attribute. 
	 * @param value the rfcDestinationName - RFC Destination name
	 */
	public void setRfcDestinationName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RFCDESTINATIONNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.rfcDestinationName</code> attribute. 
	 * @param value the rfcDestinationName - RFC Destination name
	 */
	public void setRfcDestinationName(final String value)
	{
		setRfcDestinationName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.SAPConfigurations</code> attribute.
	 * @return the SAPConfigurations
	 */
	public Collection<SAPConfiguration> getSAPConfigurations(final SessionContext ctx)
	{
		return SAPCONFIGURATIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.SAPConfigurations</code> attribute.
	 * @return the SAPConfigurations
	 */
	public Collection<SAPConfiguration> getSAPConfigurations()
	{
		return getSAPConfigurations( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.SAPConfigurations</code> attribute. 
	 * @param value the SAPConfigurations
	 */
	public void setSAPConfigurations(final SessionContext ctx, final Collection<SAPConfiguration> value)
	{
		SAPCONFIGURATIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.SAPConfigurations</code> attribute. 
	 * @param value the SAPConfigurations
	 */
	public void setSAPConfigurations(final Collection<SAPConfiguration> value)
	{
		setSAPConfigurations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to SAPConfigurations. 
	 * @param value the item to add to SAPConfigurations
	 */
	public void addToSAPConfigurations(final SessionContext ctx, final SAPConfiguration value)
	{
		SAPCONFIGURATIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to SAPConfigurations. 
	 * @param value the item to add to SAPConfigurations
	 */
	public void addToSAPConfigurations(final SAPConfiguration value)
	{
		addToSAPConfigurations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from SAPConfigurations. 
	 * @param value the item to remove from SAPConfigurations
	 */
	public void removeFromSAPConfigurations(final SessionContext ctx, final SAPConfiguration value)
	{
		SAPCONFIGURATIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from SAPConfigurations. 
	 * @param value the item to remove from SAPConfigurations
	 */
	public void removeFromSAPConfigurations(final SAPConfiguration value)
	{
		removeFromSAPConfigurations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.sid</code> attribute.
	 * @return the sid - System ID (SID) of the target system
	 */
	public String getSid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.sid</code> attribute.
	 * @return the sid - System ID (SID) of the target system
	 */
	public String getSid()
	{
		return getSid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.sid</code> attribute. 
	 * @param value the sid - System ID (SID) of the target system
	 */
	public void setSid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.sid</code> attribute. 
	 * @param value the sid - System ID (SID) of the target system
	 */
	public void setSid(final String value)
	{
		setSid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.sncMode</code> attribute.
	 * @return the sncMode - SNC Mode
	 */
	public Boolean isSncMode(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SNCMODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.sncMode</code> attribute.
	 * @return the sncMode - SNC Mode
	 */
	public Boolean isSncMode()
	{
		return isSncMode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.sncMode</code> attribute. 
	 * @return the sncMode - SNC Mode
	 */
	public boolean isSncModeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSncMode( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.sncMode</code> attribute. 
	 * @return the sncMode - SNC Mode
	 */
	public boolean isSncModeAsPrimitive()
	{
		return isSncModeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.sncMode</code> attribute. 
	 * @param value the sncMode - SNC Mode
	 */
	public void setSncMode(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SNCMODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.sncMode</code> attribute. 
	 * @param value the sncMode - SNC Mode
	 */
	public void setSncMode(final Boolean value)
	{
		setSncMode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.sncMode</code> attribute. 
	 * @param value the sncMode - SNC Mode
	 */
	public void setSncMode(final SessionContext ctx, final boolean value)
	{
		setSncMode( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.sncMode</code> attribute. 
	 * @param value the sncMode - SNC Mode
	 */
	public void setSncMode(final boolean value)
	{
		setSncMode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.sncPartnerName</code> attribute.
	 * @return the sncPartnerName - SNC Partner Name
	 */
	public String getSncPartnerName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SNCPARTNERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.sncPartnerName</code> attribute.
	 * @return the sncPartnerName - SNC Partner Name
	 */
	public String getSncPartnerName()
	{
		return getSncPartnerName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.sncPartnerName</code> attribute. 
	 * @param value the sncPartnerName - SNC Partner Name
	 */
	public void setSncPartnerName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SNCPARTNERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.sncPartnerName</code> attribute. 
	 * @param value the sncPartnerName - SNC Partner Name
	 */
	public void setSncPartnerName(final String value)
	{
		setSncPartnerName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.sncQoP</code> attribute.
	 * @return the sncQoP - SNC Level of Security
	 */
	public EnumerationValue getSncQoP(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SNCQOP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.sncQoP</code> attribute.
	 * @return the sncQoP - SNC Level of Security
	 */
	public EnumerationValue getSncQoP()
	{
		return getSncQoP( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.sncQoP</code> attribute. 
	 * @param value the sncQoP - SNC Level of Security
	 */
	public void setSncQoP(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SNCQOP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.sncQoP</code> attribute. 
	 * @param value the sncQoP - SNC Level of Security
	 */
	public void setSncQoP(final EnumerationValue value)
	{
		setSncQoP( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.targetHost</code> attribute.
	 * @return the targetHost - Hostname of the application server (for direct login)
	 */
	public String getTargetHost(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TARGETHOST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.targetHost</code> attribute.
	 * @return the targetHost - Hostname of the application server (for direct login)
	 */
	public String getTargetHost()
	{
		return getTargetHost( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.targetHost</code> attribute. 
	 * @param value the targetHost - Hostname of the application server (for direct login)
	 */
	public void setTargetHost(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TARGETHOST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.targetHost</code> attribute. 
	 * @param value the targetHost - Hostname of the application server (for direct login)
	 */
	public void setTargetHost(final String value)
	{
		setTargetHost( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.userid</code> attribute.
	 * @return the userid - User ID for the logon to the SAP system
	 */
	public String getUserid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, USERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.userid</code> attribute.
	 * @return the userid - User ID for the logon to the SAP system
	 */
	public String getUserid()
	{
		return getUserid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.userid</code> attribute. 
	 * @param value the userid - User ID for the logon to the SAP system
	 */
	public void setUserid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, USERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPRFCDestination.userid</code> attribute. 
	 * @param value the userid - User ID for the logon to the SAP system
	 */
	public void setUserid(final String value)
	{
		setUserid( getSession().getSessionContext(), value );
	}
	
}
