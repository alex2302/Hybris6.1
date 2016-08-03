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
package de.hybris.platform.sap.productconfig.model.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.sap.productconfig.model.enums.DataloadStatus;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Generated model class for type CPQDataloadStatus first defined at extension sapproductconfigmodel.
 */
@SuppressWarnings("all")
public class CPQDataloadStatusModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "CPQDataloadStatus";
	
	/** <i>Generated constant</i> - Attribute key of <code>CPQDataloadStatus.cpqDataloadStatusForSapConfiguration</code> attribute defined at extension <code>sapproductconfigmodel</code>. */
	public static final String CPQDATALOADSTATUSFORSAPCONFIGURATION = "cpqDataloadStatusForSapConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>CPQDataloadStatus.cpqDataloadStatus</code> attribute defined at extension <code>sapproductconfigmodel</code>. */
	public static final String CPQDATALOADSTATUS = "cpqDataloadStatus";
	
	/** <i>Generated constant</i> - Attribute key of <code>CPQDataloadStatus.cpqLastInitialLoadStartTime</code> attribute defined at extension <code>sapproductconfigmodel</code>. */
	public static final String CPQLASTINITIALLOADSTARTTIME = "cpqLastInitialLoadStartTime";
	
	/** <i>Generated constant</i> - Attribute key of <code>CPQDataloadStatus.cpqLastInitialLoadEndTime</code> attribute defined at extension <code>sapproductconfigmodel</code>. */
	public static final String CPQLASTINITIALLOADENDTIME = "cpqLastInitialLoadEndTime";
	
	/** <i>Generated constant</i> - Attribute key of <code>CPQDataloadStatus.cpqLastInitialLoadTransferredVolume</code> attribute defined at extension <code>sapproductconfigmodel</code>. */
	public static final String CPQLASTINITIALLOADTRANSFERREDVOLUME = "cpqLastInitialLoadTransferredVolume";
	
	/** <i>Generated constant</i> - Attribute key of <code>CPQDataloadStatus.cpqCurrentInitialLoadTransferredVolume</code> attribute defined at extension <code>sapproductconfigmodel</code>. */
	public static final String CPQCURRENTINITIALLOADTRANSFERREDVOLUME = "cpqCurrentInitialLoadTransferredVolume";
	
	/** <i>Generated constant</i> - Attribute key of <code>CPQDataloadStatus.cpqNumberOfEntriesInDeltaLoadQueue</code> attribute defined at extension <code>sapproductconfigmodel</code>. */
	public static final String CPQNUMBEROFENTRIESINDELTALOADQUEUE = "cpqNumberOfEntriesInDeltaLoadQueue";
	
	/** <i>Generated constant</i> - Attribute key of <code>CPQDataloadStatus.cpqCurrentDeltaLoadTransferredVolume</code> attribute defined at extension <code>sapproductconfigmodel</code>. */
	public static final String CPQCURRENTDELTALOADTRANSFERREDVOLUME = "cpqCurrentDeltaLoadTransferredVolume";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CPQDataloadStatusModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CPQDataloadStatusModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _cpqDataloadStatusForSapConfiguration initial attribute declared by type <code>CPQDataloadStatus</code> at extension <code>sapproductconfigmodel</code>
	 */
	@Deprecated
	public CPQDataloadStatusModel(final String _cpqDataloadStatusForSapConfiguration)
	{
		super();
		setCpqDataloadStatusForSapConfiguration(_cpqDataloadStatusForSapConfiguration);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _cpqDataloadStatusForSapConfiguration initial attribute declared by type <code>CPQDataloadStatus</code> at extension <code>sapproductconfigmodel</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public CPQDataloadStatusModel(final String _cpqDataloadStatusForSapConfiguration, final ItemModel _owner)
	{
		super();
		setCpqDataloadStatusForSapConfiguration(_cpqDataloadStatusForSapConfiguration);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CPQDataloadStatus.cpqCurrentDeltaLoadTransferredVolume</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 * @return the cpqCurrentDeltaLoadTransferredVolume - Product Config - Current Delta Load Transferred Volume
	 */
	@Accessor(qualifier = "cpqCurrentDeltaLoadTransferredVolume", type = Accessor.Type.GETTER)
	public BigDecimal getCpqCurrentDeltaLoadTransferredVolume()
	{
		return getPersistenceContext().getPropertyValue(CPQCURRENTDELTALOADTRANSFERREDVOLUME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CPQDataloadStatus.cpqCurrentInitialLoadTransferredVolume</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 * @return the cpqCurrentInitialLoadTransferredVolume - Product Config - Current Initial Load Transferred Volume
	 */
	@Accessor(qualifier = "cpqCurrentInitialLoadTransferredVolume", type = Accessor.Type.GETTER)
	public BigDecimal getCpqCurrentInitialLoadTransferredVolume()
	{
		return getPersistenceContext().getPropertyValue(CPQCURRENTINITIALLOADTRANSFERREDVOLUME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CPQDataloadStatus.cpqDataloadStatus</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 * @return the cpqDataloadStatus - Product Config - Data Load Status
	 */
	@Accessor(qualifier = "cpqDataloadStatus", type = Accessor.Type.GETTER)
	public DataloadStatus getCpqDataloadStatus()
	{
		return getPersistenceContext().getPropertyValue(CPQDATALOADSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CPQDataloadStatus.cpqDataloadStatusForSapConfiguration</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 * @return the cpqDataloadStatusForSapConfiguration - CPQ Dataload Status Name
	 */
	@Accessor(qualifier = "cpqDataloadStatusForSapConfiguration", type = Accessor.Type.GETTER)
	public String getCpqDataloadStatusForSapConfiguration()
	{
		return getPersistenceContext().getPropertyValue(CPQDATALOADSTATUSFORSAPCONFIGURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CPQDataloadStatus.cpqLastInitialLoadEndTime</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 * @return the cpqLastInitialLoadEndTime - Product Config - Last Initial Load End Time
	 */
	@Accessor(qualifier = "cpqLastInitialLoadEndTime", type = Accessor.Type.GETTER)
	public Date getCpqLastInitialLoadEndTime()
	{
		return getPersistenceContext().getPropertyValue(CPQLASTINITIALLOADENDTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CPQDataloadStatus.cpqLastInitialLoadStartTime</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 * @return the cpqLastInitialLoadStartTime - Product Config - Last Initial Load Start Time
	 */
	@Accessor(qualifier = "cpqLastInitialLoadStartTime", type = Accessor.Type.GETTER)
	public Date getCpqLastInitialLoadStartTime()
	{
		return getPersistenceContext().getPropertyValue(CPQLASTINITIALLOADSTARTTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CPQDataloadStatus.cpqLastInitialLoadTransferredVolume</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 * @return the cpqLastInitialLoadTransferredVolume - Product Config - Last Initial Load Transferred Volume
	 */
	@Accessor(qualifier = "cpqLastInitialLoadTransferredVolume", type = Accessor.Type.GETTER)
	public BigDecimal getCpqLastInitialLoadTransferredVolume()
	{
		return getPersistenceContext().getPropertyValue(CPQLASTINITIALLOADTRANSFERREDVOLUME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CPQDataloadStatus.cpqNumberOfEntriesInDeltaLoadQueue</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 * @return the cpqNumberOfEntriesInDeltaLoadQueue - Product Config - Number of Entries in Delta Load Queue
	 */
	@Accessor(qualifier = "cpqNumberOfEntriesInDeltaLoadQueue", type = Accessor.Type.GETTER)
	public Integer getCpqNumberOfEntriesInDeltaLoadQueue()
	{
		return getPersistenceContext().getPropertyValue(CPQNUMBEROFENTRIESINDELTALOADQUEUE);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CPQDataloadStatus.cpqCurrentDeltaLoadTransferredVolume</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 *  
	 * @param value the cpqCurrentDeltaLoadTransferredVolume - Product Config - Current Delta Load Transferred Volume
	 */
	@Accessor(qualifier = "cpqCurrentDeltaLoadTransferredVolume", type = Accessor.Type.SETTER)
	public void setCpqCurrentDeltaLoadTransferredVolume(final BigDecimal value)
	{
		getPersistenceContext().setPropertyValue(CPQCURRENTDELTALOADTRANSFERREDVOLUME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CPQDataloadStatus.cpqCurrentInitialLoadTransferredVolume</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 *  
	 * @param value the cpqCurrentInitialLoadTransferredVolume - Product Config - Current Initial Load Transferred Volume
	 */
	@Accessor(qualifier = "cpqCurrentInitialLoadTransferredVolume", type = Accessor.Type.SETTER)
	public void setCpqCurrentInitialLoadTransferredVolume(final BigDecimal value)
	{
		getPersistenceContext().setPropertyValue(CPQCURRENTINITIALLOADTRANSFERREDVOLUME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CPQDataloadStatus.cpqDataloadStatus</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 *  
	 * @param value the cpqDataloadStatus - Product Config - Data Load Status
	 */
	@Accessor(qualifier = "cpqDataloadStatus", type = Accessor.Type.SETTER)
	public void setCpqDataloadStatus(final DataloadStatus value)
	{
		getPersistenceContext().setPropertyValue(CPQDATALOADSTATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CPQDataloadStatus.cpqDataloadStatusForSapConfiguration</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 *  
	 * @param value the cpqDataloadStatusForSapConfiguration - CPQ Dataload Status Name
	 */
	@Accessor(qualifier = "cpqDataloadStatusForSapConfiguration", type = Accessor.Type.SETTER)
	public void setCpqDataloadStatusForSapConfiguration(final String value)
	{
		getPersistenceContext().setPropertyValue(CPQDATALOADSTATUSFORSAPCONFIGURATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CPQDataloadStatus.cpqLastInitialLoadEndTime</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 *  
	 * @param value the cpqLastInitialLoadEndTime - Product Config - Last Initial Load End Time
	 */
	@Accessor(qualifier = "cpqLastInitialLoadEndTime", type = Accessor.Type.SETTER)
	public void setCpqLastInitialLoadEndTime(final Date value)
	{
		getPersistenceContext().setPropertyValue(CPQLASTINITIALLOADENDTIME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CPQDataloadStatus.cpqLastInitialLoadStartTime</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 *  
	 * @param value the cpqLastInitialLoadStartTime - Product Config - Last Initial Load Start Time
	 */
	@Accessor(qualifier = "cpqLastInitialLoadStartTime", type = Accessor.Type.SETTER)
	public void setCpqLastInitialLoadStartTime(final Date value)
	{
		getPersistenceContext().setPropertyValue(CPQLASTINITIALLOADSTARTTIME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CPQDataloadStatus.cpqLastInitialLoadTransferredVolume</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 *  
	 * @param value the cpqLastInitialLoadTransferredVolume - Product Config - Last Initial Load Transferred Volume
	 */
	@Accessor(qualifier = "cpqLastInitialLoadTransferredVolume", type = Accessor.Type.SETTER)
	public void setCpqLastInitialLoadTransferredVolume(final BigDecimal value)
	{
		getPersistenceContext().setPropertyValue(CPQLASTINITIALLOADTRANSFERREDVOLUME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CPQDataloadStatus.cpqNumberOfEntriesInDeltaLoadQueue</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 *  
	 * @param value the cpqNumberOfEntriesInDeltaLoadQueue - Product Config - Number of Entries in Delta Load Queue
	 */
	@Accessor(qualifier = "cpqNumberOfEntriesInDeltaLoadQueue", type = Accessor.Type.SETTER)
	public void setCpqNumberOfEntriesInDeltaLoadQueue(final Integer value)
	{
		getPersistenceContext().setPropertyValue(CPQNUMBEROFENTRIESINDELTALOADQUEUE, value);
	}
	
}
