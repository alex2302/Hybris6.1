/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 31, 2016 4:07:33 PM                     ---
 * ----------------------------------------------------------------
 */
package com.sap.retail.oaa.model.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Date;

/**
 * Generated model class for type ScheduleLine first defined at extension sapoaamodel.
 */
@SuppressWarnings("all")
public class ScheduleLineModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ScheduleLine";
	
	/** <i>Generated constant</i> - Attribute key of <code>ScheduleLine.confirmedQuantity</code> attribute defined at extension <code>sapoaamodel</code>. */
	public static final String CONFIRMEDQUANTITY = "confirmedQuantity";
	
	/** <i>Generated constant</i> - Attribute key of <code>ScheduleLine.confirmedDate</code> attribute defined at extension <code>sapoaamodel</code>. */
	public static final String CONFIRMEDDATE = "confirmedDate";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ScheduleLineModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ScheduleLineModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public ScheduleLineModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ScheduleLine.confirmedDate</code> attribute defined at extension <code>sapoaamodel</code>. 
	 * @return the confirmedDate - Date
	 */
	@Accessor(qualifier = "confirmedDate", type = Accessor.Type.GETTER)
	public Date getConfirmedDate()
	{
		return getPersistenceContext().getPropertyValue(CONFIRMEDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ScheduleLine.confirmedQuantity</code> attribute defined at extension <code>sapoaamodel</code>. 
	 * @return the confirmedQuantity - Confirmed Quantity
	 */
	@Accessor(qualifier = "confirmedQuantity", type = Accessor.Type.GETTER)
	public Double getConfirmedQuantity()
	{
		return getPersistenceContext().getPropertyValue(CONFIRMEDQUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ScheduleLine.confirmedDate</code> attribute defined at extension <code>sapoaamodel</code>. 
	 *  
	 * @param value the confirmedDate - Date
	 */
	@Accessor(qualifier = "confirmedDate", type = Accessor.Type.SETTER)
	public void setConfirmedDate(final Date value)
	{
		getPersistenceContext().setPropertyValue(CONFIRMEDDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ScheduleLine.confirmedQuantity</code> attribute defined at extension <code>sapoaamodel</code>. 
	 *  
	 * @param value the confirmedQuantity - Confirmed Quantity
	 */
	@Accessor(qualifier = "confirmedQuantity", type = Accessor.Type.SETTER)
	public void setConfirmedQuantity(final Double value)
	{
		getPersistenceContext().setPropertyValue(CONFIRMEDQUANTITY, value);
	}
	
}
