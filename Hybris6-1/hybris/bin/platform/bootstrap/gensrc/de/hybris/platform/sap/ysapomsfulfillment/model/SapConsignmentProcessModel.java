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
package de.hybris.platform.sap.ysapomsfulfillment.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.commerceservices.enums.WarehouseConsignmentState;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.orderprocessing.model.OrderProcessModel;
import de.hybris.platform.ordersplitting.model.ConsignmentModel;
import de.hybris.platform.processengine.model.BusinessProcessModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SapConsignmentProcess first defined at extension ysapomsfulfillment.
 */
@SuppressWarnings("all")
public class SapConsignmentProcessModel extends BusinessProcessModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SapConsignmentProcess";
	
	/**<i>Generated relation code constant for relation <code>Consignment2SapConsignmentProcess</code> defining source attribute <code>consignment</code> in extension <code>ysapomsfulfillment</code>.</i>*/
	public final static String _CONSIGNMENT2SAPCONSIGNMENTPROCESS = "Consignment2SapConsignmentProcess";
	
	/**<i>Generated relation code constant for relation <code>OrderProcess2SapConsignmentProcess</code> defining source attribute <code>parentProcess</code> in extension <code>ysapomsfulfillment</code>.</i>*/
	public final static String _ORDERPROCESS2SAPCONSIGNMENTPROCESS = "OrderProcess2SapConsignmentProcess";
	
	/** <i>Generated constant</i> - Attribute key of <code>SapConsignmentProcess.waitingForConsignment</code> attribute defined at extension <code>ysapomsfulfillment</code>. */
	public static final String WAITINGFORCONSIGNMENT = "waitingForConsignment";
	
	/** <i>Generated constant</i> - Attribute key of <code>SapConsignmentProcess.warehouseConsignmentState</code> attribute defined at extension <code>ysapomsfulfillment</code>. */
	public static final String WAREHOUSECONSIGNMENTSTATE = "warehouseConsignmentState";
	
	/** <i>Generated constant</i> - Attribute key of <code>SapConsignmentProcess.done</code> attribute defined at extension <code>ysapomsfulfillment</code>. */
	public static final String DONE = "done";
	
	/** <i>Generated constant</i> - Attribute key of <code>SapConsignmentProcess.consignment</code> attribute defined at extension <code>ysapomsfulfillment</code>. */
	public static final String CONSIGNMENT = "consignment";
	
	/** <i>Generated constant</i> - Attribute key of <code>SapConsignmentProcess.parentProcess</code> attribute defined at extension <code>ysapomsfulfillment</code>. */
	public static final String PARENTPROCESS = "parentProcess";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SapConsignmentProcessModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SapConsignmentProcessModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 * @param _processDefinitionName initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 */
	@Deprecated
	public SapConsignmentProcessModel(final String _code, final String _processDefinitionName)
	{
		super();
		setCode(_code);
		setProcessDefinitionName(_processDefinitionName);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _processDefinitionName initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 */
	@Deprecated
	public SapConsignmentProcessModel(final String _code, final ItemModel _owner, final String _processDefinitionName)
	{
		super();
		setCode(_code);
		setOwner(_owner);
		setProcessDefinitionName(_processDefinitionName);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapConsignmentProcess.consignment</code> attribute defined at extension <code>ysapomsfulfillment</code>. 
	 * @return the consignment
	 */
	@Accessor(qualifier = "consignment", type = Accessor.Type.GETTER)
	public ConsignmentModel getConsignment()
	{
		return getPersistenceContext().getPropertyValue(CONSIGNMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapConsignmentProcess.parentProcess</code> attribute defined at extension <code>ysapomsfulfillment</code>. 
	 * @return the parentProcess
	 */
	@Accessor(qualifier = "parentProcess", type = Accessor.Type.GETTER)
	public OrderProcessModel getParentProcess()
	{
		return getPersistenceContext().getPropertyValue(PARENTPROCESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapConsignmentProcess.warehouseConsignmentState</code> attribute defined at extension <code>ysapomsfulfillment</code>. 
	 * @return the warehouseConsignmentState - State of warehouse process.
	 */
	@Accessor(qualifier = "warehouseConsignmentState", type = Accessor.Type.GETTER)
	public WarehouseConsignmentState getWarehouseConsignmentState()
	{
		return getPersistenceContext().getPropertyValue(WAREHOUSECONSIGNMENTSTATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapConsignmentProcess.done</code> attribute defined at extension <code>ysapomsfulfillment</code>. 
	 * @return the done - Mark process as done
	 */
	@Accessor(qualifier = "done", type = Accessor.Type.GETTER)
	public boolean isDone()
	{
		return toPrimitive((Boolean)getPersistenceContext().getPropertyValue(DONE));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapConsignmentProcess.waitingForConsignment</code> attribute defined at extension <code>ysapomsfulfillment</code>. 
	 * @return the waitingForConsignment - Mark that process is waiting for consignment
	 */
	@Accessor(qualifier = "waitingForConsignment", type = Accessor.Type.GETTER)
	public boolean isWaitingForConsignment()
	{
		return toPrimitive((Boolean)getPersistenceContext().getPropertyValue(WAITINGFORCONSIGNMENT));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SapConsignmentProcess.consignment</code> attribute defined at extension <code>ysapomsfulfillment</code>. 
	 *  
	 * @param value the consignment
	 */
	@Accessor(qualifier = "consignment", type = Accessor.Type.SETTER)
	public void setConsignment(final ConsignmentModel value)
	{
		getPersistenceContext().setPropertyValue(CONSIGNMENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SapConsignmentProcess.done</code> attribute defined at extension <code>ysapomsfulfillment</code>. 
	 *  
	 * @param value the done - Mark process as done
	 */
	@Accessor(qualifier = "done", type = Accessor.Type.SETTER)
	public void setDone(final boolean value)
	{
		getPersistenceContext().setPropertyValue(DONE, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SapConsignmentProcess.parentProcess</code> attribute defined at extension <code>ysapomsfulfillment</code>. 
	 *  
	 * @param value the parentProcess
	 */
	@Accessor(qualifier = "parentProcess", type = Accessor.Type.SETTER)
	public void setParentProcess(final OrderProcessModel value)
	{
		getPersistenceContext().setPropertyValue(PARENTPROCESS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SapConsignmentProcess.waitingForConsignment</code> attribute defined at extension <code>ysapomsfulfillment</code>. 
	 *  
	 * @param value the waitingForConsignment - Mark that process is waiting for consignment
	 */
	@Accessor(qualifier = "waitingForConsignment", type = Accessor.Type.SETTER)
	public void setWaitingForConsignment(final boolean value)
	{
		getPersistenceContext().setPropertyValue(WAITINGFORCONSIGNMENT, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SapConsignmentProcess.warehouseConsignmentState</code> attribute defined at extension <code>ysapomsfulfillment</code>. 
	 *  
	 * @param value the warehouseConsignmentState - State of warehouse process.
	 */
	@Accessor(qualifier = "warehouseConsignmentState", type = Accessor.Type.SETTER)
	public void setWarehouseConsignmentState(final WarehouseConsignmentState value)
	{
		getPersistenceContext().setPropertyValue(WAREHOUSECONSIGNMENTSTATE, value);
	}
	
}
