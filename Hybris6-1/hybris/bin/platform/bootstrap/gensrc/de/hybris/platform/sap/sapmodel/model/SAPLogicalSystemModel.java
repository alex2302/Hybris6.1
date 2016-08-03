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
import de.hybris.platform.sap.core.configuration.model.SAPGlobalConfigurationModel;
import de.hybris.platform.sap.core.configuration.model.SAPHTTPDestinationModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SAPLogicalSystem first defined at extension sapmodel.
 */
@SuppressWarnings("all")
public class SAPLogicalSystemModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SAPLogicalSystem";
	
	/**<i>Generated relation code constant for relation <code>SAPGlobalConfig2LogSystem</code> defining source attribute <code>sapGlobalConfiguration</code> in extension <code>sapmodel</code>.</i>*/
	public final static String _SAPGLOBALCONFIG2LOGSYSTEM = "SAPGlobalConfig2LogSystem";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPLogicalSystem.sapLogicalSystemName</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPLOGICALSYSTEMNAME = "sapLogicalSystemName";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPLogicalSystem.sapHTTPDestination</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPHTTPDESTINATION = "sapHTTPDestination";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPLogicalSystem.defaultLogicalSystem</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String DEFAULTLOGICALSYSTEM = "defaultLogicalSystem";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPLogicalSystem.sapGlobalConfiguration</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPGLOBALCONFIGURATION = "sapGlobalConfiguration";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPLogicalSystemModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPLogicalSystemModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public SAPLogicalSystemModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPLogicalSystem.sapGlobalConfiguration</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the sapGlobalConfiguration
	 */
	@Accessor(qualifier = "sapGlobalConfiguration", type = Accessor.Type.GETTER)
	public SAPGlobalConfigurationModel getSapGlobalConfiguration()
	{
		return getPersistenceContext().getPropertyValue(SAPGLOBALCONFIGURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPLogicalSystem.sapHTTPDestination</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the sapHTTPDestination - Specifies the http destination corresponding to logical system
	 */
	@Accessor(qualifier = "sapHTTPDestination", type = Accessor.Type.GETTER)
	public SAPHTTPDestinationModel getSapHTTPDestination()
	{
		return getPersistenceContext().getPropertyValue(SAPHTTPDESTINATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPLogicalSystem.sapLogicalSystemName</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the sapLogicalSystemName - Target Logical System
	 */
	@Accessor(qualifier = "sapLogicalSystemName", type = Accessor.Type.GETTER)
	public String getSapLogicalSystemName()
	{
		return getPersistenceContext().getPropertyValue(SAPLOGICALSYSTEMNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPLogicalSystem.defaultLogicalSystem</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the defaultLogicalSystem - SAP Default Logical System
	 */
	@Accessor(qualifier = "defaultLogicalSystem", type = Accessor.Type.GETTER)
	public boolean isDefaultLogicalSystem()
	{
		return toPrimitive((Boolean)getPersistenceContext().getPropertyValue(DEFAULTLOGICALSYSTEM));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPLogicalSystem.defaultLogicalSystem</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the defaultLogicalSystem - SAP Default Logical System
	 */
	@Accessor(qualifier = "defaultLogicalSystem", type = Accessor.Type.SETTER)
	public void setDefaultLogicalSystem(final boolean value)
	{
		getPersistenceContext().setPropertyValue(DEFAULTLOGICALSYSTEM, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPLogicalSystem.sapGlobalConfiguration</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapGlobalConfiguration
	 */
	@Accessor(qualifier = "sapGlobalConfiguration", type = Accessor.Type.SETTER)
	public void setSapGlobalConfiguration(final SAPGlobalConfigurationModel value)
	{
		getPersistenceContext().setPropertyValue(SAPGLOBALCONFIGURATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPLogicalSystem.sapHTTPDestination</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapHTTPDestination - Specifies the http destination corresponding to logical system
	 */
	@Accessor(qualifier = "sapHTTPDestination", type = Accessor.Type.SETTER)
	public void setSapHTTPDestination(final SAPHTTPDestinationModel value)
	{
		getPersistenceContext().setPropertyValue(SAPHTTPDESTINATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPLogicalSystem.sapLogicalSystemName</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapLogicalSystemName - Target Logical System
	 */
	@Accessor(qualifier = "sapLogicalSystemName", type = Accessor.Type.SETTER)
	public void setSapLogicalSystemName(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPLOGICALSYSTEMNAME, value);
	}
	
}
