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
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.cronjob.model.JobModel;
import de.hybris.platform.sap.core.configuration.model.SAPConfigurationModel;
import de.hybris.platform.sap.productconfig.model.enums.DataLoadTriggerMode;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type DataLoaderCronJob first defined at extension sapproductconfigmodel.
 */
@SuppressWarnings("all")
public class DataLoaderCronJobModel extends CronJobModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "DataLoaderCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>DataLoaderCronJob.sapConfiguration</code> attribute defined at extension <code>sapproductconfigmodel</code>. */
	public static final String SAPCONFIGURATION = "sapConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>DataLoaderCronJob.triggerMode</code> attribute defined at extension <code>sapproductconfigmodel</code>. */
	public static final String TRIGGERMODE = "triggerMode";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public DataLoaderCronJobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public DataLoaderCronJobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 */
	@Deprecated
	public DataLoaderCronJobModel(final JobModel _job)
	{
		super();
		setJob(_job);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public DataLoaderCronJobModel(final JobModel _job, final ItemModel _owner)
	{
		super();
		setJob(_job);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DataLoaderCronJob.sapConfiguration</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 * @return the sapConfiguration
	 */
	@Accessor(qualifier = "sapConfiguration", type = Accessor.Type.GETTER)
	public SAPConfigurationModel getSapConfiguration()
	{
		return getPersistenceContext().getPropertyValue(SAPCONFIGURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DataLoaderCronJob.triggerMode</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 * @return the triggerMode
	 */
	@Accessor(qualifier = "triggerMode", type = Accessor.Type.GETTER)
	public DataLoadTriggerMode getTriggerMode()
	{
		return getPersistenceContext().getPropertyValue(TRIGGERMODE);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>DataLoaderCronJob.sapConfiguration</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 *  
	 * @param value the sapConfiguration
	 */
	@Accessor(qualifier = "sapConfiguration", type = Accessor.Type.SETTER)
	public void setSapConfiguration(final SAPConfigurationModel value)
	{
		getPersistenceContext().setPropertyValue(SAPCONFIGURATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>DataLoaderCronJob.triggerMode</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 *  
	 * @param value the triggerMode
	 */
	@Accessor(qualifier = "triggerMode", type = Accessor.Type.SETTER)
	public void setTriggerMode(final DataLoadTriggerMode value)
	{
		getPersistenceContext().setPropertyValue(TRIGGERMODE, value);
	}
	
}
