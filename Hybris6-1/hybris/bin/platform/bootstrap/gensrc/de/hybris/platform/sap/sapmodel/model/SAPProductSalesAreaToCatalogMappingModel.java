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
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.sap.core.configuration.model.SAPGlobalConfigurationModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SAPProductSalesAreaToCatalogMapping first defined at extension sapmodel.
 */
@SuppressWarnings("all")
public class SAPProductSalesAreaToCatalogMappingModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SAPProductSalesAreaToCatalogMapping";
	
	/**<i>Generated relation code constant for relation <code>SAPGlobalConfigSAPProductSalesAreaToCatalogMappingRelation</code> defining source attribute <code>sapGlobalConfiguration</code> in extension <code>sapmodel</code>.</i>*/
	public final static String _SAPGLOBALCONFIGSAPPRODUCTSALESAREATOCATALOGMAPPINGRELATION = "SAPGlobalConfigSAPProductSalesAreaToCatalogMappingRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPProductSalesAreaToCatalogMapping.salesOrganization</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SALESORGANIZATION = "salesOrganization";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPProductSalesAreaToCatalogMapping.distributionChannel</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String DISTRIBUTIONCHANNEL = "distributionChannel";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPProductSalesAreaToCatalogMapping.catalogVersion</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String CATALOGVERSION = "catalogVersion";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPProductSalesAreaToCatalogMapping.taxClassCountry</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String TAXCLASSCOUNTRY = "taxClassCountry";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPProductSalesAreaToCatalogMapping.sapGlobalConfiguration</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPGLOBALCONFIGURATION = "sapGlobalConfiguration";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPProductSalesAreaToCatalogMappingModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPProductSalesAreaToCatalogMappingModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>SAPProductSalesAreaToCatalogMapping</code> at extension <code>sapmodel</code>
	 */
	@Deprecated
	public SAPProductSalesAreaToCatalogMappingModel(final CatalogVersionModel _catalogVersion)
	{
		super();
		setCatalogVersion(_catalogVersion);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>SAPProductSalesAreaToCatalogMapping</code> at extension <code>sapmodel</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public SAPProductSalesAreaToCatalogMappingModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductSalesAreaToCatalogMapping.catalogVersion</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the catalogVersion - Catalog Version
	 */
	@Accessor(qualifier = "catalogVersion", type = Accessor.Type.GETTER)
	public CatalogVersionModel getCatalogVersion()
	{
		return getPersistenceContext().getPropertyValue(CATALOGVERSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductSalesAreaToCatalogMapping.distributionChannel</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the distributionChannel - Distribution Channel
	 */
	@Accessor(qualifier = "distributionChannel", type = Accessor.Type.GETTER)
	public String getDistributionChannel()
	{
		return getPersistenceContext().getPropertyValue(DISTRIBUTIONCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductSalesAreaToCatalogMapping.salesOrganization</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the salesOrganization - Sales Organization
	 */
	@Accessor(qualifier = "salesOrganization", type = Accessor.Type.GETTER)
	public String getSalesOrganization()
	{
		return getPersistenceContext().getPropertyValue(SALESORGANIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductSalesAreaToCatalogMapping.sapGlobalConfiguration</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the sapGlobalConfiguration
	 */
	@Accessor(qualifier = "sapGlobalConfiguration", type = Accessor.Type.GETTER)
	public SAPGlobalConfigurationModel getSapGlobalConfiguration()
	{
		return getPersistenceContext().getPropertyValue(SAPGLOBALCONFIGURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductSalesAreaToCatalogMapping.taxClassCountry</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the taxClassCountry - Tax Class Country
	 */
	@Accessor(qualifier = "taxClassCountry", type = Accessor.Type.GETTER)
	public CountryModel getTaxClassCountry()
	{
		return getPersistenceContext().getPropertyValue(TAXCLASSCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPProductSalesAreaToCatalogMapping.catalogVersion</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the catalogVersion - Catalog Version
	 */
	@Accessor(qualifier = "catalogVersion", type = Accessor.Type.SETTER)
	public void setCatalogVersion(final CatalogVersionModel value)
	{
		getPersistenceContext().setPropertyValue(CATALOGVERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPProductSalesAreaToCatalogMapping.distributionChannel</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the distributionChannel - Distribution Channel
	 */
	@Accessor(qualifier = "distributionChannel", type = Accessor.Type.SETTER)
	public void setDistributionChannel(final String value)
	{
		getPersistenceContext().setPropertyValue(DISTRIBUTIONCHANNEL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPProductSalesAreaToCatalogMapping.salesOrganization</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the salesOrganization - Sales Organization
	 */
	@Accessor(qualifier = "salesOrganization", type = Accessor.Type.SETTER)
	public void setSalesOrganization(final String value)
	{
		getPersistenceContext().setPropertyValue(SALESORGANIZATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPProductSalesAreaToCatalogMapping.sapGlobalConfiguration</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapGlobalConfiguration
	 */
	@Accessor(qualifier = "sapGlobalConfiguration", type = Accessor.Type.SETTER)
	public void setSapGlobalConfiguration(final SAPGlobalConfigurationModel value)
	{
		getPersistenceContext().setPropertyValue(SAPGLOBALCONFIGURATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPProductSalesAreaToCatalogMapping.taxClassCountry</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the taxClassCountry - Tax Class Country
	 */
	@Accessor(qualifier = "taxClassCountry", type = Accessor.Type.SETTER)
	public void setTaxClassCountry(final CountryModel value)
	{
		getPersistenceContext().setPropertyValue(TAXCLASSCOUNTRY, value);
	}
	
}
