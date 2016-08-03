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
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.sap.core.configuration.jalo.SAPGlobalConfiguration;
import de.hybris.platform.sap.core.configuration.jalo.SAPHTTPDestination;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import sap.hybris.integration.models.constants.SapmodelConstants;

/**
 * Generated class for type {@link de.hybris.platform.sap.sapmodel.jalo.SAPLogicalSystem SAPLogicalSystem}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSAPLogicalSystem extends GenericItem
{
	/** Qualifier of the <code>SAPLogicalSystem.sapLogicalSystemName</code> attribute **/
	public static final String SAPLOGICALSYSTEMNAME = "sapLogicalSystemName";
	/** Qualifier of the <code>SAPLogicalSystem.sapHTTPDestination</code> attribute **/
	public static final String SAPHTTPDESTINATION = "sapHTTPDestination";
	/** Qualifier of the <code>SAPLogicalSystem.defaultLogicalSystem</code> attribute **/
	public static final String DEFAULTLOGICALSYSTEM = "defaultLogicalSystem";
	/** Qualifier of the <code>SAPLogicalSystem.sapGlobalConfiguration</code> attribute **/
	public static final String SAPGLOBALCONFIGURATION = "sapGlobalConfiguration";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SAPGLOBALCONFIGURATION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSAPLogicalSystem> SAPGLOBALCONFIGURATIONHANDLER = new BidirectionalOneToManyHandler<GeneratedSAPLogicalSystem>(
	SapmodelConstants.TC.SAPLOGICALSYSTEM,
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
		tmp.put(SAPLOGICALSYSTEMNAME, AttributeMode.INITIAL);
		tmp.put(SAPHTTPDESTINATION, AttributeMode.INITIAL);
		tmp.put(DEFAULTLOGICALSYSTEM, AttributeMode.INITIAL);
		tmp.put(SAPGLOBALCONFIGURATION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		SAPGLOBALCONFIGURATIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPLogicalSystem.defaultLogicalSystem</code> attribute.
	 * @return the defaultLogicalSystem - SAP Default Logical System
	 */
	public Boolean isDefaultLogicalSystem(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DEFAULTLOGICALSYSTEM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPLogicalSystem.defaultLogicalSystem</code> attribute.
	 * @return the defaultLogicalSystem - SAP Default Logical System
	 */
	public Boolean isDefaultLogicalSystem()
	{
		return isDefaultLogicalSystem( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPLogicalSystem.defaultLogicalSystem</code> attribute. 
	 * @return the defaultLogicalSystem - SAP Default Logical System
	 */
	public boolean isDefaultLogicalSystemAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDefaultLogicalSystem( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPLogicalSystem.defaultLogicalSystem</code> attribute. 
	 * @return the defaultLogicalSystem - SAP Default Logical System
	 */
	public boolean isDefaultLogicalSystemAsPrimitive()
	{
		return isDefaultLogicalSystemAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPLogicalSystem.defaultLogicalSystem</code> attribute. 
	 * @param value the defaultLogicalSystem - SAP Default Logical System
	 */
	public void setDefaultLogicalSystem(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DEFAULTLOGICALSYSTEM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPLogicalSystem.defaultLogicalSystem</code> attribute. 
	 * @param value the defaultLogicalSystem - SAP Default Logical System
	 */
	public void setDefaultLogicalSystem(final Boolean value)
	{
		setDefaultLogicalSystem( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPLogicalSystem.defaultLogicalSystem</code> attribute. 
	 * @param value the defaultLogicalSystem - SAP Default Logical System
	 */
	public void setDefaultLogicalSystem(final SessionContext ctx, final boolean value)
	{
		setDefaultLogicalSystem( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPLogicalSystem.defaultLogicalSystem</code> attribute. 
	 * @param value the defaultLogicalSystem - SAP Default Logical System
	 */
	public void setDefaultLogicalSystem(final boolean value)
	{
		setDefaultLogicalSystem( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPLogicalSystem.sapGlobalConfiguration</code> attribute.
	 * @return the sapGlobalConfiguration
	 */
	public SAPGlobalConfiguration getSapGlobalConfiguration(final SessionContext ctx)
	{
		return (SAPGlobalConfiguration)getProperty( ctx, SAPGLOBALCONFIGURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPLogicalSystem.sapGlobalConfiguration</code> attribute.
	 * @return the sapGlobalConfiguration
	 */
	public SAPGlobalConfiguration getSapGlobalConfiguration()
	{
		return getSapGlobalConfiguration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPLogicalSystem.sapGlobalConfiguration</code> attribute. 
	 * @param value the sapGlobalConfiguration
	 */
	public void setSapGlobalConfiguration(final SessionContext ctx, final SAPGlobalConfiguration value)
	{
		SAPGLOBALCONFIGURATIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPLogicalSystem.sapGlobalConfiguration</code> attribute. 
	 * @param value the sapGlobalConfiguration
	 */
	public void setSapGlobalConfiguration(final SAPGlobalConfiguration value)
	{
		setSapGlobalConfiguration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPLogicalSystem.sapHTTPDestination</code> attribute.
	 * @return the sapHTTPDestination - Specifies the http destination corresponding to logical system
	 */
	public SAPHTTPDestination getSapHTTPDestination(final SessionContext ctx)
	{
		return (SAPHTTPDestination)getProperty( ctx, SAPHTTPDESTINATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPLogicalSystem.sapHTTPDestination</code> attribute.
	 * @return the sapHTTPDestination - Specifies the http destination corresponding to logical system
	 */
	public SAPHTTPDestination getSapHTTPDestination()
	{
		return getSapHTTPDestination( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPLogicalSystem.sapHTTPDestination</code> attribute. 
	 * @param value the sapHTTPDestination - Specifies the http destination corresponding to logical system
	 */
	public void setSapHTTPDestination(final SessionContext ctx, final SAPHTTPDestination value)
	{
		setProperty(ctx, SAPHTTPDESTINATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPLogicalSystem.sapHTTPDestination</code> attribute. 
	 * @param value the sapHTTPDestination - Specifies the http destination corresponding to logical system
	 */
	public void setSapHTTPDestination(final SAPHTTPDestination value)
	{
		setSapHTTPDestination( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPLogicalSystem.sapLogicalSystemName</code> attribute.
	 * @return the sapLogicalSystemName - Target Logical System
	 */
	public String getSapLogicalSystemName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPLOGICALSYSTEMNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPLogicalSystem.sapLogicalSystemName</code> attribute.
	 * @return the sapLogicalSystemName - Target Logical System
	 */
	public String getSapLogicalSystemName()
	{
		return getSapLogicalSystemName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPLogicalSystem.sapLogicalSystemName</code> attribute. 
	 * @param value the sapLogicalSystemName - Target Logical System
	 */
	public void setSapLogicalSystemName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPLOGICALSYSTEMNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPLogicalSystem.sapLogicalSystemName</code> attribute. 
	 * @param value the sapLogicalSystemName - Target Logical System
	 */
	public void setSapLogicalSystemName(final String value)
	{
		setSapLogicalSystemName( getSession().getSessionContext(), value );
	}
	
}
