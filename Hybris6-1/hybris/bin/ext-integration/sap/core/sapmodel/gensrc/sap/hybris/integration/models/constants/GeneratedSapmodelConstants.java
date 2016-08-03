/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 31, 2016 4:07:33 PM                     ---
 * ----------------------------------------------------------------
 */
package sap.hybris.integration.models.constants;

/**
 * @deprecated use constants in Model classes instead
 */
@Deprecated
@SuppressWarnings({"unused","cast","PMD"})
public class GeneratedSapmodelConstants
{
	public static final String EXTENSIONNAME = "sapmodel";
	public static class TC
	{
		public static final String ERPVARIANTPRODUCT = "ERPVariantProduct".intern();
		public static final String REFERENCEDISTRIBUTIONCHANNELMAPPING = "ReferenceDistributionChannelMapping".intern();
		public static final String REFERENCEDIVISIONMAPPING = "ReferenceDivisionMapping".intern();
		public static final String SAPBONUSBUYSITETOCATALOG = "SAPBonusBuySiteToCatalog".intern();
		public static final String SAPDELIVERYMODE = "SAPDeliveryMode".intern();
		public static final String SAPLOGICALSYSTEM = "SAPLogicalSystem".intern();
		public static final String SAPORDER = "SAPOrder".intern();
		public static final String SAPORDERSTATUS = "SAPOrderStatus".intern();
		public static final String SAPPAYMENTMODE = "SAPPaymentMode".intern();
		public static final String SAPPLANTLOGSYSORG = "SAPPlantLogSysOrg".intern();
		public static final String SAPPRICINGCONDITION = "SAPPricingCondition".intern();
		public static final String SAPPRICINGSALESAREATOCATALOG = "SAPPricingSalesAreaToCatalog".intern();
		public static final String SAPPRODUCTIDDATACONVERSION = "SAPProductIDDataConversion".intern();
		public static final String SAPPRODUCTSALESAREATOCATALOGMAPPING = "SAPProductSalesAreaToCatalogMapping".intern();
		public static final String SAPSALESORGANIZATION = "SAPSalesOrganization".intern();
	}
	public static class Attributes
	{
		public static class AbstractOrderEntry
		{
			public static final String EXTERNALCONFIGURATION = "externalConfiguration".intern();
			public static final String SAPPRICINGCONDITIONS = "sapPricingConditions".intern();
		}
		public static class Address
		{
			public static final String SAPADDRESSUSAGE = "sapAddressUsage".intern();
			public static final String SAPADDRESSUSAGECOUNTER = "sapAddressUsageCounter".intern();
			public static final String SAPCUSTOMERID = "sapCustomerID".intern();
		}
		public static class ClassificationAttribute
		{
			public static final String DESCRIPTION = "description".intern();
			public static final String SAPERPCHARACTERISTICLONGTEXT = "sapERPCharacteristicLongText".intern();
		}
		public static class ClassificationAttributeUnit
		{
			public static final String SAPCODE = "sapCode".intern();
		}
		public static class Consignment
		{
			public static final String SAPORDER = "sapOrder".intern();
		}
		public static class Country
		{
			public static final String SAPCODE = "sapCode".intern();
		}
		public static class Currency
		{
			public static final String SAPCODE = "sapCode".intern();
		}
		public static class Customer
		{
			public static final String SAPCONSUMERID = "sapConsumerID".intern();
			public static final String SAPCONTACTID = "sapContactID".intern();
			public static final String SAPISREPLICATED = "sapIsReplicated".intern();
			public static final String SAPREPLICATIONINFO = "sapReplicationInfo".intern();
		}
		public static class DiscountRow
		{
			public static final String SAPCONDITIONID = "sapConditionId".intern();
		}
		public static class Language
		{
			public static final String SAPCODE = "sapCode".intern();
		}
		public static class Order
		{
			public static final String SAPORDERS = "sapOrders".intern();
		}
		public static class PriceRow
		{
			public static final String SAPCONDITIONID = "sapConditionId".intern();
		}
		public static class Product
		{
			public static final String SAPBASEUNITCONVERSION = "sapBaseUnitConversion".intern();
			public static final String SAPBLOCKED = "sapBlocked".intern();
			public static final String SAPBLOCKEDDATE = "sapBlockedDate".intern();
			public static final String SAPCONFIGURABLE = "sapConfigurable".intern();
			public static final String SAPEAN = "sapEAN".intern();
			public static final String SAPPLANT = "sapPlant".intern();
			public static final String SAPPRODUCTID = "sapProductID".intern();
		}
		public static class SAPConfiguration
		{
			public static final String SAPCOMMON_DISTRIBUTIONCHANNEL = "sapcommon_distributionChannel".intern();
			public static final String SAPCOMMON_DIVISION = "sapcommon_division".intern();
			public static final String SAPCOMMON_REFERENCECUSTOMER = "sapcommon_referenceCustomer".intern();
			public static final String SAPCOMMON_SALESORGANIZATION = "sapcommon_salesOrganization".intern();
			public static final String SAPCOMMON_TRANSACTIONTYPE = "sapcommon_transactionType".intern();
			public static final String SAPDELIVERYMODES = "sapDeliveryModes".intern();
			public static final String SAPPAYMENTMODES = "sapPaymentModes".intern();
			public static final String SAPPLANTLOGSYSORG = "sapPlantLogSysOrg".intern();
		}
		public static class SAPGlobalConfiguration
		{
			public static final String REPLICATEREGISTEREDUSER = "replicateregistereduser".intern();
			public static final String SAPCOMMON_ERPHTTPDESTINATION = "sapcommon_erpHttpDestination".intern();
			public static final String SAPCOMMON_ERPLOGICALSYSTEM = "sapcommon_erpLogicalSystem".intern();
			public static final String SAPCOMMON_SAPPRICINGSALESAREA = "sapcommon_sapPricingSalesArea".intern();
			public static final String SAPCOMMON_SAPSITETOCATALOG = "sapcommon_sapSiteToCatalog".intern();
			public static final String SAPLOGICALSYSTEMGLOBALCONFIG = "sapLogicalSystemGlobalConfig".intern();
			public static final String SAPPRODUCTSALESAREATOCATALOGMAPPING = "sapProductSalesAreaToCatalogMapping".intern();
		}
		public static class Unit
		{
			public static final String SAPCODE = "sapCode".intern();
		}
		public static class Warehouse
		{
			public static final String PRODUCT = "Product".intern();
		}
	}
	public static class Enumerations
	{
		public static class SAPOrderStatus
		{
			public static final String NOT_SENT_TO_ERP = "NOT_SENT_TO_ERP".intern();
			public static final String SENT_TO_ERP = "SENT_TO_ERP".intern();
			public static final String CONFIRMED_FROM_ERP = "CONFIRMED_FROM_ERP".intern();
			public static final String CANCELLED_FROM_ERP = "CANCELLED_FROM_ERP".intern();
		}
	}
	public static class Relations
	{
		public static final String CONSIGNMENTSAPORDERRELATION = "ConsignmentSapOrderRelation".intern();
		public static final String ORDER2SAPORDER = "Order2SapOrder".intern();
		public static final String ORDERENTRY2SAPPRICINGCONDITION = "OrderEntry2SapPricingCondition".intern();
		public static final String SAPCONFIG2PLANTLOGSYSORG = "SAPConfig2PlantLogSysOrg".intern();
		public static final String SAPCONFIGBONUSBUYSITE = "SAPConfigBonusBuySite".intern();
		public static final String SAPCONFIGDELIVERYRELATION = "SAPConfigDeliveryRelation".intern();
		public static final String SAPCONFIGPAYMENTRELATION = "SapConfigPaymentRelation".intern();
		public static final String SAPGLOBALCONFIG2LOGSYSTEM = "SAPGlobalConfig2LogSystem".intern();
		public static final String SAPGLOBALCONFIGSAPPRODUCTSALESAREATOCATALOGMAPPINGRELATION = "SAPGlobalConfigSAPProductSalesAreaToCatalogMappingRelation".intern();
		public static final String SAPGLOBALCONFIGURATIONPRICINGSALESAREA = "SAPGlobalConfigurationPricingSalesArea".intern();
		public static final String SAPPRODUCTPLANTRELATION = "SapProductPlantRelation".intern();
	}
	
	protected GeneratedSapmodelConstants()
	{
		// private constructor
	}
	
	
}
