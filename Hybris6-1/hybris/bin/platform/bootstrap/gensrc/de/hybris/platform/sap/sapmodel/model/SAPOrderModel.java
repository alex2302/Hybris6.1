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
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.ordersplitting.model.ConsignmentModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Set;
import sap.hybris.integration.models.enums.SAPOrderStatus;

/**
 * Generated model class for type SAPOrder first defined at extension sapmodel.
 */
@SuppressWarnings("all")
public class SAPOrderModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SAPOrder";
	
	/**<i>Generated relation code constant for relation <code>Order2SapOrder</code> defining source attribute <code>order</code> in extension <code>sapmodel</code>.</i>*/
	public final static String _ORDER2SAPORDER = "Order2SapOrder";
	
	/**<i>Generated relation code constant for relation <code>ConsignmentSapOrderRelation</code> defining source attribute <code>consignments</code> in extension <code>sapmodel</code>.</i>*/
	public final static String _CONSIGNMENTSAPORDERRELATION = "ConsignmentSapOrderRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPOrder.code</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPOrder.sapOrderStatus</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPORDERSTATUS = "sapOrderStatus";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPOrder.orderPOS</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String ORDERPOS = "orderPOS";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPOrder.order</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String ORDER = "order";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPOrder.consignments</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String CONSIGNMENTS = "consignments";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPOrderModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPOrderModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _order initial attribute declared by type <code>SAPOrder</code> at extension <code>sapmodel</code>
	 */
	@Deprecated
	public SAPOrderModel(final OrderModel _order)
	{
		super();
		setOrder(_order);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _order initial attribute declared by type <code>SAPOrder</code> at extension <code>sapmodel</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public SAPOrderModel(final OrderModel _order, final ItemModel _owner)
	{
		super();
		setOrder(_order);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPOrder.code</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the code - SAP Order Number
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.GETTER)
	public String getCode()
	{
		return getPersistenceContext().getPropertyValue(CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPOrder.consignments</code> attribute defined at extension <code>sapmodel</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the consignments
	 */
	@Accessor(qualifier = "consignments", type = Accessor.Type.GETTER)
	public Set<ConsignmentModel> getConsignments()
	{
		return getPersistenceContext().getPropertyValue(CONSIGNMENTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPOrder.order</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the order
	 */
	@Accessor(qualifier = "order", type = Accessor.Type.GETTER)
	public OrderModel getOrder()
	{
		return getPersistenceContext().getPropertyValue(ORDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPOrder.sapOrderStatus</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the sapOrderStatus - Sap Order Status
	 */
	@Accessor(qualifier = "sapOrderStatus", type = Accessor.Type.GETTER)
	public SAPOrderStatus getSapOrderStatus()
	{
		return getPersistenceContext().getPropertyValue(SAPORDERSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPOrder.code</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the code - SAP Order Number
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.SETTER)
	public void setCode(final String value)
	{
		getPersistenceContext().setPropertyValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPOrder.consignments</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the consignments
	 */
	@Accessor(qualifier = "consignments", type = Accessor.Type.SETTER)
	public void setConsignments(final Set<ConsignmentModel> value)
	{
		getPersistenceContext().setPropertyValue(CONSIGNMENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>SAPOrder.order</code> attribute defined at extension <code>sapmodel</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the order
	 */
	@Accessor(qualifier = "order", type = Accessor.Type.SETTER)
	public void setOrder(final OrderModel value)
	{
		getPersistenceContext().setPropertyValue(ORDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPOrder.sapOrderStatus</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapOrderStatus - Sap Order Status
	 */
	@Accessor(qualifier = "sapOrderStatus", type = Accessor.Type.SETTER)
	public void setSapOrderStatus(final SAPOrderStatus value)
	{
		getPersistenceContext().setPropertyValue(SAPORDERSTATUS, value);
	}
	
}
