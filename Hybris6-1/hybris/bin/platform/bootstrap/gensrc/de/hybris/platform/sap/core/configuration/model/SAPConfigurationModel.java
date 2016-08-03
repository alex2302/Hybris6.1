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
package de.hybris.platform.sap.core.configuration.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.sap.core.configuration.model.SAPRFCDestinationModel;
import de.hybris.platform.sap.productconfig.model.model.CPQDataloadStatusModel;
import de.hybris.platform.sap.sapmodel.model.SAPDeliveryModeModel;
import de.hybris.platform.sap.sapmodel.model.SAPPaymentModeModel;
import de.hybris.platform.sap.sapmodel.model.SAPPlantLogSysOrgModel;
import de.hybris.platform.sap.sappricingbol.enums.PricingProceduresSubtotal;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.store.BaseStoreModel;
import java.util.Collection;
import java.util.Set;

/**
 * Generated model class for type SAPConfiguration first defined at extension sapcoreconfiguration.
 */
@SuppressWarnings("all")
public class SAPConfigurationModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SAPConfiguration";
	
	/**<i>Generated relation code constant for relation <code>SAPConfigurationForBaseStore</code> defining source attribute <code>baseStores</code> in extension <code>sapcoreconfiguration</code>.</i>*/
	public final static String _SAPCONFIGURATIONFORBASESTORE = "SAPConfigurationForBaseStore";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.core_name</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String CORE_NAME = "core_name";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.baseStores</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String BASESTORES = "baseStores";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.SAPRFCDestination</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String SAPRFCDESTINATION = "SAPRFCDestination";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapcommon_referenceCustomer</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPCOMMON_REFERENCECUSTOMER = "sapcommon_referenceCustomer";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapcommon_transactionType</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPCOMMON_TRANSACTIONTYPE = "sapcommon_transactionType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapcommon_salesOrganization</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPCOMMON_SALESORGANIZATION = "sapcommon_salesOrganization";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapcommon_distributionChannel</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPCOMMON_DISTRIBUTIONCHANNEL = "sapcommon_distributionChannel";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapcommon_division</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPCOMMON_DIVISION = "sapcommon_division";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapDeliveryModes</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPDELIVERYMODES = "sapDeliveryModes";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapPaymentModes</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPPAYMENTMODES = "sapPaymentModes";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapPlantLogSysOrg</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPPLANTLOGSYSORG = "sapPlantLogSysOrg";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapoaa_oaaProfile</code> attribute defined at extension <code>sapoaamodel</code>. */
	public static final String SAPOAA_OAAPROFILE = "sapoaa_oaaProfile";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapoaa_consumerId</code> attribute defined at extension <code>sapoaamodel</code>. */
	public static final String SAPOAA_CONSUMERID = "sapoaa_consumerId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapproductconfig_enable_pricing</code> attribute defined at extension <code>sapproductconfigmodel</code>. */
	public static final String SAPPRODUCTCONFIG_ENABLE_PRICING = "sapproductconfig_enable_pricing";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapproductconfig_pricingprocedure</code> attribute defined at extension <code>sapproductconfigmodel</code>. */
	public static final String SAPPRODUCTCONFIG_PRICINGPROCEDURE = "sapproductconfig_pricingprocedure";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapproductconfig_condfunc_baseprice</code> attribute defined at extension <code>sapproductconfigmodel</code>. */
	public static final String SAPPRODUCTCONFIG_CONDFUNC_BASEPRICE = "sapproductconfig_condfunc_baseprice";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapproductconfig_condfunc_selectedoptions</code> attribute defined at extension <code>sapproductconfigmodel</code>. */
	public static final String SAPPRODUCTCONFIG_CONDFUNC_SELECTEDOPTIONS = "sapproductconfig_condfunc_selectedoptions";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapproductconfig_sapServer</code> attribute defined at extension <code>sapproductconfigmodel</code>. */
	public static final String SAPPRODUCTCONFIG_SAPSERVER = "sapproductconfig_sapServer";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapproductconfig_sapRFCDestination</code> attribute defined at extension <code>sapproductconfigmodel</code>. */
	public static final String SAPPRODUCTCONFIG_SAPRFCDESTINATION = "sapproductconfig_sapRFCDestination";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapproductconfig_filterKnowledgeBase</code> attribute defined at extension <code>sapproductconfigmodel</code>. */
	public static final String SAPPRODUCTCONFIG_FILTERKNOWLEDGEBASE = "sapproductconfig_filterKnowledgeBase";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapproductconfig_filterCondition</code> attribute defined at extension <code>sapproductconfigmodel</code>. */
	public static final String SAPPRODUCTCONFIG_FILTERCONDITION = "sapproductconfig_filterCondition";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapproductconfig_filterMaterial</code> attribute defined at extension <code>sapproductconfigmodel</code>. */
	public static final String SAPPRODUCTCONFIG_FILTERMATERIAL = "sapproductconfig_filterMaterial";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapproductconfig_cpqDataloadStatus</code> attribute defined at extension <code>sapproductconfigmodel</code>. */
	public static final String SAPPRODUCTCONFIG_CPQDATALOADSTATUS = "sapproductconfig_cpqDataloadStatus";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sappricingbol_catalogPricing</code> attribute defined at extension <code>sappricingbol</code>. */
	public static final String SAPPRICINGBOL_CATALOGPRICING = "sappricingbol_catalogPricing";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sappricingbol_cartPricing</code> attribute defined at extension <code>sappricingbol</code>. */
	public static final String SAPPRICINGBOL_CARTPRICING = "sappricingbol_cartPricing";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sappricingbol_cachePrice</code> attribute defined at extension <code>sappricingbol</code>. */
	public static final String SAPPRICINGBOL_CACHEPRICE = "sappricingbol_cachePrice";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sappricingbol_priceSub</code> attribute defined at extension <code>sappricingbol</code>. */
	public static final String SAPPRICINGBOL_PRICESUB = "sappricingbol_priceSub";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sappricingbol_discountSub</code> attribute defined at extension <code>sappricingbol</code>. */
	public static final String SAPPRICINGBOL_DISCOUNTSUB = "sappricingbol_discountSub";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sappricingbol_taxesSub</code> attribute defined at extension <code>sappricingbol</code>. */
	public static final String SAPPRICINGBOL_TAXESSUB = "sappricingbol_taxesSub";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sappricingbol_deliverySub</code> attribute defined at extension <code>sappricingbol</code>. */
	public static final String SAPPRICINGBOL_DELIVERYSUB = "sappricingbol_deliverySub";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sappricingbol_paymentSub</code> attribute defined at extension <code>sappricingbol</code>. */
	public static final String SAPPRICINGBOL_PAYMENTSUB = "sappricingbol_paymentSub";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapordermgmt_enabled</code> attribute defined at extension <code>sapordermgmtbol</code>. */
	public static final String SAPORDERMGMT_ENABLED = "sapordermgmt_enabled";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapordermgmt_headerCondTypeFreight</code> attribute defined at extension <code>sapordermgmtbol</code>. */
	public static final String SAPORDERMGMT_HEADERCONDTYPEFREIGHT = "sapordermgmt_headerCondTypeFreight";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapordermgmt_sourceFreight</code> attribute defined at extension <code>sapordermgmtbol</code>. */
	public static final String SAPORDERMGMT_SOURCEFREIGHT = "sapordermgmt_sourceFreight";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapordermgmt_sourceNetWOFreight</code> attribute defined at extension <code>sapordermgmtbol</code>. */
	public static final String SAPORDERMGMT_SOURCENETWOFREIGHT = "sapordermgmt_sourceNetWOFreight";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapordermgmt_maxHits</code> attribute defined at extension <code>sapordermgmtbol</code>. */
	public static final String SAPORDERMGMT_MAXHITS = "sapordermgmt_maxHits";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapordermgmt_dateRange</code> attribute defined at extension <code>sapordermgmtbol</code>. */
	public static final String SAPORDERMGMT_DATERANGE = "sapordermgmt_dateRange";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.saporderexchange_itemPriceConditionType</code> attribute defined at extension <code>saporderexchange</code>. */
	public static final String SAPORDEREXCHANGE_ITEMPRICECONDITIONTYPE = "saporderexchange_itemPriceConditionType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.saporderexchange_paymentCostConditionType</code> attribute defined at extension <code>saporderexchange</code>. */
	public static final String SAPORDEREXCHANGE_PAYMENTCOSTCONDITIONTYPE = "saporderexchange_paymentCostConditionType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.saporderexchange_deliveryCostConditionType</code> attribute defined at extension <code>saporderexchange</code>. */
	public static final String SAPORDEREXCHANGE_DELIVERYCOSTCONDITIONTYPE = "saporderexchange_deliveryCostConditionType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapproductavailability_atpActive</code> attribute defined at extension <code>sapproductavailability</code>. */
	public static final String SAPPRODUCTAVAILABILITY_ATPACTIVE = "sapproductavailability_atpActive";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.replicateregisteredb2buser</code> attribute defined at extension <code>sapcustomerb2b</code>. */
	public static final String REPLICATEREGISTEREDB2BUSER = "replicateregisteredb2buser";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapcreditcheckactive</code> attribute defined at extension <code>sapcreditcheck</code>. */
	public static final String SAPCREDITCHECKACTIVE = "sapcreditcheckactive";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPConfigurationModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPConfigurationModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _sapcreditcheckactive initial attribute declared by type <code>SAPConfiguration</code> at extension <code>sapcreditcheck</code>
	 * @param _sapordermgmt_enabled initial attribute declared by type <code>SAPConfiguration</code> at extension <code>sapordermgmtbol</code>
	 */
	@Deprecated
	public SAPConfigurationModel(final boolean _sapcreditcheckactive, final boolean _sapordermgmt_enabled)
	{
		super();
		setSapcreditcheckactive(_sapcreditcheckactive);
		setSapordermgmt_enabled(_sapordermgmt_enabled);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _sapcreditcheckactive initial attribute declared by type <code>SAPConfiguration</code> at extension <code>sapcreditcheck</code>
	 * @param _sapordermgmt_enabled initial attribute declared by type <code>SAPConfiguration</code> at extension <code>sapordermgmtbol</code>
	 */
	@Deprecated
	public SAPConfigurationModel(final ItemModel _owner, final boolean _sapcreditcheckactive, final boolean _sapordermgmt_enabled)
	{
		super();
		setOwner(_owner);
		setSapcreditcheckactive(_sapcreditcheckactive);
		setSapordermgmt_enabled(_sapordermgmt_enabled);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.baseStores</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the baseStores
	 */
	@Accessor(qualifier = "baseStores", type = Accessor.Type.GETTER)
	public Collection<BaseStoreModel> getBaseStores()
	{
		return getPersistenceContext().getPropertyValue(BASESTORES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.core_name</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the core_name - Name
	 */
	@Accessor(qualifier = "core_name", type = Accessor.Type.GETTER)
	public String getCore_name()
	{
		return getPersistenceContext().getPropertyValue(CORE_NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.replicateregisteredb2buser</code> attribute defined at extension <code>sapcustomerb2b</code>. 
	 * @return the replicateregisteredb2buser - Replicate Registered B2B Users
	 */
	@Accessor(qualifier = "replicateregisteredb2buser", type = Accessor.Type.GETTER)
	public Boolean getReplicateregisteredb2buser()
	{
		return getPersistenceContext().getPropertyValue(REPLICATEREGISTEREDB2BUSER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapcommon_distributionChannel</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the sapcommon_distributionChannel
	 */
	@Accessor(qualifier = "sapcommon_distributionChannel", type = Accessor.Type.GETTER)
	public String getSapcommon_distributionChannel()
	{
		return getPersistenceContext().getPropertyValue(SAPCOMMON_DISTRIBUTIONCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapcommon_division</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the sapcommon_division
	 */
	@Accessor(qualifier = "sapcommon_division", type = Accessor.Type.GETTER)
	public String getSapcommon_division()
	{
		return getPersistenceContext().getPropertyValue(SAPCOMMON_DIVISION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapcommon_referenceCustomer</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the sapcommon_referenceCustomer - reference customer used in RFC call
	 */
	@Accessor(qualifier = "sapcommon_referenceCustomer", type = Accessor.Type.GETTER)
	public String getSapcommon_referenceCustomer()
	{
		return getPersistenceContext().getPropertyValue(SAPCOMMON_REFERENCECUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapcommon_salesOrganization</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the sapcommon_salesOrganization
	 */
	@Accessor(qualifier = "sapcommon_salesOrganization", type = Accessor.Type.GETTER)
	public String getSapcommon_salesOrganization()
	{
		return getPersistenceContext().getPropertyValue(SAPCOMMON_SALESORGANIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapcommon_transactionType</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the sapcommon_transactionType
	 */
	@Accessor(qualifier = "sapcommon_transactionType", type = Accessor.Type.GETTER)
	public String getSapcommon_transactionType()
	{
		return getPersistenceContext().getPropertyValue(SAPCOMMON_TRANSACTIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapDeliveryModes</code> attribute defined at extension <code>sapmodel</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sapDeliveryModes
	 */
	@Accessor(qualifier = "sapDeliveryModes", type = Accessor.Type.GETTER)
	public Set<SAPDeliveryModeModel> getSapDeliveryModes()
	{
		return getPersistenceContext().getPropertyValue(SAPDELIVERYMODES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapoaa_consumerId</code> attribute defined at extension <code>sapoaamodel</code>. 
	 * @return the sapoaa_consumerId - OAA Consumer ID
	 */
	@Accessor(qualifier = "sapoaa_consumerId", type = Accessor.Type.GETTER)
	public String getSapoaa_consumerId()
	{
		return getPersistenceContext().getPropertyValue(SAPOAA_CONSUMERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapoaa_oaaProfile</code> attribute defined at extension <code>sapoaamodel</code>. 
	 * @return the sapoaa_oaaProfile - OAA Profile
	 */
	@Accessor(qualifier = "sapoaa_oaaProfile", type = Accessor.Type.GETTER)
	public String getSapoaa_oaaProfile()
	{
		return getPersistenceContext().getPropertyValue(SAPOAA_OAAPROFILE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.saporderexchange_deliveryCostConditionType</code> attribute defined at extension <code>saporderexchange</code>. 
	 * @return the saporderexchange_deliveryCostConditionType - Condition Type for delivery cost.
	 */
	@Accessor(qualifier = "saporderexchange_deliveryCostConditionType", type = Accessor.Type.GETTER)
	public String getSaporderexchange_deliveryCostConditionType()
	{
		return getPersistenceContext().getPropertyValue(SAPORDEREXCHANGE_DELIVERYCOSTCONDITIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.saporderexchange_itemPriceConditionType</code> attribute defined at extension <code>saporderexchange</code>. 
	 * @return the saporderexchange_itemPriceConditionType - Condition Type for item Price.
	 */
	@Accessor(qualifier = "saporderexchange_itemPriceConditionType", type = Accessor.Type.GETTER)
	public String getSaporderexchange_itemPriceConditionType()
	{
		return getPersistenceContext().getPropertyValue(SAPORDEREXCHANGE_ITEMPRICECONDITIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.saporderexchange_paymentCostConditionType</code> attribute defined at extension <code>saporderexchange</code>. 
	 * @return the saporderexchange_paymentCostConditionType - Condition Type for payment cost.
	 */
	@Accessor(qualifier = "saporderexchange_paymentCostConditionType", type = Accessor.Type.GETTER)
	public String getSaporderexchange_paymentCostConditionType()
	{
		return getPersistenceContext().getPropertyValue(SAPORDEREXCHANGE_PAYMENTCOSTCONDITIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapordermgmt_dateRange</code> attribute defined at extension <code>sapordermgmtbol</code>. 
	 * @return the sapordermgmt_dateRange - sapordermgmt_dateRange
	 */
	@Accessor(qualifier = "sapordermgmt_dateRange", type = Accessor.Type.GETTER)
	public String getSapordermgmt_dateRange()
	{
		return getPersistenceContext().getPropertyValue(SAPORDERMGMT_DATERANGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapordermgmt_headerCondTypeFreight</code> attribute defined at extension <code>sapordermgmtbol</code>. 
	 * @return the sapordermgmt_headerCondTypeFreight - sapordermgmt_headerCondTypeFreight
	 */
	@Accessor(qualifier = "sapordermgmt_headerCondTypeFreight", type = Accessor.Type.GETTER)
	public String getSapordermgmt_headerCondTypeFreight()
	{
		return getPersistenceContext().getPropertyValue(SAPORDERMGMT_HEADERCONDTYPEFREIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapordermgmt_maxHits</code> attribute defined at extension <code>sapordermgmtbol</code>. 
	 * @return the sapordermgmt_maxHits - sapordermgmt_maxHits
	 */
	@Accessor(qualifier = "sapordermgmt_maxHits", type = Accessor.Type.GETTER)
	public String getSapordermgmt_maxHits()
	{
		return getPersistenceContext().getPropertyValue(SAPORDERMGMT_MAXHITS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapordermgmt_sourceFreight</code> attribute defined at extension <code>sapordermgmtbol</code>. 
	 * @return the sapordermgmt_sourceFreight - sapordermgmt_sourceFreight
	 */
	@Accessor(qualifier = "sapordermgmt_sourceFreight", type = Accessor.Type.GETTER)
	public String getSapordermgmt_sourceFreight()
	{
		return getPersistenceContext().getPropertyValue(SAPORDERMGMT_SOURCEFREIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapordermgmt_sourceNetWOFreight</code> attribute defined at extension <code>sapordermgmtbol</code>. 
	 * @return the sapordermgmt_sourceNetWOFreight - sapordermgmt_sourceNetWOFreight
	 */
	@Accessor(qualifier = "sapordermgmt_sourceNetWOFreight", type = Accessor.Type.GETTER)
	public String getSapordermgmt_sourceNetWOFreight()
	{
		return getPersistenceContext().getPropertyValue(SAPORDERMGMT_SOURCENETWOFREIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapPaymentModes</code> attribute defined at extension <code>sapmodel</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sapPaymentModes
	 */
	@Accessor(qualifier = "sapPaymentModes", type = Accessor.Type.GETTER)
	public Set<SAPPaymentModeModel> getSapPaymentModes()
	{
		return getPersistenceContext().getPropertyValue(SAPPAYMENTMODES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapPlantLogSysOrg</code> attribute defined at extension <code>sapmodel</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sapPlantLogSysOrg
	 */
	@Accessor(qualifier = "sapPlantLogSysOrg", type = Accessor.Type.GETTER)
	public Set<SAPPlantLogSysOrgModel> getSapPlantLogSysOrg()
	{
		return getPersistenceContext().getPropertyValue(SAPPLANTLOGSYSORG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_cachePrice</code> attribute defined at extension <code>sappricingbol</code>. 
	 * @return the sappricingbol_cachePrice - Determines whether the site should cache external catalog prices
	 */
	@Accessor(qualifier = "sappricingbol_cachePrice", type = Accessor.Type.GETTER)
	public Boolean getSappricingbol_cachePrice()
	{
		return getPersistenceContext().getPropertyValue(SAPPRICINGBOL_CACHEPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_cartPricing</code> attribute defined at extension <code>sappricingbol</code>. 
	 * @return the sappricingbol_cartPricing - Determines whether the site should use external external order pricing
	 */
	@Accessor(qualifier = "sappricingbol_cartPricing", type = Accessor.Type.GETTER)
	public Boolean getSappricingbol_cartPricing()
	{
		return getPersistenceContext().getPropertyValue(SAPPRICINGBOL_CARTPRICING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_catalogPricing</code> attribute defined at extension <code>sappricingbol</code>. 
	 * @return the sappricingbol_catalogPricing - Determines whether the site should use external catalog pricing
	 */
	@Accessor(qualifier = "sappricingbol_catalogPricing", type = Accessor.Type.GETTER)
	public Boolean getSappricingbol_catalogPricing()
	{
		return getPersistenceContext().getPropertyValue(SAPPRICINGBOL_CATALOGPRICING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_deliverySub</code> attribute defined at extension <code>sappricingbol</code>. 
	 * @return the sappricingbol_deliverySub - Assigned procedure for delivery.
	 */
	@Accessor(qualifier = "sappricingbol_deliverySub", type = Accessor.Type.GETTER)
	public PricingProceduresSubtotal getSappricingbol_deliverySub()
	{
		return getPersistenceContext().getPropertyValue(SAPPRICINGBOL_DELIVERYSUB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_discountSub</code> attribute defined at extension <code>sappricingbol</code>. 
	 * @return the sappricingbol_discountSub - Assigned procedure for discounts.
	 */
	@Accessor(qualifier = "sappricingbol_discountSub", type = Accessor.Type.GETTER)
	public PricingProceduresSubtotal getSappricingbol_discountSub()
	{
		return getPersistenceContext().getPropertyValue(SAPPRICINGBOL_DISCOUNTSUB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_paymentSub</code> attribute defined at extension <code>sappricingbol</code>. 
	 * @return the sappricingbol_paymentSub - Assigned procedure for payment.
	 */
	@Accessor(qualifier = "sappricingbol_paymentSub", type = Accessor.Type.GETTER)
	public PricingProceduresSubtotal getSappricingbol_paymentSub()
	{
		return getPersistenceContext().getPropertyValue(SAPPRICINGBOL_PAYMENTSUB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_priceSub</code> attribute defined at extension <code>sappricingbol</code>. 
	 * @return the sappricingbol_priceSub - Assigned procedure for price.
	 */
	@Accessor(qualifier = "sappricingbol_priceSub", type = Accessor.Type.GETTER)
	public PricingProceduresSubtotal getSappricingbol_priceSub()
	{
		return getPersistenceContext().getPropertyValue(SAPPRICINGBOL_PRICESUB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sappricingbol_taxesSub</code> attribute defined at extension <code>sappricingbol</code>. 
	 * @return the sappricingbol_taxesSub - Assigned procedure for taxes.
	 */
	@Accessor(qualifier = "sappricingbol_taxesSub", type = Accessor.Type.GETTER)
	public PricingProceduresSubtotal getSappricingbol_taxesSub()
	{
		return getPersistenceContext().getPropertyValue(SAPPRICINGBOL_TAXESSUB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductavailability_atpActive</code> attribute defined at extension <code>sapproductavailability</code>. 
	 * @return the sapproductavailability_atpActive - Determines whether the site should use perform live availability-to-purchase(ATP) check
	 */
	@Accessor(qualifier = "sapproductavailability_atpActive", type = Accessor.Type.GETTER)
	public Boolean getSapproductavailability_atpActive()
	{
		return getPersistenceContext().getPropertyValue(SAPPRODUCTAVAILABILITY_ATPACTIVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_condfunc_baseprice</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 * @return the sapproductconfig_condfunc_baseprice - Product Config - Condition Function for Base Price
	 */
	@Accessor(qualifier = "sapproductconfig_condfunc_baseprice", type = Accessor.Type.GETTER)
	public String getSapproductconfig_condfunc_baseprice()
	{
		return getPersistenceContext().getPropertyValue(SAPPRODUCTCONFIG_CONDFUNC_BASEPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_condfunc_selectedoptions</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 * @return the sapproductconfig_condfunc_selectedoptions - Product Config - Condition Function for Selected Options
	 */
	@Accessor(qualifier = "sapproductconfig_condfunc_selectedoptions", type = Accessor.Type.GETTER)
	public String getSapproductconfig_condfunc_selectedoptions()
	{
		return getPersistenceContext().getPropertyValue(SAPPRODUCTCONFIG_CONDFUNC_SELECTEDOPTIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_cpqDataloadStatus</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 * @return the sapproductconfig_cpqDataloadStatus - Product Config - Data Load Status
	 */
	@Accessor(qualifier = "sapproductconfig_cpqDataloadStatus", type = Accessor.Type.GETTER)
	public CPQDataloadStatusModel getSapproductconfig_cpqDataloadStatus()
	{
		return getPersistenceContext().getPropertyValue(SAPPRODUCTCONFIG_CPQDATALOADSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_enable_pricing</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 * @return the sapproductconfig_enable_pricing - Product Config - Activate Pricing
	 */
	@Accessor(qualifier = "sapproductconfig_enable_pricing", type = Accessor.Type.GETTER)
	public Boolean getSapproductconfig_enable_pricing()
	{
		return getPersistenceContext().getPropertyValue(SAPPRODUCTCONFIG_ENABLE_PRICING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_filterCondition</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 * @return the sapproductconfig_filterCondition
	 */
	@Accessor(qualifier = "sapproductconfig_filterCondition", type = Accessor.Type.GETTER)
	public MediaModel getSapproductconfig_filterCondition()
	{
		return getPersistenceContext().getPropertyValue(SAPPRODUCTCONFIG_FILTERCONDITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_filterKnowledgeBase</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 * @return the sapproductconfig_filterKnowledgeBase
	 */
	@Accessor(qualifier = "sapproductconfig_filterKnowledgeBase", type = Accessor.Type.GETTER)
	public MediaModel getSapproductconfig_filterKnowledgeBase()
	{
		return getPersistenceContext().getPropertyValue(SAPPRODUCTCONFIG_FILTERKNOWLEDGEBASE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_filterMaterial</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 * @return the sapproductconfig_filterMaterial
	 */
	@Accessor(qualifier = "sapproductconfig_filterMaterial", type = Accessor.Type.GETTER)
	public MediaModel getSapproductconfig_filterMaterial()
	{
		return getPersistenceContext().getPropertyValue(SAPPRODUCTCONFIG_FILTERMATERIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_pricingprocedure</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 * @return the sapproductconfig_pricingprocedure - Product Config - Pricing Procedure
	 */
	@Accessor(qualifier = "sapproductconfig_pricingprocedure", type = Accessor.Type.GETTER)
	public String getSapproductconfig_pricingprocedure()
	{
		return getPersistenceContext().getPropertyValue(SAPPRODUCTCONFIG_PRICINGPROCEDURE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_sapRFCDestination</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 * @return the sapproductconfig_sapRFCDestination
	 */
	@Accessor(qualifier = "sapproductconfig_sapRFCDestination", type = Accessor.Type.GETTER)
	public String getSapproductconfig_sapRFCDestination()
	{
		return getPersistenceContext().getPropertyValue(SAPPRODUCTCONFIG_SAPRFCDESTINATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapproductconfig_sapServer</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 * @return the sapproductconfig_sapServer
	 */
	@Accessor(qualifier = "sapproductconfig_sapServer", type = Accessor.Type.GETTER)
	public SAPRFCDestinationModel getSapproductconfig_sapServer()
	{
		return getPersistenceContext().getPropertyValue(SAPPRODUCTCONFIG_SAPSERVER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.SAPRFCDestination</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the SAPRFCDestination
	 */
	@Accessor(qualifier = "SAPRFCDestination", type = Accessor.Type.GETTER)
	public SAPRFCDestinationModel getSAPRFCDestination()
	{
		return getPersistenceContext().getPropertyValue(SAPRFCDESTINATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapcreditcheckactive</code> attribute defined at extension <code>sapcreditcheck</code>. 
	 * @return the sapcreditcheckactive - Determines whether the site should use SAP credit check
	 */
	@Accessor(qualifier = "sapcreditcheckactive", type = Accessor.Type.GETTER)
	public boolean isSapcreditcheckactive()
	{
		return toPrimitive((Boolean)getPersistenceContext().getPropertyValue(SAPCREDITCHECKACTIVE));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapordermgmt_enabled</code> attribute defined at extension <code>sapordermgmtbol</code>. 
	 * @return the sapordermgmt_enabled - Determines whether the site should use external external order pricing
	 */
	@Accessor(qualifier = "sapordermgmt_enabled", type = Accessor.Type.GETTER)
	public boolean isSapordermgmt_enabled()
	{
		return toPrimitive((Boolean)getPersistenceContext().getPropertyValue(SAPORDERMGMT_ENABLED));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.baseStores</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the baseStores
	 */
	@Accessor(qualifier = "baseStores", type = Accessor.Type.SETTER)
	public void setBaseStores(final Collection<BaseStoreModel> value)
	{
		getPersistenceContext().setPropertyValue(BASESTORES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.core_name</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the core_name - Name
	 */
	@Accessor(qualifier = "core_name", type = Accessor.Type.SETTER)
	public void setCore_name(final String value)
	{
		getPersistenceContext().setPropertyValue(CORE_NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.replicateregisteredb2buser</code> attribute defined at extension <code>sapcustomerb2b</code>. 
	 *  
	 * @param value the replicateregisteredb2buser - Replicate Registered B2B Users
	 */
	@Accessor(qualifier = "replicateregisteredb2buser", type = Accessor.Type.SETTER)
	public void setReplicateregisteredb2buser(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(REPLICATEREGISTEREDB2BUSER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapcommon_distributionChannel</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapcommon_distributionChannel
	 */
	@Accessor(qualifier = "sapcommon_distributionChannel", type = Accessor.Type.SETTER)
	public void setSapcommon_distributionChannel(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPCOMMON_DISTRIBUTIONCHANNEL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapcommon_division</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapcommon_division
	 */
	@Accessor(qualifier = "sapcommon_division", type = Accessor.Type.SETTER)
	public void setSapcommon_division(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPCOMMON_DIVISION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapcommon_referenceCustomer</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapcommon_referenceCustomer - reference customer used in RFC call
	 */
	@Accessor(qualifier = "sapcommon_referenceCustomer", type = Accessor.Type.SETTER)
	public void setSapcommon_referenceCustomer(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPCOMMON_REFERENCECUSTOMER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapcommon_salesOrganization</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapcommon_salesOrganization
	 */
	@Accessor(qualifier = "sapcommon_salesOrganization", type = Accessor.Type.SETTER)
	public void setSapcommon_salesOrganization(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPCOMMON_SALESORGANIZATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapcommon_transactionType</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapcommon_transactionType
	 */
	@Accessor(qualifier = "sapcommon_transactionType", type = Accessor.Type.SETTER)
	public void setSapcommon_transactionType(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPCOMMON_TRANSACTIONTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapcreditcheckactive</code> attribute defined at extension <code>sapcreditcheck</code>. 
	 *  
	 * @param value the sapcreditcheckactive - Determines whether the site should use SAP credit check
	 */
	@Accessor(qualifier = "sapcreditcheckactive", type = Accessor.Type.SETTER)
	public void setSapcreditcheckactive(final boolean value)
	{
		getPersistenceContext().setPropertyValue(SAPCREDITCHECKACTIVE, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapDeliveryModes</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapDeliveryModes
	 */
	@Accessor(qualifier = "sapDeliveryModes", type = Accessor.Type.SETTER)
	public void setSapDeliveryModes(final Set<SAPDeliveryModeModel> value)
	{
		getPersistenceContext().setPropertyValue(SAPDELIVERYMODES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapoaa_consumerId</code> attribute defined at extension <code>sapoaamodel</code>. 
	 *  
	 * @param value the sapoaa_consumerId - OAA Consumer ID
	 */
	@Accessor(qualifier = "sapoaa_consumerId", type = Accessor.Type.SETTER)
	public void setSapoaa_consumerId(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPOAA_CONSUMERID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapoaa_oaaProfile</code> attribute defined at extension <code>sapoaamodel</code>. 
	 *  
	 * @param value the sapoaa_oaaProfile - OAA Profile
	 */
	@Accessor(qualifier = "sapoaa_oaaProfile", type = Accessor.Type.SETTER)
	public void setSapoaa_oaaProfile(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPOAA_OAAPROFILE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.saporderexchange_deliveryCostConditionType</code> attribute defined at extension <code>saporderexchange</code>. 
	 *  
	 * @param value the saporderexchange_deliveryCostConditionType - Condition Type for delivery cost.
	 */
	@Accessor(qualifier = "saporderexchange_deliveryCostConditionType", type = Accessor.Type.SETTER)
	public void setSaporderexchange_deliveryCostConditionType(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPORDEREXCHANGE_DELIVERYCOSTCONDITIONTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.saporderexchange_itemPriceConditionType</code> attribute defined at extension <code>saporderexchange</code>. 
	 *  
	 * @param value the saporderexchange_itemPriceConditionType - Condition Type for item Price.
	 */
	@Accessor(qualifier = "saporderexchange_itemPriceConditionType", type = Accessor.Type.SETTER)
	public void setSaporderexchange_itemPriceConditionType(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPORDEREXCHANGE_ITEMPRICECONDITIONTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.saporderexchange_paymentCostConditionType</code> attribute defined at extension <code>saporderexchange</code>. 
	 *  
	 * @param value the saporderexchange_paymentCostConditionType - Condition Type for payment cost.
	 */
	@Accessor(qualifier = "saporderexchange_paymentCostConditionType", type = Accessor.Type.SETTER)
	public void setSaporderexchange_paymentCostConditionType(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPORDEREXCHANGE_PAYMENTCOSTCONDITIONTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapordermgmt_dateRange</code> attribute defined at extension <code>sapordermgmtbol</code>. 
	 *  
	 * @param value the sapordermgmt_dateRange - sapordermgmt_dateRange
	 */
	@Accessor(qualifier = "sapordermgmt_dateRange", type = Accessor.Type.SETTER)
	public void setSapordermgmt_dateRange(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPORDERMGMT_DATERANGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapordermgmt_enabled</code> attribute defined at extension <code>sapordermgmtbol</code>. 
	 *  
	 * @param value the sapordermgmt_enabled - Determines whether the site should use external external order pricing
	 */
	@Accessor(qualifier = "sapordermgmt_enabled", type = Accessor.Type.SETTER)
	public void setSapordermgmt_enabled(final boolean value)
	{
		getPersistenceContext().setPropertyValue(SAPORDERMGMT_ENABLED, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapordermgmt_headerCondTypeFreight</code> attribute defined at extension <code>sapordermgmtbol</code>. 
	 *  
	 * @param value the sapordermgmt_headerCondTypeFreight - sapordermgmt_headerCondTypeFreight
	 */
	@Accessor(qualifier = "sapordermgmt_headerCondTypeFreight", type = Accessor.Type.SETTER)
	public void setSapordermgmt_headerCondTypeFreight(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPORDERMGMT_HEADERCONDTYPEFREIGHT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapordermgmt_maxHits</code> attribute defined at extension <code>sapordermgmtbol</code>. 
	 *  
	 * @param value the sapordermgmt_maxHits - sapordermgmt_maxHits
	 */
	@Accessor(qualifier = "sapordermgmt_maxHits", type = Accessor.Type.SETTER)
	public void setSapordermgmt_maxHits(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPORDERMGMT_MAXHITS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapordermgmt_sourceFreight</code> attribute defined at extension <code>sapordermgmtbol</code>. 
	 *  
	 * @param value the sapordermgmt_sourceFreight - sapordermgmt_sourceFreight
	 */
	@Accessor(qualifier = "sapordermgmt_sourceFreight", type = Accessor.Type.SETTER)
	public void setSapordermgmt_sourceFreight(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPORDERMGMT_SOURCEFREIGHT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapordermgmt_sourceNetWOFreight</code> attribute defined at extension <code>sapordermgmtbol</code>. 
	 *  
	 * @param value the sapordermgmt_sourceNetWOFreight - sapordermgmt_sourceNetWOFreight
	 */
	@Accessor(qualifier = "sapordermgmt_sourceNetWOFreight", type = Accessor.Type.SETTER)
	public void setSapordermgmt_sourceNetWOFreight(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPORDERMGMT_SOURCENETWOFREIGHT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapPaymentModes</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapPaymentModes
	 */
	@Accessor(qualifier = "sapPaymentModes", type = Accessor.Type.SETTER)
	public void setSapPaymentModes(final Set<SAPPaymentModeModel> value)
	{
		getPersistenceContext().setPropertyValue(SAPPAYMENTMODES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapPlantLogSysOrg</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapPlantLogSysOrg
	 */
	@Accessor(qualifier = "sapPlantLogSysOrg", type = Accessor.Type.SETTER)
	public void setSapPlantLogSysOrg(final Set<SAPPlantLogSysOrgModel> value)
	{
		getPersistenceContext().setPropertyValue(SAPPLANTLOGSYSORG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sappricingbol_cachePrice</code> attribute defined at extension <code>sappricingbol</code>. 
	 *  
	 * @param value the sappricingbol_cachePrice - Determines whether the site should cache external catalog prices
	 */
	@Accessor(qualifier = "sappricingbol_cachePrice", type = Accessor.Type.SETTER)
	public void setSappricingbol_cachePrice(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(SAPPRICINGBOL_CACHEPRICE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sappricingbol_cartPricing</code> attribute defined at extension <code>sappricingbol</code>. 
	 *  
	 * @param value the sappricingbol_cartPricing - Determines whether the site should use external external order pricing
	 */
	@Accessor(qualifier = "sappricingbol_cartPricing", type = Accessor.Type.SETTER)
	public void setSappricingbol_cartPricing(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(SAPPRICINGBOL_CARTPRICING, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sappricingbol_catalogPricing</code> attribute defined at extension <code>sappricingbol</code>. 
	 *  
	 * @param value the sappricingbol_catalogPricing - Determines whether the site should use external catalog pricing
	 */
	@Accessor(qualifier = "sappricingbol_catalogPricing", type = Accessor.Type.SETTER)
	public void setSappricingbol_catalogPricing(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(SAPPRICINGBOL_CATALOGPRICING, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sappricingbol_deliverySub</code> attribute defined at extension <code>sappricingbol</code>. 
	 *  
	 * @param value the sappricingbol_deliverySub - Assigned procedure for delivery.
	 */
	@Accessor(qualifier = "sappricingbol_deliverySub", type = Accessor.Type.SETTER)
	public void setSappricingbol_deliverySub(final PricingProceduresSubtotal value)
	{
		getPersistenceContext().setPropertyValue(SAPPRICINGBOL_DELIVERYSUB, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sappricingbol_discountSub</code> attribute defined at extension <code>sappricingbol</code>. 
	 *  
	 * @param value the sappricingbol_discountSub - Assigned procedure for discounts.
	 */
	@Accessor(qualifier = "sappricingbol_discountSub", type = Accessor.Type.SETTER)
	public void setSappricingbol_discountSub(final PricingProceduresSubtotal value)
	{
		getPersistenceContext().setPropertyValue(SAPPRICINGBOL_DISCOUNTSUB, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sappricingbol_paymentSub</code> attribute defined at extension <code>sappricingbol</code>. 
	 *  
	 * @param value the sappricingbol_paymentSub - Assigned procedure for payment.
	 */
	@Accessor(qualifier = "sappricingbol_paymentSub", type = Accessor.Type.SETTER)
	public void setSappricingbol_paymentSub(final PricingProceduresSubtotal value)
	{
		getPersistenceContext().setPropertyValue(SAPPRICINGBOL_PAYMENTSUB, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sappricingbol_priceSub</code> attribute defined at extension <code>sappricingbol</code>. 
	 *  
	 * @param value the sappricingbol_priceSub - Assigned procedure for price.
	 */
	@Accessor(qualifier = "sappricingbol_priceSub", type = Accessor.Type.SETTER)
	public void setSappricingbol_priceSub(final PricingProceduresSubtotal value)
	{
		getPersistenceContext().setPropertyValue(SAPPRICINGBOL_PRICESUB, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sappricingbol_taxesSub</code> attribute defined at extension <code>sappricingbol</code>. 
	 *  
	 * @param value the sappricingbol_taxesSub - Assigned procedure for taxes.
	 */
	@Accessor(qualifier = "sappricingbol_taxesSub", type = Accessor.Type.SETTER)
	public void setSappricingbol_taxesSub(final PricingProceduresSubtotal value)
	{
		getPersistenceContext().setPropertyValue(SAPPRICINGBOL_TAXESSUB, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapproductavailability_atpActive</code> attribute defined at extension <code>sapproductavailability</code>. 
	 *  
	 * @param value the sapproductavailability_atpActive - Determines whether the site should use perform live availability-to-purchase(ATP) check
	 */
	@Accessor(qualifier = "sapproductavailability_atpActive", type = Accessor.Type.SETTER)
	public void setSapproductavailability_atpActive(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(SAPPRODUCTAVAILABILITY_ATPACTIVE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapproductconfig_condfunc_baseprice</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 *  
	 * @param value the sapproductconfig_condfunc_baseprice - Product Config - Condition Function for Base Price
	 */
	@Accessor(qualifier = "sapproductconfig_condfunc_baseprice", type = Accessor.Type.SETTER)
	public void setSapproductconfig_condfunc_baseprice(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPPRODUCTCONFIG_CONDFUNC_BASEPRICE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapproductconfig_condfunc_selectedoptions</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 *  
	 * @param value the sapproductconfig_condfunc_selectedoptions - Product Config - Condition Function for Selected Options
	 */
	@Accessor(qualifier = "sapproductconfig_condfunc_selectedoptions", type = Accessor.Type.SETTER)
	public void setSapproductconfig_condfunc_selectedoptions(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPPRODUCTCONFIG_CONDFUNC_SELECTEDOPTIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapproductconfig_cpqDataloadStatus</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 *  
	 * @param value the sapproductconfig_cpqDataloadStatus - Product Config - Data Load Status
	 */
	@Accessor(qualifier = "sapproductconfig_cpqDataloadStatus", type = Accessor.Type.SETTER)
	public void setSapproductconfig_cpqDataloadStatus(final CPQDataloadStatusModel value)
	{
		getPersistenceContext().setPropertyValue(SAPPRODUCTCONFIG_CPQDATALOADSTATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapproductconfig_enable_pricing</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 *  
	 * @param value the sapproductconfig_enable_pricing - Product Config - Activate Pricing
	 */
	@Accessor(qualifier = "sapproductconfig_enable_pricing", type = Accessor.Type.SETTER)
	public void setSapproductconfig_enable_pricing(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(SAPPRODUCTCONFIG_ENABLE_PRICING, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapproductconfig_filterCondition</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 *  
	 * @param value the sapproductconfig_filterCondition
	 */
	@Accessor(qualifier = "sapproductconfig_filterCondition", type = Accessor.Type.SETTER)
	public void setSapproductconfig_filterCondition(final MediaModel value)
	{
		getPersistenceContext().setPropertyValue(SAPPRODUCTCONFIG_FILTERCONDITION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapproductconfig_filterKnowledgeBase</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 *  
	 * @param value the sapproductconfig_filterKnowledgeBase
	 */
	@Accessor(qualifier = "sapproductconfig_filterKnowledgeBase", type = Accessor.Type.SETTER)
	public void setSapproductconfig_filterKnowledgeBase(final MediaModel value)
	{
		getPersistenceContext().setPropertyValue(SAPPRODUCTCONFIG_FILTERKNOWLEDGEBASE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapproductconfig_filterMaterial</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 *  
	 * @param value the sapproductconfig_filterMaterial
	 */
	@Accessor(qualifier = "sapproductconfig_filterMaterial", type = Accessor.Type.SETTER)
	public void setSapproductconfig_filterMaterial(final MediaModel value)
	{
		getPersistenceContext().setPropertyValue(SAPPRODUCTCONFIG_FILTERMATERIAL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapproductconfig_pricingprocedure</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 *  
	 * @param value the sapproductconfig_pricingprocedure - Product Config - Pricing Procedure
	 */
	@Accessor(qualifier = "sapproductconfig_pricingprocedure", type = Accessor.Type.SETTER)
	public void setSapproductconfig_pricingprocedure(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPPRODUCTCONFIG_PRICINGPROCEDURE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapproductconfig_sapRFCDestination</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 *  
	 * @param value the sapproductconfig_sapRFCDestination
	 */
	@Accessor(qualifier = "sapproductconfig_sapRFCDestination", type = Accessor.Type.SETTER)
	public void setSapproductconfig_sapRFCDestination(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPPRODUCTCONFIG_SAPRFCDESTINATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapproductconfig_sapServer</code> attribute defined at extension <code>sapproductconfigmodel</code>. 
	 *  
	 * @param value the sapproductconfig_sapServer
	 */
	@Accessor(qualifier = "sapproductconfig_sapServer", type = Accessor.Type.SETTER)
	public void setSapproductconfig_sapServer(final SAPRFCDestinationModel value)
	{
		getPersistenceContext().setPropertyValue(SAPPRODUCTCONFIG_SAPSERVER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.SAPRFCDestination</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the SAPRFCDestination
	 */
	@Accessor(qualifier = "SAPRFCDestination", type = Accessor.Type.SETTER)
	public void setSAPRFCDestination(final SAPRFCDestinationModel value)
	{
		getPersistenceContext().setPropertyValue(SAPRFCDESTINATION, value);
	}
	
}
