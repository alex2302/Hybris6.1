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
package de.hybris.platform.sap.productconfig.model.constants;

/**
 * @deprecated use constants in Model classes instead
 */
@Deprecated
@SuppressWarnings({"unused","cast","PMD"})
public class GeneratedSapproductconfigmodelConstants
{
	public static final String EXTENSIONNAME = "sapproductconfigmodel";
	public static class TC
	{
		public static final String CPQDATALOADSTATUS = "CPQDataloadStatus".intern();
		public static final String DATALOADERCRONJOB = "DataLoaderCronJob".intern();
		public static final String DATALOADERSTOPCRONJOB = "DataLoaderStopCronJob".intern();
		public static final String DATALOADSTATUS = "DataloadStatus".intern();
		public static final String DATALOADTRIGGERMODE = "DataLoadTriggerMode".intern();
	}
	public static class Attributes
	{
		public static class SAPConfiguration
		{
			public static final String SAPPRODUCTCONFIG_CONDFUNC_BASEPRICE = "sapproductconfig_condfunc_baseprice".intern();
			public static final String SAPPRODUCTCONFIG_CONDFUNC_SELECTEDOPTIONS = "sapproductconfig_condfunc_selectedoptions".intern();
			public static final String SAPPRODUCTCONFIG_CPQDATALOADSTATUS = "sapproductconfig_cpqDataloadStatus".intern();
			public static final String SAPPRODUCTCONFIG_ENABLE_PRICING = "sapproductconfig_enable_pricing".intern();
			public static final String SAPPRODUCTCONFIG_FILTERCONDITION = "sapproductconfig_filterCondition".intern();
			public static final String SAPPRODUCTCONFIG_FILTERKNOWLEDGEBASE = "sapproductconfig_filterKnowledgeBase".intern();
			public static final String SAPPRODUCTCONFIG_FILTERMATERIAL = "sapproductconfig_filterMaterial".intern();
			public static final String SAPPRODUCTCONFIG_PRICINGPROCEDURE = "sapproductconfig_pricingprocedure".intern();
			public static final String SAPPRODUCTCONFIG_SAPRFCDESTINATION = "sapproductconfig_sapRFCDestination".intern();
			public static final String SAPPRODUCTCONFIG_SAPSERVER = "sapproductconfig_sapServer".intern();
		}
	}
	public static class Enumerations
	{
		public static class CronJobResult
		{
			public static final String DATALOAD_ALREADY_RUNNING = "DATALOAD_ALREADY_RUNNING".intern();
			public static final String DATALOAD_RESUME_ATTEMPT_DONE = "DATALOAD_RESUME_ATTEMPT_DONE".intern();
			public static final String DATALOAD_NO_INITIAL_DOWNLOAD = "DATALOAD_NO_INITIAL_DOWNLOAD".intern();
		}
		public static class DataloadStatus
		{
			public static final String NOT_STARTED = "NOT_STARTED".intern();
			public static final String INITIAL_LOAD = "INITIAL_LOAD".intern();
			public static final String INITIAL_LOAD_COMPLETED = "INITIAL_LOAD_COMPLETED".intern();
			public static final String INITIAL_LOAD_STOPPED = "INITIAL_LOAD_STOPPED".intern();
			public static final String DELTA_LOAD = "DELTA_LOAD".intern();
			public static final String DELTA_LOAD_STOPPED = "DELTA_LOAD_STOPPED".intern();
			public static final String ERROR = "ERROR".intern();
		}
		public static class DataLoadTriggerMode
		{
			public static final String RESUME = "Resume".intern();
			public static final String STARTINITIAL = "StartInitial".intern();
			public static final String STARTDELTA = "StartDelta".intern();
		}
	}
	
	protected GeneratedSapproductconfigmodelConstants()
	{
		// private constructor
	}
	
	
}
