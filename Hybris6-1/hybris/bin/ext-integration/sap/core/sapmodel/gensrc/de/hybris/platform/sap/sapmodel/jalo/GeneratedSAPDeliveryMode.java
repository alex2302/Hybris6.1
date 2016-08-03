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
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.order.delivery.DeliveryMode;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import sap.hybris.integration.models.constants.SapmodelConstants;

/**
 * Generated class for type {@link de.hybris.platform.sap.sapmodel.jalo.SAPDeliveryMode SAPDeliveryMode}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSAPDeliveryMode extends GenericItem
{
	/** Qualifier of the <code>SAPDeliveryMode.sapConfiguration</code> attribute **/
	public static final String SAPCONFIGURATION = "sapConfiguration";
	/** Qualifier of the <code>SAPDeliveryMode.deliveryMode</code> attribute **/
	public static final String DELIVERYMODE = "deliveryMode";
	/** Qualifier of the <code>SAPDeliveryMode.deliveryValue</code> attribute **/
	public static final String DELIVERYVALUE = "deliveryValue";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SAPCONFIGURATION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSAPDeliveryMode> SAPCONFIGURATIONHANDLER = new BidirectionalOneToManyHandler<GeneratedSAPDeliveryMode>(
	SapmodelConstants.TC.SAPDELIVERYMODE,
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
		tmp.put(SAPCONFIGURATION, AttributeMode.INITIAL);
		tmp.put(DELIVERYMODE, AttributeMode.INITIAL);
		tmp.put(DELIVERYVALUE, AttributeMode.INITIAL);
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
	 * <i>Generated method</i> - Getter of the <code>SAPDeliveryMode.deliveryMode</code> attribute.
	 * @return the deliveryMode
	 */
	public DeliveryMode getDeliveryMode(final SessionContext ctx)
	{
		return (DeliveryMode)getProperty( ctx, DELIVERYMODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDeliveryMode.deliveryMode</code> attribute.
	 * @return the deliveryMode
	 */
	public DeliveryMode getDeliveryMode()
	{
		return getDeliveryMode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDeliveryMode.deliveryMode</code> attribute. 
	 * @param value the deliveryMode
	 */
	public void setDeliveryMode(final SessionContext ctx, final DeliveryMode value)
	{
		setProperty(ctx, DELIVERYMODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDeliveryMode.deliveryMode</code> attribute. 
	 * @param value the deliveryMode
	 */
	public void setDeliveryMode(final DeliveryMode value)
	{
		setDeliveryMode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDeliveryMode.deliveryValue</code> attribute.
	 * @return the deliveryValue
	 */
	public String getDeliveryValue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DELIVERYVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDeliveryMode.deliveryValue</code> attribute.
	 * @return the deliveryValue
	 */
	public String getDeliveryValue()
	{
		return getDeliveryValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDeliveryMode.deliveryValue</code> attribute. 
	 * @param value the deliveryValue
	 */
	public void setDeliveryValue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DELIVERYVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDeliveryMode.deliveryValue</code> attribute. 
	 * @param value the deliveryValue
	 */
	public void setDeliveryValue(final String value)
	{
		setDeliveryValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDeliveryMode.sapConfiguration</code> attribute.
	 * @return the sapConfiguration
	 */
	public SAPConfiguration getSapConfiguration(final SessionContext ctx)
	{
		return (SAPConfiguration)getProperty( ctx, SAPCONFIGURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDeliveryMode.sapConfiguration</code> attribute.
	 * @return the sapConfiguration
	 */
	public SAPConfiguration getSapConfiguration()
	{
		return getSapConfiguration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDeliveryMode.sapConfiguration</code> attribute. 
	 * @param value the sapConfiguration
	 */
	protected void setSapConfiguration(final SessionContext ctx, final SAPConfiguration value)
	{
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+SAPCONFIGURATION+"' is not changeable", 0 );
		}
		SAPCONFIGURATIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPDeliveryMode.sapConfiguration</code> attribute. 
	 * @param value the sapConfiguration
	 */
	protected void setSapConfiguration(final SAPConfiguration value)
	{
		setSapConfiguration( getSession().getSessionContext(), value );
	}
	
}
