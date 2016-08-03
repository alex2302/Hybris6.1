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
package de.hybris.platform.sap.sappricingbol.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration;
import de.hybris.platform.sap.sappricingbol.constants.SappricingbolConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>SappricingbolManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSappricingbolManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("sappricingbol_catalogPricing", AttributeMode.INITIAL);
		tmp.put("sappricingbol_cartPricing", AttributeMode.INITIAL);
		tmp.put("sappricingbol_cachePrice", AttributeMode.INITIAL);
		tmp.put("sappricingbol_priceSub", AttributeMode.INITIAL);
		tmp.put("sappricingbol_discountSub", AttributeMode.INITIAL);
		tmp.put("sappricingbol_taxesSub", AttributeMode.INITIAL);
		tmp.put("sappricingbol_deliverySub", AttributeMode.INITIAL);
		tmp.put("sappricingbol_paymentSub", AttributeMode.INITIAL);
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
		return SappricingbolConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_cachePrice</code> attribute.
	 * @return the sappricingbol_cachePrice - Determines whether the site should cache external catalog prices
	 */
	public Boolean isSappricingbol_cachePrice(final SessionContext ctx, final GenericItem item)
	{
		return (Boolean)item.getProperty( ctx, SappricingbolConstants.Attributes.SAPConfiguration.SAPPRICINGBOL_CACHEPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_cachePrice</code> attribute.
	 * @return the sappricingbol_cachePrice - Determines whether the site should cache external catalog prices
	 */
	public Boolean isSappricingbol_cachePrice(final SAPConfiguration item)
	{
		return isSappricingbol_cachePrice( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_cachePrice</code> attribute. 
	 * @return the sappricingbol_cachePrice - Determines whether the site should cache external catalog prices
	 */
	public boolean isSappricingbol_cachePriceAsPrimitive(final SessionContext ctx, final SAPConfiguration item)
	{
		Boolean value = isSappricingbol_cachePrice( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_cachePrice</code> attribute. 
	 * @return the sappricingbol_cachePrice - Determines whether the site should cache external catalog prices
	 */
	public boolean isSappricingbol_cachePriceAsPrimitive(final SAPConfiguration item)
	{
		return isSappricingbol_cachePriceAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sappricingbol_cachePrice</code> attribute. 
	 * @param value the sappricingbol_cachePrice - Determines whether the site should cache external catalog prices
	 */
	public void setSappricingbol_cachePrice(final SessionContext ctx, final GenericItem item, final Boolean value)
	{
		item.setProperty(ctx, SappricingbolConstants.Attributes.SAPConfiguration.SAPPRICINGBOL_CACHEPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sappricingbol_cachePrice</code> attribute. 
	 * @param value the sappricingbol_cachePrice - Determines whether the site should cache external catalog prices
	 */
	public void setSappricingbol_cachePrice(final SAPConfiguration item, final Boolean value)
	{
		setSappricingbol_cachePrice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sappricingbol_cachePrice</code> attribute. 
	 * @param value the sappricingbol_cachePrice - Determines whether the site should cache external catalog prices
	 */
	public void setSappricingbol_cachePrice(final SessionContext ctx, final SAPConfiguration item, final boolean value)
	{
		setSappricingbol_cachePrice( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sappricingbol_cachePrice</code> attribute. 
	 * @param value the sappricingbol_cachePrice - Determines whether the site should cache external catalog prices
	 */
	public void setSappricingbol_cachePrice(final SAPConfiguration item, final boolean value)
	{
		setSappricingbol_cachePrice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_cartPricing</code> attribute.
	 * @return the sappricingbol_cartPricing - Determines whether the site should use external external order pricing
	 */
	public Boolean isSappricingbol_cartPricing(final SessionContext ctx, final GenericItem item)
	{
		return (Boolean)item.getProperty( ctx, SappricingbolConstants.Attributes.SAPConfiguration.SAPPRICINGBOL_CARTPRICING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_cartPricing</code> attribute.
	 * @return the sappricingbol_cartPricing - Determines whether the site should use external external order pricing
	 */
	public Boolean isSappricingbol_cartPricing(final SAPConfiguration item)
	{
		return isSappricingbol_cartPricing( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_cartPricing</code> attribute. 
	 * @return the sappricingbol_cartPricing - Determines whether the site should use external external order pricing
	 */
	public boolean isSappricingbol_cartPricingAsPrimitive(final SessionContext ctx, final SAPConfiguration item)
	{
		Boolean value = isSappricingbol_cartPricing( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_cartPricing</code> attribute. 
	 * @return the sappricingbol_cartPricing - Determines whether the site should use external external order pricing
	 */
	public boolean isSappricingbol_cartPricingAsPrimitive(final SAPConfiguration item)
	{
		return isSappricingbol_cartPricingAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sappricingbol_cartPricing</code> attribute. 
	 * @param value the sappricingbol_cartPricing - Determines whether the site should use external external order pricing
	 */
	public void setSappricingbol_cartPricing(final SessionContext ctx, final GenericItem item, final Boolean value)
	{
		item.setProperty(ctx, SappricingbolConstants.Attributes.SAPConfiguration.SAPPRICINGBOL_CARTPRICING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sappricingbol_cartPricing</code> attribute. 
	 * @param value the sappricingbol_cartPricing - Determines whether the site should use external external order pricing
	 */
	public void setSappricingbol_cartPricing(final SAPConfiguration item, final Boolean value)
	{
		setSappricingbol_cartPricing( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sappricingbol_cartPricing</code> attribute. 
	 * @param value the sappricingbol_cartPricing - Determines whether the site should use external external order pricing
	 */
	public void setSappricingbol_cartPricing(final SessionContext ctx, final SAPConfiguration item, final boolean value)
	{
		setSappricingbol_cartPricing( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sappricingbol_cartPricing</code> attribute. 
	 * @param value the sappricingbol_cartPricing - Determines whether the site should use external external order pricing
	 */
	public void setSappricingbol_cartPricing(final SAPConfiguration item, final boolean value)
	{
		setSappricingbol_cartPricing( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_catalogPricing</code> attribute.
	 * @return the sappricingbol_catalogPricing - Determines whether the site should use external catalog pricing
	 */
	public Boolean isSappricingbol_catalogPricing(final SessionContext ctx, final GenericItem item)
	{
		return (Boolean)item.getProperty( ctx, SappricingbolConstants.Attributes.SAPConfiguration.SAPPRICINGBOL_CATALOGPRICING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_catalogPricing</code> attribute.
	 * @return the sappricingbol_catalogPricing - Determines whether the site should use external catalog pricing
	 */
	public Boolean isSappricingbol_catalogPricing(final SAPConfiguration item)
	{
		return isSappricingbol_catalogPricing( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_catalogPricing</code> attribute. 
	 * @return the sappricingbol_catalogPricing - Determines whether the site should use external catalog pricing
	 */
	public boolean isSappricingbol_catalogPricingAsPrimitive(final SessionContext ctx, final SAPConfiguration item)
	{
		Boolean value = isSappricingbol_catalogPricing( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_catalogPricing</code> attribute. 
	 * @return the sappricingbol_catalogPricing - Determines whether the site should use external catalog pricing
	 */
	public boolean isSappricingbol_catalogPricingAsPrimitive(final SAPConfiguration item)
	{
		return isSappricingbol_catalogPricingAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sappricingbol_catalogPricing</code> attribute. 
	 * @param value the sappricingbol_catalogPricing - Determines whether the site should use external catalog pricing
	 */
	public void setSappricingbol_catalogPricing(final SessionContext ctx, final GenericItem item, final Boolean value)
	{
		item.setProperty(ctx, SappricingbolConstants.Attributes.SAPConfiguration.SAPPRICINGBOL_CATALOGPRICING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sappricingbol_catalogPricing</code> attribute. 
	 * @param value the sappricingbol_catalogPricing - Determines whether the site should use external catalog pricing
	 */
	public void setSappricingbol_catalogPricing(final SAPConfiguration item, final Boolean value)
	{
		setSappricingbol_catalogPricing( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sappricingbol_catalogPricing</code> attribute. 
	 * @param value the sappricingbol_catalogPricing - Determines whether the site should use external catalog pricing
	 */
	public void setSappricingbol_catalogPricing(final SessionContext ctx, final SAPConfiguration item, final boolean value)
	{
		setSappricingbol_catalogPricing( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sappricingbol_catalogPricing</code> attribute. 
	 * @param value the sappricingbol_catalogPricing - Determines whether the site should use external catalog pricing
	 */
	public void setSappricingbol_catalogPricing(final SAPConfiguration item, final boolean value)
	{
		setSappricingbol_catalogPricing( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_deliverySub</code> attribute.
	 * @return the sappricingbol_deliverySub - Assigned procedure for delivery.
	 */
	public EnumerationValue getSappricingbol_deliverySub(final SessionContext ctx, final GenericItem item)
	{
		return (EnumerationValue)item.getProperty( ctx, SappricingbolConstants.Attributes.SAPConfiguration.SAPPRICINGBOL_DELIVERYSUB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_deliverySub</code> attribute.
	 * @return the sappricingbol_deliverySub - Assigned procedure for delivery.
	 */
	public EnumerationValue getSappricingbol_deliverySub(final SAPConfiguration item)
	{
		return getSappricingbol_deliverySub( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sappricingbol_deliverySub</code> attribute. 
	 * @param value the sappricingbol_deliverySub - Assigned procedure for delivery.
	 */
	public void setSappricingbol_deliverySub(final SessionContext ctx, final GenericItem item, final EnumerationValue value)
	{
		item.setProperty(ctx, SappricingbolConstants.Attributes.SAPConfiguration.SAPPRICINGBOL_DELIVERYSUB,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sappricingbol_deliverySub</code> attribute. 
	 * @param value the sappricingbol_deliverySub - Assigned procedure for delivery.
	 */
	public void setSappricingbol_deliverySub(final SAPConfiguration item, final EnumerationValue value)
	{
		setSappricingbol_deliverySub( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_discountSub</code> attribute.
	 * @return the sappricingbol_discountSub - Assigned procedure for discounts.
	 */
	public EnumerationValue getSappricingbol_discountSub(final SessionContext ctx, final GenericItem item)
	{
		return (EnumerationValue)item.getProperty( ctx, SappricingbolConstants.Attributes.SAPConfiguration.SAPPRICINGBOL_DISCOUNTSUB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_discountSub</code> attribute.
	 * @return the sappricingbol_discountSub - Assigned procedure for discounts.
	 */
	public EnumerationValue getSappricingbol_discountSub(final SAPConfiguration item)
	{
		return getSappricingbol_discountSub( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sappricingbol_discountSub</code> attribute. 
	 * @param value the sappricingbol_discountSub - Assigned procedure for discounts.
	 */
	public void setSappricingbol_discountSub(final SessionContext ctx, final GenericItem item, final EnumerationValue value)
	{
		item.setProperty(ctx, SappricingbolConstants.Attributes.SAPConfiguration.SAPPRICINGBOL_DISCOUNTSUB,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sappricingbol_discountSub</code> attribute. 
	 * @param value the sappricingbol_discountSub - Assigned procedure for discounts.
	 */
	public void setSappricingbol_discountSub(final SAPConfiguration item, final EnumerationValue value)
	{
		setSappricingbol_discountSub( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_paymentSub</code> attribute.
	 * @return the sappricingbol_paymentSub - Assigned procedure for payment.
	 */
	public EnumerationValue getSappricingbol_paymentSub(final SessionContext ctx, final GenericItem item)
	{
		return (EnumerationValue)item.getProperty( ctx, SappricingbolConstants.Attributes.SAPConfiguration.SAPPRICINGBOL_PAYMENTSUB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_paymentSub</code> attribute.
	 * @return the sappricingbol_paymentSub - Assigned procedure for payment.
	 */
	public EnumerationValue getSappricingbol_paymentSub(final SAPConfiguration item)
	{
		return getSappricingbol_paymentSub( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sappricingbol_paymentSub</code> attribute. 
	 * @param value the sappricingbol_paymentSub - Assigned procedure for payment.
	 */
	public void setSappricingbol_paymentSub(final SessionContext ctx, final GenericItem item, final EnumerationValue value)
	{
		item.setProperty(ctx, SappricingbolConstants.Attributes.SAPConfiguration.SAPPRICINGBOL_PAYMENTSUB,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sappricingbol_paymentSub</code> attribute. 
	 * @param value the sappricingbol_paymentSub - Assigned procedure for payment.
	 */
	public void setSappricingbol_paymentSub(final SAPConfiguration item, final EnumerationValue value)
	{
		setSappricingbol_paymentSub( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_priceSub</code> attribute.
	 * @return the sappricingbol_priceSub - Assigned procedure for price.
	 */
	public EnumerationValue getSappricingbol_priceSub(final SessionContext ctx, final GenericItem item)
	{
		return (EnumerationValue)item.getProperty( ctx, SappricingbolConstants.Attributes.SAPConfiguration.SAPPRICINGBOL_PRICESUB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_priceSub</code> attribute.
	 * @return the sappricingbol_priceSub - Assigned procedure for price.
	 */
	public EnumerationValue getSappricingbol_priceSub(final SAPConfiguration item)
	{
		return getSappricingbol_priceSub( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sappricingbol_priceSub</code> attribute. 
	 * @param value the sappricingbol_priceSub - Assigned procedure for price.
	 */
	public void setSappricingbol_priceSub(final SessionContext ctx, final GenericItem item, final EnumerationValue value)
	{
		item.setProperty(ctx, SappricingbolConstants.Attributes.SAPConfiguration.SAPPRICINGBOL_PRICESUB,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sappricingbol_priceSub</code> attribute. 
	 * @param value the sappricingbol_priceSub - Assigned procedure for price.
	 */
	public void setSappricingbol_priceSub(final SAPConfiguration item, final EnumerationValue value)
	{
		setSappricingbol_priceSub( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_taxesSub</code> attribute.
	 * @return the sappricingbol_taxesSub - Assigned procedure for taxes.
	 */
	public EnumerationValue getSappricingbol_taxesSub(final SessionContext ctx, final GenericItem item)
	{
		return (EnumerationValue)item.getProperty( ctx, SappricingbolConstants.Attributes.SAPConfiguration.SAPPRICINGBOL_TAXESSUB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_taxesSub</code> attribute.
	 * @return the sappricingbol_taxesSub - Assigned procedure for taxes.
	 */
	public EnumerationValue getSappricingbol_taxesSub(final SAPConfiguration item)
	{
		return getSappricingbol_taxesSub( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sappricingbol_taxesSub</code> attribute. 
	 * @param value the sappricingbol_taxesSub - Assigned procedure for taxes.
	 */
	public void setSappricingbol_taxesSub(final SessionContext ctx, final GenericItem item, final EnumerationValue value)
	{
		item.setProperty(ctx, SappricingbolConstants.Attributes.SAPConfiguration.SAPPRICINGBOL_TAXESSUB,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sappricingbol_taxesSub</code> attribute. 
	 * @param value the sappricingbol_taxesSub - Assigned procedure for taxes.
	 */
	public void setSappricingbol_taxesSub(final SAPConfiguration item, final EnumerationValue value)
	{
		setSappricingbol_taxesSub( getSession().getSessionContext(), item, value );
	}
	
}
