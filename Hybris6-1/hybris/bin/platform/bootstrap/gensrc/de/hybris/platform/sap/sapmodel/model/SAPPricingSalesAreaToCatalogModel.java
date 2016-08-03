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
import de.hybris.platform.sap.core.configuration.model.SAPGlobalConfigurationModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SAPPricingSalesAreaToCatalog first defined at extension sapmodel.
 */
@SuppressWarnings("all")
public class SAPPricingSalesAreaToCatalogModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SAPPricingSalesAreaToCatalog";
	
	/**<i>Generated relation code constant for relation <code>SAPGlobalConfigurationPricingSalesArea</code> defining source attribute <code>sapcommon_sapGlobalConfiguration</code> in extension <code>sapmodel</code>.</i>*/
	public final static String _SAPGLOBALCONFIGURATIONPRICINGSALESAREA = "SAPGlobalConfigurationPricingSalesArea";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPPricingSalesAreaToCatalog.salesOrganization</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SALESORGANIZATION = "salesOrganization";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPPricingSalesAreaToCatalog.distributionChannel</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String DISTRIBUTIONCHANNEL = "distributionChannel";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPPricingSalesAreaToCatalog.catalogVersion</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String CATALOGVERSION = "catalogVersion";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPPricingSalesAreaToCatalog.net</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String NET = "net";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPPricingSalesAreaToCatalog.sapcommon_sapGlobalConfiguration</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPCOMMON_SAPGLOBALCONFIGURATION = "sapcommon_sapGlobalConfiguration";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPPricingSalesAreaToCatalogModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPPricingSalesAreaToCatalogModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>SAPPricingSalesAreaToCatalog</code> at extension <code>sapmodel</code>
	 */
	@Deprecated
	public SAPPricingSalesAreaToCatalogModel(final CatalogVersionModel _catalogVersion)
	{
		super();
		setCatalogVersion(_catalogVersion);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>SAPPricingSalesAreaToCatalog</code> at extension <code>sapmodel</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public SAPPricingSalesAreaToCatalogModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingSalesAreaToCatalog.catalogVersion</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the catalogVersion - Catalog Version
	 */
	@Accessor(qualifier = "catalogVersion", type = Accessor.Type.GETTER)
	public CatalogVersionModel getCatalogVersion()
	{
		return getPersistenceContext().getPropertyValue(CATALOGVERSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingSalesAreaToCatalog.distributionChannel</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the distributionChannel - Distribution Channel
	 */
	@Accessor(qualifier = "distributionChannel", type = Accessor.Type.GETTER)
	public String getDistributionChannel()
	{
		return getPersistenceContext().getPropertyValue(DISTRIBUTIONCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingSalesAreaToCatalog.salesOrganization</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the salesOrganization - Sales Organization
	 */
	@Accessor(qualifier = "salesOrganization", type = Accessor.Type.GETTER)
	public String getSalesOrganization()
	{
		return getPersistenceContext().getPropertyValue(SALESORGANIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingSalesAreaToCatalog.sapcommon_sapGlobalConfiguration</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the sapcommon_sapGlobalConfiguration
	 */
	@Accessor(qualifier = "sapcommon_sapGlobalConfiguration", type = Accessor.Type.GETTER)
	public SAPGlobalConfigurationModel getSapcommon_sapGlobalConfiguration()
	{
		return getPersistenceContext().getPropertyValue(SAPCOMMON_SAPGLOBALCONFIGURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingSalesAreaToCatalog.net</code> dynamic attribute defined at extension <code>sapmodel</code>. 
	 * @return the net - Net Flag
	 */
	@Accessor(qualifier = "net", type = Accessor.Type.GETTER)
	public boolean isNet()
	{
		return toPrimitive( (Boolean) getPersistenceContext().getDynamicValue(this,NET));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPPricingSalesAreaToCatalog.catalogVersion</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the catalogVersion - Catalog Version
	 */
	@Accessor(qualifier = "catalogVersion", type = Accessor.Type.SETTER)
	public void setCatalogVersion(final CatalogVersionModel value)
	{
		getPersistenceContext().setPropertyValue(CATALOGVERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPPricingSalesAreaToCatalog.distributionChannel</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the distributionChannel - Distribution Channel
	 */
	@Accessor(qualifier = "distributionChannel", type = Accessor.Type.SETTER)
	public void setDistributionChannel(final String value)
	{
		getPersistenceContext().setPropertyValue(DISTRIBUTIONCHANNEL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPPricingSalesAreaToCatalog.salesOrganization</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the salesOrganization - Sales Organization
	 */
	@Accessor(qualifier = "salesOrganization", type = Accessor.Type.SETTER)
	public void setSalesOrganization(final String value)
	{
		getPersistenceContext().setPropertyValue(SALESORGANIZATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPPricingSalesAreaToCatalog.sapcommon_sapGlobalConfiguration</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapcommon_sapGlobalConfiguration
	 */
	@Accessor(qualifier = "sapcommon_sapGlobalConfiguration", type = Accessor.Type.SETTER)
	public void setSapcommon_sapGlobalConfiguration(final SAPGlobalConfigurationModel value)
	{
		getPersistenceContext().setPropertyValue(SAPCOMMON_SAPGLOBALCONFIGURATION, value);
	}
	
}
