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
 * Generated enum DataloadStatus declared at extension sapproductconfigmodel.
 * <p/>
 * This enumeration defines the different data load statuses.
 */
@SuppressWarnings("PMD")
public enum DataloadStatus implements HybrisEnumValue
{
	/**
	 * Generated enum value for DataloadStatus.NOT_STARTED declared at extension sapproductconfigmodel.
	 */
	NOT_STARTED("NOT_STARTED"),
	/**
	 * Generated enum value for DataloadStatus.INITIAL_LOAD declared at extension sapproductconfigmodel.
	 */
	INITIAL_LOAD("INITIAL_LOAD"),
	/**
	 * Generated enum value for DataloadStatus.INITIAL_LOAD_COMPLETED declared at extension sapproductconfigmodel.
	 */
	INITIAL_LOAD_COMPLETED("INITIAL_LOAD_COMPLETED"),
	/**
	 * Generated enum value for DataloadStatus.INITIAL_LOAD_STOPPED declared at extension sapproductconfigmodel.
	 */
	INITIAL_LOAD_STOPPED("INITIAL_LOAD_STOPPED"),
	/**
	 * Generated enum value for DataloadStatus.DELTA_LOAD declared at extension sapproductconfigmodel.
	 */
	DELTA_LOAD("DELTA_LOAD"),
	/**
	 * Generated enum value for DataloadStatus.DELTA_LOAD_STOPPED declared at extension sapproductconfigmodel.
	 */
	DELTA_LOAD_STOPPED("DELTA_LOAD_STOPPED"),
	/**
	 * Generated enum value for DataloadStatus.ERROR declared at extension sapproductconfigmodel.
	 */
	ERROR("ERROR");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "DataloadStatus";
	
	/**<i>Generated simple class name constant.</i>*/
	public final static String SIMPLE_CLASSNAME = "DataloadStatus";
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private DataloadStatus(final String code)
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
