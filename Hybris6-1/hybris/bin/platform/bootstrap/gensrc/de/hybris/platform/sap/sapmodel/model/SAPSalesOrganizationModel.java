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
package de.hybris.platform.sap.sapmodel.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SAPSalesOrganization first defined at extension sapmodel.
 */
@SuppressWarnings("all")
public class SAPSalesOrganizationModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SAPSalesOrganization";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPSalesOrganization.salesOrganization</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SALESORGANIZATION = "salesOrganization";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPSalesOrganization.distributionChannel</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String DISTRIBUTIONCHANNEL = "distributionChannel";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPSalesOrganization.division</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String DIVISION = "division";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPSalesOrganizationModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPSalesOrganizationModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public SAPSalesOrganizationModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPSalesOrganization.distributionChannel</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the distributionChannel - Distribution Channel
	 */
	@Accessor(qualifier = "distributionChannel", type = Accessor.Type.GETTER)
	public String getDistributionChannel()
	{
		return getPersistenceContext().getPropertyValue(DISTRIBUTIONCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPSalesOrganization.division</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the division - Division
	 */
	@Accessor(qualifier = "division", type = Accessor.Type.GETTER)
	public String getDivision()
	{
		return getPersistenceContext().getPropertyValue(DIVISION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPSalesOrganization.salesOrganization</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the salesOrganization - Sales Organization
	 */
	@Accessor(qualifier = "salesOrganization", type = Accessor.Type.GETTER)
	public String getSalesOrganization()
	{
		return getPersistenceContext().getPropertyValue(SALESORGANIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPSalesOrganization.distributionChannel</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the distributionChannel - Distribution Channel
	 */
	@Accessor(qualifier = "distributionChannel", type = Accessor.Type.SETTER)
	public void setDistributionChannel(final String value)
	{
		getPersistenceContext().setPropertyValue(DISTRIBUTIONCHANNEL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPSalesOrganization.division</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the division - Division
	 */
	@Accessor(qualifier = "division", type = Accessor.Type.SETTER)
	public void setDivision(final String value)
	{
		getPersistenceContext().setPropertyValue(DIVISION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPSalesOrganization.salesOrganization</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the salesOrganization - Sales Organization
	 */
	@Accessor(qualifier = "salesOrganization", type = Accessor.Type.SETTER)
	public void setSalesOrganization(final String value)
	{
		getPersistenceContext().setPropertyValue(SALESORGANIZATION, value);
	}
	
}
