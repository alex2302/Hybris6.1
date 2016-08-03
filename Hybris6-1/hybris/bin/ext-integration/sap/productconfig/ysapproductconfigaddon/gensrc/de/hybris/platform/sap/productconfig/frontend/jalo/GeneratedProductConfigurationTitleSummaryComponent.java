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
package de.hybris.platform.sap.productconfig.frontend.jalo;

import de.hybris.platform.cms2.jalo.contents.components.CMSParagraphComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.sap.productconfig.frontend.constants.SapproductconfigaddonConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.cms2.jalo.contents.components.CMSParagraphComponent ProductConfigurationTitleSummaryComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedProductConfigurationTitleSummaryComponent extends CMSParagraphComponent
{
	/** Qualifier of the <code>ProductConfigurationTitleSummaryComponent.showSummary</code> attribute **/
	public static final String SHOWSUMMARY = "showSummary";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CMSParagraphComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SHOWSUMMARY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductConfigurationTitleSummaryComponent.showSummary</code> attribute.
	 * @return the showSummary
	 */
	public Boolean isShowSummary(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SHOWSUMMARY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductConfigurationTitleSummaryComponent.showSummary</code> attribute.
	 * @return the showSummary
	 */
	public Boolean isShowSummary()
	{
		return isShowSummary( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductConfigurationTitleSummaryComponent.showSummary</code> attribute. 
	 * @return the showSummary
	 */
	public boolean isShowSummaryAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isShowSummary( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductConfigurationTitleSummaryComponent.showSummary</code> attribute. 
	 * @return the showSummary
	 */
	public boolean isShowSummaryAsPrimitive()
	{
		return isShowSummaryAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductConfigurationTitleSummaryComponent.showSummary</code> attribute. 
	 * @param value the showSummary
	 */
	public void setShowSummary(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SHOWSUMMARY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductConfigurationTitleSummaryComponent.showSummary</code> attribute. 
	 * @param value the showSummary
	 */
	public void setShowSummary(final Boolean value)
	{
		setShowSummary( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductConfigurationTitleSummaryComponent.showSummary</code> attribute. 
	 * @param value the showSummary
	 */
	public void setShowSummary(final SessionContext ctx, final boolean value)
	{
		setShowSummary( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductConfigurationTitleSummaryComponent.showSummary</code> attribute. 
	 * @param value the showSummary
	 */
	public void setShowSummary(final boolean value)
	{
		setShowSummary( getSession().getSessionContext(), value );
	}
	
}
