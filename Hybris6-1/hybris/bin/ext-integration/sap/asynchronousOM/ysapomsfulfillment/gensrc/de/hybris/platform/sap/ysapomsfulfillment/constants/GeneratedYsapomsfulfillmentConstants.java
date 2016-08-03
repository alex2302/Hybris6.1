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
package de.hybris.platform.sap.ysapomsfulfillment.constants;

/**
 * @deprecated use constants in Model classes instead
 */
@Deprecated
@SuppressWarnings({"unused","cast","PMD"})
public class GeneratedYsapomsfulfillmentConstants
{
	public static final String EXTENSIONNAME = "ysapomsfulfillment";
	public static class TC
	{
		public static final String CONSIGNMENTENTRYSTATUS = "ConsignmentEntryStatus".intern();
		public static final String SAPCONSIGNMENTPROCESS = "SapConsignmentProcess".intern();
	}
	public static class Attributes
	{
		public static class Consignment
		{
			public static final String SAPCONSIGNMENTPROCESSES = "sapConsignmentProcesses".intern();
		}
		public static class ConsignmentEntry
		{
			public static final String SAPORDERENTRYROWNUMBER = "sapOrderEntryRowNumber".intern();
			public static final String STATUS = "status".intern();
		}
		public static class Order
		{
			public static final String SAPLOGICALSYSTEM = "sapLogicalSystem".intern();
			public static final String SAPSALESORGANIZATION = "sapSalesOrganization".intern();
		}
		public static class OrderProcess
		{
			public static final String SAPCONSIGNMENTPROCESSES = "sapConsignmentProcesses".intern();
		}
	}
	public static class Enumerations
	{
		public static class ConsignmentEntryStatus
		{
			public static final String WAITING = "WAITING".intern();
			public static final String PICKPACK = "PICKPACK".intern();
			public static final String READY = "READY".intern();
			public static final String SHIPPED = "SHIPPED".intern();
			public static final String CANCELLED = "CANCELLED".intern();
		}
	}
	public static class Relations
	{
		public static final String CONSIGNMENT2SAPCONSIGNMENTPROCESS = "Consignment2SapConsignmentProcess".intern();
		public static final String ORDERPROCESS2SAPCONSIGNMENTPROCESS = "OrderProcess2SapConsignmentProcess".intern();
	}
	
	protected GeneratedYsapomsfulfillmentConstants()
	{
		// private constructor
	}
	
	
}
