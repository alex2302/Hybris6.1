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
package de.hybris.platform.sap.sapordermgmtbol.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration;
import de.hybris.platform.sap.sapordermgmtbol.constants.SapordermgmtbolConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>SapordermgmtbolManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSapordermgmtbolManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("sapordermgmt_enabled", AttributeMode.INITIAL);
		tmp.put("sapordermgmt_headerCondTypeFreight", AttributeMode.INITIAL);
		tmp.put("sapordermgmt_sourceFreight", AttributeMode.INITIAL);
		tmp.put("sapordermgmt_sourceNetWOFreight", AttributeMode.INITIAL);
		tmp.put("sapordermgmt_maxHits", AttributeMode.INITIAL);
		tmp.put("sapordermgmt_dateRange", AttributeMode.INITIAL);
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
	
	@Override
	public String getName()
	{
		return SapordermgmtbolConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapordermgmt_dateRange</code> attribute.
	 * @return the sapordermgmt_dateRange - sapordermgmt_dateRange
	 */
	public String getSapordermgmt_dateRange(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapordermgmtbolConstants.Attributes.SAPConfiguration.SAPORDERMGMT_DATERANGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapordermgmt_dateRange</code> attribute.
	 * @return the sapordermgmt_dateRange - sapordermgmt_dateRange
	 */
	public String getSapordermgmt_dateRange(final SAPConfiguration item)
	{
		return getSapordermgmt_dateRange( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapordermgmt_dateRange</code> attribute. 
	 * @param value the sapordermgmt_dateRange - sapordermgmt_dateRange
	 */
	public void setSapordermgmt_dateRange(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapordermgmtbolConstants.Attributes.SAPConfiguration.SAPORDERMGMT_DATERANGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapordermgmt_dateRange</code> attribute. 
	 * @param value the sapordermgmt_dateRange - sapordermgmt_dateRange
	 */
	public void setSapordermgmt_dateRange(final SAPConfiguration item, final String value)
	{
		setSapordermgmt_dateRange( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapordermgmt_enabled</code> attribute.
	 * @return the sapordermgmt_enabled - Determines whether the site should use external external order pricing
	 */
	public Boolean isSapordermgmt_enabled(final SessionContext ctx, final GenericItem item)
	{
		return (Boolean)item.getProperty( ctx, SapordermgmtbolConstants.Attributes.SAPConfiguration.SAPORDERMGMT_ENABLED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapordermgmt_enabled</code> attribute.
	 * @return the sapordermgmt_enabled - Determines whether the site should use external external order pricing
	 */
	public Boolean isSapordermgmt_enabled(final SAPConfiguration item)
	{
		return isSapordermgmt_enabled( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapordermgmt_enabled</code> attribute. 
	 * @return the sapordermgmt_enabled - Determines whether the site should use external external order pricing
	 */
	public boolean isSapordermgmt_enabledAsPrimitive(final SessionContext ctx, final SAPConfiguration item)
	{
		Boolean value = isSapordermgmt_enabled( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapordermgmt_enabled</code> attribute. 
	 * @return the sapordermgmt_enabled - Determines whether the site should use external external order pricing
	 */
	public boolean isSapordermgmt_enabledAsPrimitive(final SAPConfiguration item)
	{
		return isSapordermgmt_enabledAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapordermgmt_enabled</code> attribute. 
	 * @param value the sapordermgmt_enabled - Determines whether the site should use external external order pricing
	 */
	public void setSapordermgmt_enabled(final SessionContext ctx, final GenericItem item, final Boolean value)
	{
		item.setProperty(ctx, SapordermgmtbolConstants.Attributes.SAPConfiguration.SAPORDERMGMT_ENABLED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapordermgmt_enabled</code> attribute. 
	 * @param value the sapordermgmt_enabled - Determines whether the site should use external external order pricing
	 */
	public void setSapordermgmt_enabled(final SAPConfiguration item, final Boolean value)
	{
		setSapordermgmt_enabled( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapordermgmt_enabled</code> attribute. 
	 * @param value the sapordermgmt_enabled - Determines whether the site should use external external order pricing
	 */
	public void setSapordermgmt_enabled(final SessionContext ctx, final SAPConfiguration item, final boolean value)
	{
		setSapordermgmt_enabled( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapordermgmt_enabled</code> attribute. 
	 * @param value the sapordermgmt_enabled - Determines whether the site should use external external order pricing
	 */
	public void setSapordermgmt_enabled(final SAPConfiguration item, final boolean value)
	{
		setSapordermgmt_enabled( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapordermgmt_headerCondTypeFreight</code> attribute.
	 * @return the sapordermgmt_headerCondTypeFreight - sapordermgmt_headerCondTypeFreight
	 */
	public String getSapordermgmt_headerCondTypeFreight(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapordermgmtbolConstants.Attributes.SAPConfiguration.SAPORDERMGMT_HEADERCONDTYPEFREIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapordermgmt_headerCondTypeFreight</code> attribute.
	 * @return the sapordermgmt_headerCondTypeFreight - sapordermgmt_headerCondTypeFreight
	 */
	public String getSapordermgmt_headerCondTypeFreight(final SAPConfiguration item)
	{
		return getSapordermgmt_headerCondTypeFreight( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapordermgmt_headerCondTypeFreight</code> attribute. 
	 * @param value the sapordermgmt_headerCondTypeFreight - sapordermgmt_headerCondTypeFreight
	 */
	public void setSapordermgmt_headerCondTypeFreight(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapordermgmtbolConstants.Attributes.SAPConfiguration.SAPORDERMGMT_HEADERCONDTYPEFREIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapordermgmt_headerCondTypeFreight</code> attribute. 
	 * @param value the sapordermgmt_headerCondTypeFreight - sapordermgmt_headerCondTypeFreight
	 */
	public void setSapordermgmt_headerCondTypeFreight(final SAPConfiguration item, final String value)
	{
		setSapordermgmt_headerCondTypeFreight( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapordermgmt_maxHits</code> attribute.
	 * @return the sapordermgmt_maxHits - sapordermgmt_maxHits
	 */
	public String getSapordermgmt_maxHits(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapordermgmtbolConstants.Attributes.SAPConfiguration.SAPORDERMGMT_MAXHITS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapordermgmt_maxHits</code> attribute.
	 * @return the sapordermgmt_maxHits - sapordermgmt_maxHits
	 */
	public String getSapordermgmt_maxHits(final SAPConfiguration item)
	{
		return getSapordermgmt_maxHits( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapordermgmt_maxHits</code> attribute. 
	 * @param value the sapordermgmt_maxHits - sapordermgmt_maxHits
	 */
	public void setSapordermgmt_maxHits(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapordermgmtbolConstants.Attributes.SAPConfiguration.SAPORDERMGMT_MAXHITS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapordermgmt_maxHits</code> attribute. 
	 * @param value the sapordermgmt_maxHits - sapordermgmt_maxHits
	 */
	public void setSapordermgmt_maxHits(final SAPConfiguration item, final String value)
	{
		setSapordermgmt_maxHits( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapordermgmt_sourceFreight</code> attribute.
	 * @return the sapordermgmt_sourceFreight - sapordermgmt_sourceFreight
	 */
	public String getSapordermgmt_sourceFreight(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapordermgmtbolConstants.Attributes.SAPConfiguration.SAPORDERMGMT_SOURCEFREIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapordermgmt_sourceFreight</code> attribute.
	 * @return the sapordermgmt_sourceFreight - sapordermgmt_sourceFreight
	 */
	public String getSapordermgmt_sourceFreight(final SAPConfiguration item)
	{
		return getSapordermgmt_sourceFreight( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapordermgmt_sourceFreight</code> attribute. 
	 * @param value the sapordermgmt_sourceFreight - sapordermgmt_sourceFreight
	 */
	public void setSapordermgmt_sourceFreight(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapordermgmtbolConstants.Attributes.SAPConfiguration.SAPORDERMGMT_SOURCEFREIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapordermgmt_sourceFreight</code> attribute. 
	 * @param value the sapordermgmt_sourceFreight - sapordermgmt_sourceFreight
	 */
	public void setSapordermgmt_sourceFreight(final SAPConfiguration item, final String value)
	{
		setSapordermgmt_sourceFreight( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapordermgmt_sourceNetWOFreight</code> attribute.
	 * @return the sapordermgmt_sourceNetWOFreight - sapordermgmt_sourceNetWOFreight
	 */
	public String getSapordermgmt_sourceNetWOFreight(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapordermgmtbolConstants.Attributes.SAPConfiguration.SAPORDERMGMT_SOURCENETWOFREIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapordermgmt_sourceNetWOFreight</code> attribute.
	 * @return the sapordermgmt_sourceNetWOFreight - sapordermgmt_sourceNetWOFreight
	 */
	public String getSapordermgmt_sourceNetWOFreight(final SAPConfiguration item)
	{
		return getSapordermgmt_sourceNetWOFreight( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapordermgmt_sourceNetWOFreight</code> attribute. 
	 * @param value the sapordermgmt_sourceNetWOFreight - sapordermgmt_sourceNetWOFreight
	 */
	public void setSapordermgmt_sourceNetWOFreight(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapordermgmtbolConstants.Attributes.SAPConfiguration.SAPORDERMGMT_SOURCENETWOFREIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapordermgmt_sourceNetWOFreight</code> attribute. 
	 * @param value the sapordermgmt_sourceNetWOFreight - sapordermgmt_sourceNetWOFreight
	 */
	public void setSapordermgmt_sourceNetWOFreight(final SAPConfiguration item, final String value)
	{
		setSapordermgmt_sourceNetWOFreight( getSession().getSessionContext(), item, value );
	}
	
}
