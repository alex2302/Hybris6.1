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
package de.hybris.platform.sap.core.configuration.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.sap.core.configuration.constants.SapcoreconfigurationConstants;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem SAPAdministration}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSAPAdministration extends GenericItem
{
	/** Qualifier of the <code>SAPAdministration.core_lastDataHubInitialLoad</code> attribute **/
	public static final String CORE_LASTDATAHUBINITIALLOAD = "core_lastDataHubInitialLoad";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CORE_LASTDATAHUBINITIALLOAD, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPAdministration.core_lastDataHubInitialLoad</code> attribute.
	 * @return the core_lastDataHubInitialLoad - Last Data Hub Initial Load
	 */
	public Date getCore_lastDataHubInitialLoad(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CORE_LASTDATAHUBINITIALLOAD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPAdministration.core_lastDataHubInitialLoad</code> attribute.
	 * @return the core_lastDataHubInitialLoad - Last Data Hub Initial Load
	 */
	public Date getCore_lastDataHubInitialLoad()
	{
		return getCore_lastDataHubInitialLoad( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPAdministration.core_lastDataHubInitialLoad</code> attribute. 
	 * @param value the core_lastDataHubInitialLoad - Last Data Hub Initial Load
	 */
	public void setCore_lastDataHubInitialLoad(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CORE_LASTDATAHUBINITIALLOAD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPAdministration.core_lastDataHubInitialLoad</code> attribute. 
	 * @param value the core_lastDataHubInitialLoad - Last Data Hub Initial Load
	 */
	public void setCore_lastDataHubInitialLoad(final Date value)
	{
		setCore_lastDataHubInitialLoad( getSession().getSessionContext(), value );
	}
	
}
