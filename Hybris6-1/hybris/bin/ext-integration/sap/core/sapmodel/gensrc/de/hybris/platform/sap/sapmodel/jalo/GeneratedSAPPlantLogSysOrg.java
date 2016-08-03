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
import de.hybris.platform.ordersplitting.jalo.Warehouse;
import de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration;
import de.hybris.platform.sap.sapmodel.jalo.SAPLogicalSystem;
import de.hybris.platform.sap.sapmodel.jalo.SAPSalesOrganization;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import sap.hybris.integration.models.constants.SapmodelConstants;

/**
 * Generated class for type {@link de.hybris.platform.sap.sapmodel.jalo.SAPPlantLogSysOrg SAPPlantLogSysOrg}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSAPPlantLogSysOrg extends GenericItem
{
	/** Qualifier of the <code>SAPPlantLogSysOrg.plant</code> attribute **/
	public static final String PLANT = "plant";
	/** Qualifier of the <code>SAPPlantLogSysOrg.logSys</code> attribute **/
	public static final String LOGSYS = "logSys";
	/** Qualifier of the <code>SAPPlantLogSysOrg.salesOrg</code> attribute **/
	public static final String SALESORG = "salesOrg";
	/** Qualifier of the <code>SAPPlantLogSysOrg.sapConfiguration</code> attribute **/
	public static final String SAPCONFIGURATION = "sapConfiguration";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SAPCONFIGURATION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSAPPlantLogSysOrg> SAPCONFIGURATIONHANDLER = new BidirectionalOneToManyHandler<GeneratedSAPPlantLogSysOrg>(
	SapmodelConstants.TC.SAPPLANTLOGSYSORG,
	false,
	"sapConfiguration",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PLANT, AttributeMode.INITIAL);
		tmp.put(LOGSYS, AttributeMode.INITIAL);
		tmp.put(SALESORG, AttributeMode.INITIAL);
		tmp.put(SAPCONFIGURATION, AttributeMode.INITIAL);
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
		SAPCONFIGURATIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPlantLogSysOrg.logSys</code> attribute.
	 * @return the logSys - SAP Logical System
	 */
	public SAPLogicalSystem getLogSys(final SessionContext ctx)
	{
		return (SAPLogicalSystem)getProperty( ctx, LOGSYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPlantLogSysOrg.logSys</code> attribute.
	 * @return the logSys - SAP Logical System
	 */
	public SAPLogicalSystem getLogSys()
	{
		return getLogSys( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPlantLogSysOrg.logSys</code> attribute. 
	 * @param value the logSys - SAP Logical System
	 */
	public void setLogSys(final SessionContext ctx, final SAPLogicalSystem value)
	{
		setProperty(ctx, LOGSYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPlantLogSysOrg.logSys</code> attribute. 
	 * @param value the logSys - SAP Logical System
	 */
	public void setLogSys(final SAPLogicalSystem value)
	{
		setLogSys( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPlantLogSysOrg.plant</code> attribute.
	 * @return the plant - Warehouse
	 */
	public Warehouse getPlant(final SessionContext ctx)
	{
		return (Warehouse)getProperty( ctx, PLANT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPlantLogSysOrg.plant</code> attribute.
	 * @return the plant - Warehouse
	 */
	public Warehouse getPlant()
	{
		return getPlant( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPlantLogSysOrg.plant</code> attribute. 
	 * @param value the plant - Warehouse
	 */
	public void setPlant(final SessionContext ctx, final Warehouse value)
	{
		setProperty(ctx, PLANT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPlantLogSysOrg.plant</code> attribute. 
	 * @param value the plant - Warehouse
	 */
	public void setPlant(final Warehouse value)
	{
		setPlant( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPlantLogSysOrg.salesOrg</code> attribute.
	 * @return the salesOrg - SAP Sales Organization
	 */
	public SAPSalesOrganization getSalesOrg(final SessionContext ctx)
	{
		return (SAPSalesOrganization)getProperty( ctx, SALESORG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPlantLogSysOrg.salesOrg</code> attribute.
	 * @return the salesOrg - SAP Sales Organization
	 */
	public SAPSalesOrganization getSalesOrg()
	{
		return getSalesOrg( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPlantLogSysOrg.salesOrg</code> attribute. 
	 * @param value the salesOrg - SAP Sales Organization
	 */
	public void setSalesOrg(final SessionContext ctx, final SAPSalesOrganization value)
	{
		setProperty(ctx, SALESORG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPlantLogSysOrg.salesOrg</code> attribute. 
	 * @param value the salesOrg - SAP Sales Organization
	 */
	public void setSalesOrg(final SAPSalesOrganization value)
	{
		setSalesOrg( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPlantLogSysOrg.sapConfiguration</code> attribute.
	 * @return the sapConfiguration
	 */
	public SAPConfiguration getSapConfiguration(final SessionContext ctx)
	{
		return (SAPConfiguration)getProperty( ctx, SAPCONFIGURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPlantLogSysOrg.sapConfiguration</code> attribute.
	 * @return the sapConfiguration
	 */
	public SAPConfiguration getSapConfiguration()
	{
		return getSapConfiguration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPlantLogSysOrg.sapConfiguration</code> attribute. 
	 * @param value the sapConfiguration
	 */
	public void setSapConfiguration(final SessionContext ctx, final SAPConfiguration value)
	{
		SAPCONFIGURATIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPlantLogSysOrg.sapConfiguration</code> attribute. 
	 * @param value the sapConfiguration
	 */
	public void setSapConfiguration(final SAPConfiguration value)
	{
		setSapConfiguration( getSession().getSessionContext(), value );
	}
	
}
