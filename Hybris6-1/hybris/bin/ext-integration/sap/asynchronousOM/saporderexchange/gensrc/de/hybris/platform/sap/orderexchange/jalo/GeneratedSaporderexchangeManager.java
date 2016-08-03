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
package de.hybris.platform.sap.orderexchange.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.orderprocessing.jalo.OrderProcess;
import de.hybris.platform.processengine.jalo.BusinessProcess;
import de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration;
import de.hybris.platform.sap.orderexchange.constants.SaporderexchangeConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>SaporderexchangeManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSaporderexchangeManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("saporderexchange_itemPriceConditionType", AttributeMode.INITIAL);
		tmp.put("saporderexchange_paymentCostConditionType", AttributeMode.INITIAL);
		tmp.put("saporderexchange_deliveryCostConditionType", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("sendOrderRetryCount", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.orderprocessing.jalo.OrderProcess", Collections.unmodifiableMap(tmp));
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
		return SaporderexchangeConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.saporderexchange_deliveryCostConditionType</code> attribute.
	 * @return the saporderexchange_deliveryCostConditionType - Condition Type for delivery cost.
	 */
	public String getSaporderexchange_deliveryCostConditionType(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SaporderexchangeConstants.Attributes.SAPConfiguration.SAPORDEREXCHANGE_DELIVERYCOSTCONDITIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.saporderexchange_deliveryCostConditionType</code> attribute.
	 * @return the saporderexchange_deliveryCostConditionType - Condition Type for delivery cost.
	 */
	public String getSaporderexchange_deliveryCostConditionType(final SAPConfiguration item)
	{
		return getSaporderexchange_deliveryCostConditionType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.saporderexchange_deliveryCostConditionType</code> attribute. 
	 * @param value the saporderexchange_deliveryCostConditionType - Condition Type for delivery cost.
	 */
	public void setSaporderexchange_deliveryCostConditionType(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SaporderexchangeConstants.Attributes.SAPConfiguration.SAPORDEREXCHANGE_DELIVERYCOSTCONDITIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.saporderexchange_deliveryCostConditionType</code> attribute. 
	 * @param value the saporderexchange_deliveryCostConditionType - Condition Type for delivery cost.
	 */
	public void setSaporderexchange_deliveryCostConditionType(final SAPConfiguration item, final String value)
	{
		setSaporderexchange_deliveryCostConditionType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.saporderexchange_itemPriceConditionType</code> attribute.
	 * @return the saporderexchange_itemPriceConditionType - Condition Type for item Price.
	 */
	public String getSaporderexchange_itemPriceConditionType(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SaporderexchangeConstants.Attributes.SAPConfiguration.SAPORDEREXCHANGE_ITEMPRICECONDITIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.saporderexchange_itemPriceConditionType</code> attribute.
	 * @return the saporderexchange_itemPriceConditionType - Condition Type for item Price.
	 */
	public String getSaporderexchange_itemPriceConditionType(final SAPConfiguration item)
	{
		return getSaporderexchange_itemPriceConditionType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.saporderexchange_itemPriceConditionType</code> attribute. 
	 * @param value the saporderexchange_itemPriceConditionType - Condition Type for item Price.
	 */
	public void setSaporderexchange_itemPriceConditionType(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SaporderexchangeConstants.Attributes.SAPConfiguration.SAPORDEREXCHANGE_ITEMPRICECONDITIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.saporderexchange_itemPriceConditionType</code> attribute. 
	 * @param value the saporderexchange_itemPriceConditionType - Condition Type for item Price.
	 */
	public void setSaporderexchange_itemPriceConditionType(final SAPConfiguration item, final String value)
	{
		setSaporderexchange_itemPriceConditionType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.saporderexchange_paymentCostConditionType</code> attribute.
	 * @return the saporderexchange_paymentCostConditionType - Condition Type for payment cost.
	 */
	public String getSaporderexchange_paymentCostConditionType(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SaporderexchangeConstants.Attributes.SAPConfiguration.SAPORDEREXCHANGE_PAYMENTCOSTCONDITIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.saporderexchange_paymentCostConditionType</code> attribute.
	 * @return the saporderexchange_paymentCostConditionType - Condition Type for payment cost.
	 */
	public String getSaporderexchange_paymentCostConditionType(final SAPConfiguration item)
	{
		return getSaporderexchange_paymentCostConditionType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.saporderexchange_paymentCostConditionType</code> attribute. 
	 * @param value the saporderexchange_paymentCostConditionType - Condition Type for payment cost.
	 */
	public void setSaporderexchange_paymentCostConditionType(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SaporderexchangeConstants.Attributes.SAPConfiguration.SAPORDEREXCHANGE_PAYMENTCOSTCONDITIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.saporderexchange_paymentCostConditionType</code> attribute. 
	 * @param value the saporderexchange_paymentCostConditionType - Condition Type for payment cost.
	 */
	public void setSaporderexchange_paymentCostConditionType(final SAPConfiguration item, final String value)
	{
		setSaporderexchange_paymentCostConditionType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProcess.sendOrderRetryCount</code> attribute.
	 * @return the sendOrderRetryCount
	 */
	public Integer getSendOrderRetryCount(final SessionContext ctx, final OrderProcess item)
	{
		return (Integer)item.getProperty( ctx, SaporderexchangeConstants.Attributes.OrderProcess.SENDORDERRETRYCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProcess.sendOrderRetryCount</code> attribute.
	 * @return the sendOrderRetryCount
	 */
	public Integer getSendOrderRetryCount(final OrderProcess item)
	{
		return getSendOrderRetryCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProcess.sendOrderRetryCount</code> attribute. 
	 * @return the sendOrderRetryCount
	 */
	public int getSendOrderRetryCountAsPrimitive(final SessionContext ctx, final OrderProcess item)
	{
		Integer value = getSendOrderRetryCount( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProcess.sendOrderRetryCount</code> attribute. 
	 * @return the sendOrderRetryCount
	 */
	public int getSendOrderRetryCountAsPrimitive(final OrderProcess item)
	{
		return getSendOrderRetryCountAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProcess.sendOrderRetryCount</code> attribute. 
	 * @param value the sendOrderRetryCount
	 */
	public void setSendOrderRetryCount(final SessionContext ctx, final OrderProcess item, final Integer value)
	{
		item.setProperty(ctx, SaporderexchangeConstants.Attributes.OrderProcess.SENDORDERRETRYCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProcess.sendOrderRetryCount</code> attribute. 
	 * @param value the sendOrderRetryCount
	 */
	public void setSendOrderRetryCount(final OrderProcess item, final Integer value)
	{
		setSendOrderRetryCount( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProcess.sendOrderRetryCount</code> attribute. 
	 * @param value the sendOrderRetryCount
	 */
	public void setSendOrderRetryCount(final SessionContext ctx, final OrderProcess item, final int value)
	{
		setSendOrderRetryCount( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProcess.sendOrderRetryCount</code> attribute. 
	 * @param value the sendOrderRetryCount
	 */
	public void setSendOrderRetryCount(final OrderProcess item, final int value)
	{
		setSendOrderRetryCount( getSession().getSessionContext(), item, value );
	}
	
}
