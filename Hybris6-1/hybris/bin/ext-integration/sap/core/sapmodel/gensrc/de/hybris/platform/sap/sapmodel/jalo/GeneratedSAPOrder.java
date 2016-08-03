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

import de.hybris.platform.basecommerce.constants.BasecommerceConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.order.Order;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.ordersplitting.jalo.Consignment;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import sap.hybris.integration.models.constants.SapmodelConstants;

/**
 * Generated class for type {@link de.hybris.platform.sap.sapmodel.jalo.SAPOrder SAPOrder}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSAPOrder extends GenericItem
{
	/** Qualifier of the <code>SAPOrder.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>SAPOrder.sapOrderStatus</code> attribute **/
	public static final String SAPORDERSTATUS = "sapOrderStatus";
	/** Qualifier of the <code>SAPOrder.orderPOS</code> attribute **/
	public static final String ORDERPOS = "orderPOS";
	/** Qualifier of the <code>SAPOrder.order</code> attribute **/
	public static final String ORDER = "order";
	/** Qualifier of the <code>SAPOrder.consignments</code> attribute **/
	public static final String CONSIGNMENTS = "consignments";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ORDER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSAPOrder> ORDERHANDLER = new BidirectionalOneToManyHandler<GeneratedSAPOrder>(
	SapmodelConstants.TC.SAPORDER,
	false,
	"order",
	"orderPOS",
	true,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CONSIGNMENTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Consignment> CONSIGNMENTSHANDLER = new OneToManyHandler<Consignment>(
	BasecommerceConstants.TC.CONSIGNMENT,
	false,
	"sapOrder",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(SAPORDERSTATUS, AttributeMode.INITIAL);
		tmp.put(ORDERPOS, AttributeMode.INITIAL);
		tmp.put(ORDER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPOrder.code</code> attribute.
	 * @return the code - SAP Order Number
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPOrder.code</code> attribute.
	 * @return the code - SAP Order Number
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPOrder.code</code> attribute. 
	 * @param value the code - SAP Order Number
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPOrder.code</code> attribute. 
	 * @param value the code - SAP Order Number
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPOrder.consignments</code> attribute.
	 * @return the consignments
	 */
	public Set<Consignment> getConsignments(final SessionContext ctx)
	{
		return (Set<Consignment>)CONSIGNMENTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPOrder.consignments</code> attribute.
	 * @return the consignments
	 */
	public Set<Consignment> getConsignments()
	{
		return getConsignments( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPOrder.consignments</code> attribute. 
	 * @param value the consignments
	 */
	public void setConsignments(final SessionContext ctx, final Set<Consignment> value)
	{
		CONSIGNMENTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPOrder.consignments</code> attribute. 
	 * @param value the consignments
	 */
	public void setConsignments(final Set<Consignment> value)
	{
		setConsignments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to consignments. 
	 * @param value the item to add to consignments
	 */
	public void addToConsignments(final SessionContext ctx, final Consignment value)
	{
		CONSIGNMENTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to consignments. 
	 * @param value the item to add to consignments
	 */
	public void addToConsignments(final Consignment value)
	{
		addToConsignments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from consignments. 
	 * @param value the item to remove from consignments
	 */
	public void removeFromConsignments(final SessionContext ctx, final Consignment value)
	{
		CONSIGNMENTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from consignments. 
	 * @param value the item to remove from consignments
	 */
	public void removeFromConsignments(final Consignment value)
	{
		removeFromConsignments( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ORDERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPOrder.order</code> attribute.
	 * @return the order
	 */
	public Order getOrder(final SessionContext ctx)
	{
		return (Order)getProperty( ctx, ORDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPOrder.order</code> attribute.
	 * @return the order
	 */
	public Order getOrder()
	{
		return getOrder( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPOrder.order</code> attribute. 
	 * @param value the order
	 */
	protected void setOrder(final SessionContext ctx, final Order value)
	{
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+ORDER+"' is not changeable", 0 );
		}
		ORDERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPOrder.order</code> attribute. 
	 * @param value the order
	 */
	protected void setOrder(final Order value)
	{
		setOrder( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPOrder.orderPOS</code> attribute.
	 * @return the orderPOS
	 */
	 Integer getOrderPOS(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ORDERPOS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPOrder.orderPOS</code> attribute.
	 * @return the orderPOS
	 */
	 Integer getOrderPOS()
	{
		return getOrderPOS( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPOrder.orderPOS</code> attribute. 
	 * @return the orderPOS
	 */
	 int getOrderPOSAsPrimitive(final SessionContext ctx)
	{
		Integer value = getOrderPOS( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPOrder.orderPOS</code> attribute. 
	 * @return the orderPOS
	 */
	 int getOrderPOSAsPrimitive()
	{
		return getOrderPOSAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPOrder.orderPOS</code> attribute. 
	 * @param value the orderPOS
	 */
	 void setOrderPOS(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ORDERPOS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPOrder.orderPOS</code> attribute. 
	 * @param value the orderPOS
	 */
	 void setOrderPOS(final Integer value)
	{
		setOrderPOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPOrder.orderPOS</code> attribute. 
	 * @param value the orderPOS
	 */
	 void setOrderPOS(final SessionContext ctx, final int value)
	{
		setOrderPOS( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPOrder.orderPOS</code> attribute. 
	 * @param value the orderPOS
	 */
	 void setOrderPOS(final int value)
	{
		setOrderPOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPOrder.sapOrderStatus</code> attribute.
	 * @return the sapOrderStatus - Sap Order Status
	 */
	public EnumerationValue getSapOrderStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SAPORDERSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPOrder.sapOrderStatus</code> attribute.
	 * @return the sapOrderStatus - Sap Order Status
	 */
	public EnumerationValue getSapOrderStatus()
	{
		return getSapOrderStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPOrder.sapOrderStatus</code> attribute. 
	 * @param value the sapOrderStatus - Sap Order Status
	 */
	public void setSapOrderStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SAPORDERSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPOrder.sapOrderStatus</code> attribute. 
	 * @param value the sapOrderStatus - Sap Order Status
	 */
	public void setSapOrderStatus(final EnumerationValue value)
	{
		setSapOrderStatus( getSession().getSessionContext(), value );
	}
	
}
