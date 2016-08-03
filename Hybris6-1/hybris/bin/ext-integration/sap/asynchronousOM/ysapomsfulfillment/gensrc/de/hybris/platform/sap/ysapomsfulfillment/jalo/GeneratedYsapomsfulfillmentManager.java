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

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.order.AbstractOrder;
import de.hybris.platform.jalo.order.Order;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.orderprocessing.jalo.OrderProcess;
import de.hybris.platform.ordersplitting.jalo.Consignment;
import de.hybris.platform.ordersplitting.jalo.ConsignmentEntry;
import de.hybris.platform.processengine.jalo.BusinessProcess;
import de.hybris.platform.sap.sapmodel.jalo.SAPSalesOrganization;
import de.hybris.platform.sap.ysapomsfulfillment.constants.YsapomsfulfillmentConstants;
import de.hybris.platform.sap.ysapomsfulfillment.jalo.SapConsignmentProcess;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>YsapomsfulfillmentManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedYsapomsfulfillmentManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n SAPCONSIGNMENTPROCESSES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SapConsignmentProcess> CONSIGNMENT2SAPCONSIGNMENTPROCESSSAPCONSIGNMENTPROCESSESHANDLER = new OneToManyHandler<SapConsignmentProcess>(
	YsapomsfulfillmentConstants.TC.SAPCONSIGNMENTPROCESS,
	false,
	"consignment",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SAPCONSIGNMENTPROCESSES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SapConsignmentProcess> ORDERPROCESS2SAPCONSIGNMENTPROCESSSAPCONSIGNMENTPROCESSESHANDLER = new OneToManyHandler<SapConsignmentProcess>(
	YsapomsfulfillmentConstants.TC.SAPCONSIGNMENTPROCESS,
	false,
	"parentProcess",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("sapLogicalSystem", AttributeMode.INITIAL);
		tmp.put("sapSalesOrganization", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.Order", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("sapOrderEntryRowNumber", AttributeMode.INITIAL);
		tmp.put("status", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.ordersplitting.jalo.ConsignmentEntry", Collections.unmodifiableMap(tmp));
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
	
	public SapConsignmentProcess createSapConsignmentProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( YsapomsfulfillmentConstants.TC.SAPCONSIGNMENTPROCESS );
			return (SapConsignmentProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SapConsignmentProcess : "+e.getMessage(), 0 );
		}
	}
	
	public SapConsignmentProcess createSapConsignmentProcess(final Map attributeValues)
	{
		return createSapConsignmentProcess( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return YsapomsfulfillmentConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Consignment.sapConsignmentProcesses</code> attribute.
	 * @return the sapConsignmentProcesses
	 */
	public Collection<SapConsignmentProcess> getSapConsignmentProcesses(final SessionContext ctx, final Consignment item)
	{
		return CONSIGNMENT2SAPCONSIGNMENTPROCESSSAPCONSIGNMENTPROCESSESHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Consignment.sapConsignmentProcesses</code> attribute.
	 * @return the sapConsignmentProcesses
	 */
	public Collection<SapConsignmentProcess> getSapConsignmentProcesses(final Consignment item)
	{
		return getSapConsignmentProcesses( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Consignment.sapConsignmentProcesses</code> attribute. 
	 * @param value the sapConsignmentProcesses
	 */
	public void setSapConsignmentProcesses(final SessionContext ctx, final Consignment item, final Collection<SapConsignmentProcess> value)
	{
		CONSIGNMENT2SAPCONSIGNMENTPROCESSSAPCONSIGNMENTPROCESSESHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Consignment.sapConsignmentProcesses</code> attribute. 
	 * @param value the sapConsignmentProcesses
	 */
	public void setSapConsignmentProcesses(final Consignment item, final Collection<SapConsignmentProcess> value)
	{
		setSapConsignmentProcesses( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sapConsignmentProcesses. 
	 * @param value the item to add to sapConsignmentProcesses
	 */
	public void addToSapConsignmentProcesses(final SessionContext ctx, final Consignment item, final SapConsignmentProcess value)
	{
		CONSIGNMENT2SAPCONSIGNMENTPROCESSSAPCONSIGNMENTPROCESSESHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sapConsignmentProcesses. 
	 * @param value the item to add to sapConsignmentProcesses
	 */
	public void addToSapConsignmentProcesses(final Consignment item, final SapConsignmentProcess value)
	{
		addToSapConsignmentProcesses( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sapConsignmentProcesses. 
	 * @param value the item to remove from sapConsignmentProcesses
	 */
	public void removeFromSapConsignmentProcesses(final SessionContext ctx, final Consignment item, final SapConsignmentProcess value)
	{
		CONSIGNMENT2SAPCONSIGNMENTPROCESSSAPCONSIGNMENTPROCESSESHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sapConsignmentProcesses. 
	 * @param value the item to remove from sapConsignmentProcesses
	 */
	public void removeFromSapConsignmentProcesses(final Consignment item, final SapConsignmentProcess value)
	{
		removeFromSapConsignmentProcesses( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProcess.sapConsignmentProcesses</code> attribute.
	 * @return the sapConsignmentProcesses
	 */
	public Collection<SapConsignmentProcess> getSapConsignmentProcesses(final SessionContext ctx, final OrderProcess item)
	{
		return ORDERPROCESS2SAPCONSIGNMENTPROCESSSAPCONSIGNMENTPROCESSESHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderProcess.sapConsignmentProcesses</code> attribute.
	 * @return the sapConsignmentProcesses
	 */
	public Collection<SapConsignmentProcess> getSapConsignmentProcesses(final OrderProcess item)
	{
		return getSapConsignmentProcesses( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProcess.sapConsignmentProcesses</code> attribute. 
	 * @param value the sapConsignmentProcesses
	 */
	public void setSapConsignmentProcesses(final SessionContext ctx, final OrderProcess item, final Collection<SapConsignmentProcess> value)
	{
		ORDERPROCESS2SAPCONSIGNMENTPROCESSSAPCONSIGNMENTPROCESSESHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderProcess.sapConsignmentProcesses</code> attribute. 
	 * @param value the sapConsignmentProcesses
	 */
	public void setSapConsignmentProcesses(final OrderProcess item, final Collection<SapConsignmentProcess> value)
	{
		setSapConsignmentProcesses( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sapConsignmentProcesses. 
	 * @param value the item to add to sapConsignmentProcesses
	 */
	public void addToSapConsignmentProcesses(final SessionContext ctx, final OrderProcess item, final SapConsignmentProcess value)
	{
		ORDERPROCESS2SAPCONSIGNMENTPROCESSSAPCONSIGNMENTPROCESSESHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sapConsignmentProcesses. 
	 * @param value the item to add to sapConsignmentProcesses
	 */
	public void addToSapConsignmentProcesses(final OrderProcess item, final SapConsignmentProcess value)
	{
		addToSapConsignmentProcesses( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sapConsignmentProcesses. 
	 * @param value the item to remove from sapConsignmentProcesses
	 */
	public void removeFromSapConsignmentProcesses(final SessionContext ctx, final OrderProcess item, final SapConsignmentProcess value)
	{
		ORDERPROCESS2SAPCONSIGNMENTPROCESSSAPCONSIGNMENTPROCESSESHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sapConsignmentProcesses. 
	 * @param value the item to remove from sapConsignmentProcesses
	 */
	public void removeFromSapConsignmentProcesses(final OrderProcess item, final SapConsignmentProcess value)
	{
		removeFromSapConsignmentProcesses( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.sapLogicalSystem</code> attribute.
	 * @return the sapLogicalSystem - SAP logical system
	 */
	public String getSapLogicalSystem(final SessionContext ctx, final Order item)
	{
		return (String)item.getProperty( ctx, YsapomsfulfillmentConstants.Attributes.Order.SAPLOGICALSYSTEM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.sapLogicalSystem</code> attribute.
	 * @return the sapLogicalSystem - SAP logical system
	 */
	public String getSapLogicalSystem(final Order item)
	{
		return getSapLogicalSystem( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.sapLogicalSystem</code> attribute. 
	 * @param value the sapLogicalSystem - SAP logical system
	 */
	public void setSapLogicalSystem(final SessionContext ctx, final Order item, final String value)
	{
		item.setProperty(ctx, YsapomsfulfillmentConstants.Attributes.Order.SAPLOGICALSYSTEM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.sapLogicalSystem</code> attribute. 
	 * @param value the sapLogicalSystem - SAP logical system
	 */
	public void setSapLogicalSystem(final Order item, final String value)
	{
		setSapLogicalSystem( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsignmentEntry.sapOrderEntryRowNumber</code> attribute.
	 * @return the sapOrderEntryRowNumber
	 */
	public Integer getSapOrderEntryRowNumber(final SessionContext ctx, final ConsignmentEntry item)
	{
		return (Integer)item.getProperty( ctx, YsapomsfulfillmentConstants.Attributes.ConsignmentEntry.SAPORDERENTRYROWNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsignmentEntry.sapOrderEntryRowNumber</code> attribute.
	 * @return the sapOrderEntryRowNumber
	 */
	public Integer getSapOrderEntryRowNumber(final ConsignmentEntry item)
	{
		return getSapOrderEntryRowNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsignmentEntry.sapOrderEntryRowNumber</code> attribute. 
	 * @return the sapOrderEntryRowNumber
	 */
	public int getSapOrderEntryRowNumberAsPrimitive(final SessionContext ctx, final ConsignmentEntry item)
	{
		Integer value = getSapOrderEntryRowNumber( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsignmentEntry.sapOrderEntryRowNumber</code> attribute. 
	 * @return the sapOrderEntryRowNumber
	 */
	public int getSapOrderEntryRowNumberAsPrimitive(final ConsignmentEntry item)
	{
		return getSapOrderEntryRowNumberAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConsignmentEntry.sapOrderEntryRowNumber</code> attribute. 
	 * @param value the sapOrderEntryRowNumber
	 */
	public void setSapOrderEntryRowNumber(final SessionContext ctx, final ConsignmentEntry item, final Integer value)
	{
		item.setProperty(ctx, YsapomsfulfillmentConstants.Attributes.ConsignmentEntry.SAPORDERENTRYROWNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConsignmentEntry.sapOrderEntryRowNumber</code> attribute. 
	 * @param value the sapOrderEntryRowNumber
	 */
	public void setSapOrderEntryRowNumber(final ConsignmentEntry item, final Integer value)
	{
		setSapOrderEntryRowNumber( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConsignmentEntry.sapOrderEntryRowNumber</code> attribute. 
	 * @param value the sapOrderEntryRowNumber
	 */
	public void setSapOrderEntryRowNumber(final SessionContext ctx, final ConsignmentEntry item, final int value)
	{
		setSapOrderEntryRowNumber( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConsignmentEntry.sapOrderEntryRowNumber</code> attribute. 
	 * @param value the sapOrderEntryRowNumber
	 */
	public void setSapOrderEntryRowNumber(final ConsignmentEntry item, final int value)
	{
		setSapOrderEntryRowNumber( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.sapSalesOrganization</code> attribute.
	 * @return the sapSalesOrganization - SAP Sales Organization
	 */
	public SAPSalesOrganization getSapSalesOrganization(final SessionContext ctx, final Order item)
	{
		return (SAPSalesOrganization)item.getProperty( ctx, YsapomsfulfillmentConstants.Attributes.Order.SAPSALESORGANIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.sapSalesOrganization</code> attribute.
	 * @return the sapSalesOrganization - SAP Sales Organization
	 */
	public SAPSalesOrganization getSapSalesOrganization(final Order item)
	{
		return getSapSalesOrganization( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.sapSalesOrganization</code> attribute. 
	 * @param value the sapSalesOrganization - SAP Sales Organization
	 */
	public void setSapSalesOrganization(final SessionContext ctx, final Order item, final SAPSalesOrganization value)
	{
		item.setProperty(ctx, YsapomsfulfillmentConstants.Attributes.Order.SAPSALESORGANIZATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.sapSalesOrganization</code> attribute. 
	 * @param value the sapSalesOrganization - SAP Sales Organization
	 */
	public void setSapSalesOrganization(final Order item, final SAPSalesOrganization value)
	{
		setSapSalesOrganization( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsignmentEntry.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus(final SessionContext ctx, final ConsignmentEntry item)
	{
		return (EnumerationValue)item.getProperty( ctx, YsapomsfulfillmentConstants.Attributes.ConsignmentEntry.STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsignmentEntry.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus(final ConsignmentEntry item)
	{
		return getStatus( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConsignmentEntry.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final SessionContext ctx, final ConsignmentEntry item, final EnumerationValue value)
	{
		item.setProperty(ctx, YsapomsfulfillmentConstants.Attributes.ConsignmentEntry.STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConsignmentEntry.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final ConsignmentEntry item, final EnumerationValue value)
	{
		setStatus( getSession().getSessionContext(), item, value );
	}
	
}
