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
package de.hybris.platform.sap.sapmodel.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SAPPricingCondition first defined at extension sapmodel.
 */
@SuppressWarnings("all")
public class SAPPricingConditionModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SAPPricingCondition";
	
	/**<i>Generated relation code constant for relation <code>OrderEntry2SapPricingCondition</code> defining source attribute <code>orderEntry</code> in extension <code>sapmodel</code>.</i>*/
	public final static String _ORDERENTRY2SAPPRICINGCONDITION = "OrderEntry2SapPricingCondition";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPPricingCondition.order</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String ORDER = "order";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPPricingCondition.conditionType</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String CONDITIONTYPE = "conditionType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPPricingCondition.stepNumber</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String STEPNUMBER = "stepNumber";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPPricingCondition.conditionCounter</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String CONDITIONCOUNTER = "conditionCounter";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPPricingCondition.currencyKey</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String CURRENCYKEY = "currencyKey";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPPricingCondition.conditionPricingUnit</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String CONDITIONPRICINGUNIT = "conditionPricingUnit";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPPricingCondition.conditionUnit</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String CONDITIONUNIT = "conditionUnit";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPPricingCondition.conditionCalculationType</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String CONDITIONCALCULATIONTYPE = "conditionCalculationType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPPricingCondition.conditionRate</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String CONDITIONRATE = "conditionRate";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPPricingCondition.conditionValue</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String CONDITIONVALUE = "conditionValue";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPPricingCondition.orderEntry</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String ORDERENTRY = "orderEntry";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPPricingConditionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPPricingConditionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _conditionType initial attribute declared by type <code>SAPPricingCondition</code> at extension <code>sapmodel</code>
	 * @param _order initial attribute declared by type <code>SAPPricingCondition</code> at extension <code>sapmodel</code>
	 * @param _orderEntry initial attribute declared by type <code>SAPPricingCondition</code> at extension <code>sapmodel</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public SAPPricingConditionModel(final String _conditionType, final String _order, final AbstractOrderEntryModel _orderEntry, final ItemModel _owner)
	{
		super();
		setConditionType(_conditionType);
		setOrder(_order);
		setOrderEntry(_orderEntry);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.conditionCalculationType</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the conditionCalculationType - KRECH - Calculation type for condition
	 */
	@Accessor(qualifier = "conditionCalculationType", type = Accessor.Type.GETTER)
	public String getConditionCalculationType()
	{
		return getPersistenceContext().getPropertyValue(CONDITIONCALCULATIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.conditionCounter</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the conditionCounter - ZAEHK - Condition counter
	 */
	@Accessor(qualifier = "conditionCounter", type = Accessor.Type.GETTER)
	public String getConditionCounter()
	{
		return getPersistenceContext().getPropertyValue(CONDITIONCOUNTER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.conditionPricingUnit</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the conditionPricingUnit - KPEIN - Condition pricing unit
	 */
	@Accessor(qualifier = "conditionPricingUnit", type = Accessor.Type.GETTER)
	public String getConditionPricingUnit()
	{
		return getPersistenceContext().getPropertyValue(CONDITIONPRICINGUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.conditionRate</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the conditionRate - KBETR - Rate (condition amount or percentage)
	 */
	@Accessor(qualifier = "conditionRate", type = Accessor.Type.GETTER)
	public String getConditionRate()
	{
		return getPersistenceContext().getPropertyValue(CONDITIONRATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.conditionType</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the conditionType - KSCHL - Condition type
	 */
	@Accessor(qualifier = "conditionType", type = Accessor.Type.GETTER)
	public String getConditionType()
	{
		return getPersistenceContext().getPropertyValue(CONDITIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.conditionUnit</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the conditionUnit - KMEIN - Condition unit in the document
	 */
	@Accessor(qualifier = "conditionUnit", type = Accessor.Type.GETTER)
	public String getConditionUnit()
	{
		return getPersistenceContext().getPropertyValue(CONDITIONUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.conditionValue</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the conditionValue - KWERT - Condition value
	 */
	@Accessor(qualifier = "conditionValue", type = Accessor.Type.GETTER)
	public String getConditionValue()
	{
		return getPersistenceContext().getPropertyValue(CONDITIONVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.currencyKey</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the currencyKey - WAERS - Currency key
	 */
	@Accessor(qualifier = "currencyKey", type = Accessor.Type.GETTER)
	public String getCurrencyKey()
	{
		return getPersistenceContext().getPropertyValue(CURRENCYKEY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.order</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the order - Order number
	 */
	@Accessor(qualifier = "order", type = Accessor.Type.GETTER)
	public String getOrder()
	{
		return getPersistenceContext().getPropertyValue(ORDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.orderEntry</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the orderEntry - Order entry
	 */
	@Accessor(qualifier = "orderEntry", type = Accessor.Type.GETTER)
	public AbstractOrderEntryModel getOrderEntry()
	{
		return getPersistenceContext().getPropertyValue(ORDERENTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPricingCondition.stepNumber</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the stepNumber - STUNR - Step number
	 */
	@Accessor(qualifier = "stepNumber", type = Accessor.Type.GETTER)
	public String getStepNumber()
	{
		return getPersistenceContext().getPropertyValue(STEPNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPPricingCondition.conditionCalculationType</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the conditionCalculationType - KRECH - Calculation type for condition
	 */
	@Accessor(qualifier = "conditionCalculationType", type = Accessor.Type.SETTER)
	public void setConditionCalculationType(final String value)
	{
		getPersistenceContext().setPropertyValue(CONDITIONCALCULATIONTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPPricingCondition.conditionCounter</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the conditionCounter - ZAEHK - Condition counter
	 */
	@Accessor(qualifier = "conditionCounter", type = Accessor.Type.SETTER)
	public void setConditionCounter(final String value)
	{
		getPersistenceContext().setPropertyValue(CONDITIONCOUNTER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPPricingCondition.conditionPricingUnit</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the conditionPricingUnit - KPEIN - Condition pricing unit
	 */
	@Accessor(qualifier = "conditionPricingUnit", type = Accessor.Type.SETTER)
	public void setConditionPricingUnit(final String value)
	{
		getPersistenceContext().setPropertyValue(CONDITIONPRICINGUNIT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPPricingCondition.conditionRate</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the conditionRate - KBETR - Rate (condition amount or percentage)
	 */
	@Accessor(qualifier = "conditionRate", type = Accessor.Type.SETTER)
	public void setConditionRate(final String value)
	{
		getPersistenceContext().setPropertyValue(CONDITIONRATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>SAPPricingCondition.conditionType</code> attribute defined at extension <code>sapmodel</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the conditionType - KSCHL - Condition type
	 */
	@Accessor(qualifier = "conditionType", type = Accessor.Type.SETTER)
	public void setConditionType(final String value)
	{
		getPersistenceContext().setPropertyValue(CONDITIONTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPPricingCondition.conditionUnit</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the conditionUnit - KMEIN - Condition unit in the document
	 */
	@Accessor(qualifier = "conditionUnit", type = Accessor.Type.SETTER)
	public void setConditionUnit(final String value)
	{
		getPersistenceContext().setPropertyValue(CONDITIONUNIT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPPricingCondition.conditionValue</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the conditionValue - KWERT - Condition value
	 */
	@Accessor(qualifier = "conditionValue", type = Accessor.Type.SETTER)
	public void setConditionValue(final String value)
	{
		getPersistenceContext().setPropertyValue(CONDITIONVALUE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPPricingCondition.currencyKey</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the currencyKey - WAERS - Currency key
	 */
	@Accessor(qualifier = "currencyKey", type = Accessor.Type.SETTER)
	public void setCurrencyKey(final String value)
	{
		getPersistenceContext().setPropertyValue(CURRENCYKEY, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>SAPPricingCondition.order</code> attribute defined at extension <code>sapmodel</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the order - Order number
	 */
	@Accessor(qualifier = "order", type = Accessor.Type.SETTER)
	public void setOrder(final String value)
	{
		getPersistenceContext().setPropertyValue(ORDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>SAPPricingCondition.orderEntry</code> attribute defined at extension <code>sapmodel</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the orderEntry - Order entry
	 */
	@Accessor(qualifier = "orderEntry", type = Accessor.Type.SETTER)
	public void setOrderEntry(final AbstractOrderEntryModel value)
	{
		getPersistenceContext().setPropertyValue(ORDERENTRY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPPricingCondition.stepNumber</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the stepNumber - STUNR - Step number
	 */
	@Accessor(qualifier = "stepNumber", type = Accessor.Type.SETTER)
	public void setStepNumber(final String value)
	{
		getPersistenceContext().setPropertyValue(STEPNUMBER, value);
	}
	
}
