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
import de.hybris.platform.core.model.order.delivery.DeliveryModeModel;
import de.hybris.platform.sap.core.configuration.model.SAPConfigurationModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SAPDeliveryMode first defined at extension sapmodel.
 */
@SuppressWarnings("all")
public class SAPDeliveryModeModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SAPDeliveryMode";
	
	/**<i>Generated relation code constant for relation <code>SAPConfigDeliveryRelation</code> defining source attribute <code>sapConfiguration</code> in extension <code>sapmodel</code>.</i>*/
	public final static String _SAPCONFIGDELIVERYRELATION = "SAPConfigDeliveryRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPDeliveryMode.sapConfiguration</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPCONFIGURATION = "sapConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPDeliveryMode.deliveryMode</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String DELIVERYMODE = "deliveryMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPDeliveryMode.deliveryValue</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String DELIVERYVALUE = "deliveryValue";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPDeliveryModeModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPDeliveryModeModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _deliveryMode initial attribute declared by type <code>SAPDeliveryMode</code> at extension <code>sapmodel</code>
	 * @param _deliveryValue initial attribute declared by type <code>SAPDeliveryMode</code> at extension <code>sapmodel</code>
	 */
	@Deprecated
	public SAPDeliveryModeModel(final DeliveryModeModel _deliveryMode, final String _deliveryValue)
	{
		super();
		setDeliveryMode(_deliveryMode);
		setDeliveryValue(_deliveryValue);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _deliveryMode initial attribute declared by type <code>SAPDeliveryMode</code> at extension <code>sapmodel</code>
	 * @param _deliveryValue initial attribute declared by type <code>SAPDeliveryMode</code> at extension <code>sapmodel</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _sapConfiguration initial attribute declared by type <code>SAPDeliveryMode</code> at extension <code>sapmodel</code>
	 */
	@Deprecated
	public SAPDeliveryModeModel(final DeliveryModeModel _deliveryMode, final String _deliveryValue, final ItemModel _owner, final SAPConfigurationModel _sapConfiguration)
	{
		super();
		setDeliveryMode(_deliveryMode);
		setDeliveryValue(_deliveryValue);
		setOwner(_owner);
		setSapConfiguration(_sapConfiguration);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDeliveryMode.deliveryMode</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the deliveryMode
	 */
	@Accessor(qualifier = "deliveryMode", type = Accessor.Type.GETTER)
	public DeliveryModeModel getDeliveryMode()
	{
		return getPersistenceContext().getPropertyValue(DELIVERYMODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDeliveryMode.deliveryValue</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the deliveryValue
	 */
	@Accessor(qualifier = "deliveryValue", type = Accessor.Type.GETTER)
	public String getDeliveryValue()
	{
		return getPersistenceContext().getPropertyValue(DELIVERYVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPDeliveryMode.sapConfiguration</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the sapConfiguration
	 */
	@Accessor(qualifier = "sapConfiguration", type = Accessor.Type.GETTER)
	public SAPConfigurationModel getSapConfiguration()
	{
		return getPersistenceContext().getPropertyValue(SAPCONFIGURATION);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPDeliveryMode.deliveryMode</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the deliveryMode
	 */
	@Accessor(qualifier = "deliveryMode", type = Accessor.Type.SETTER)
	public void setDeliveryMode(final DeliveryModeModel value)
	{
		getPersistenceContext().setPropertyValue(DELIVERYMODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPDeliveryMode.deliveryValue</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the deliveryValue
	 */
	@Accessor(qualifier = "deliveryValue", type = Accessor.Type.SETTER)
	public void setDeliveryValue(final String value)
	{
		getPersistenceContext().setPropertyValue(DELIVERYVALUE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>SAPDeliveryMode.sapConfiguration</code> attribute defined at extension <code>sapmodel</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the sapConfiguration
	 */
	@Accessor(qualifier = "sapConfiguration", type = Accessor.Type.SETTER)
	public void setSapConfiguration(final SAPConfigurationModel value)
	{
		getPersistenceContext().setPropertyValue(SAPCONFIGURATION, value);
	}
	
}
