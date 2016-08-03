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

import de.hybris.platform.catalog.jalo.CatalogVersion;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.sap.core.configuration.jalo.SAPGlobalConfiguration;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import sap.hybris.integration.models.constants.SapmodelConstants;

/**
 * Generated class for type {@link de.hybris.platform.sap.sapmodel.jalo.SAPProductSalesAreaToCatalogMapping SAPProductSalesAreaToCatalogMapping}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSAPProductSalesAreaToCatalogMapping extends GenericItem
{
	/** Qualifier of the <code>SAPProductSalesAreaToCatalogMapping.salesOrganization</code> attribute **/
	public static final String SALESORGANIZATION = "salesOrganization";
	/** Qualifier of the <code>SAPProductSalesAreaToCatalogMapping.distributionChannel</code> attribute **/
	public static final String DISTRIBUTIONCHANNEL = "distributionChannel";
	/** Qualifier of the <code>SAPProductSalesAreaToCatalogMapping.catalogVersion</code> attribute **/
	public static final String CATALOGVERSION = "catalogVersion";
	/** Qualifier of the <code>SAPProductSalesAreaToCatalogMapping.taxClassCountry</code> attribute **/
	public static final String TAXCLASSCOUNTRY = "taxClassCountry";
	/** Qualifier of the <code>SAPProductSalesAreaToCatalogMapping.sapGlobalConfiguration</code> attribute **/
	public static final String SAPGLOBALCONFIGURATION = "sapGlobalConfiguration";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SAPGLOBALCONFIGURATION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSAPProductSalesAreaToCatalogMapping> SAPGLOBALCONFIGURATIONHANDLER = new BidirectionalOneToManyHandler<GeneratedSAPProductSalesAreaToCatalogMapping>(
	SapmodelConstants.TC.SAPPRODUCTSALESAREATOCATALOGMAPPING,
	false,
	"sapGlobalConfiguration",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SALESORGANIZATION, AttributeMode.INITIAL);
		tmp.put(DISTRIBUTIONCHANNEL, AttributeMode.INITIAL);
		tmp.put(CATALOGVERSION, AttributeMode.INITIAL);
		tmp.put(TAXCLASSCOUNTRY, AttributeMode.INITIAL);
		tmp.put(SAPGLOBALCONFIGURATION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductSalesAreaToCatalogMapping.catalogVersion</code> attribute.
	 * @return the catalogVersion - Catalog Version
	 */
	public CatalogVersion getCatalogVersion(final SessionContext ctx)
	{
		return (CatalogVersion)getProperty( ctx, CATALOGVERSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductSalesAreaToCatalogMapping.catalogVersion</code> attribute.
	 * @return the catalogVersion - Catalog Version
	 */
	public CatalogVersion getCatalogVersion()
	{
		return getCatalogVersion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPProductSalesAreaToCatalogMapping.catalogVersion</code> attribute. 
	 * @param value the catalogVersion - Catalog Version
	 */
	public void setCatalogVersion(final SessionContext ctx, final CatalogVersion value)
	{
		setProperty(ctx, CATALOGVERSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPProductSalesAreaToCatalogMapping.catalogVersion</code> attribute. 
	 * @param value the catalogVersion - Catalog Version
	 */
	public void setCatalogVersion(final CatalogVersion value)
	{
		setCatalogVersion( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		SAPGLOBALCONFIGURATIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductSalesAreaToCatalogMapping.distributionChannel</code> attribute.
	 * @return the distributionChannel - Distribution Channel
	 */
	public String getDistributionChannel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DISTRIBUTIONCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductSalesAreaToCatalogMapping.distributionChannel</code> attribute.
	 * @return the distributionChannel - Distribution Channel
	 */
	public String getDistributionChannel()
	{
		return getDistributionChannel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPProductSalesAreaToCatalogMapping.distributionChannel</code> attribute. 
	 * @param value the distributionChannel - Distribution Channel
	 */
	public void setDistributionChannel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DISTRIBUTIONCHANNEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPProductSalesAreaToCatalogMapping.distributionChannel</code> attribute. 
	 * @param value the distributionChannel - Distribution Channel
	 */
	public void setDistributionChannel(final String value)
	{
		setDistributionChannel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductSalesAreaToCatalogMapping.salesOrganization</code> attribute.
	 * @return the salesOrganization - Sales Organization
	 */
	public String getSalesOrganization(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORGANIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductSalesAreaToCatalogMapping.salesOrganization</code> attribute.
	 * @return the salesOrganization - Sales Organization
	 */
	public String getSalesOrganization()
	{
		return getSalesOrganization( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPProductSalesAreaToCatalogMapping.salesOrganization</code> attribute. 
	 * @param value the salesOrganization - Sales Organization
	 */
	public void setSalesOrganization(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORGANIZATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPProductSalesAreaToCatalogMapping.salesOrganization</code> attribute. 
	 * @param value the salesOrganization - Sales Organization
	 */
	public void setSalesOrganization(final String value)
	{
		setSalesOrganization( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductSalesAreaToCatalogMapping.sapGlobalConfiguration</code> attribute.
	 * @return the sapGlobalConfiguration
	 */
	public SAPGlobalConfiguration getSapGlobalConfiguration(final SessionContext ctx)
	{
		return (SAPGlobalConfiguration)getProperty( ctx, SAPGLOBALCONFIGURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductSalesAreaToCatalogMapping.sapGlobalConfiguration</code> attribute.
	 * @return the sapGlobalConfiguration
	 */
	public SAPGlobalConfiguration getSapGlobalConfiguration()
	{
		return getSapGlobalConfiguration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPProductSalesAreaToCatalogMapping.sapGlobalConfiguration</code> attribute. 
	 * @param value the sapGlobalConfiguration
	 */
	public void setSapGlobalConfiguration(final SessionContext ctx, final SAPGlobalConfiguration value)
	{
		SAPGLOBALCONFIGURATIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPProductSalesAreaToCatalogMapping.sapGlobalConfiguration</code> attribute. 
	 * @param value the sapGlobalConfiguration
	 */
	public void setSapGlobalConfiguration(final SAPGlobalConfiguration value)
	{
		setSapGlobalConfiguration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductSalesAreaToCatalogMapping.taxClassCountry</code> attribute.
	 * @return the taxClassCountry - Tax Class Country
	 */
	public Country getTaxClassCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, TAXCLASSCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductSalesAreaToCatalogMapping.taxClassCountry</code> attribute.
	 * @return the taxClassCountry - Tax Class Country
	 */
	public Country getTaxClassCountry()
	{
		return getTaxClassCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPProductSalesAreaToCatalogMapping.taxClassCountry</code> attribute. 
	 * @param value the taxClassCountry - Tax Class Country
	 */
	public void setTaxClassCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, TAXCLASSCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPProductSalesAreaToCatalogMapping.taxClassCountry</code> attribute. 
	 * @param value the taxClassCountry - Tax Class Country
	 */
	public void setTaxClassCountry(final Country value)
	{
		setTaxClassCountry( getSession().getSessionContext(), value );
	}
	
}
