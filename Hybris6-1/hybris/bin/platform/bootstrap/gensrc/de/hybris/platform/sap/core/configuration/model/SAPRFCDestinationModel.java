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
import de.hybris.platform.sap.core.configuration.enums.BackendType;
import de.hybris.platform.sap.core.configuration.enums.JCoCPICTrace;
import de.hybris.platform.sap.core.configuration.enums.JCoTraceLevel;
import de.hybris.platform.sap.core.configuration.enums.SncQoP;
import de.hybris.platform.sap.core.configuration.model.RFCDestinationAttributeModel;
import de.hybris.platform.sap.core.configuration.model.SAPConfigurationModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type SAPRFCDestination first defined at extension sapcoreconfiguration.
 */
@SuppressWarnings("all")
public class SAPRFCDestinationModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SAPRFCDestination";
	
	/**<i>Generated relation code constant for relation <code>JCODestinationForSAPConfiguration</code> defining source attribute <code>SAPConfigurations</code> in extension <code>sapcoreconfiguration</code>.</i>*/
	public final static String _JCODESTINATIONFORSAPCONFIGURATION = "JCODestinationForSAPConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRFCDestination.rfcDestinationName</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String RFCDESTINATIONNAME = "rfcDestinationName";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRFCDestination.offlineMode</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String OFFLINEMODE = "offlineMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRFCDestination.sid</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String SID = "sid";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRFCDestination.client</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String CLIENT = "client";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRFCDestination.messageServer</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String MESSAGESERVER = "messageServer";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRFCDestination.targetHost</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String TARGETHOST = "targetHost";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRFCDestination.connectionType</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String CONNECTIONTYPE = "connectionType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRFCDestination.group</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String GROUP = "group";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRFCDestination.instance</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String INSTANCE = "instance";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRFCDestination.userid</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String USERID = "userid";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRFCDestination.password</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String PASSWORD = "password";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRFCDestination.pooledConnectionMode</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String POOLEDCONNECTIONMODE = "pooledConnectionMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRFCDestination.maxConnections</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String MAXCONNECTIONS = "maxConnections";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRFCDestination.poolSize</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String POOLSIZE = "poolSize";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRFCDestination.maxWaitTime</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String MAXWAITTIME = "maxWaitTime";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRFCDestination.jcoMsServ</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String JCOMSSERV = "jcoMsServ";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRFCDestination.jcoSAPRouter</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String JCOSAPROUTER = "jcoSAPRouter";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRFCDestination.jcoTraceLevel</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String JCOTRACELEVEL = "jcoTraceLevel";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRFCDestination.jcoTracePath</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String JCOTRACEPATH = "jcoTracePath";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRFCDestination.jcoRFCTrace</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String JCORFCTRACE = "jcoRFCTrace";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRFCDestination.jcoCPICTrace</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String JCOCPICTRACE = "jcoCPICTrace";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRFCDestination.jcoClientDelta</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String JCOCLIENTDELTA = "jcoClientDelta";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRFCDestination.backendType</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String BACKENDTYPE = "backendType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRFCDestination.sncMode</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String SNCMODE = "sncMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRFCDestination.sncQoP</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String SNCQOP = "sncQoP";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRFCDestination.sncPartnerName</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String SNCPARTNERNAME = "sncPartnerName";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRFCDestination.SAPConfigurations</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String SAPCONFIGURATIONS = "SAPConfigurations";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRFCDestination.AdditionalAttributes</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String ADDITIONALATTRIBUTES = "AdditionalAttributes";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPRFCDestinationModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPRFCDestinationModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _client initial attribute declared by type <code>SAPRFCDestination</code> at extension <code>sapcoreconfiguration</code>
	 * @param _password initial attribute declared by type <code>SAPRFCDestination</code> at extension <code>sapcoreconfiguration</code>
	 * @param _rfcDestinationName initial attribute declared by type <code>SAPRFCDestination</code> at extension <code>sapcoreconfiguration</code>
	 * @param _userid initial attribute declared by type <code>SAPRFCDestination</code> at extension <code>sapcoreconfiguration</code>
	 */
	@Deprecated
	public SAPRFCDestinationModel(final String _client, final String _password, final String _rfcDestinationName, final String _userid)
	{
		super();
		setClient(_client);
		setPassword(_password);
		setRfcDestinationName(_rfcDestinationName);
		setUserid(_userid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _client initial attribute declared by type <code>SAPRFCDestination</code> at extension <code>sapcoreconfiguration</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _password initial attribute declared by type <code>SAPRFCDestination</code> at extension <code>sapcoreconfiguration</code>
	 * @param _rfcDestinationName initial attribute declared by type <code>SAPRFCDestination</code> at extension <code>sapcoreconfiguration</code>
	 * @param _userid initial attribute declared by type <code>SAPRFCDestination</code> at extension <code>sapcoreconfiguration</code>
	 */
	@Deprecated
	public SAPRFCDestinationModel(final String _client, final ItemModel _owner, final String _password, final String _rfcDestinationName, final String _userid)
	{
		super();
		setClient(_client);
		setOwner(_owner);
		setPassword(_password);
		setRfcDestinationName(_rfcDestinationName);
		setUserid(_userid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.AdditionalAttributes</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the AdditionalAttributes
	 */
	@Accessor(qualifier = "AdditionalAttributes", type = Accessor.Type.GETTER)
	public Collection<RFCDestinationAttributeModel> getAdditionalAttributes()
	{
		return getPersistenceContext().getPropertyValue(ADDITIONALATTRIBUTES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.backendType</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the backendType - Backend Type
	 */
	@Accessor(qualifier = "backendType", type = Accessor.Type.GETTER)
	public BackendType getBackendType()
	{
		return getPersistenceContext().getPropertyValue(BACKENDTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.client</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the client - Client number (000-999)
	 */
	@Accessor(qualifier = "client", type = Accessor.Type.GETTER)
	public String getClient()
	{
		return getPersistenceContext().getPropertyValue(CLIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.connectionType</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the connectionType - Way to connect to the SAP system (server or group connection)
	 */
	@Accessor(qualifier = "connectionType", type = Accessor.Type.GETTER)
	public Boolean getConnectionType()
	{
		return getPersistenceContext().getPropertyValue(CONNECTIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.group</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the group - Name of the logon group (only relevant for group
	 * 						connect)
	 */
	@Accessor(qualifier = "group", type = Accessor.Type.GETTER)
	public String getGroup()
	{
		return getPersistenceContext().getPropertyValue(GROUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.instance</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the instance - Instance number of the application server (only
	 * 						relevant for server connect)
	 */
	@Accessor(qualifier = "instance", type = Accessor.Type.GETTER)
	public String getInstance()
	{
		return getPersistenceContext().getPropertyValue(INSTANCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.jcoClientDelta</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the jcoClientDelta - Enable/disable table parameter delta management (1 - enable [default] or 0 - disable)
	 */
	@Accessor(qualifier = "jcoClientDelta", type = Accessor.Type.GETTER)
	public Boolean getJcoClientDelta()
	{
		return getPersistenceContext().getPropertyValue(JCOCLIENTDELTA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.jcoCPICTrace</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the jcoCPICTrace - Enable/disable CPIC trace (-1 [take over environment value 'CPIC_TRACE'], 0 no trace, 1,2,3 different trace levels)
	 */
	@Accessor(qualifier = "jcoCPICTrace", type = Accessor.Type.GETTER)
	public JCoCPICTrace getJcoCPICTrace()
	{
		return getPersistenceContext().getPropertyValue(JCOCPICTRACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.jcoMsServ</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the jcoMsServ - SAP message server service or port number
	 */
	@Accessor(qualifier = "jcoMsServ", type = Accessor.Type.GETTER)
	public String getJcoMsServ()
	{
		return getPersistenceContext().getPropertyValue(JCOMSSERV);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.jcoRFCTrace</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the jcoRFCTrace - JCo RFC Trace
	 */
	@Accessor(qualifier = "jcoRFCTrace", type = Accessor.Type.GETTER)
	public Boolean getJcoRFCTrace()
	{
		return getPersistenceContext().getPropertyValue(JCORFCTRACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.jcoSAPRouter</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the jcoSAPRouter - SAP router string to use for networks being protected by a firewall
	 */
	@Accessor(qualifier = "jcoSAPRouter", type = Accessor.Type.GETTER)
	public String getJcoSAPRouter()
	{
		return getPersistenceContext().getPropertyValue(JCOSAPROUTER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.jcoTraceLevel</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the jcoTraceLevel - Turns on the JCo trace. Allowed levels are [0 .. 8].
	 */
	@Accessor(qualifier = "jcoTraceLevel", type = Accessor.Type.GETTER)
	public JCoTraceLevel getJcoTraceLevel()
	{
		return getPersistenceContext().getPropertyValue(JCOTRACELEVEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.jcoTracePath</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the jcoTracePath - As path value null, stdout, stderr or an existing path are allowed.
	 */
	@Accessor(qualifier = "jcoTracePath", type = Accessor.Type.GETTER)
	public String getJcoTracePath()
	{
		return getPersistenceContext().getPropertyValue(JCOTRACEPATH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.maxConnections</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the maxConnections - Maximal number of connections
	 */
	@Accessor(qualifier = "maxConnections", type = Accessor.Type.GETTER)
	public String getMaxConnections()
	{
		return getPersistenceContext().getPropertyValue(MAXCONNECTIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.maxWaitTime</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the maxWaitTime - Maximal wait time in ms
	 */
	@Accessor(qualifier = "maxWaitTime", type = Accessor.Type.GETTER)
	public String getMaxWaitTime()
	{
		return getPersistenceContext().getPropertyValue(MAXWAITTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.messageServer</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the messageServer - Message server (for group login)
	 */
	@Accessor(qualifier = "messageServer", type = Accessor.Type.GETTER)
	public String getMessageServer()
	{
		return getPersistenceContext().getPropertyValue(MESSAGESERVER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.offlineMode</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the offlineMode - Offline mode
	 */
	@Accessor(qualifier = "offlineMode", type = Accessor.Type.GETTER)
	public Boolean getOfflineMode()
	{
		return getPersistenceContext().getPropertyValue(OFFLINEMODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.password</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the password - Password for the logon to the SAP system
	 */
	@Accessor(qualifier = "password", type = Accessor.Type.GETTER)
	public String getPassword()
	{
		return getPersistenceContext().getPropertyValue(PASSWORD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.pooledConnectionMode</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the pooledConnectionMode - Pooled connection mode
	 */
	@Accessor(qualifier = "pooledConnectionMode", type = Accessor.Type.GETTER)
	public Boolean getPooledConnectionMode()
	{
		return getPersistenceContext().getPropertyValue(POOLEDCONNECTIONMODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.poolSize</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the poolSize - Pool size
	 */
	@Accessor(qualifier = "poolSize", type = Accessor.Type.GETTER)
	public String getPoolSize()
	{
		return getPersistenceContext().getPropertyValue(POOLSIZE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.rfcDestinationName</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the rfcDestinationName - RFC Destination name
	 */
	@Accessor(qualifier = "rfcDestinationName", type = Accessor.Type.GETTER)
	public String getRfcDestinationName()
	{
		return getPersistenceContext().getPropertyValue(RFCDESTINATIONNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.SAPConfigurations</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the SAPConfigurations
	 */
	@Accessor(qualifier = "SAPConfigurations", type = Accessor.Type.GETTER)
	public Collection<SAPConfigurationModel> getSAPConfigurations()
	{
		return getPersistenceContext().getPropertyValue(SAPCONFIGURATIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.sid</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the sid - System ID (SID) of the target system
	 */
	@Accessor(qualifier = "sid", type = Accessor.Type.GETTER)
	public String getSid()
	{
		return getPersistenceContext().getPropertyValue(SID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.sncMode</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the sncMode - SNC Mode
	 */
	@Accessor(qualifier = "sncMode", type = Accessor.Type.GETTER)
	public Boolean getSncMode()
	{
		return getPersistenceContext().getPropertyValue(SNCMODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.sncPartnerName</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the sncPartnerName - SNC Partner Name
	 */
	@Accessor(qualifier = "sncPartnerName", type = Accessor.Type.GETTER)
	public String getSncPartnerName()
	{
		return getPersistenceContext().getPropertyValue(SNCPARTNERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.sncQoP</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the sncQoP - SNC Level of Security
	 */
	@Accessor(qualifier = "sncQoP", type = Accessor.Type.GETTER)
	public SncQoP getSncQoP()
	{
		return getPersistenceContext().getPropertyValue(SNCQOP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.targetHost</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the targetHost - Hostname of the application server (for direct login)
	 */
	@Accessor(qualifier = "targetHost", type = Accessor.Type.GETTER)
	public String getTargetHost()
	{
		return getPersistenceContext().getPropertyValue(TARGETHOST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRFCDestination.userid</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the userid - User ID for the logon to the SAP system
	 */
	@Accessor(qualifier = "userid", type = Accessor.Type.GETTER)
	public String getUserid()
	{
		return getPersistenceContext().getPropertyValue(USERID);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRFCDestination.AdditionalAttributes</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the AdditionalAttributes
	 */
	@Accessor(qualifier = "AdditionalAttributes", type = Accessor.Type.SETTER)
	public void setAdditionalAttributes(final Collection<RFCDestinationAttributeModel> value)
	{
		getPersistenceContext().setPropertyValue(ADDITIONALATTRIBUTES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRFCDestination.backendType</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the backendType - Backend Type
	 */
	@Accessor(qualifier = "backendType", type = Accessor.Type.SETTER)
	public void setBackendType(final BackendType value)
	{
		getPersistenceContext().setPropertyValue(BACKENDTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRFCDestination.client</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the client - Client number (000-999)
	 */
	@Accessor(qualifier = "client", type = Accessor.Type.SETTER)
	public void setClient(final String value)
	{
		getPersistenceContext().setPropertyValue(CLIENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRFCDestination.connectionType</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the connectionType - Way to connect to the SAP system (server or group connection)
	 */
	@Accessor(qualifier = "connectionType", type = Accessor.Type.SETTER)
	public void setConnectionType(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(CONNECTIONTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRFCDestination.group</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the group - Name of the logon group (only relevant for group
	 * 						connect)
	 */
	@Accessor(qualifier = "group", type = Accessor.Type.SETTER)
	public void setGroup(final String value)
	{
		getPersistenceContext().setPropertyValue(GROUP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRFCDestination.instance</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the instance - Instance number of the application server (only
	 * 						relevant for server connect)
	 */
	@Accessor(qualifier = "instance", type = Accessor.Type.SETTER)
	public void setInstance(final String value)
	{
		getPersistenceContext().setPropertyValue(INSTANCE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRFCDestination.jcoClientDelta</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the jcoClientDelta - Enable/disable table parameter delta management (1 - enable [default] or 0 - disable)
	 */
	@Accessor(qualifier = "jcoClientDelta", type = Accessor.Type.SETTER)
	public void setJcoClientDelta(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(JCOCLIENTDELTA, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRFCDestination.jcoCPICTrace</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the jcoCPICTrace - Enable/disable CPIC trace (-1 [take over environment value 'CPIC_TRACE'], 0 no trace, 1,2,3 different trace levels)
	 */
	@Accessor(qualifier = "jcoCPICTrace", type = Accessor.Type.SETTER)
	public void setJcoCPICTrace(final JCoCPICTrace value)
	{
		getPersistenceContext().setPropertyValue(JCOCPICTRACE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRFCDestination.jcoMsServ</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the jcoMsServ - SAP message server service or port number
	 */
	@Accessor(qualifier = "jcoMsServ", type = Accessor.Type.SETTER)
	public void setJcoMsServ(final String value)
	{
		getPersistenceContext().setPropertyValue(JCOMSSERV, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRFCDestination.jcoRFCTrace</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the jcoRFCTrace - JCo RFC Trace
	 */
	@Accessor(qualifier = "jcoRFCTrace", type = Accessor.Type.SETTER)
	public void setJcoRFCTrace(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(JCORFCTRACE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRFCDestination.jcoSAPRouter</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the jcoSAPRouter - SAP router string to use for networks being protected by a firewall
	 */
	@Accessor(qualifier = "jcoSAPRouter", type = Accessor.Type.SETTER)
	public void setJcoSAPRouter(final String value)
	{
		getPersistenceContext().setPropertyValue(JCOSAPROUTER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRFCDestination.jcoTraceLevel</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the jcoTraceLevel - Turns on the JCo trace. Allowed levels are [0 .. 8].
	 */
	@Accessor(qualifier = "jcoTraceLevel", type = Accessor.Type.SETTER)
	public void setJcoTraceLevel(final JCoTraceLevel value)
	{
		getPersistenceContext().setPropertyValue(JCOTRACELEVEL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRFCDestination.jcoTracePath</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the jcoTracePath - As path value null, stdout, stderr or an existing path are allowed.
	 */
	@Accessor(qualifier = "jcoTracePath", type = Accessor.Type.SETTER)
	public void setJcoTracePath(final String value)
	{
		getPersistenceContext().setPropertyValue(JCOTRACEPATH, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRFCDestination.maxConnections</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the maxConnections - Maximal number of connections
	 */
	@Accessor(qualifier = "maxConnections", type = Accessor.Type.SETTER)
	public void setMaxConnections(final String value)
	{
		getPersistenceContext().setPropertyValue(MAXCONNECTIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRFCDestination.maxWaitTime</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the maxWaitTime - Maximal wait time in ms
	 */
	@Accessor(qualifier = "maxWaitTime", type = Accessor.Type.SETTER)
	public void setMaxWaitTime(final String value)
	{
		getPersistenceContext().setPropertyValue(MAXWAITTIME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRFCDestination.messageServer</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the messageServer - Message server (for group login)
	 */
	@Accessor(qualifier = "messageServer", type = Accessor.Type.SETTER)
	public void setMessageServer(final String value)
	{
		getPersistenceContext().setPropertyValue(MESSAGESERVER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRFCDestination.offlineMode</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the offlineMode - Offline mode
	 */
	@Accessor(qualifier = "offlineMode", type = Accessor.Type.SETTER)
	public void setOfflineMode(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(OFFLINEMODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRFCDestination.password</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the password - Password for the logon to the SAP system
	 */
	@Accessor(qualifier = "password", type = Accessor.Type.SETTER)
	public void setPassword(final String value)
	{
		getPersistenceContext().setPropertyValue(PASSWORD, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRFCDestination.pooledConnectionMode</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the pooledConnectionMode - Pooled connection mode
	 */
	@Accessor(qualifier = "pooledConnectionMode", type = Accessor.Type.SETTER)
	public void setPooledConnectionMode(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(POOLEDCONNECTIONMODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRFCDestination.poolSize</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the poolSize - Pool size
	 */
	@Accessor(qualifier = "poolSize", type = Accessor.Type.SETTER)
	public void setPoolSize(final String value)
	{
		getPersistenceContext().setPropertyValue(POOLSIZE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRFCDestination.rfcDestinationName</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the rfcDestinationName - RFC Destination name
	 */
	@Accessor(qualifier = "rfcDestinationName", type = Accessor.Type.SETTER)
	public void setRfcDestinationName(final String value)
	{
		getPersistenceContext().setPropertyValue(RFCDESTINATIONNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRFCDestination.SAPConfigurations</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the SAPConfigurations
	 */
	@Accessor(qualifier = "SAPConfigurations", type = Accessor.Type.SETTER)
	public void setSAPConfigurations(final Collection<SAPConfigurationModel> value)
	{
		getPersistenceContext().setPropertyValue(SAPCONFIGURATIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRFCDestination.sid</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the sid - System ID (SID) of the target system
	 */
	@Accessor(qualifier = "sid", type = Accessor.Type.SETTER)
	public void setSid(final String value)
	{
		getPersistenceContext().setPropertyValue(SID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRFCDestination.sncMode</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the sncMode - SNC Mode
	 */
	@Accessor(qualifier = "sncMode", type = Accessor.Type.SETTER)
	public void setSncMode(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(SNCMODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRFCDestination.sncPartnerName</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the sncPartnerName - SNC Partner Name
	 */
	@Accessor(qualifier = "sncPartnerName", type = Accessor.Type.SETTER)
	public void setSncPartnerName(final String value)
	{
		getPersistenceContext().setPropertyValue(SNCPARTNERNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRFCDestination.sncQoP</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the sncQoP - SNC Level of Security
	 */
	@Accessor(qualifier = "sncQoP", type = Accessor.Type.SETTER)
	public void setSncQoP(final SncQoP value)
	{
		getPersistenceContext().setPropertyValue(SNCQOP, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRFCDestination.targetHost</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the targetHost - Hostname of the application server (for direct login)
	 */
	@Accessor(qualifier = "targetHost", type = Accessor.Type.SETTER)
	public void setTargetHost(final String value)
	{
		getPersistenceContext().setPropertyValue(TARGETHOST, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRFCDestination.userid</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the userid - User ID for the logon to the SAP system
	 */
	@Accessor(qualifier = "userid", type = Accessor.Type.SETTER)
	public void setUserid(final String value)
	{
		getPersistenceContext().setPropertyValue(USERID, value);
	}
	
}
