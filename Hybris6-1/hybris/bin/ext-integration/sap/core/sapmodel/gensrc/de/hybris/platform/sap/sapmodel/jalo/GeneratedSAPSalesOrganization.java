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
package de.hybris.platform.sap.sapmodel.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import sap.hybris.integration.models.constants.SapmodelConstants;

/**
 * Generated class for type {@link de.hybris.platform.sap.sapmodel.jalo.SAPSalesOrganization SAPSalesOrganization}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSAPSalesOrganization extends GenericItem
{
	/** Qualifier of the <code>SAPSalesOrganization.salesOrganization</code> attribute **/
	public static final String SALESORGANIZATION = "salesOrganization";
	/** Qualifier of the <code>SAPSalesOrganization.distributionChannel</code> attribute **/
	public static final String DISTRIBUTIONCHANNEL = "distributionChannel";
	/** Qualifier of the <code>SAPSalesOrganization.division</code> attribute **/
	public static final String DIVISION = "division";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SALESORGANIZATION, AttributeMode.INITIAL);
		tmp.put(DISTRIBUTIONCHANNEL, AttributeMode.INITIAL);
		tmp.put(DIVISION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPSalesOrganization.distributionChannel</code> attribute.
	 * @return the distributionChannel - Distribution Channel
	 */
	public String getDistributionChannel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DISTRIBUTIONCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPSalesOrganization.distributionChannel</code> attribute.
	 * @return the distributionChannel - Distribution Channel
	 */
	public String getDistributionChannel()
	{
		return getDistributionChannel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPSalesOrganization.distributionChannel</code> attribute. 
	 * @param value the distributionChannel - Distribution Channel
	 */
	public void setDistributionChannel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DISTRIBUTIONCHANNEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPSalesOrganization.distributionChannel</code> attribute. 
	 * @param value the distributionChannel - Distribution Channel
	 */
	public void setDistributionChannel(final String value)
	{
		setDistributionChannel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPSalesOrganization.division</code> attribute.
	 * @return the division - Division
	 */
	public String getDivision(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DIVISION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPSalesOrganization.division</code> attribute.
	 * @return the division - Division
	 */
	public String getDivision()
	{
		return getDivision( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPSalesOrganization.division</code> attribute. 
	 * @param value the division - Division
	 */
	public void setDivision(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DIVISION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPSalesOrganization.division</code> attribute. 
	 * @param value the division - Division
	 */
	public void setDivision(final String value)
	{
		setDivision( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPSalesOrganization.salesOrganization</code> attribute.
	 * @return the salesOrganization - Sales Organization
	 */
	public String getSalesOrganization(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORGANIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPSalesOrganization.salesOrganization</code> attribute.
	 * @return the salesOrganization - Sales Organization
	 */
	public String getSalesOrganization()
	{
		return getSalesOrganization( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPSalesOrganization.salesOrganization</code> attribute. 
	 * @param value the salesOrganization - Sales Organization
	 */
	public void setSalesOrganization(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORGANIZATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPSalesOrganization.salesOrganization</code> attribute. 
	 * @param value the salesOrganization - Sales Organization
	 */
	public void setSalesOrganization(final String value)
	{
		setSalesOrganization( getSession().getSessionContext(), value );
	}
	
}
