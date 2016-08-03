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
 * Generated enum JCoCPICTrace declared at extension sapcoreconfiguration.
 * <p/>
 * This type determines the CPIP trace level.
 */
@SuppressWarnings("PMD")
public enum JCoCPICTrace implements HybrisEnumValue
{
	/**
	 * Generated enum value for JCoCPICTrace.NO_TRACE declared at extension sapcoreconfiguration.
	 */
	NO_TRACE("NO_TRACE"),
	/**
	 * Generated enum value for JCoCPICTrace.GLOBAL_TRACELEVEL declared at extension sapcoreconfiguration.
	 */
	GLOBAL_TRACELEVEL("GLOBAL_TRACELEVEL"),
	/**
	 * Generated enum value for JCoCPICTrace.MINIMAL_TRACELEVEL declared at extension sapcoreconfiguration.
	 */
	MINIMAL_TRACELEVEL("MINIMAL_TRACELEVEL"),
	/**
	 * Generated enum value for JCoCPICTrace.FULL_TRACELEVEL declared at extension sapcoreconfiguration.
	 */
	FULL_TRACELEVEL("FULL_TRACELEVEL"),
	/**
	 * Generated enum value for JCoCPICTrace.FULL_TRACELEVEL_DATA declared at extension sapcoreconfiguration.
	 */
	FULL_TRACELEVEL_DATA("FULL_TRACELEVEL_DATA");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "JCoCPICTrace";
	
	/**<i>Generated simple class name constant.</i>*/
	public final static String SIMPLE_CLASSNAME = "JCoCPICTrace";
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private JCoCPICTrace(final String code)
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
