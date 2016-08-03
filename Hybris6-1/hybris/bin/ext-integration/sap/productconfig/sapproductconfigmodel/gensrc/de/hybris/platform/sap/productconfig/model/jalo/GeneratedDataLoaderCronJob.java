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

import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration;
import de.hybris.platform.sap.productconfig.model.constants.SapproductconfigmodelConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.cronjob.jalo.CronJob DataLoaderCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDataLoaderCronJob extends CronJob
{
	/** Qualifier of the <code>DataLoaderCronJob.sapConfiguration</code> attribute **/
	public static final String SAPCONFIGURATION = "sapConfiguration";
	/** Qualifier of the <code>DataLoaderCronJob.triggerMode</code> attribute **/
	public static final String TRIGGERMODE = "triggerMode";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SAPCONFIGURATION, AttributeMode.INITIAL);
		tmp.put(TRIGGERMODE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DataLoaderCronJob.sapConfiguration</code> attribute.
	 * @return the sapConfiguration
	 */
	public SAPConfiguration getSapConfiguration(final SessionContext ctx)
	{
		return (SAPConfiguration)getProperty( ctx, SAPCONFIGURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DataLoaderCronJob.sapConfiguration</code> attribute.
	 * @return the sapConfiguration
	 */
	public SAPConfiguration getSapConfiguration()
	{
		return getSapConfiguration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DataLoaderCronJob.sapConfiguration</code> attribute. 
	 * @param value the sapConfiguration
	 */
	public void setSapConfiguration(final SessionContext ctx, final SAPConfiguration value)
	{
		setProperty(ctx, SAPCONFIGURATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DataLoaderCronJob.sapConfiguration</code> attribute. 
	 * @param value the sapConfiguration
	 */
	public void setSapConfiguration(final SAPConfiguration value)
	{
		setSapConfiguration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DataLoaderCronJob.triggerMode</code> attribute.
	 * @return the triggerMode
	 */
	public EnumerationValue getTriggerMode(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TRIGGERMODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DataLoaderCronJob.triggerMode</code> attribute.
	 * @return the triggerMode
	 */
	public EnumerationValue getTriggerMode()
	{
		return getTriggerMode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DataLoaderCronJob.triggerMode</code> attribute. 
	 * @param value the triggerMode
	 */
	public void setTriggerMode(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TRIGGERMODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DataLoaderCronJob.triggerMode</code> attribute. 
	 * @param value the triggerMode
	 */
	public void setTriggerMode(final EnumerationValue value)
	{
		setTriggerMode( getSession().getSessionContext(), value );
	}
	
}
