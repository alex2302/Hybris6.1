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
package de.hybris.platform.sap.ysapomsfulfillment.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.orderprocessing.jalo.OrderProcess;
import de.hybris.platform.ordersplitting.jalo.Consignment;
import de.hybris.platform.processengine.jalo.BusinessProcess;
import de.hybris.platform.sap.ysapomsfulfillment.constants.YsapomsfulfillmentConstants;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.sap.ysapomsfulfillment.jalo.SapConsignmentProcess SapConsignmentProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSapConsignmentProcess extends BusinessProcess
{
	/** Qualifier of the <code>SapConsignmentProcess.waitingForConsignment</code> attribute **/
	public static final String WAITINGFORCONSIGNMENT = "waitingForConsignment";
	/** Qualifier of the <code>SapConsignmentProcess.warehouseConsignmentState</code> attribute **/
	public static final String WAREHOUSECONSIGNMENTSTATE = "warehouseConsignmentState";
	/** Qualifier of the <code>SapConsignmentProcess.done</code> attribute **/
	public static final String DONE = "done";
	/** Qualifier of the <code>SapConsignmentProcess.consignment</code> attribute **/
	public static final String CONSIGNMENT = "consignment";
	/** Qualifier of the <code>SapConsignmentProcess.parentProcess</code> attribute **/
	public static final String PARENTPROCESS = "parentProcess";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CONSIGNMENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSapConsignmentProcess> CONSIGNMENTHANDLER = new BidirectionalOneToManyHandler<GeneratedSapConsignmentProcess>(
	YsapomsfulfillmentConstants.TC.SAPCONSIGNMENTPROCESS,
	false,
	"consignment",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PARENTPROCESS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSapConsignmentProcess> PARENTPROCESSHANDLER = new BidirectionalOneToManyHandler<GeneratedSapConsignmentProcess>(
	YsapomsfulfillmentConstants.TC.SAPCONSIGNMENTPROCESS,
	false,
	"parentProcess",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(BusinessProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(WAITINGFORCONSIGNMENT, AttributeMode.INITIAL);
		tmp.put(WAREHOUSECONSIGNMENTSTATE, AttributeMode.INITIAL);
		tmp.put(DONE, AttributeMode.INITIAL);
		tmp.put(CONSIGNMENT, AttributeMode.INITIAL);
		tmp.put(PARENTPROCESS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapConsignmentProcess.consignment</code> attribute.
	 * @return the consignment
	 */
	public Consignment getConsignment(final SessionContext ctx)
	{
		return (Consignment)getProperty( ctx, CONSIGNMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapConsignmentProcess.consignment</code> attribute.
	 * @return the consignment
	 */
	public Consignment getConsignment()
	{
		return getConsignment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SapConsignmentProcess.consignment</code> attribute. 
	 * @param value the consignment
	 */
	public void setConsignment(final SessionContext ctx, final Consignment value)
	{
		CONSIGNMENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SapConsignmentProcess.consignment</code> attribute. 
	 * @param value the consignment
	 */
	public void setConsignment(final Consignment value)
	{
		setConsignment( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CONSIGNMENTHANDLER.newInstance(ctx, allAttributes);
		PARENTPROCESSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapConsignmentProcess.done</code> attribute.
	 * @return the done - Mark process as done
	 */
	public Boolean isDone(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapConsignmentProcess.done</code> attribute.
	 * @return the done - Mark process as done
	 */
	public Boolean isDone()
	{
		return isDone( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapConsignmentProcess.done</code> attribute. 
	 * @return the done - Mark process as done
	 */
	public boolean isDoneAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDone( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapConsignmentProcess.done</code> attribute. 
	 * @return the done - Mark process as done
	 */
	public boolean isDoneAsPrimitive()
	{
		return isDoneAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SapConsignmentProcess.done</code> attribute. 
	 * @param value the done - Mark process as done
	 */
	public void setDone(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SapConsignmentProcess.done</code> attribute. 
	 * @param value the done - Mark process as done
	 */
	public void setDone(final Boolean value)
	{
		setDone( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SapConsignmentProcess.done</code> attribute. 
	 * @param value the done - Mark process as done
	 */
	public void setDone(final SessionContext ctx, final boolean value)
	{
		setDone( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SapConsignmentProcess.done</code> attribute. 
	 * @param value the done - Mark process as done
	 */
	public void setDone(final boolean value)
	{
		setDone( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapConsignmentProcess.parentProcess</code> attribute.
	 * @return the parentProcess
	 */
	public OrderProcess getParentProcess(final SessionContext ctx)
	{
		return (OrderProcess)getProperty( ctx, PARENTPROCESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapConsignmentProcess.parentProcess</code> attribute.
	 * @return the parentProcess
	 */
	public OrderProcess getParentProcess()
	{
		return getParentProcess( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SapConsignmentProcess.parentProcess</code> attribute. 
	 * @param value the parentProcess
	 */
	public void setParentProcess(final SessionContext ctx, final OrderProcess value)
	{
		PARENTPROCESSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SapConsignmentProcess.parentProcess</code> attribute. 
	 * @param value the parentProcess
	 */
	public void setParentProcess(final OrderProcess value)
	{
		setParentProcess( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapConsignmentProcess.waitingForConsignment</code> attribute.
	 * @return the waitingForConsignment - Mark that process is waiting for consignment
	 */
	public Boolean isWaitingForConsignment(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, WAITINGFORCONSIGNMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapConsignmentProcess.waitingForConsignment</code> attribute.
	 * @return the waitingForConsignment - Mark that process is waiting for consignment
	 */
	public Boolean isWaitingForConsignment()
	{
		return isWaitingForConsignment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapConsignmentProcess.waitingForConsignment</code> attribute. 
	 * @return the waitingForConsignment - Mark that process is waiting for consignment
	 */
	public boolean isWaitingForConsignmentAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isWaitingForConsignment( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapConsignmentProcess.waitingForConsignment</code> attribute. 
	 * @return the waitingForConsignment - Mark that process is waiting for consignment
	 */
	public boolean isWaitingForConsignmentAsPrimitive()
	{
		return isWaitingForConsignmentAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SapConsignmentProcess.waitingForConsignment</code> attribute. 
	 * @param value the waitingForConsignment - Mark that process is waiting for consignment
	 */
	public void setWaitingForConsignment(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, WAITINGFORCONSIGNMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SapConsignmentProcess.waitingForConsignment</code> attribute. 
	 * @param value the waitingForConsignment - Mark that process is waiting for consignment
	 */
	public void setWaitingForConsignment(final Boolean value)
	{
		setWaitingForConsignment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SapConsignmentProcess.waitingForConsignment</code> attribute. 
	 * @param value the waitingForConsignment - Mark that process is waiting for consignment
	 */
	public void setWaitingForConsignment(final SessionContext ctx, final boolean value)
	{
		setWaitingForConsignment( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SapConsignmentProcess.waitingForConsignment</code> attribute. 
	 * @param value the waitingForConsignment - Mark that process is waiting for consignment
	 */
	public void setWaitingForConsignment(final boolean value)
	{
		setWaitingForConsignment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapConsignmentProcess.warehouseConsignmentState</code> attribute.
	 * @return the warehouseConsignmentState - State of warehouse process.
	 */
	public EnumerationValue getWarehouseConsignmentState(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, WAREHOUSECONSIGNMENTSTATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapConsignmentProcess.warehouseConsignmentState</code> attribute.
	 * @return the warehouseConsignmentState - State of warehouse process.
	 */
	public EnumerationValue getWarehouseConsignmentState()
	{
		return getWarehouseConsignmentState( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SapConsignmentProcess.warehouseConsignmentState</code> attribute. 
	 * @param value the warehouseConsignmentState - State of warehouse process.
	 */
	public void setWarehouseConsignmentState(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, WAREHOUSECONSIGNMENTSTATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SapConsignmentProcess.warehouseConsignmentState</code> attribute. 
	 * @param value the warehouseConsignmentState - State of warehouse process.
	 */
	public void setWarehouseConsignmentState(final EnumerationValue value)
	{
		setWarehouseConsignmentState( getSession().getSessionContext(), value );
	}
	
}
