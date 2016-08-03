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
package de.hybris.platform.sap.core.configuration.constants;

/**
 * @deprecated use constants in Model classes instead
 */
@Deprecated
@SuppressWarnings({"unused","cast","PMD"})
public class GeneratedSapcoreconfigurationConstants
{
	public static final String EXTENSIONNAME = "sapcoreconfiguration";
	public static class TC
	{
		public static final String BACKENDTYPE = "BackendType".intern();
		public static final String HTTPAUTHENTICATIONTYPE = "HTTPAuthenticationType".intern();
		public static final String JCOCPICTRACE = "JCoCPICTrace".intern();
		public static final String JCOTRACELEVEL = "JCoTraceLevel".intern();
		public static final String RFCDESTINATIONATTRIBUTE = "RFCDestinationAttribute".intern();
		public static final String SAPADMINISTRATION = "SAPAdministration".intern();
		public static final String SAPCONFIGURATION = "SAPConfiguration".intern();
		public static final String SAPGLOBALCONFIGURATION = "SAPGlobalConfiguration".intern();
		public static final String SAPHTTPDESTINATION = "SAPHTTPDestination".intern();
		public static final String SAPRFCDESTINATION = "SAPRFCDestination".intern();
		public static final String SNCQOP = "SncQoP".intern();
	}
	public static class Attributes
	{
		public static class BaseStore
		{
			public static final String SAPCONFIGURATION = "SAPConfiguration".intern();
		}
	}
	public static class Enumerations
	{
		public static class BackendType
		{
			public static final String ERP = "ERP".intern();
		}
		public static class HTTPAuthenticationType
		{
			public static final String NO_AUTHENTICATION = "NO_AUTHENTICATION".intern();
			public static final String BASIC_AUTHENTICATION = "BASIC_AUTHENTICATION".intern();
		}
		public static class JCoCPICTrace
		{
			public static final String NO_TRACE = "NO_TRACE".intern();
			public static final String GLOBAL_TRACELEVEL = "GLOBAL_TRACELEVEL".intern();
			public static final String MINIMAL_TRACELEVEL = "MINIMAL_TRACELEVEL".intern();
			public static final String FULL_TRACELEVEL = "FULL_TRACELEVEL".intern();
			public static final String FULL_TRACELEVEL_DATA = "FULL_TRACELEVEL_DATA".intern();
		}
		public static class JCoTraceLevel
		{
			public static final String NO_TRACE = "NO_TRACE".intern();
			public static final String ERRORS = "ERRORS".intern();
			public static final String ERRORS_WARNINGS = "ERRORS_WARNINGS".intern();
			public static final String INFOS_ERRORS_WARNINGS = "INFOS_ERRORS_WARNINGS".intern();
			public static final String EXPATH_INFOS_ERRORS_WARNINGS = "EXPATH_INFOS_ERRORS_WARNINGS".intern();
			public static final String VERBEXPATH_INFOS_ERRORS_WARNINGS = "VERBEXPATH_INFOS_ERRORS_WARNINGS".intern();
			public static final String VERBEXPATH_LIMDATADUMPS_INFOS_ERRORS_WARNINGS = "VERBEXPATH_LIMDATADUMPS_INFOS_ERRORS_WARNINGS".intern();
			public static final String FULLEXPATH_DATADUMPS_VERBINFOS_ERRORS_WARNINGS = "FULLEXPATH_DATADUMPS_VERBINFOS_ERRORS_WARNINGS".intern();
			public static final String FULLEXPATH_FULLDATADUMPS_VERBINFOS_ERRORS_WARNINGS = "FULLEXPATH_FULLDATADUMPS_VERBINFOS_ERRORS_WARNINGS".intern();
		}
		public static class SncQoP
		{
			public static final String AUTHENTICATION_ONLY = "AUTHENTICATION_ONLY".intern();
			public static final String INTEGRITY_PROTECTION = "INTEGRITY_PROTECTION".intern();
			public static final String PRIVACY_PROTECTION = "PRIVACY_PROTECTION".intern();
		}
	}
	public static class Relations
	{
		public static final String JCOATTRFORJCODESTINATION = "JCoAttrForJCODestination".intern();
		public static final String JCODESTINATIONFORSAPCONFIGURATION = "JCODestinationForSAPConfiguration".intern();
		public static final String SAPCONFIGURATIONFORBASESTORE = "SAPConfigurationForBaseStore".intern();
	}
	
	protected GeneratedSapcoreconfigurationConstants()
	{
		// private constructor
	}
	
	
}
