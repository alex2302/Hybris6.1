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
package de.hybris.platform.sap.productconfig.model.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.sap.productconfig.model.constants.SapproductconfigmodelConstants;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CPQDataloadStatus}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCPQDataloadStatus extends GenericItem
{
	/** Qualifier of the <code>CPQDataloadStatus.cpqDataloadStatusForSapConfiguration</code> attribute **/
	public static final String CPQDATALOADSTATUSFORSAPCONFIGURATION = "cpqDataloadStatusForSapConfiguration";
	/** Qualifier of the <code>CPQDataloadStatus.cpqDataloadStatus</code> attribute **/
	public static final String CPQDATALOADSTATUS = "cpqDataloadStatus";
	/** Qualifier of the <code>CPQDataloadStatus.cpqLastInitialLoadStartTime</code> attribute **/
	public static final String CPQLASTINITIALLOADSTARTTIME = "cpqLastInitialLoadStartTime";
	/** Qualifier of the <code>CPQDataloadStatus.cpqLastInitialLoadEndTime</code> attribute **/
	public static final String CPQLASTINITIALLOADENDTIME = "cpqLastInitialLoadEndTime";
	/** Qualifier of the <code>CPQDataloadStatus.cpqLastInitialLoadTransferredVolume</code> attribute **/
	public static final String CPQLASTINITIALLOADTRANSFERREDVOLUME = "cpqLastInitialLoadTransferredVolume";
	/** Qualifier of the <code>CPQDataloadStatus.cpqCurrentInitialLoadTransferredVolume</code> attribute **/
	public static final String CPQCURRENTINITIALLOADTRANSFERREDVOLUME = "cpqCurrentInitialLoadTransferredVolume";
	/** Qualifier of the <code>CPQDataloadStatus.cpqNumberOfEntriesInDeltaLoadQueue</code> attribute **/
	public static final String CPQNUMBEROFENTRIESINDELTALOADQUEUE = "cpqNumberOfEntriesInDeltaLoadQueue";
	/** Qualifier of the <code>CPQDataloadStatus.cpqCurrentDeltaLoadTransferredVolume</code> attribute **/
	public static final String CPQCURRENTDELTALOADTRANSFERREDVOLUME = "cpqCurrentDeltaLoadTransferredVolume";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CPQDATALOADSTATUSFORSAPCONFIGURATION, AttributeMode.INITIAL);
		tmp.put(CPQDATALOADSTATUS, AttributeMode.INITIAL);
		tmp.put(CPQLASTINITIALLOADSTARTTIME, AttributeMode.INITIAL);
		tmp.put(CPQLASTINITIALLOADENDTIME, AttributeMode.INITIAL);
		tmp.put(CPQLASTINITIALLOADTRANSFERREDVOLUME, AttributeMode.INITIAL);
		tmp.put(CPQCURRENTINITIALLOADTRANSFERREDVOLUME, AttributeMode.INITIAL);
		tmp.put(CPQNUMBEROFENTRIESINDELTALOADQUEUE, AttributeMode.INITIAL);
		tmp.put(CPQCURRENTDELTALOADTRANSFERREDVOLUME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CPQDataloadStatus.cpqCurrentDeltaLoadTransferredVolume</code> attribute.
	 * @return the cpqCurrentDeltaLoadTransferredVolume - Product Config - Current Delta Load Transferred Volume
	 */
	public BigDecimal getCpqCurrentDeltaLoadTransferredVolume(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, CPQCURRENTDELTALOADTRANSFERREDVOLUME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CPQDataloadStatus.cpqCurrentDeltaLoadTransferredVolume</code> attribute.
	 * @return the cpqCurrentDeltaLoadTransferredVolume - Product Config - Current Delta Load Transferred Volume
	 */
	public BigDecimal getCpqCurrentDeltaLoadTransferredVolume()
	{
		return getCpqCurrentDeltaLoadTransferredVolume( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CPQDataloadStatus.cpqCurrentDeltaLoadTransferredVolume</code> attribute. 
	 * @param value the cpqCurrentDeltaLoadTransferredVolume - Product Config - Current Delta Load Transferred Volume
	 */
	public void setCpqCurrentDeltaLoadTransferredVolume(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, CPQCURRENTDELTALOADTRANSFERREDVOLUME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CPQDataloadStatus.cpqCurrentDeltaLoadTransferredVolume</code> attribute. 
	 * @param value the cpqCurrentDeltaLoadTransferredVolume - Product Config - Current Delta Load Transferred Volume
	 */
	public void setCpqCurrentDeltaLoadTransferredVolume(final BigDecimal value)
	{
		setCpqCurrentDeltaLoadTransferredVolume( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CPQDataloadStatus.cpqCurrentInitialLoadTransferredVolume</code> attribute.
	 * @return the cpqCurrentInitialLoadTransferredVolume - Product Config - Current Initial Load Transferred Volume
	 */
	public BigDecimal getCpqCurrentInitialLoadTransferredVolume(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, CPQCURRENTINITIALLOADTRANSFERREDVOLUME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CPQDataloadStatus.cpqCurrentInitialLoadTransferredVolume</code> attribute.
	 * @return the cpqCurrentInitialLoadTransferredVolume - Product Config - Current Initial Load Transferred Volume
	 */
	public BigDecimal getCpqCurrentInitialLoadTransferredVolume()
	{
		return getCpqCurrentInitialLoadTransferredVolume( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CPQDataloadStatus.cpqCurrentInitialLoadTransferredVolume</code> attribute. 
	 * @param value the cpqCurrentInitialLoadTransferredVolume - Product Config - Current Initial Load Transferred Volume
	 */
	public void setCpqCurrentInitialLoadTransferredVolume(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, CPQCURRENTINITIALLOADTRANSFERREDVOLUME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CPQDataloadStatus.cpqCurrentInitialLoadTransferredVolume</code> attribute. 
	 * @param value the cpqCurrentInitialLoadTransferredVolume - Product Config - Current Initial Load Transferred Volume
	 */
	public void setCpqCurrentInitialLoadTransferredVolume(final BigDecimal value)
	{
		setCpqCurrentInitialLoadTransferredVolume( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CPQDataloadStatus.cpqDataloadStatus</code> attribute.
	 * @return the cpqDataloadStatus - Product Config - Data Load Status
	 */
	public EnumerationValue getCpqDataloadStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CPQDATALOADSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CPQDataloadStatus.cpqDataloadStatus</code> attribute.
	 * @return the cpqDataloadStatus - Product Config - Data Load Status
	 */
	public EnumerationValue getCpqDataloadStatus()
	{
		return getCpqDataloadStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CPQDataloadStatus.cpqDataloadStatus</code> attribute. 
	 * @param value the cpqDataloadStatus - Product Config - Data Load Status
	 */
	public void setCpqDataloadStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CPQDATALOADSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CPQDataloadStatus.cpqDataloadStatus</code> attribute. 
	 * @param value the cpqDataloadStatus - Product Config - Data Load Status
	 */
	public void setCpqDataloadStatus(final EnumerationValue value)
	{
		setCpqDataloadStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CPQDataloadStatus.cpqDataloadStatusForSapConfiguration</code> attribute.
	 * @return the cpqDataloadStatusForSapConfiguration - CPQ Dataload Status Name
	 */
	public String getCpqDataloadStatusForSapConfiguration(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CPQDATALOADSTATUSFORSAPCONFIGURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CPQDataloadStatus.cpqDataloadStatusForSapConfiguration</code> attribute.
	 * @return the cpqDataloadStatusForSapConfiguration - CPQ Dataload Status Name
	 */
	public String getCpqDataloadStatusForSapConfiguration()
	{
		return getCpqDataloadStatusForSapConfiguration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CPQDataloadStatus.cpqDataloadStatusForSapConfiguration</code> attribute. 
	 * @param value the cpqDataloadStatusForSapConfiguration - CPQ Dataload Status Name
	 */
	public void setCpqDataloadStatusForSapConfiguration(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CPQDATALOADSTATUSFORSAPCONFIGURATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CPQDataloadStatus.cpqDataloadStatusForSapConfiguration</code> attribute. 
	 * @param value the cpqDataloadStatusForSapConfiguration - CPQ Dataload Status Name
	 */
	public void setCpqDataloadStatusForSapConfiguration(final String value)
	{
		setCpqDataloadStatusForSapConfiguration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CPQDataloadStatus.cpqLastInitialLoadEndTime</code> attribute.
	 * @return the cpqLastInitialLoadEndTime - Product Config - Last Initial Load End Time
	 */
	public Date getCpqLastInitialLoadEndTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CPQLASTINITIALLOADENDTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CPQDataloadStatus.cpqLastInitialLoadEndTime</code> attribute.
	 * @return the cpqLastInitialLoadEndTime - Product Config - Last Initial Load End Time
	 */
	public Date getCpqLastInitialLoadEndTime()
	{
		return getCpqLastInitialLoadEndTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CPQDataloadStatus.cpqLastInitialLoadEndTime</code> attribute. 
	 * @param value the cpqLastInitialLoadEndTime - Product Config - Last Initial Load End Time
	 */
	public void setCpqLastInitialLoadEndTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CPQLASTINITIALLOADENDTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CPQDataloadStatus.cpqLastInitialLoadEndTime</code> attribute. 
	 * @param value the cpqLastInitialLoadEndTime - Product Config - Last Initial Load End Time
	 */
	public void setCpqLastInitialLoadEndTime(final Date value)
	{
		setCpqLastInitialLoadEndTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CPQDataloadStatus.cpqLastInitialLoadStartTime</code> attribute.
	 * @return the cpqLastInitialLoadStartTime - Product Config - Last Initial Load Start Time
	 */
	public Date getCpqLastInitialLoadStartTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CPQLASTINITIALLOADSTARTTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CPQDataloadStatus.cpqLastInitialLoadStartTime</code> attribute.
	 * @return the cpqLastInitialLoadStartTime - Product Config - Last Initial Load Start Time
	 */
	public Date getCpqLastInitialLoadStartTime()
	{
		return getCpqLastInitialLoadStartTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CPQDataloadStatus.cpqLastInitialLoadStartTime</code> attribute. 
	 * @param value the cpqLastInitialLoadStartTime - Product Config - Last Initial Load Start Time
	 */
	public void setCpqLastInitialLoadStartTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CPQLASTINITIALLOADSTARTTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CPQDataloadStatus.cpqLastInitialLoadStartTime</code> attribute. 
	 * @param value the cpqLastInitialLoadStartTime - Product Config - Last Initial Load Start Time
	 */
	public void setCpqLastInitialLoadStartTime(final Date value)
	{
		setCpqLastInitialLoadStartTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CPQDataloadStatus.cpqLastInitialLoadTransferredVolume</code> attribute.
	 * @return the cpqLastInitialLoadTransferredVolume - Product Config - Last Initial Load Transferred Volume
	 */
	public BigDecimal getCpqLastInitialLoadTransferredVolume(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, CPQLASTINITIALLOADTRANSFERREDVOLUME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CPQDataloadStatus.cpqLastInitialLoadTransferredVolume</code> attribute.
	 * @return the cpqLastInitialLoadTransferredVolume - Product Config - Last Initial Load Transferred Volume
	 */
	public BigDecimal getCpqLastInitialLoadTransferredVolume()
	{
		return getCpqLastInitialLoadTransferredVolume( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CPQDataloadStatus.cpqLastInitialLoadTransferredVolume</code> attribute. 
	 * @param value the cpqLastInitialLoadTransferredVolume - Product Config - Last Initial Load Transferred Volume
	 */
	public void setCpqLastInitialLoadTransferredVolume(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, CPQLASTINITIALLOADTRANSFERREDVOLUME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CPQDataloadStatus.cpqLastInitialLoadTransferredVolume</code> attribute. 
	 * @param value the cpqLastInitialLoadTransferredVolume - Product Config - Last Initial Load Transferred Volume
	 */
	public void setCpqLastInitialLoadTransferredVolume(final BigDecimal value)
	{
		setCpqLastInitialLoadTransferredVolume( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CPQDataloadStatus.cpqNumberOfEntriesInDeltaLoadQueue</code> attribute.
	 * @return the cpqNumberOfEntriesInDeltaLoadQueue - Product Config - Number of Entries in Delta Load Queue
	 */
	public Integer getCpqNumberOfEntriesInDeltaLoadQueue(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, CPQNUMBEROFENTRIESINDELTALOADQUEUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CPQDataloadStatus.cpqNumberOfEntriesInDeltaLoadQueue</code> attribute.
	 * @return the cpqNumberOfEntriesInDeltaLoadQueue - Product Config - Number of Entries in Delta Load Queue
	 */
	public Integer getCpqNumberOfEntriesInDeltaLoadQueue()
	{
		return getCpqNumberOfEntriesInDeltaLoadQueue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CPQDataloadStatus.cpqNumberOfEntriesInDeltaLoadQueue</code> attribute. 
	 * @return the cpqNumberOfEntriesInDeltaLoadQueue - Product Config - Number of Entries in Delta Load Queue
	 */
	public int getCpqNumberOfEntriesInDeltaLoadQueueAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCpqNumberOfEntriesInDeltaLoadQueue( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CPQDataloadStatus.cpqNumberOfEntriesInDeltaLoadQueue</code> attribute. 
	 * @return the cpqNumberOfEntriesInDeltaLoadQueue - Product Config - Number of Entries in Delta Load Queue
	 */
	public int getCpqNumberOfEntriesInDeltaLoadQueueAsPrimitive()
	{
		return getCpqNumberOfEntriesInDeltaLoadQueueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CPQDataloadStatus.cpqNumberOfEntriesInDeltaLoadQueue</code> attribute. 
	 * @param value the cpqNumberOfEntriesInDeltaLoadQueue - Product Config - Number of Entries in Delta Load Queue
	 */
	public void setCpqNumberOfEntriesInDeltaLoadQueue(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, CPQNUMBEROFENTRIESINDELTALOADQUEUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CPQDataloadStatus.cpqNumberOfEntriesInDeltaLoadQueue</code> attribute. 
	 * @param value the cpqNumberOfEntriesInDeltaLoadQueue - Product Config - Number of Entries in Delta Load Queue
	 */
	public void setCpqNumberOfEntriesInDeltaLoadQueue(final Integer value)
	{
		setCpqNumberOfEntriesInDeltaLoadQueue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CPQDataloadStatus.cpqNumberOfEntriesInDeltaLoadQueue</code> attribute. 
	 * @param value the cpqNumberOfEntriesInDeltaLoadQueue - Product Config - Number of Entries in Delta Load Queue
	 */
	public void setCpqNumberOfEntriesInDeltaLoadQueue(final SessionContext ctx, final int value)
	{
		setCpqNumberOfEntriesInDeltaLoadQueue( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CPQDataloadStatus.cpqNumberOfEntriesInDeltaLoadQueue</code> attribute. 
	 * @param value the cpqNumberOfEntriesInDeltaLoadQueue - Product Config - Number of Entries in Delta Load Queue
	 */
	public void setCpqNumberOfEntriesInDeltaLoadQueue(final int value)
	{
		setCpqNumberOfEntriesInDeltaLoadQueue( getSession().getSessionContext(), value );
	}
	
}
