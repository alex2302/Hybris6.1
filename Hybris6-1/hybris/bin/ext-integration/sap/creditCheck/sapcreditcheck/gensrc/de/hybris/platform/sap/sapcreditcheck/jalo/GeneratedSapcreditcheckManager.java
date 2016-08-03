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
package de.hybris.platform.sap.sapcreditcheck.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration;
import de.hybris.platform.sap.sapcreditcheck.constants.SapcreditcheckConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>SapcreditcheckManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSapcreditcheckManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("sapcreditcheckactive", AttributeMode.INITIAL);
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
		return SapcreditcheckConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapcreditcheckactive</code> attribute.
	 * @return the sapcreditcheckactive - Determines whether the site should use SAP credit check
	 */
	public Boolean isSapcreditcheckactive(final SessionContext ctx, final GenericItem item)
	{
		return (Boolean)item.getProperty( ctx, SapcreditcheckConstants.Attributes.SAPConfiguration.SAPCREDITCHECKACTIVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapcreditcheckactive</code> attribute.
	 * @return the sapcreditcheckactive - Determines whether the site should use SAP credit check
	 */
	public Boolean isSapcreditcheckactive(final SAPConfiguration item)
	{
		return isSapcreditcheckactive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapcreditcheckactive</code> attribute. 
	 * @return the sapcreditcheckactive - Determines whether the site should use SAP credit check
	 */
	public boolean isSapcreditcheckactiveAsPrimitive(final SessionContext ctx, final SAPConfiguration item)
	{
		Boolean value = isSapcreditcheckactive( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapcreditcheckactive</code> attribute. 
	 * @return the sapcreditcheckactive - Determines whether the site should use SAP credit check
	 */
	public boolean isSapcreditcheckactiveAsPrimitive(final SAPConfiguration item)
	{
		return isSapcreditcheckactiveAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapcreditcheckactive</code> attribute. 
	 * @param value the sapcreditcheckactive - Determines whether the site should use SAP credit check
	 */
	public void setSapcreditcheckactive(final SessionContext ctx, final GenericItem item, final Boolean value)
	{
		item.setProperty(ctx, SapcreditcheckConstants.Attributes.SAPConfiguration.SAPCREDITCHECKACTIVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapcreditcheckactive</code> attribute. 
	 * @param value the sapcreditcheckactive - Determines whether the site should use SAP credit check
	 */
	public void setSapcreditcheckactive(final SAPConfiguration item, final Boolean value)
	{
		setSapcreditcheckactive( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapcreditcheckactive</code> attribute. 
	 * @param value the sapcreditcheckactive - Determines whether the site should use SAP credit check
	 */
	public void setSapcreditcheckactive(final SessionContext ctx, final SAPConfiguration item, final boolean value)
	{
		setSapcreditcheckactive( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapcreditcheckactive</code> attribute. 
	 * @param value the sapcreditcheckactive - Determines whether the site should use SAP credit check
	 */
	public void setSapcreditcheckactive(final SAPConfiguration item, final boolean value)
	{
		setSapcreditcheckactive( getSession().getSessionContext(), item, value );
	}
	
}
