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
import de.hybris.platform.core.model.order.payment.PaymentModeModel;
import de.hybris.platform.sap.core.configuration.model.SAPConfigurationModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SAPPaymentMode first defined at extension sapmodel.
 */
@SuppressWarnings("all")
public class SAPPaymentModeModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SAPPaymentMode";
	
	/**<i>Generated relation code constant for relation <code>SapConfigPaymentRelation</code> defining source attribute <code>sapConfiguration</code> in extension <code>sapmodel</code>.</i>*/
	public final static String _SAPCONFIGPAYMENTRELATION = "SapConfigPaymentRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPPaymentMode.sapConfiguration</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPCONFIGURATION = "sapConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPPaymentMode.paymentMode</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String PAYMENTMODE = "paymentMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPPaymentMode.paymentName</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String PAYMENTNAME = "paymentName";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPPaymentMode.paymentValue</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String PAYMENTVALUE = "paymentValue";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPPaymentModeModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPPaymentModeModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _paymentMode initial attribute declared by type <code>SAPPaymentMode</code> at extension <code>sapmodel</code>
	 * @param _paymentName initial attribute declared by type <code>SAPPaymentMode</code> at extension <code>sapmodel</code>
	 * @param _paymentValue initial attribute declared by type <code>SAPPaymentMode</code> at extension <code>sapmodel</code>
	 */
	@Deprecated
	public SAPPaymentModeModel(final PaymentModeModel _paymentMode, final String _paymentName, final String _paymentValue)
	{
		super();
		setPaymentMode(_paymentMode);
		setPaymentName(_paymentName);
		setPaymentValue(_paymentValue);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _paymentMode initial attribute declared by type <code>SAPPaymentMode</code> at extension <code>sapmodel</code>
	 * @param _paymentName initial attribute declared by type <code>SAPPaymentMode</code> at extension <code>sapmodel</code>
	 * @param _paymentValue initial attribute declared by type <code>SAPPaymentMode</code> at extension <code>sapmodel</code>
	 * @param _sapConfiguration initial attribute declared by type <code>SAPPaymentMode</code> at extension <code>sapmodel</code>
	 */
	@Deprecated
	public SAPPaymentModeModel(final ItemModel _owner, final PaymentModeModel _paymentMode, final String _paymentName, final String _paymentValue, final SAPConfigurationModel _sapConfiguration)
	{
		super();
		setOwner(_owner);
		setPaymentMode(_paymentMode);
		setPaymentName(_paymentName);
		setPaymentValue(_paymentValue);
		setSapConfiguration(_sapConfiguration);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPaymentMode.paymentMode</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the paymentMode
	 */
	@Accessor(qualifier = "paymentMode", type = Accessor.Type.GETTER)
	public PaymentModeModel getPaymentMode()
	{
		return getPersistenceContext().getPropertyValue(PAYMENTMODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPaymentMode.paymentName</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the paymentName
	 */
	@Accessor(qualifier = "paymentName", type = Accessor.Type.GETTER)
	public String getPaymentName()
	{
		return getPersistenceContext().getPropertyValue(PAYMENTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPaymentMode.paymentValue</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the paymentValue
	 */
	@Accessor(qualifier = "paymentValue", type = Accessor.Type.GETTER)
	public String getPaymentValue()
	{
		return getPersistenceContext().getPropertyValue(PAYMENTVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPaymentMode.sapConfiguration</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the sapConfiguration
	 */
	@Accessor(qualifier = "sapConfiguration", type = Accessor.Type.GETTER)
	public SAPConfigurationModel getSapConfiguration()
	{
		return getPersistenceContext().getPropertyValue(SAPCONFIGURATION);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPPaymentMode.paymentMode</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the paymentMode
	 */
	@Accessor(qualifier = "paymentMode", type = Accessor.Type.SETTER)
	public void setPaymentMode(final PaymentModeModel value)
	{
		getPersistenceContext().setPropertyValue(PAYMENTMODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPPaymentMode.paymentName</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the paymentName
	 */
	@Accessor(qualifier = "paymentName", type = Accessor.Type.SETTER)
	public void setPaymentName(final String value)
	{
		getPersistenceContext().setPropertyValue(PAYMENTNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPPaymentMode.paymentValue</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the paymentValue
	 */
	@Accessor(qualifier = "paymentValue", type = Accessor.Type.SETTER)
	public void setPaymentValue(final String value)
	{
		getPersistenceContext().setPropertyValue(PAYMENTVALUE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>SAPPaymentMode.sapConfiguration</code> attribute defined at extension <code>sapmodel</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the sapConfiguration
	 */
	@Accessor(qualifier = "sapConfiguration", type = Accessor.Type.SETTER)
	public void setSapConfiguration(final SAPConfigurationModel value)
	{
		getPersistenceContext().setPropertyValue(SAPCONFIGURATION, value);
	}
	
}
