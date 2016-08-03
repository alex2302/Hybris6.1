/*
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
package de.hybris.platform.sap.core.configuration.enums;

import de.hybris.platform.core.HybrisEnumValue;

/**
 * Generated enum JCoTraceLevel declared at extension sapcoreconfiguration.
 * <p/>
 * This type determines the JCo trace level.
 */
@SuppressWarnings("PMD")
public enum JCoTraceLevel implements HybrisEnumValue
{
	/**
	 * Generated enum value for JCoTraceLevel.NO_TRACE declared at extension sapcoreconfiguration.
	 */
	NO_TRACE("NO_TRACE"),
	/**
	 * Generated enum value for JCoTraceLevel.ERRORS declared at extension sapcoreconfiguration.
	 */
	ERRORS("ERRORS"),
	/**
	 * Generated enum value for JCoTraceLevel.ERRORS_WARNINGS declared at extension sapcoreconfiguration.
	 */
	ERRORS_WARNINGS("ERRORS_WARNINGS"),
	/**
	 * Generated enum value for JCoTraceLevel.INFOS_ERRORS_WARNINGS declared at extension sapcoreconfiguration.
	 */
	INFOS_ERRORS_WARNINGS("INFOS_ERRORS_WARNINGS"),
	/**
	 * Generated enum value for JCoTraceLevel.EXPATH_INFOS_ERRORS_WARNINGS declared at extension sapcoreconfiguration.
	 */
	EXPATH_INFOS_ERRORS_WARNINGS("EXPATH_INFOS_ERRORS_WARNINGS"),
	/**
	 * Generated enum value for JCoTraceLevel.VERBEXPATH_INFOS_ERRORS_WARNINGS declared at extension sapcoreconfiguration.
	 */
	VERBEXPATH_INFOS_ERRORS_WARNINGS("VERBEXPATH_INFOS_ERRORS_WARNINGS"),
	/**
	 * Generated enum value for JCoTraceLevel.VERBEXPATH_LIMDATADUMPS_INFOS_ERRORS_WARNINGS declared at extension sapcoreconfiguration.
	 */
	VERBEXPATH_LIMDATADUMPS_INFOS_ERRORS_WARNINGS("VERBEXPATH_LIMDATADUMPS_INFOS_ERRORS_WARNINGS"),
	/**
	 * Generated enum value for JCoTraceLevel.FULLEXPATH_DATADUMPS_VERBINFOS_ERRORS_WARNINGS declared at extension sapcoreconfiguration.
	 */
	FULLEXPATH_DATADUMPS_VERBINFOS_ERRORS_WARNINGS("FULLEXPATH_DATADUMPS_VERBINFOS_ERRORS_WARNINGS"),
	/**
	 * Generated enum value for JCoTraceLevel.FULLEXPATH_FULLDATADUMPS_VERBINFOS_ERRORS_WARNINGS declared at extension sapcoreconfiguration.
	 */
	FULLEXPATH_FULLDATADUMPS_VERBINFOS_ERRORS_WARNINGS("FULLEXPATH_FULLDATADUMPS_VERBINFOS_ERRORS_WARNINGS");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "JCoTraceLevel";
	
	/**<i>Generated simple class name constant.</i>*/
	public final static String SIMPLE_CLASSNAME = "JCoTraceLevel";
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private JCoTraceLevel(final String code)
	{
		this.code = code.intern();
	}
	
	
	/**
	 * Gets the code of this enum value.
	 *  
	 * @return code of value
	 */
	@Override
	public String getCode()
	{
		return this.code;
	}
	
	/**
	 * Gets the type this enum value belongs to.
	 *  
	 * @return code of type
	 */
	@Override
	public String getType()
	{
		return SIMPLE_CLASSNAME;
	}
	
}
