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
import de.hybris.platform.jalo.order.payment.PaymentMode;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import sap.hybris.integration.models.constants.SapmodelConstants;

/**
 * Generated class for type {@link de.hybris.platform.sap.sapmodel.jalo.SAPPaymentMode SAPPaymentMode}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSAPPaymentMode extends GenericItem
{
	/** Qualifier of the <code>SAPPaymentMode.sapConfiguration</code> attribute **/
	public static final String SAPCONFIGURATION = "sapConfiguration";
	/** Qualifier of the <code>SAPPaymentMode.paymentMode</code> attribute **/
	public static final String PAYMENTMODE = "paymentMode";
	/** Qualifier of the <code>SAPPaymentMode.paymentName</code> attribute **/
	public static final String PAYMENTNAME = "paymentName";
	/** Qualifier of the <code>SAPPaymentMode.paymentValue</code> attribute **/
	public static final String PAYMENTVALUE = "paymentValue";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SAPCONFIGURATION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSAPPaymentMode> SAPCONFIGURATIONHANDLER = new BidirectionalOneToManyHandler<GeneratedSAPPaymentMode>(
	SapmodelConstants.TC.SAPPAYMENTMODE,
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
		tmp.put(PAYMENTMODE, AttributeMode.INITIAL);
		tmp.put(PAYMENTNAME, AttributeMode.INITIAL);
		tmp.put(PAYMENTVALUE, AttributeMode.INITIAL);
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
	 * <i>Generated method</i> - Getter of the <code>SAPPaymentMode.paymentMode</code> attribute.
	 * @return the paymentMode
	 */
	public PaymentMode getPaymentMode(final SessionContext ctx)
	{
		return (PaymentMode)getProperty( ctx, PAYMENTMODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPaymentMode.paymentMode</code> attribute.
	 * @return the paymentMode
	 */
	public PaymentMode getPaymentMode()
	{
		return getPaymentMode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPaymentMode.paymentMode</code> attribute. 
	 * @param value the paymentMode
	 */
	public void setPaymentMode(final SessionContext ctx, final PaymentMode value)
	{
		setProperty(ctx, PAYMENTMODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPaymentMode.paymentMode</code> attribute. 
	 * @param value the paymentMode
	 */
	public void setPaymentMode(final PaymentMode value)
	{
		setPaymentMode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPaymentMode.paymentName</code> attribute.
	 * @return the paymentName
	 */
	public String getPaymentName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PAYMENTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPaymentMode.paymentName</code> attribute.
	 * @return the paymentName
	 */
	public String getPaymentName()
	{
		return getPaymentName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPaymentMode.paymentName</code> attribute. 
	 * @param value the paymentName
	 */
	public void setPaymentName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PAYMENTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPaymentMode.paymentName</code> attribute. 
	 * @param value the paymentName
	 */
	public void setPaymentName(final String value)
	{
		setPaymentName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPaymentMode.paymentValue</code> attribute.
	 * @return the paymentValue
	 */
	public String getPaymentValue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PAYMENTVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPaymentMode.paymentValue</code> attribute.
	 * @return the paymentValue
	 */
	public String getPaymentValue()
	{
		return getPaymentValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPaymentMode.paymentValue</code> attribute. 
	 * @param value the paymentValue
	 */
	public void setPaymentValue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PAYMENTVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPaymentMode.paymentValue</code> attribute. 
	 * @param value the paymentValue
	 */
	public void setPaymentValue(final String value)
	{
		setPaymentValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPaymentMode.sapConfiguration</code> attribute.
	 * @return the sapConfiguration
	 */
	public SAPConfiguration getSapConfiguration(final SessionContext ctx)
	{
		return (SAPConfiguration)getProperty( ctx, SAPCONFIGURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPaymentMode.sapConfiguration</code> attribute.
	 * @return the sapConfiguration
	 */
	public SAPConfiguration getSapConfiguration()
	{
		return getSapConfiguration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPaymentMode.sapConfiguration</code> attribute. 
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
	 * <i>Generated method</i> - Setter of the <code>SAPPaymentMode.sapConfiguration</code> attribute. 
	 * @param value the sapConfiguration
	 */
	protected void setSapConfiguration(final SAPConfiguration value)
	{
		setSapConfiguration( getSession().getSessionContext(), value );
	}
	
}
