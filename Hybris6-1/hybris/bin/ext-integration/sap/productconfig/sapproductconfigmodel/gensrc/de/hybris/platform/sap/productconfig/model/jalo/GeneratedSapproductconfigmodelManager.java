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
package de.hybris.platform.sap.productconfig.model.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration;
import de.hybris.platform.sap.core.configuration.jalo.SAPRFCDestination;
import de.hybris.platform.sap.productconfig.model.constants.SapproductconfigmodelConstants;
import de.hybris.platform.sap.productconfig.model.jalo.CPQDataloadStatus;
import de.hybris.platform.sap.productconfig.model.jalo.DataLoaderCronJob;
import de.hybris.platform.sap.productconfig.model.jalo.DataLoaderStopCronJob;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>SapproductconfigmodelManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSapproductconfigmodelManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("sapproductconfig_enable_pricing", AttributeMode.INITIAL);
		tmp.put("sapproductconfig_pricingprocedure", AttributeMode.INITIAL);
		tmp.put("sapproductconfig_condfunc_baseprice", AttributeMode.INITIAL);
		tmp.put("sapproductconfig_condfunc_selectedoptions", AttributeMode.INITIAL);
		tmp.put("sapproductconfig_sapServer", AttributeMode.INITIAL);
		tmp.put("sapproductconfig_sapRFCDestination", AttributeMode.INITIAL);
		tmp.put("sapproductconfig_filterKnowledgeBase", AttributeMode.INITIAL);
		tmp.put("sapproductconfig_filterCondition", AttributeMode.INITIAL);
		tmp.put("sapproductconfig_filterMaterial", AttributeMode.INITIAL);
		tmp.put("sapproductconfig_cpqDataloadStatus", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public CPQDataloadStatus createCPQDataloadStatus(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapproductconfigmodelConstants.TC.CPQDATALOADSTATUS );
			return (CPQDataloadStatus)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CPQDataloadStatus : "+e.getMessage(), 0 );
		}
	}
	
	public CPQDataloadStatus createCPQDataloadStatus(final Map attributeValues)
	{
		return createCPQDataloadStatus( getSession().getSessionContext(), attributeValues );
	}
	
	public DataLoaderCronJob createDataLoaderCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapproductconfigmodelConstants.TC.DATALOADERCRONJOB );
			return (DataLoaderCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating DataLoaderCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public DataLoaderCronJob createDataLoaderCronJob(final Map attributeValues)
	{
		return createDataLoaderCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public DataLoaderStopCronJob createDataLoaderStopCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapproductconfigmodelConstants.TC.DATALOADERSTOPCRONJOB );
			return (DataLoaderStopCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating DataLoaderStopCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public DataLoaderStopCronJob createDataLoaderStopCronJob(final Map attributeValues)
	{
		return createDataLoaderStopCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return SapproductconfigmodelConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_condfunc_baseprice</code> attribute.
	 * @return the sapproductconfig_condfunc_baseprice - Product Config - Condition Function for Base Price
	 */
	public String getSapproductconfig_condfunc_baseprice(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapproductconfigmodelConstants.Attributes.SAPConfiguration.SAPPRODUCTCONFIG_CONDFUNC_BASEPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_condfunc_baseprice</code> attribute.
	 * @return the sapproductconfig_condfunc_baseprice - Product Config - Condition Function for Base Price
	 */
	public String getSapproductconfig_condfunc_baseprice(final SAPConfiguration item)
	{
		return getSapproductconfig_condfunc_baseprice( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapproductconfig_condfunc_baseprice</code> attribute. 
	 * @param value the sapproductconfig_condfunc_baseprice - Product Config - Condition Function for Base Price
	 */
	public void setSapproductconfig_condfunc_baseprice(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapproductconfigmodelConstants.Attributes.SAPConfiguration.SAPPRODUCTCONFIG_CONDFUNC_BASEPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapproductconfig_condfunc_baseprice</code> attribute. 
	 * @param value the sapproductconfig_condfunc_baseprice - Product Config - Condition Function for Base Price
	 */
	public void setSapproductconfig_condfunc_baseprice(final SAPConfiguration item, final String value)
	{
		setSapproductconfig_condfunc_baseprice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_condfunc_selectedoptions</code> attribute.
	 * @return the sapproductconfig_condfunc_selectedoptions - Product Config - Condition Function for Selected Options
	 */
	public String getSapproductconfig_condfunc_selectedoptions(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapproductconfigmodelConstants.Attributes.SAPConfiguration.SAPPRODUCTCONFIG_CONDFUNC_SELECTEDOPTIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_condfunc_selectedoptions</code> attribute.
	 * @return the sapproductconfig_condfunc_selectedoptions - Product Config - Condition Function for Selected Options
	 */
	public String getSapproductconfig_condfunc_selectedoptions(final SAPConfiguration item)
	{
		return getSapproductconfig_condfunc_selectedoptions( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapproductconfig_condfunc_selectedoptions</code> attribute. 
	 * @param value the sapproductconfig_condfunc_selectedoptions - Product Config - Condition Function for Selected Options
	 */
	public void setSapproductconfig_condfunc_selectedoptions(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapproductconfigmodelConstants.Attributes.SAPConfiguration.SAPPRODUCTCONFIG_CONDFUNC_SELECTEDOPTIONS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapproductconfig_condfunc_selectedoptions</code> attribute. 
	 * @param value the sapproductconfig_condfunc_selectedoptions - Product Config - Condition Function for Selected Options
	 */
	public void setSapproductconfig_condfunc_selectedoptions(final SAPConfiguration item, final String value)
	{
		setSapproductconfig_condfunc_selectedoptions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_cpqDataloadStatus</code> attribute.
	 * @return the sapproductconfig_cpqDataloadStatus - Product Config - Data Load Status
	 */
	public CPQDataloadStatus getSapproductconfig_cpqDataloadStatus(final SessionContext ctx, final GenericItem item)
	{
		return (CPQDataloadStatus)item.getProperty( ctx, SapproductconfigmodelConstants.Attributes.SAPConfiguration.SAPPRODUCTCONFIG_CPQDATALOADSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_cpqDataloadStatus</code> attribute.
	 * @return the sapproductconfig_cpqDataloadStatus - Product Config - Data Load Status
	 */
	public CPQDataloadStatus getSapproductconfig_cpqDataloadStatus(final SAPConfiguration item)
	{
		return getSapproductconfig_cpqDataloadStatus( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapproductconfig_cpqDataloadStatus</code> attribute. 
	 * @param value the sapproductconfig_cpqDataloadStatus - Product Config - Data Load Status
	 */
	public void setSapproductconfig_cpqDataloadStatus(final SessionContext ctx, final GenericItem item, final CPQDataloadStatus value)
	{
		item.setProperty(ctx, SapproductconfigmodelConstants.Attributes.SAPConfiguration.SAPPRODUCTCONFIG_CPQDATALOADSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapproductconfig_cpqDataloadStatus</code> attribute. 
	 * @param value the sapproductconfig_cpqDataloadStatus - Product Config - Data Load Status
	 */
	public void setSapproductconfig_cpqDataloadStatus(final SAPConfiguration item, final CPQDataloadStatus value)
	{
		setSapproductconfig_cpqDataloadStatus( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_enable_pricing</code> attribute.
	 * @return the sapproductconfig_enable_pricing - Product Config - Activate Pricing
	 */
	public Boolean isSapproductconfig_enable_pricing(final SessionContext ctx, final GenericItem item)
	{
		return (Boolean)item.getProperty( ctx, SapproductconfigmodelConstants.Attributes.SAPConfiguration.SAPPRODUCTCONFIG_ENABLE_PRICING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_enable_pricing</code> attribute.
	 * @return the sapproductconfig_enable_pricing - Product Config - Activate Pricing
	 */
	public Boolean isSapproductconfig_enable_pricing(final SAPConfiguration item)
	{
		return isSapproductconfig_enable_pricing( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_enable_pricing</code> attribute. 
	 * @return the sapproductconfig_enable_pricing - Product Config - Activate Pricing
	 */
	public boolean isSapproductconfig_enable_pricingAsPrimitive(final SessionContext ctx, final SAPConfiguration item)
	{
		Boolean value = isSapproductconfig_enable_pricing( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_enable_pricing</code> attribute. 
	 * @return the sapproductconfig_enable_pricing - Product Config - Activate Pricing
	 */
	public boolean isSapproductconfig_enable_pricingAsPrimitive(final SAPConfiguration item)
	{
		return isSapproductconfig_enable_pricingAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapproductconfig_enable_pricing</code> attribute. 
	 * @param value the sapproductconfig_enable_pricing - Product Config - Activate Pricing
	 */
	public void setSapproductconfig_enable_pricing(final SessionContext ctx, final GenericItem item, final Boolean value)
	{
		item.setProperty(ctx, SapproductconfigmodelConstants.Attributes.SAPConfiguration.SAPPRODUCTCONFIG_ENABLE_PRICING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapproductconfig_enable_pricing</code> attribute. 
	 * @param value the sapproductconfig_enable_pricing - Product Config - Activate Pricing
	 */
	public void setSapproductconfig_enable_pricing(final SAPConfiguration item, final Boolean value)
	{
		setSapproductconfig_enable_pricing( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapproductconfig_enable_pricing</code> attribute. 
	 * @param value the sapproductconfig_enable_pricing - Product Config - Activate Pricing
	 */
	public void setSapproductconfig_enable_pricing(final SessionContext ctx, final SAPConfiguration item, final boolean value)
	{
		setSapproductconfig_enable_pricing( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapproductconfig_enable_pricing</code> attribute. 
	 * @param value the sapproductconfig_enable_pricing - Product Config - Activate Pricing
	 */
	public void setSapproductconfig_enable_pricing(final SAPConfiguration item, final boolean value)
	{
		setSapproductconfig_enable_pricing( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_filterCondition</code> attribute.
	 * @return the sapproductconfig_filterCondition
	 */
	public Media getSapproductconfig_filterCondition(final SessionContext ctx, final GenericItem item)
	{
		return (Media)item.getProperty( ctx, SapproductconfigmodelConstants.Attributes.SAPConfiguration.SAPPRODUCTCONFIG_FILTERCONDITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_filterCondition</code> attribute.
	 * @return the sapproductconfig_filterCondition
	 */
	public Media getSapproductconfig_filterCondition(final SAPConfiguration item)
	{
		return getSapproductconfig_filterCondition( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapproductconfig_filterCondition</code> attribute. 
	 * @param value the sapproductconfig_filterCondition
	 */
	public void setSapproductconfig_filterCondition(final SessionContext ctx, final GenericItem item, final Media value)
	{
		item.setProperty(ctx, SapproductconfigmodelConstants.Attributes.SAPConfiguration.SAPPRODUCTCONFIG_FILTERCONDITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapproductconfig_filterCondition</code> attribute. 
	 * @param value the sapproductconfig_filterCondition
	 */
	public void setSapproductconfig_filterCondition(final SAPConfiguration item, final Media value)
	{
		setSapproductconfig_filterCondition( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_filterKnowledgeBase</code> attribute.
	 * @return the sapproductconfig_filterKnowledgeBase
	 */
	public Media getSapproductconfig_filterKnowledgeBase(final SessionContext ctx, final GenericItem item)
	{
		return (Media)item.getProperty( ctx, SapproductconfigmodelConstants.Attributes.SAPConfiguration.SAPPRODUCTCONFIG_FILTERKNOWLEDGEBASE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_filterKnowledgeBase</code> attribute.
	 * @return the sapproductconfig_filterKnowledgeBase
	 */
	public Media getSapproductconfig_filterKnowledgeBase(final SAPConfiguration item)
	{
		return getSapproductconfig_filterKnowledgeBase( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapproductconfig_filterKnowledgeBase</code> attribute. 
	 * @param value the sapproductconfig_filterKnowledgeBase
	 */
	public void setSapproductconfig_filterKnowledgeBase(final SessionContext ctx, final GenericItem item, final Media value)
	{
		item.setProperty(ctx, SapproductconfigmodelConstants.Attributes.SAPConfiguration.SAPPRODUCTCONFIG_FILTERKNOWLEDGEBASE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapproductconfig_filterKnowledgeBase</code> attribute. 
	 * @param value the sapproductconfig_filterKnowledgeBase
	 */
	public void setSapproductconfig_filterKnowledgeBase(final SAPConfiguration item, final Media value)
	{
		setSapproductconfig_filterKnowledgeBase( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_filterMaterial</code> attribute.
	 * @return the sapproductconfig_filterMaterial
	 */
	public Media getSapproductconfig_filterMaterial(final SessionContext ctx, final GenericItem item)
	{
		return (Media)item.getProperty( ctx, SapproductconfigmodelConstants.Attributes.SAPConfiguration.SAPPRODUCTCONFIG_FILTERMATERIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_filterMaterial</code> attribute.
	 * @return the sapproductconfig_filterMaterial
	 */
	public Media getSapproductconfig_filterMaterial(final SAPConfiguration item)
	{
		return getSapproductconfig_filterMaterial( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapproductconfig_filterMaterial</code> attribute. 
	 * @param value the sapproductconfig_filterMaterial
	 */
	public void setSapproductconfig_filterMaterial(final SessionContext ctx, final GenericItem item, final Media value)
	{
		item.setProperty(ctx, SapproductconfigmodelConstants.Attributes.SAPConfiguration.SAPPRODUCTCONFIG_FILTERMATERIAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapproductconfig_filterMaterial</code> attribute. 
	 * @param value the sapproductconfig_filterMaterial
	 */
	public void setSapproductconfig_filterMaterial(final SAPConfiguration item, final Media value)
	{
		setSapproductconfig_filterMaterial( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_pricingprocedure</code> attribute.
	 * @return the sapproductconfig_pricingprocedure - Product Config - Pricing Procedure
	 */
	public String getSapproductconfig_pricingprocedure(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapproductconfigmodelConstants.Attributes.SAPConfiguration.SAPPRODUCTCONFIG_PRICINGPROCEDURE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_pricingprocedure</code> attribute.
	 * @return the sapproductconfig_pricingprocedure - Product Config - Pricing Procedure
	 */
	public String getSapproductconfig_pricingprocedure(final SAPConfiguration item)
	{
		return getSapproductconfig_pricingprocedure( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapproductconfig_pricingprocedure</code> attribute. 
	 * @param value the sapproductconfig_pricingprocedure - Product Config - Pricing Procedure
	 */
	public void setSapproductconfig_pricingprocedure(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapproductconfigmodelConstants.Attributes.SAPConfiguration.SAPPRODUCTCONFIG_PRICINGPROCEDURE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapproductconfig_pricingprocedure</code> attribute. 
	 * @param value the sapproductconfig_pricingprocedure - Product Config - Pricing Procedure
	 */
	public void setSapproductconfig_pricingprocedure(final SAPConfiguration item, final String value)
	{
		setSapproductconfig_pricingprocedure( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_sapRFCDestination</code> attribute.
	 * @return the sapproductconfig_sapRFCDestination
	 */
	public String getSapproductconfig_sapRFCDestination(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapproductconfigmodelConstants.Attributes.SAPConfiguration.SAPPRODUCTCONFIG_SAPRFCDESTINATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_sapRFCDestination</code> attribute.
	 * @return the sapproductconfig_sapRFCDestination
	 */
	public String getSapproductconfig_sapRFCDestination(final SAPConfiguration item)
	{
		return getSapproductconfig_sapRFCDestination( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapproductconfig_sapRFCDestination</code> attribute. 
	 * @param value the sapproductconfig_sapRFCDestination
	 */
	public void setSapproductconfig_sapRFCDestination(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapproductconfigmodelConstants.Attributes.SAPConfiguration.SAPPRODUCTCONFIG_SAPRFCDESTINATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapproductconfig_sapRFCDestination</code> attribute. 
	 * @param value the sapproductconfig_sapRFCDestination
	 */
	public void setSapproductconfig_sapRFCDestination(final SAPConfiguration item, final String value)
	{
		setSapproductconfig_sapRFCDestination( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_sapServer</code> attribute.
	 * @return the sapproductconfig_sapServer
	 */
	public SAPRFCDestination getSapproductconfig_sapServer(final SessionContext ctx, final GenericItem item)
	{
		return (SAPRFCDestination)item.getProperty( ctx, SapproductconfigmodelConstants.Attributes.SAPConfiguration.SAPPRODUCTCONFIG_SAPSERVER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_sapServer</code> attribute.
	 * @return the sapproductconfig_sapServer
	 */
	public SAPRFCDestination getSapproductconfig_sapServer(final SAPConfiguration item)
	{
		return getSapproductconfig_sapServer( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapproductconfig_sapServer</code> attribute. 
	 * @param value the sapproductconfig_sapServer
	 */
	public void setSapproductconfig_sapServer(final SessionContext ctx, final GenericItem item, final SAPRFCDestination value)
	{
		item.setProperty(ctx, SapproductconfigmodelConstants.Attributes.SAPConfiguration.SAPPRODUCTCONFIG_SAPSERVER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapproductconfig_sapServer</code> attribute. 
	 * @param value the sapproductconfig_sapServer
	 */
	public void setSapproductconfig_sapServer(final SAPConfiguration item, final SAPRFCDestination value)
	{
		setSapproductconfig_sapServer( getSession().getSessionContext(), item, value );
	}
	
}
