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
import de.hybris.platform.jalo.order.AbstractOrderEntry;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import sap.hybris.integration.models.constants.SapmodelConstants;

/**
 * Generated class for type {@link de.hybris.platform.sap.sapmodel.jalo.SAPPricingCondition SAPPricingCondition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSAPPricingCondition extends GenericItem
{
	/** Qualifier of the <code>SAPPricingCondition.order</code> attribute **/
	public static final String ORDER = "order";
	/** Qualifier of the <code>SAPPricingCondition.conditionType</code> attribute **/
	public static final String CONDITIONTYPE = "conditionType";
	/** Qualifier of the <code>SAPPricingCondition.stepNumber</code> attribute **/
	public static final String STEPNUMBER = "stepNumber";
	/** Qualifier of the <code>SAPPricingCondition.conditionCounter</code> attribute **/
	public static final String CONDITIONCOUNTER = "conditionCounter";
	/** Qualifier of the <code>SAPPricingCondition.currencyKey</code> attribute **/
	public static final String CURRENCYKEY = "currencyKey";
	/** Qualifier of the <code>SAPPricingCondition.conditionPricingUnit</code> attribute **/
	public static final String CONDITIONPRICINGUNIT = "conditionPricingUnit";
	/** Qualifier of the <code>SAPPricingCondition.conditionUnit</code> attribute **/
	public static final String CONDITIONUNIT = "conditionUnit";
	/** Qualifier of the <code>SAPPricingCondition.conditionCalculationType</code> attribute **/
	public static final String CONDITIONCALCULATIONTYPE = "conditionCalculationType";
	/** Qualifier of the <code>SAPPricingCondition.conditionRate</code> attribute **/
	public static final String CONDITIONRATE = "conditionRate";
	/** Qualifier of the <code>SAPPricingCondition.conditionValue</code> attribute **/
	public static final String CONDITIONVALUE = "conditionValue";
	/** Qualifier of the <code>SAPPricingCondition.orderEntry</code> attribute **/
	public static final String ORDERENTRY = "orderEntry";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ORDERENTRY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSAPPricingCondition> ORDERENTRYHANDLER = new BidirectionalOneToManyHandler<GeneratedSAPPricingCondition>(
	SapmodelConstants.TC.SAPPRICINGCONDITION,
	false,
	"orderEntry",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ORDER, AttributeMode.INITIAL);
		tmp.put(CONDITIONTYPE, AttributeMode.INITIAL);
		tmp.put(STEPNUMBER, AttributeMode.INITIAL);
		tmp.put(CONDITIONCOUNTER, AttributeMode.INITIAL);
		tmp.put(CURRENCYKEY, AttributeMode.INITIAL);
		tmp.put(CONDITIONPRICINGUNIT, AttributeMode.INITIAL);
		tmp.put(CONDITIONUNIT, AttributeMode.INITIAL);
		tmp.put(CONDITIONCALCULATIONTYPE, AttributeMode.INITIAL);
		tmp.put(CONDITIONRATE, AttributeMode.INITIAL);
		tmp.put(CONDITIONVALUE, AttributeMode.INITIAL);
		tmp.put(ORDERENTRY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.conditionCalculationType</code> attribute.
	 * @return the conditionCalculationType - KRECH - Calculation type for condition
	 */
	public String getConditionCalculationType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONDITIONCALCULATIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.conditionCalculationType</code> attribute.
	 * @return the conditionCalculationType - KRECH - Calculation type for condition
	 */
	public String getConditionCalculationType()
	{
		return getConditionCalculationType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPricingCondition.conditionCalculationType</code> attribute. 
	 * @param value the conditionCalculationType - KRECH - Calculation type for condition
	 */
	public void setConditionCalculationType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONDITIONCALCULATIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPricingCondition.conditionCalculationType</code> attribute. 
	 * @param value the conditionCalculationType - KRECH - Calculation type for condition
	 */
	public void setConditionCalculationType(final String value)
	{
		setConditionCalculationType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.conditionCounter</code> attribute.
	 * @return the conditionCounter - ZAEHK - Condition counter
	 */
	public String getConditionCounter(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONDITIONCOUNTER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.conditionCounter</code> attribute.
	 * @return the conditionCounter - ZAEHK - Condition counter
	 */
	public String getConditionCounter()
	{
		return getConditionCounter( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPricingCondition.conditionCounter</code> attribute. 
	 * @param value the conditionCounter - ZAEHK - Condition counter
	 */
	public void setConditionCounter(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONDITIONCOUNTER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPricingCondition.conditionCounter</code> attribute. 
	 * @param value the conditionCounter - ZAEHK - Condition counter
	 */
	public void setConditionCounter(final String value)
	{
		setConditionCounter( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.conditionPricingUnit</code> attribute.
	 * @return the conditionPricingUnit - KPEIN - Condition pricing unit
	 */
	public String getConditionPricingUnit(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONDITIONPRICINGUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.conditionPricingUnit</code> attribute.
	 * @return the conditionPricingUnit - KPEIN - Condition pricing unit
	 */
	public String getConditionPricingUnit()
	{
		return getConditionPricingUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPricingCondition.conditionPricingUnit</code> attribute. 
	 * @param value the conditionPricingUnit - KPEIN - Condition pricing unit
	 */
	public void setConditionPricingUnit(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONDITIONPRICINGUNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPricingCondition.conditionPricingUnit</code> attribute. 
	 * @param value the conditionPricingUnit - KPEIN - Condition pricing unit
	 */
	public void setConditionPricingUnit(final String value)
	{
		setConditionPricingUnit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.conditionRate</code> attribute.
	 * @return the conditionRate - KBETR - Rate (condition amount or percentage)
	 */
	public String getConditionRate(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONDITIONRATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.conditionRate</code> attribute.
	 * @return the conditionRate - KBETR - Rate (condition amount or percentage)
	 */
	public String getConditionRate()
	{
		return getConditionRate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPricingCondition.conditionRate</code> attribute. 
	 * @param value the conditionRate - KBETR - Rate (condition amount or percentage)
	 */
	public void setConditionRate(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONDITIONRATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPricingCondition.conditionRate</code> attribute. 
	 * @param value the conditionRate - KBETR - Rate (condition amount or percentage)
	 */
	public void setConditionRate(final String value)
	{
		setConditionRate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.conditionType</code> attribute.
	 * @return the conditionType - KSCHL - Condition type
	 */
	public String getConditionType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONDITIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.conditionType</code> attribute.
	 * @return the conditionType - KSCHL - Condition type
	 */
	public String getConditionType()
	{
		return getConditionType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPricingCondition.conditionType</code> attribute. 
	 * @param value the conditionType - KSCHL - Condition type
	 */
	protected void setConditionType(final SessionContext ctx, final String value)
	{
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+CONDITIONTYPE+"' is not changeable", 0 );
		}
		setProperty(ctx, CONDITIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPricingCondition.conditionType</code> attribute. 
	 * @param value the conditionType - KSCHL - Condition type
	 */
	protected void setConditionType(final String value)
	{
		setConditionType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.conditionUnit</code> attribute.
	 * @return the conditionUnit - KMEIN - Condition unit in the document
	 */
	public String getConditionUnit(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONDITIONUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.conditionUnit</code> attribute.
	 * @return the conditionUnit - KMEIN - Condition unit in the document
	 */
	public String getConditionUnit()
	{
		return getConditionUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPricingCondition.conditionUnit</code> attribute. 
	 * @param value the conditionUnit - KMEIN - Condition unit in the document
	 */
	public void setConditionUnit(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONDITIONUNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPricingCondition.conditionUnit</code> attribute. 
	 * @param value the conditionUnit - KMEIN - Condition unit in the document
	 */
	public void setConditionUnit(final String value)
	{
		setConditionUnit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.conditionValue</code> attribute.
	 * @return the conditionValue - KWERT - Condition value
	 */
	public String getConditionValue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONDITIONVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.conditionValue</code> attribute.
	 * @return the conditionValue - KWERT - Condition value
	 */
	public String getConditionValue()
	{
		return getConditionValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPricingCondition.conditionValue</code> attribute. 
	 * @param value the conditionValue - KWERT - Condition value
	 */
	public void setConditionValue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONDITIONVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPricingCondition.conditionValue</code> attribute. 
	 * @param value the conditionValue - KWERT - Condition value
	 */
	public void setConditionValue(final String value)
	{
		setConditionValue( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ORDERENTRYHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.currencyKey</code> attribute.
	 * @return the currencyKey - WAERS - Currency key
	 */
	public String getCurrencyKey(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CURRENCYKEY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.currencyKey</code> attribute.
	 * @return the currencyKey - WAERS - Currency key
	 */
	public String getCurrencyKey()
	{
		return getCurrencyKey( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPricingCondition.currencyKey</code> attribute. 
	 * @param value the currencyKey - WAERS - Currency key
	 */
	public void setCurrencyKey(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CURRENCYKEY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPricingCondition.currencyKey</code> attribute. 
	 * @param value the currencyKey - WAERS - Currency key
	 */
	public void setCurrencyKey(final String value)
	{
		setCurrencyKey( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.order</code> attribute.
	 * @return the order - Order number
	 */
	public String getOrder(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ORDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.order</code> attribute.
	 * @return the order - Order number
	 */
	public String getOrder()
	{
		return getOrder( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPricingCondition.order</code> attribute. 
	 * @param value the order - Order number
	 */
	protected void setOrder(final SessionContext ctx, final String value)
	{
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+ORDER+"' is not changeable", 0 );
		}
		setProperty(ctx, ORDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPricingCondition.order</code> attribute. 
	 * @param value the order - Order number
	 */
	protected void setOrder(final String value)
	{
		setOrder( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.orderEntry</code> attribute.
	 * @return the orderEntry - Order entry
	 */
	public AbstractOrderEntry getOrderEntry(final SessionContext ctx)
	{
		return (AbstractOrderEntry)getProperty( ctx, ORDERENTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.orderEntry</code> attribute.
	 * @return the orderEntry - Order entry
	 */
	public AbstractOrderEntry getOrderEntry()
	{
		return getOrderEntry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPricingCondition.orderEntry</code> attribute. 
	 * @param value the orderEntry - Order entry
	 */
	protected void setOrderEntry(final SessionContext ctx, final AbstractOrderEntry value)
	{
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+ORDERENTRY+"' is not changeable", 0 );
		}
		ORDERENTRYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPricingCondition.orderEntry</code> attribute. 
	 * @param value the orderEntry - Order entry
	 */
	protected void setOrderEntry(final AbstractOrderEntry value)
	{
		setOrderEntry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.stepNumber</code> attribute.
	 * @return the stepNumber - STUNR - Step number
	 */
	public String getStepNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STEPNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.stepNumber</code> attribute.
	 * @return the stepNumber - STUNR - Step number
	 */
	public String getStepNumber()
	{
		return getStepNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPricingCondition.stepNumber</code> attribute. 
	 * @param value the stepNumber - STUNR - Step number
	 */
	public void setStepNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STEPNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPPricingCondition.stepNumber</code> attribute. 
	 * @param value the stepNumber - STUNR - Step number
	 */
	public void setStepNumber(final String value)
	{
		setStepNumber( getSession().getSessionContext(), value );
	}
	
}
