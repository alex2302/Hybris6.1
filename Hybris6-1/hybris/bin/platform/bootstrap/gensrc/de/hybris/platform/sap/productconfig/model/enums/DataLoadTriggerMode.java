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
package de.hybris.platform.sap.productconfig.model.enums;

import de.hybris.platform.core.HybrisEnumValue;

/**
 * Generated enum DataLoadTriggerMode declared at extension sapproductconfigmodel.
 * <p/>
 * This enumeration defines the different data loader calling modes.
 */
@SuppressWarnings("PMD")
public enum DataLoadTriggerMode implements HybrisEnumValue
{
	/**
	 * Generated enum value for DataLoadTriggerMode.Resume declared at extension sapproductconfigmodel.
	 */
	RESUME("Resume"),
	/**
	 * Generated enum value for DataLoadTriggerMode.StartInitial declared at extension sapproductconfigmodel.
	 */
	STARTINITIAL("StartInitial"),
	/**
	 * Generated enum value for DataLoadTriggerMode.StartDelta declared at extension sapproductconfigmodel.
	 */
	STARTDELTA("StartDelta");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "DataLoadTriggerMode";
	
	/**<i>Generated simple class name constant.</i>*/
	public final static String SIMPLE_CLASSNAME = "DataLoadTriggerMode";
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private DataLoadTriggerMode(final String code)
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
