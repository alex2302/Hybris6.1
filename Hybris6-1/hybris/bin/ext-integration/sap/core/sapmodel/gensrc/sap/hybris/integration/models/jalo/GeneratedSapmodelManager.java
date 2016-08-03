/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 31, 2016 4:07:33 PM                     ---
 * ----------------------------------------------------------------
 */
package sap.hybris.integration.models.jalo;

import de.hybris.platform.catalog.jalo.classification.ClassificationAttribute;
import de.hybris.platform.catalog.jalo.classification.ClassificationAttributeUnit;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.europe1.jalo.AbstractDiscountRow;
import de.hybris.platform.europe1.jalo.DiscountRow;
import de.hybris.platform.europe1.jalo.PDTRow;
import de.hybris.platform.europe1.jalo.PriceRow;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LItem;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.order.AbstractOrder;
import de.hybris.platform.jalo.order.AbstractOrderEntry;
import de.hybris.platform.jalo.order.Order;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.product.Unit;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.ordersplitting.jalo.Consignment;
import de.hybris.platform.ordersplitting.jalo.Warehouse;
import de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration;
import de.hybris.platform.sap.core.configuration.jalo.SAPGlobalConfiguration;
import de.hybris.platform.sap.core.configuration.jalo.SAPHTTPDestination;
import de.hybris.platform.sap.sapmodel.jalo.ERPVariantProduct;
import de.hybris.platform.sap.sapmodel.jalo.SAPBonusBuySiteToCatalog;
import de.hybris.platform.sap.sapmodel.jalo.SAPDeliveryMode;
import de.hybris.platform.sap.sapmodel.jalo.SAPLogicalSystem;
import de.hybris.platform.sap.sapmodel.jalo.SAPOrder;
import de.hybris.platform.sap.sapmodel.jalo.SAPPaymentMode;
import de.hybris.platform.sap.sapmodel.jalo.SAPPlantLogSysOrg;
import de.hybris.platform.sap.sapmodel.jalo.SAPPricingCondition;
import de.hybris.platform.sap.sapmodel.jalo.SAPPricingSalesAreaToCatalog;
import de.hybris.platform.sap.sapmodel.jalo.SAPProductSalesAreaToCatalogMapping;
import de.hybris.platform.sap.sapmodel.jalo.SAPSalesOrganization;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import sap.hybris.integration.models.constants.SapmodelConstants;
import sap.hybris.integration.models.jalo.ReferenceDistributionChannelMapping;
import sap.hybris.integration.models.jalo.ReferenceDivisionMapping;
import sap.hybris.integration.models.jalo.SAPProductIDDataConversion;

/**
 * Generated class for type <code>SapmodelManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSapmodelManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n SAPPRICINGCONDITIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SAPPricingCondition> ORDERENTRY2SAPPRICINGCONDITIONSAPPRICINGCONDITIONSHANDLER = new OneToManyHandler<SAPPricingCondition>(
	SapmodelConstants.TC.SAPPRICINGCONDITION,
	false,
	"orderEntry",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SAPDELIVERYMODES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SAPDeliveryMode> SAPCONFIGDELIVERYRELATIONSAPDELIVERYMODESHANDLER = new OneToManyHandler<SAPDeliveryMode>(
	SapmodelConstants.TC.SAPDELIVERYMODE,
	false,
	"sapConfiguration",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SAPPAYMENTMODES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SAPPaymentMode> SAPCONFIGPAYMENTRELATIONSAPPAYMENTMODESHANDLER = new OneToManyHandler<SAPPaymentMode>(
	SapmodelConstants.TC.SAPPAYMENTMODE,
	false,
	"sapConfiguration",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SAPPLANTLOGSYSORG's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SAPPlantLogSysOrg> SAPCONFIG2PLANTLOGSYSORGSAPPLANTLOGSYSORGHANDLER = new OneToManyHandler<SAPPlantLogSysOrg>(
	SapmodelConstants.TC.SAPPLANTLOGSYSORG,
	true,
	"sapConfiguration",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SAPPRODUCTSALESAREATOCATALOGMAPPING's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SAPProductSalesAreaToCatalogMapping> SAPGLOBALCONFIGSAPPRODUCTSALESAREATOCATALOGMAPPINGRELATIONSAPPRODUCTSALESAREATOCATALOGMAPPINGHANDLER = new OneToManyHandler<SAPProductSalesAreaToCatalogMapping>(
	SapmodelConstants.TC.SAPPRODUCTSALESAREATOCATALOGMAPPING,
	false,
	"sapGlobalConfiguration",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SAPCOMMON_SAPPRICINGSALESAREA's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SAPPricingSalesAreaToCatalog> SAPGLOBALCONFIGURATIONPRICINGSALESAREASAPCOMMON_SAPPRICINGSALESAREAHANDLER = new OneToManyHandler<SAPPricingSalesAreaToCatalog>(
	SapmodelConstants.TC.SAPPRICINGSALESAREATOCATALOG,
	false,
	"sapcommon_sapGlobalConfiguration",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SAPCOMMON_SAPSITETOCATALOG's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SAPBonusBuySiteToCatalog> SAPCONFIGBONUSBUYSITESAPCOMMON_SAPSITETOCATALOGHANDLER = new OneToManyHandler<SAPBonusBuySiteToCatalog>(
	SapmodelConstants.TC.SAPBONUSBUYSITETOCATALOG,
	false,
	"sapcommon_sapGlobalConfiguration",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SAPLOGICALSYSTEMGLOBALCONFIG's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SAPLogicalSystem> SAPGLOBALCONFIG2LOGSYSTEMSAPLOGICALSYSTEMGLOBALCONFIGHANDLER = new OneToManyHandler<SAPLogicalSystem>(
	SapmodelConstants.TC.SAPLOGICALSYSTEM,
	false,
	"sapGlobalConfiguration",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PRODUCT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Product> SAPPRODUCTPLANTRELATIONPRODUCTHANDLER = new OneToManyHandler<Product>(
	CoreConstants.TC.PRODUCT,
	false,
	"sapPlant",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SAPORDERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SAPOrder> ORDER2SAPORDERSAPORDERSHANDLER = new OneToManyHandler<SAPOrder>(
	SapmodelConstants.TC.SAPORDER,
	false,
	"order",
	"orderPOS",
	true,
	true,
	CollectionType.SET
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("externalConfiguration", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.AbstractOrderEntry", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("sapCode", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.c2l.Language", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("sapCode", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.c2l.Currency", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("sapCode", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Unit", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("sapCode", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.catalog.jalo.classification.ClassificationAttributeUnit", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("sapCode", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.c2l.Country", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("sapBlocked", AttributeMode.INITIAL);
		tmp.put("sapBlockedDate", AttributeMode.INITIAL);
		tmp.put("sapConfigurable", AttributeMode.INITIAL);
		tmp.put("sapEAN", AttributeMode.INITIAL);
		tmp.put("sapBaseUnitConversion", AttributeMode.INITIAL);
		tmp.put("sapPlant", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("sapCustomerID", AttributeMode.INITIAL);
		tmp.put("sapAddressUsage", AttributeMode.INITIAL);
		tmp.put("sapAddressUsageCounter", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Address", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("sapConsumerID", AttributeMode.INITIAL);
		tmp.put("sapContactID", AttributeMode.INITIAL);
		tmp.put("sapIsReplicated", AttributeMode.INITIAL);
		tmp.put("sapReplicationInfo", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("sapcommon_referenceCustomer", AttributeMode.INITIAL);
		tmp.put("sapcommon_transactionType", AttributeMode.INITIAL);
		tmp.put("sapcommon_salesOrganization", AttributeMode.INITIAL);
		tmp.put("sapcommon_distributionChannel", AttributeMode.INITIAL);
		tmp.put("sapcommon_division", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("sapConditionId", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.europe1.jalo.PriceRow", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("sapConditionId", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.europe1.jalo.DiscountRow", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("sapERPCharacteristicLongText", AttributeMode.INITIAL);
		tmp.put("description", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.catalog.jalo.classification.ClassificationAttribute", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("replicateregistereduser", AttributeMode.INITIAL);
		tmp.put("sapcommon_erpLogicalSystem", AttributeMode.INITIAL);
		tmp.put("sapcommon_erpHttpDestination", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.sap.core.configuration.jalo.SAPGlobalConfiguration", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("sapOrder", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.ordersplitting.jalo.Consignment", Collections.unmodifiableMap(tmp));
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
	
	public ERPVariantProduct createERPVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapmodelConstants.TC.ERPVARIANTPRODUCT );
			return (ERPVariantProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ERPVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ERPVariantProduct createERPVariantProduct(final Map attributeValues)
	{
		return createERPVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ReferenceDistributionChannelMapping createReferenceDistributionChannelMapping(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapmodelConstants.TC.REFERENCEDISTRIBUTIONCHANNELMAPPING );
			return (ReferenceDistributionChannelMapping)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ReferenceDistributionChannelMapping : "+e.getMessage(), 0 );
		}
	}
	
	public ReferenceDistributionChannelMapping createReferenceDistributionChannelMapping(final Map attributeValues)
	{
		return createReferenceDistributionChannelMapping( getSession().getSessionContext(), attributeValues );
	}
	
	public ReferenceDivisionMapping createReferenceDivisionMapping(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapmodelConstants.TC.REFERENCEDIVISIONMAPPING );
			return (ReferenceDivisionMapping)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ReferenceDivisionMapping : "+e.getMessage(), 0 );
		}
	}
	
	public ReferenceDivisionMapping createReferenceDivisionMapping(final Map attributeValues)
	{
		return createReferenceDivisionMapping( getSession().getSessionContext(), attributeValues );
	}
	
	public SAPBonusBuySiteToCatalog createSAPBonusBuySiteToCatalog(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapmodelConstants.TC.SAPBONUSBUYSITETOCATALOG );
			return (SAPBonusBuySiteToCatalog)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SAPBonusBuySiteToCatalog : "+e.getMessage(), 0 );
		}
	}
	
	public SAPBonusBuySiteToCatalog createSAPBonusBuySiteToCatalog(final Map attributeValues)
	{
		return createSAPBonusBuySiteToCatalog( getSession().getSessionContext(), attributeValues );
	}
	
	public SAPDeliveryMode createSAPDeliveryMode(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapmodelConstants.TC.SAPDELIVERYMODE );
			return (SAPDeliveryMode)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SAPDeliveryMode : "+e.getMessage(), 0 );
		}
	}
	
	public SAPDeliveryMode createSAPDeliveryMode(final Map attributeValues)
	{
		return createSAPDeliveryMode( getSession().getSessionContext(), attributeValues );
	}
	
	public SAPLogicalSystem createSAPLogicalSystem(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapmodelConstants.TC.SAPLOGICALSYSTEM );
			return (SAPLogicalSystem)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SAPLogicalSystem : "+e.getMessage(), 0 );
		}
	}
	
	public SAPLogicalSystem createSAPLogicalSystem(final Map attributeValues)
	{
		return createSAPLogicalSystem( getSession().getSessionContext(), attributeValues );
	}
	
	public SAPOrder createSAPOrder(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapmodelConstants.TC.SAPORDER );
			return (SAPOrder)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SAPOrder : "+e.getMessage(), 0 );
		}
	}
	
	public SAPOrder createSAPOrder(final Map attributeValues)
	{
		return createSAPOrder( getSession().getSessionContext(), attributeValues );
	}
	
	public SAPPaymentMode createSAPPaymentMode(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapmodelConstants.TC.SAPPAYMENTMODE );
			return (SAPPaymentMode)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SAPPaymentMode : "+e.getMessage(), 0 );
		}
	}
	
	public SAPPaymentMode createSAPPaymentMode(final Map attributeValues)
	{
		return createSAPPaymentMode( getSession().getSessionContext(), attributeValues );
	}
	
	public SAPPlantLogSysOrg createSAPPlantLogSysOrg(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapmodelConstants.TC.SAPPLANTLOGSYSORG );
			return (SAPPlantLogSysOrg)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SAPPlantLogSysOrg : "+e.getMessage(), 0 );
		}
	}
	
	public SAPPlantLogSysOrg createSAPPlantLogSysOrg(final Map attributeValues)
	{
		return createSAPPlantLogSysOrg( getSession().getSessionContext(), attributeValues );
	}
	
	public SAPPricingCondition createSAPPricingCondition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapmodelConstants.TC.SAPPRICINGCONDITION );
			return (SAPPricingCondition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SAPPricingCondition : "+e.getMessage(), 0 );
		}
	}
	
	public SAPPricingCondition createSAPPricingCondition(final Map attributeValues)
	{
		return createSAPPricingCondition( getSession().getSessionContext(), attributeValues );
	}
	
	public SAPPricingSalesAreaToCatalog createSAPPricingSalesAreaToCatalog(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapmodelConstants.TC.SAPPRICINGSALESAREATOCATALOG );
			return (SAPPricingSalesAreaToCatalog)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SAPPricingSalesAreaToCatalog : "+e.getMessage(), 0 );
		}
	}
	
	public SAPPricingSalesAreaToCatalog createSAPPricingSalesAreaToCatalog(final Map attributeValues)
	{
		return createSAPPricingSalesAreaToCatalog( getSession().getSessionContext(), attributeValues );
	}
	
	public SAPProductIDDataConversion createSAPProductIDDataConversion(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapmodelConstants.TC.SAPPRODUCTIDDATACONVERSION );
			return (SAPProductIDDataConversion)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SAPProductIDDataConversion : "+e.getMessage(), 0 );
		}
	}
	
	public SAPProductIDDataConversion createSAPProductIDDataConversion(final Map attributeValues)
	{
		return createSAPProductIDDataConversion( getSession().getSessionContext(), attributeValues );
	}
	
	public SAPProductSalesAreaToCatalogMapping createSAPProductSalesAreaToCatalogMapping(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapmodelConstants.TC.SAPPRODUCTSALESAREATOCATALOGMAPPING );
			return (SAPProductSalesAreaToCatalogMapping)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SAPProductSalesAreaToCatalogMapping : "+e.getMessage(), 0 );
		}
	}
	
	public SAPProductSalesAreaToCatalogMapping createSAPProductSalesAreaToCatalogMapping(final Map attributeValues)
	{
		return createSAPProductSalesAreaToCatalogMapping( getSession().getSessionContext(), attributeValues );
	}
	
	public SAPSalesOrganization createSAPSalesOrganization(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapmodelConstants.TC.SAPSALESORGANIZATION );
			return (SAPSalesOrganization)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SAPSalesOrganization : "+e.getMessage(), 0 );
		}
	}
	
	public SAPSalesOrganization createSAPSalesOrganization(final Map attributeValues)
	{
		return createSAPSalesOrganization( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClassificationAttribute.description</code> attribute.
	 * @return the description - Enhanced Description
	 */
	public String getDescription(final SessionContext ctx, final ClassificationAttribute item)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedClassificationAttribute.getDescription requires a session language", 0 );
		}
		return (String)item.getLocalizedProperty( ctx, SapmodelConstants.Attributes.ClassificationAttribute.DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClassificationAttribute.description</code> attribute.
	 * @return the description - Enhanced Description
	 */
	public String getDescription(final ClassificationAttribute item)
	{
		return getDescription( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClassificationAttribute.description</code> attribute. 
	 * @return the localized description - Enhanced Description
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx, final ClassificationAttribute item)
	{
		return (Map<Language,String>)item.getAllLocalizedProperties(ctx,SapmodelConstants.Attributes.ClassificationAttribute.DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClassificationAttribute.description</code> attribute. 
	 * @return the localized description - Enhanced Description
	 */
	public Map<Language,String> getAllDescription(final ClassificationAttribute item)
	{
		return getAllDescription( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClassificationAttribute.description</code> attribute. 
	 * @param value the description - Enhanced Description
	 */
	public void setDescription(final SessionContext ctx, final ClassificationAttribute item, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedClassificationAttribute.setDescription requires a session language", 0 );
		}
		item.setLocalizedProperty(ctx, SapmodelConstants.Attributes.ClassificationAttribute.DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClassificationAttribute.description</code> attribute. 
	 * @param value the description - Enhanced Description
	 */
	public void setDescription(final ClassificationAttribute item, final String value)
	{
		setDescription( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClassificationAttribute.description</code> attribute. 
	 * @param value the description - Enhanced Description
	 */
	public void setAllDescription(final SessionContext ctx, final ClassificationAttribute item, final Map<Language,String> value)
	{
		item.setAllLocalizedProperties(ctx,SapmodelConstants.Attributes.ClassificationAttribute.DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClassificationAttribute.description</code> attribute. 
	 * @param value the description - Enhanced Description
	 */
	public void setAllDescription(final ClassificationAttribute item, final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.externalConfiguration</code> attribute.
	 * @return the externalConfiguration - XML Representation of a Product Configuration
	 */
	public String getExternalConfiguration(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, SapmodelConstants.Attributes.AbstractOrderEntry.EXTERNALCONFIGURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.externalConfiguration</code> attribute.
	 * @return the externalConfiguration - XML Representation of a Product Configuration
	 */
	public String getExternalConfiguration(final AbstractOrderEntry item)
	{
		return getExternalConfiguration( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.externalConfiguration</code> attribute. 
	 * @param value the externalConfiguration - XML Representation of a Product Configuration
	 */
	public void setExternalConfiguration(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, SapmodelConstants.Attributes.AbstractOrderEntry.EXTERNALCONFIGURATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.externalConfiguration</code> attribute. 
	 * @param value the externalConfiguration - XML Representation of a Product Configuration
	 */
	public void setExternalConfiguration(final AbstractOrderEntry item, final String value)
	{
		setExternalConfiguration( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return SapmodelConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.replicateregistereduser</code> attribute.
	 * @return the replicateregistereduser - Replicate Registered User
	 */
	public Boolean isReplicateregistereduser(final SessionContext ctx, final GenericItem item)
	{
		return (Boolean)item.getProperty( ctx, SapmodelConstants.Attributes.SAPGlobalConfiguration.REPLICATEREGISTEREDUSER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.replicateregistereduser</code> attribute.
	 * @return the replicateregistereduser - Replicate Registered User
	 */
	public Boolean isReplicateregistereduser(final SAPGlobalConfiguration item)
	{
		return isReplicateregistereduser( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.replicateregistereduser</code> attribute. 
	 * @return the replicateregistereduser - Replicate Registered User
	 */
	public boolean isReplicateregistereduserAsPrimitive(final SessionContext ctx, final SAPGlobalConfiguration item)
	{
		Boolean value = isReplicateregistereduser( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.replicateregistereduser</code> attribute. 
	 * @return the replicateregistereduser - Replicate Registered User
	 */
	public boolean isReplicateregistereduserAsPrimitive(final SAPGlobalConfiguration item)
	{
		return isReplicateregistereduserAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPGlobalConfiguration.replicateregistereduser</code> attribute. 
	 * @param value the replicateregistereduser - Replicate Registered User
	 */
	public void setReplicateregistereduser(final SessionContext ctx, final GenericItem item, final Boolean value)
	{
		item.setProperty(ctx, SapmodelConstants.Attributes.SAPGlobalConfiguration.REPLICATEREGISTEREDUSER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPGlobalConfiguration.replicateregistereduser</code> attribute. 
	 * @param value the replicateregistereduser - Replicate Registered User
	 */
	public void setReplicateregistereduser(final SAPGlobalConfiguration item, final Boolean value)
	{
		setReplicateregistereduser( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPGlobalConfiguration.replicateregistereduser</code> attribute. 
	 * @param value the replicateregistereduser - Replicate Registered User
	 */
	public void setReplicateregistereduser(final SessionContext ctx, final SAPGlobalConfiguration item, final boolean value)
	{
		setReplicateregistereduser( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPGlobalConfiguration.replicateregistereduser</code> attribute. 
	 * @param value the replicateregistereduser - Replicate Registered User
	 */
	public void setReplicateregistereduser(final SAPGlobalConfiguration item, final boolean value)
	{
		setReplicateregistereduser( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.sapAddressUsage</code> attribute.
	 * @return the sapAddressUsage - SAP address usage
	 */
	public String getSapAddressUsage(final SessionContext ctx, final Address item)
	{
		return (String)item.getProperty( ctx, SapmodelConstants.Attributes.Address.SAPADDRESSUSAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.sapAddressUsage</code> attribute.
	 * @return the sapAddressUsage - SAP address usage
	 */
	public String getSapAddressUsage(final Address item)
	{
		return getSapAddressUsage( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.sapAddressUsage</code> attribute. 
	 * @param value the sapAddressUsage - SAP address usage
	 */
	public void setSapAddressUsage(final SessionContext ctx, final Address item, final String value)
	{
		item.setProperty(ctx, SapmodelConstants.Attributes.Address.SAPADDRESSUSAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.sapAddressUsage</code> attribute. 
	 * @param value the sapAddressUsage - SAP address usage
	 */
	public void setSapAddressUsage(final Address item, final String value)
	{
		setSapAddressUsage( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.sapAddressUsageCounter</code> attribute.
	 * @return the sapAddressUsageCounter - SAP address usage counter
	 */
	public String getSapAddressUsageCounter(final SessionContext ctx, final Address item)
	{
		return (String)item.getProperty( ctx, SapmodelConstants.Attributes.Address.SAPADDRESSUSAGECOUNTER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.sapAddressUsageCounter</code> attribute.
	 * @return the sapAddressUsageCounter - SAP address usage counter
	 */
	public String getSapAddressUsageCounter(final Address item)
	{
		return getSapAddressUsageCounter( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.sapAddressUsageCounter</code> attribute. 
	 * @param value the sapAddressUsageCounter - SAP address usage counter
	 */
	public void setSapAddressUsageCounter(final SessionContext ctx, final Address item, final String value)
	{
		item.setProperty(ctx, SapmodelConstants.Attributes.Address.SAPADDRESSUSAGECOUNTER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.sapAddressUsageCounter</code> attribute. 
	 * @param value the sapAddressUsageCounter - SAP address usage counter
	 */
	public void setSapAddressUsageCounter(final Address item, final String value)
	{
		setSapAddressUsageCounter( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.sapBaseUnitConversion</code> attribute.
	 * @return the sapBaseUnitConversion - Factor for converting Sales Unit quantity to Base Unit quantity
	 */
	public Double getSapBaseUnitConversion(final SessionContext ctx, final Product item)
	{
		return (Double)item.getProperty( ctx, SapmodelConstants.Attributes.Product.SAPBASEUNITCONVERSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.sapBaseUnitConversion</code> attribute.
	 * @return the sapBaseUnitConversion - Factor for converting Sales Unit quantity to Base Unit quantity
	 */
	public Double getSapBaseUnitConversion(final Product item)
	{
		return getSapBaseUnitConversion( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.sapBaseUnitConversion</code> attribute. 
	 * @return the sapBaseUnitConversion - Factor for converting Sales Unit quantity to Base Unit quantity
	 */
	public double getSapBaseUnitConversionAsPrimitive(final SessionContext ctx, final Product item)
	{
		Double value = getSapBaseUnitConversion( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.sapBaseUnitConversion</code> attribute. 
	 * @return the sapBaseUnitConversion - Factor for converting Sales Unit quantity to Base Unit quantity
	 */
	public double getSapBaseUnitConversionAsPrimitive(final Product item)
	{
		return getSapBaseUnitConversionAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.sapBaseUnitConversion</code> attribute. 
	 * @param value the sapBaseUnitConversion - Factor for converting Sales Unit quantity to Base Unit quantity
	 */
	public void setSapBaseUnitConversion(final SessionContext ctx, final Product item, final Double value)
	{
		item.setProperty(ctx, SapmodelConstants.Attributes.Product.SAPBASEUNITCONVERSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.sapBaseUnitConversion</code> attribute. 
	 * @param value the sapBaseUnitConversion - Factor for converting Sales Unit quantity to Base Unit quantity
	 */
	public void setSapBaseUnitConversion(final Product item, final Double value)
	{
		setSapBaseUnitConversion( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.sapBaseUnitConversion</code> attribute. 
	 * @param value the sapBaseUnitConversion - Factor for converting Sales Unit quantity to Base Unit quantity
	 */
	public void setSapBaseUnitConversion(final SessionContext ctx, final Product item, final double value)
	{
		setSapBaseUnitConversion( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.sapBaseUnitConversion</code> attribute. 
	 * @param value the sapBaseUnitConversion - Factor for converting Sales Unit quantity to Base Unit quantity
	 */
	public void setSapBaseUnitConversion(final Product item, final double value)
	{
		setSapBaseUnitConversion( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.sapBlocked</code> attribute.
	 * @return the sapBlocked - Indicator if item is blocked for sale
	 */
	public Boolean isSapBlocked(final SessionContext ctx, final Product item)
	{
		return (Boolean)item.getProperty( ctx, SapmodelConstants.Attributes.Product.SAPBLOCKED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.sapBlocked</code> attribute.
	 * @return the sapBlocked - Indicator if item is blocked for sale
	 */
	public Boolean isSapBlocked(final Product item)
	{
		return isSapBlocked( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.sapBlocked</code> attribute. 
	 * @return the sapBlocked - Indicator if item is blocked for sale
	 */
	public boolean isSapBlockedAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isSapBlocked( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.sapBlocked</code> attribute. 
	 * @return the sapBlocked - Indicator if item is blocked for sale
	 */
	public boolean isSapBlockedAsPrimitive(final Product item)
	{
		return isSapBlockedAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.sapBlocked</code> attribute. 
	 * @param value the sapBlocked - Indicator if item is blocked for sale
	 */
	public void setSapBlocked(final SessionContext ctx, final Product item, final Boolean value)
	{
		item.setProperty(ctx, SapmodelConstants.Attributes.Product.SAPBLOCKED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.sapBlocked</code> attribute. 
	 * @param value the sapBlocked - Indicator if item is blocked for sale
	 */
	public void setSapBlocked(final Product item, final Boolean value)
	{
		setSapBlocked( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.sapBlocked</code> attribute. 
	 * @param value the sapBlocked - Indicator if item is blocked for sale
	 */
	public void setSapBlocked(final SessionContext ctx, final Product item, final boolean value)
	{
		setSapBlocked( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.sapBlocked</code> attribute. 
	 * @param value the sapBlocked - Indicator if item is blocked for sale
	 */
	public void setSapBlocked(final Product item, final boolean value)
	{
		setSapBlocked( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.sapBlockedDate</code> attribute.
	 * @return the sapBlockedDate - Indicates the date the product is blocked from
	 */
	public Date getSapBlockedDate(final SessionContext ctx, final Product item)
	{
		return (Date)item.getProperty( ctx, SapmodelConstants.Attributes.Product.SAPBLOCKEDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.sapBlockedDate</code> attribute.
	 * @return the sapBlockedDate - Indicates the date the product is blocked from
	 */
	public Date getSapBlockedDate(final Product item)
	{
		return getSapBlockedDate( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.sapBlockedDate</code> attribute. 
	 * @param value the sapBlockedDate - Indicates the date the product is blocked from
	 */
	public void setSapBlockedDate(final SessionContext ctx, final Product item, final Date value)
	{
		item.setProperty(ctx, SapmodelConstants.Attributes.Product.SAPBLOCKEDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.sapBlockedDate</code> attribute. 
	 * @param value the sapBlockedDate - Indicates the date the product is blocked from
	 */
	public void setSapBlockedDate(final Product item, final Date value)
	{
		setSapBlockedDate( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Language.sapCode</code> attribute.
	 * @return the sapCode - SAP Code (ERP Table T002 field SPRAS)
	 */
	public String getSapCode(final SessionContext ctx, final Language item)
	{
		return (String)item.getProperty( ctx, SapmodelConstants.Attributes.Language.SAPCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Language.sapCode</code> attribute.
	 * @return the sapCode - SAP Code (ERP Table T002 field SPRAS)
	 */
	public String getSapCode(final Language item)
	{
		return getSapCode( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Language.sapCode</code> attribute. 
	 * @param value the sapCode - SAP Code (ERP Table T002 field SPRAS)
	 */
	public void setSapCode(final SessionContext ctx, final Language item, final String value)
	{
		item.setProperty(ctx, SapmodelConstants.Attributes.Language.SAPCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Language.sapCode</code> attribute. 
	 * @param value the sapCode - SAP Code (ERP Table T002 field SPRAS)
	 */
	public void setSapCode(final Language item, final String value)
	{
		setSapCode( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Currency.sapCode</code> attribute.
	 * @return the sapCode - SAP Code (ERP Table TCURC field WAERS)
	 */
	public String getSapCode(final SessionContext ctx, final Currency item)
	{
		return (String)item.getProperty( ctx, SapmodelConstants.Attributes.Currency.SAPCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Currency.sapCode</code> attribute.
	 * @return the sapCode - SAP Code (ERP Table TCURC field WAERS)
	 */
	public String getSapCode(final Currency item)
	{
		return getSapCode( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Currency.sapCode</code> attribute. 
	 * @param value the sapCode - SAP Code (ERP Table TCURC field WAERS)
	 */
	public void setSapCode(final SessionContext ctx, final Currency item, final String value)
	{
		item.setProperty(ctx, SapmodelConstants.Attributes.Currency.SAPCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Currency.sapCode</code> attribute. 
	 * @param value the sapCode - SAP Code (ERP Table TCURC field WAERS)
	 */
	public void setSapCode(final Currency item, final String value)
	{
		setSapCode( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Unit.sapCode</code> attribute.
	 * @return the sapCode - SAP Code (ERP Table T006 field MSEHI)
	 */
	public String getSapCode(final SessionContext ctx, final Unit item)
	{
		return (String)item.getProperty( ctx, SapmodelConstants.Attributes.Unit.SAPCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Unit.sapCode</code> attribute.
	 * @return the sapCode - SAP Code (ERP Table T006 field MSEHI)
	 */
	public String getSapCode(final Unit item)
	{
		return getSapCode( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Unit.sapCode</code> attribute. 
	 * @param value the sapCode - SAP Code (ERP Table T006 field MSEHI)
	 */
	public void setSapCode(final SessionContext ctx, final Unit item, final String value)
	{
		item.setProperty(ctx, SapmodelConstants.Attributes.Unit.SAPCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Unit.sapCode</code> attribute. 
	 * @param value the sapCode - SAP Code (ERP Table T006 field MSEHI)
	 */
	public void setSapCode(final Unit item, final String value)
	{
		setSapCode( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClassificationAttributeUnit.sapCode</code> attribute.
	 * @return the sapCode - SAP Code (ERP Table T006 field MSEHI)
	 */
	public String getSapCode(final SessionContext ctx, final ClassificationAttributeUnit item)
	{
		return (String)item.getProperty( ctx, SapmodelConstants.Attributes.ClassificationAttributeUnit.SAPCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClassificationAttributeUnit.sapCode</code> attribute.
	 * @return the sapCode - SAP Code (ERP Table T006 field MSEHI)
	 */
	public String getSapCode(final ClassificationAttributeUnit item)
	{
		return getSapCode( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClassificationAttributeUnit.sapCode</code> attribute. 
	 * @param value the sapCode - SAP Code (ERP Table T006 field MSEHI)
	 */
	public void setSapCode(final SessionContext ctx, final ClassificationAttributeUnit item, final String value)
	{
		item.setProperty(ctx, SapmodelConstants.Attributes.ClassificationAttributeUnit.SAPCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClassificationAttributeUnit.sapCode</code> attribute. 
	 * @param value the sapCode - SAP Code (ERP Table T006 field MSEHI)
	 */
	public void setSapCode(final ClassificationAttributeUnit item, final String value)
	{
		setSapCode( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Country.sapCode</code> attribute.
	 * @return the sapCode - SAP Code (ERP Table T005 field LAND1)
	 */
	public String getSapCode(final SessionContext ctx, final Country item)
	{
		return (String)item.getProperty( ctx, SapmodelConstants.Attributes.Country.SAPCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Country.sapCode</code> attribute.
	 * @return the sapCode - SAP Code (ERP Table T005 field LAND1)
	 */
	public String getSapCode(final Country item)
	{
		return getSapCode( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Country.sapCode</code> attribute. 
	 * @param value the sapCode - SAP Code (ERP Table T005 field LAND1)
	 */
	public void setSapCode(final SessionContext ctx, final Country item, final String value)
	{
		item.setProperty(ctx, SapmodelConstants.Attributes.Country.SAPCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Country.sapCode</code> attribute. 
	 * @param value the sapCode - SAP Code (ERP Table T005 field LAND1)
	 */
	public void setSapCode(final Country item, final String value)
	{
		setSapCode( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapcommon_distributionChannel</code> attribute.
	 * @return the sapcommon_distributionChannel
	 */
	public String getSapcommon_distributionChannel(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapmodelConstants.Attributes.SAPConfiguration.SAPCOMMON_DISTRIBUTIONCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapcommon_distributionChannel</code> attribute.
	 * @return the sapcommon_distributionChannel
	 */
	public String getSapcommon_distributionChannel(final SAPConfiguration item)
	{
		return getSapcommon_distributionChannel( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapcommon_distributionChannel</code> attribute. 
	 * @param value the sapcommon_distributionChannel
	 */
	public void setSapcommon_distributionChannel(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapmodelConstants.Attributes.SAPConfiguration.SAPCOMMON_DISTRIBUTIONCHANNEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapcommon_distributionChannel</code> attribute. 
	 * @param value the sapcommon_distributionChannel
	 */
	public void setSapcommon_distributionChannel(final SAPConfiguration item, final String value)
	{
		setSapcommon_distributionChannel( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapcommon_division</code> attribute.
	 * @return the sapcommon_division
	 */
	public String getSapcommon_division(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapmodelConstants.Attributes.SAPConfiguration.SAPCOMMON_DIVISION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapcommon_division</code> attribute.
	 * @return the sapcommon_division
	 */
	public String getSapcommon_division(final SAPConfiguration item)
	{
		return getSapcommon_division( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapcommon_division</code> attribute. 
	 * @param value the sapcommon_division
	 */
	public void setSapcommon_division(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapmodelConstants.Attributes.SAPConfiguration.SAPCOMMON_DIVISION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapcommon_division</code> attribute. 
	 * @param value the sapcommon_division
	 */
	public void setSapcommon_division(final SAPConfiguration item, final String value)
	{
		setSapcommon_division( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.sapcommon_erpHttpDestination</code> attribute.
	 * @return the sapcommon_erpHttpDestination
	 */
	public SAPHTTPDestination getSapcommon_erpHttpDestination(final SessionContext ctx, final GenericItem item)
	{
		return (SAPHTTPDestination)item.getProperty( ctx, SapmodelConstants.Attributes.SAPGlobalConfiguration.SAPCOMMON_ERPHTTPDESTINATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.sapcommon_erpHttpDestination</code> attribute.
	 * @return the sapcommon_erpHttpDestination
	 */
	public SAPHTTPDestination getSapcommon_erpHttpDestination(final SAPGlobalConfiguration item)
	{
		return getSapcommon_erpHttpDestination( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPGlobalConfiguration.sapcommon_erpHttpDestination</code> attribute. 
	 * @param value the sapcommon_erpHttpDestination
	 */
	public void setSapcommon_erpHttpDestination(final SessionContext ctx, final GenericItem item, final SAPHTTPDestination value)
	{
		item.setProperty(ctx, SapmodelConstants.Attributes.SAPGlobalConfiguration.SAPCOMMON_ERPHTTPDESTINATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPGlobalConfiguration.sapcommon_erpHttpDestination</code> attribute. 
	 * @param value the sapcommon_erpHttpDestination
	 */
	public void setSapcommon_erpHttpDestination(final SAPGlobalConfiguration item, final SAPHTTPDestination value)
	{
		setSapcommon_erpHttpDestination( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.sapcommon_erpLogicalSystem</code> attribute.
	 * @return the sapcommon_erpLogicalSystem
	 */
	public String getSapcommon_erpLogicalSystem(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapmodelConstants.Attributes.SAPGlobalConfiguration.SAPCOMMON_ERPLOGICALSYSTEM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.sapcommon_erpLogicalSystem</code> attribute.
	 * @return the sapcommon_erpLogicalSystem
	 */
	public String getSapcommon_erpLogicalSystem(final SAPGlobalConfiguration item)
	{
		return getSapcommon_erpLogicalSystem( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPGlobalConfiguration.sapcommon_erpLogicalSystem</code> attribute. 
	 * @param value the sapcommon_erpLogicalSystem
	 */
	public void setSapcommon_erpLogicalSystem(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapmodelConstants.Attributes.SAPGlobalConfiguration.SAPCOMMON_ERPLOGICALSYSTEM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPGlobalConfiguration.sapcommon_erpLogicalSystem</code> attribute. 
	 * @param value the sapcommon_erpLogicalSystem
	 */
	public void setSapcommon_erpLogicalSystem(final SAPGlobalConfiguration item, final String value)
	{
		setSapcommon_erpLogicalSystem( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapcommon_referenceCustomer</code> attribute.
	 * @return the sapcommon_referenceCustomer - reference customer used in RFC call
	 */
	public String getSapcommon_referenceCustomer(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapmodelConstants.Attributes.SAPConfiguration.SAPCOMMON_REFERENCECUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapcommon_referenceCustomer</code> attribute.
	 * @return the sapcommon_referenceCustomer - reference customer used in RFC call
	 */
	public String getSapcommon_referenceCustomer(final SAPConfiguration item)
	{
		return getSapcommon_referenceCustomer( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapcommon_referenceCustomer</code> attribute. 
	 * @param value the sapcommon_referenceCustomer - reference customer used in RFC call
	 */
	public void setSapcommon_referenceCustomer(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapmodelConstants.Attributes.SAPConfiguration.SAPCOMMON_REFERENCECUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapcommon_referenceCustomer</code> attribute. 
	 * @param value the sapcommon_referenceCustomer - reference customer used in RFC call
	 */
	public void setSapcommon_referenceCustomer(final SAPConfiguration item, final String value)
	{
		setSapcommon_referenceCustomer( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapcommon_salesOrganization</code> attribute.
	 * @return the sapcommon_salesOrganization
	 */
	public String getSapcommon_salesOrganization(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapmodelConstants.Attributes.SAPConfiguration.SAPCOMMON_SALESORGANIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapcommon_salesOrganization</code> attribute.
	 * @return the sapcommon_salesOrganization
	 */
	public String getSapcommon_salesOrganization(final SAPConfiguration item)
	{
		return getSapcommon_salesOrganization( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapcommon_salesOrganization</code> attribute. 
	 * @param value the sapcommon_salesOrganization
	 */
	public void setSapcommon_salesOrganization(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapmodelConstants.Attributes.SAPConfiguration.SAPCOMMON_SALESORGANIZATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapcommon_salesOrganization</code> attribute. 
	 * @param value the sapcommon_salesOrganization
	 */
	public void setSapcommon_salesOrganization(final SAPConfiguration item, final String value)
	{
		setSapcommon_salesOrganization( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.sapcommon_sapPricingSalesArea</code> attribute.
	 * @return the sapcommon_sapPricingSalesArea
	 */
	public Set<SAPPricingSalesAreaToCatalog> getSapcommon_sapPricingSalesArea(final SessionContext ctx, final GenericItem item)
	{
		return (Set<SAPPricingSalesAreaToCatalog>)SAPGLOBALCONFIGURATIONPRICINGSALESAREASAPCOMMON_SAPPRICINGSALESAREAHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.sapcommon_sapPricingSalesArea</code> attribute.
	 * @return the sapcommon_sapPricingSalesArea
	 */
	public Set<SAPPricingSalesAreaToCatalog> getSapcommon_sapPricingSalesArea(final SAPGlobalConfiguration item)
	{
		return getSapcommon_sapPricingSalesArea( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPGlobalConfiguration.sapcommon_sapPricingSalesArea</code> attribute. 
	 * @param value the sapcommon_sapPricingSalesArea
	 */
	public void setSapcommon_sapPricingSalesArea(final SessionContext ctx, final GenericItem item, final Set<SAPPricingSalesAreaToCatalog> value)
	{
		SAPGLOBALCONFIGURATIONPRICINGSALESAREASAPCOMMON_SAPPRICINGSALESAREAHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPGlobalConfiguration.sapcommon_sapPricingSalesArea</code> attribute. 
	 * @param value the sapcommon_sapPricingSalesArea
	 */
	public void setSapcommon_sapPricingSalesArea(final SAPGlobalConfiguration item, final Set<SAPPricingSalesAreaToCatalog> value)
	{
		setSapcommon_sapPricingSalesArea( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sapcommon_sapPricingSalesArea. 
	 * @param value the item to add to sapcommon_sapPricingSalesArea
	 */
	public void addToSapcommon_sapPricingSalesArea(final SessionContext ctx, final GenericItem item, final SAPPricingSalesAreaToCatalog value)
	{
		SAPGLOBALCONFIGURATIONPRICINGSALESAREASAPCOMMON_SAPPRICINGSALESAREAHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sapcommon_sapPricingSalesArea. 
	 * @param value the item to add to sapcommon_sapPricingSalesArea
	 */
	public void addToSapcommon_sapPricingSalesArea(final SAPGlobalConfiguration item, final SAPPricingSalesAreaToCatalog value)
	{
		addToSapcommon_sapPricingSalesArea( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sapcommon_sapPricingSalesArea. 
	 * @param value the item to remove from sapcommon_sapPricingSalesArea
	 */
	public void removeFromSapcommon_sapPricingSalesArea(final SessionContext ctx, final GenericItem item, final SAPPricingSalesAreaToCatalog value)
	{
		SAPGLOBALCONFIGURATIONPRICINGSALESAREASAPCOMMON_SAPPRICINGSALESAREAHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sapcommon_sapPricingSalesArea. 
	 * @param value the item to remove from sapcommon_sapPricingSalesArea
	 */
	public void removeFromSapcommon_sapPricingSalesArea(final SAPGlobalConfiguration item, final SAPPricingSalesAreaToCatalog value)
	{
		removeFromSapcommon_sapPricingSalesArea( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.sapcommon_sapSiteToCatalog</code> attribute.
	 * @return the sapcommon_sapSiteToCatalog
	 */
	public Set<SAPBonusBuySiteToCatalog> getSapcommon_sapSiteToCatalog(final SessionContext ctx, final GenericItem item)
	{
		return (Set<SAPBonusBuySiteToCatalog>)SAPCONFIGBONUSBUYSITESAPCOMMON_SAPSITETOCATALOGHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.sapcommon_sapSiteToCatalog</code> attribute.
	 * @return the sapcommon_sapSiteToCatalog
	 */
	public Set<SAPBonusBuySiteToCatalog> getSapcommon_sapSiteToCatalog(final SAPGlobalConfiguration item)
	{
		return getSapcommon_sapSiteToCatalog( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPGlobalConfiguration.sapcommon_sapSiteToCatalog</code> attribute. 
	 * @param value the sapcommon_sapSiteToCatalog
	 */
	public void setSapcommon_sapSiteToCatalog(final SessionContext ctx, final GenericItem item, final Set<SAPBonusBuySiteToCatalog> value)
	{
		SAPCONFIGBONUSBUYSITESAPCOMMON_SAPSITETOCATALOGHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPGlobalConfiguration.sapcommon_sapSiteToCatalog</code> attribute. 
	 * @param value the sapcommon_sapSiteToCatalog
	 */
	public void setSapcommon_sapSiteToCatalog(final SAPGlobalConfiguration item, final Set<SAPBonusBuySiteToCatalog> value)
	{
		setSapcommon_sapSiteToCatalog( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sapcommon_sapSiteToCatalog. 
	 * @param value the item to add to sapcommon_sapSiteToCatalog
	 */
	public void addToSapcommon_sapSiteToCatalog(final SessionContext ctx, final GenericItem item, final SAPBonusBuySiteToCatalog value)
	{
		SAPCONFIGBONUSBUYSITESAPCOMMON_SAPSITETOCATALOGHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sapcommon_sapSiteToCatalog. 
	 * @param value the item to add to sapcommon_sapSiteToCatalog
	 */
	public void addToSapcommon_sapSiteToCatalog(final SAPGlobalConfiguration item, final SAPBonusBuySiteToCatalog value)
	{
		addToSapcommon_sapSiteToCatalog( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sapcommon_sapSiteToCatalog. 
	 * @param value the item to remove from sapcommon_sapSiteToCatalog
	 */
	public void removeFromSapcommon_sapSiteToCatalog(final SessionContext ctx, final GenericItem item, final SAPBonusBuySiteToCatalog value)
	{
		SAPCONFIGBONUSBUYSITESAPCOMMON_SAPSITETOCATALOGHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sapcommon_sapSiteToCatalog. 
	 * @param value the item to remove from sapcommon_sapSiteToCatalog
	 */
	public void removeFromSapcommon_sapSiteToCatalog(final SAPGlobalConfiguration item, final SAPBonusBuySiteToCatalog value)
	{
		removeFromSapcommon_sapSiteToCatalog( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapcommon_transactionType</code> attribute.
	 * @return the sapcommon_transactionType
	 */
	public String getSapcommon_transactionType(final SessionContext ctx, final GenericItem item)
	{
		return (String)item.getProperty( ctx, SapmodelConstants.Attributes.SAPConfiguration.SAPCOMMON_TRANSACTIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapcommon_transactionType</code> attribute.
	 * @return the sapcommon_transactionType
	 */
	public String getSapcommon_transactionType(final SAPConfiguration item)
	{
		return getSapcommon_transactionType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapcommon_transactionType</code> attribute. 
	 * @param value the sapcommon_transactionType
	 */
	public void setSapcommon_transactionType(final SessionContext ctx, final GenericItem item, final String value)
	{
		item.setProperty(ctx, SapmodelConstants.Attributes.SAPConfiguration.SAPCOMMON_TRANSACTIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapcommon_transactionType</code> attribute. 
	 * @param value the sapcommon_transactionType
	 */
	public void setSapcommon_transactionType(final SAPConfiguration item, final String value)
	{
		setSapcommon_transactionType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.sapConditionId</code> attribute.
	 * @return the sapConditionId - Unique identifier of Price Condition.
	 */
	public String getSapConditionId(final SessionContext ctx, final PriceRow item)
	{
		return (String)item.getProperty( ctx, SapmodelConstants.Attributes.PriceRow.SAPCONDITIONID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.sapConditionId</code> attribute.
	 * @return the sapConditionId - Unique identifier of Price Condition.
	 */
	public String getSapConditionId(final PriceRow item)
	{
		return getSapConditionId( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRow.sapConditionId</code> attribute. 
	 * @param value the sapConditionId - Unique identifier of Price Condition.
	 */
	public void setSapConditionId(final SessionContext ctx, final PriceRow item, final String value)
	{
		item.setProperty(ctx, SapmodelConstants.Attributes.PriceRow.SAPCONDITIONID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRow.sapConditionId</code> attribute. 
	 * @param value the sapConditionId - Unique identifier of Price Condition.
	 */
	public void setSapConditionId(final PriceRow item, final String value)
	{
		setSapConditionId( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountRow.sapConditionId</code> attribute.
	 * @return the sapConditionId - Unique identifier of Price Condition.
	 */
	public String getSapConditionId(final SessionContext ctx, final DiscountRow item)
	{
		return (String)item.getProperty( ctx, SapmodelConstants.Attributes.DiscountRow.SAPCONDITIONID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountRow.sapConditionId</code> attribute.
	 * @return the sapConditionId - Unique identifier of Price Condition.
	 */
	public String getSapConditionId(final DiscountRow item)
	{
		return getSapConditionId( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountRow.sapConditionId</code> attribute. 
	 * @param value the sapConditionId - Unique identifier of Price Condition.
	 */
	public void setSapConditionId(final SessionContext ctx, final DiscountRow item, final String value)
	{
		item.setProperty(ctx, SapmodelConstants.Attributes.DiscountRow.SAPCONDITIONID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountRow.sapConditionId</code> attribute. 
	 * @param value the sapConditionId - Unique identifier of Price Condition.
	 */
	public void setSapConditionId(final DiscountRow item, final String value)
	{
		setSapConditionId( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.sapConfigurable</code> attribute.
	 * @return the sapConfigurable - Is the product configurable?
	 */
	public Boolean isSapConfigurable(final SessionContext ctx, final Product item)
	{
		return (Boolean)item.getProperty( ctx, SapmodelConstants.Attributes.Product.SAPCONFIGURABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.sapConfigurable</code> attribute.
	 * @return the sapConfigurable - Is the product configurable?
	 */
	public Boolean isSapConfigurable(final Product item)
	{
		return isSapConfigurable( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.sapConfigurable</code> attribute. 
	 * @return the sapConfigurable - Is the product configurable?
	 */
	public boolean isSapConfigurableAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isSapConfigurable( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.sapConfigurable</code> attribute. 
	 * @return the sapConfigurable - Is the product configurable?
	 */
	public boolean isSapConfigurableAsPrimitive(final Product item)
	{
		return isSapConfigurableAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.sapConfigurable</code> attribute. 
	 * @param value the sapConfigurable - Is the product configurable?
	 */
	public void setSapConfigurable(final SessionContext ctx, final Product item, final Boolean value)
	{
		item.setProperty(ctx, SapmodelConstants.Attributes.Product.SAPCONFIGURABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.sapConfigurable</code> attribute. 
	 * @param value the sapConfigurable - Is the product configurable?
	 */
	public void setSapConfigurable(final Product item, final Boolean value)
	{
		setSapConfigurable( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.sapConfigurable</code> attribute. 
	 * @param value the sapConfigurable - Is the product configurable?
	 */
	public void setSapConfigurable(final SessionContext ctx, final Product item, final boolean value)
	{
		setSapConfigurable( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.sapConfigurable</code> attribute. 
	 * @param value the sapConfigurable - Is the product configurable?
	 */
	public void setSapConfigurable(final Product item, final boolean value)
	{
		setSapConfigurable( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.sapConsumerID</code> attribute.
	 * @return the sapConsumerID - Unique identifier of SAP consumer
	 */
	public String getSapConsumerID(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, SapmodelConstants.Attributes.Customer.SAPCONSUMERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.sapConsumerID</code> attribute.
	 * @return the sapConsumerID - Unique identifier of SAP consumer
	 */
	public String getSapConsumerID(final Customer item)
	{
		return getSapConsumerID( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.sapConsumerID</code> attribute. 
	 * @param value the sapConsumerID - Unique identifier of SAP consumer
	 */
	public void setSapConsumerID(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, SapmodelConstants.Attributes.Customer.SAPCONSUMERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.sapConsumerID</code> attribute. 
	 * @param value the sapConsumerID - Unique identifier of SAP consumer
	 */
	public void setSapConsumerID(final Customer item, final String value)
	{
		setSapConsumerID( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.sapContactID</code> attribute.
	 * @return the sapContactID - Unique identifier of SAP contact
	 */
	public String getSapContactID(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, SapmodelConstants.Attributes.Customer.SAPCONTACTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.sapContactID</code> attribute.
	 * @return the sapContactID - Unique identifier of SAP contact
	 */
	public String getSapContactID(final Customer item)
	{
		return getSapContactID( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.sapContactID</code> attribute. 
	 * @param value the sapContactID - Unique identifier of SAP contact
	 */
	public void setSapContactID(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, SapmodelConstants.Attributes.Customer.SAPCONTACTID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.sapContactID</code> attribute. 
	 * @param value the sapContactID - Unique identifier of SAP contact
	 */
	public void setSapContactID(final Customer item, final String value)
	{
		setSapContactID( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.sapCustomerID</code> attribute.
	 * @return the sapCustomerID - Unique identifier of SAP customer
	 */
	public String getSapCustomerID(final SessionContext ctx, final Address item)
	{
		return (String)item.getProperty( ctx, SapmodelConstants.Attributes.Address.SAPCUSTOMERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.sapCustomerID</code> attribute.
	 * @return the sapCustomerID - Unique identifier of SAP customer
	 */
	public String getSapCustomerID(final Address item)
	{
		return getSapCustomerID( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.sapCustomerID</code> attribute. 
	 * @param value the sapCustomerID - Unique identifier of SAP customer
	 */
	public void setSapCustomerID(final SessionContext ctx, final Address item, final String value)
	{
		item.setProperty(ctx, SapmodelConstants.Attributes.Address.SAPCUSTOMERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.sapCustomerID</code> attribute. 
	 * @param value the sapCustomerID - Unique identifier of SAP customer
	 */
	public void setSapCustomerID(final Address item, final String value)
	{
		setSapCustomerID( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapDeliveryModes</code> attribute.
	 * @return the sapDeliveryModes
	 */
	public Set<SAPDeliveryMode> getSapDeliveryModes(final SessionContext ctx, final GenericItem item)
	{
		return (Set<SAPDeliveryMode>)SAPCONFIGDELIVERYRELATIONSAPDELIVERYMODESHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapDeliveryModes</code> attribute.
	 * @return the sapDeliveryModes
	 */
	public Set<SAPDeliveryMode> getSapDeliveryModes(final SAPConfiguration item)
	{
		return getSapDeliveryModes( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapDeliveryModes</code> attribute. 
	 * @param value the sapDeliveryModes
	 */
	public void setSapDeliveryModes(final SessionContext ctx, final GenericItem item, final Set<SAPDeliveryMode> value)
	{
		SAPCONFIGDELIVERYRELATIONSAPDELIVERYMODESHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapDeliveryModes</code> attribute. 
	 * @param value the sapDeliveryModes
	 */
	public void setSapDeliveryModes(final SAPConfiguration item, final Set<SAPDeliveryMode> value)
	{
		setSapDeliveryModes( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sapDeliveryModes. 
	 * @param value the item to add to sapDeliveryModes
	 */
	public void addToSapDeliveryModes(final SessionContext ctx, final GenericItem item, final SAPDeliveryMode value)
	{
		SAPCONFIGDELIVERYRELATIONSAPDELIVERYMODESHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sapDeliveryModes. 
	 * @param value the item to add to sapDeliveryModes
	 */
	public void addToSapDeliveryModes(final SAPConfiguration item, final SAPDeliveryMode value)
	{
		addToSapDeliveryModes( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sapDeliveryModes. 
	 * @param value the item to remove from sapDeliveryModes
	 */
	public void removeFromSapDeliveryModes(final SessionContext ctx, final GenericItem item, final SAPDeliveryMode value)
	{
		SAPCONFIGDELIVERYRELATIONSAPDELIVERYMODESHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sapDeliveryModes. 
	 * @param value the item to remove from sapDeliveryModes
	 */
	public void removeFromSapDeliveryModes(final SAPConfiguration item, final SAPDeliveryMode value)
	{
		removeFromSapDeliveryModes( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.sapEAN</code> attribute.
	 * @return the sapEAN - Product EAN
	 */
	public String getSapEAN(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, SapmodelConstants.Attributes.Product.SAPEAN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.sapEAN</code> attribute.
	 * @return the sapEAN - Product EAN
	 */
	public String getSapEAN(final Product item)
	{
		return getSapEAN( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.sapEAN</code> attribute. 
	 * @param value the sapEAN - Product EAN
	 */
	public void setSapEAN(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, SapmodelConstants.Attributes.Product.SAPEAN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.sapEAN</code> attribute. 
	 * @param value the sapEAN - Product EAN
	 */
	public void setSapEAN(final Product item, final String value)
	{
		setSapEAN( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClassificationAttribute.sapERPCharacteristicLongText</code> attribute.
	 * @return the sapERPCharacteristicLongText - Original Characteristic Long Text in SAP ERP
	 */
	public String getSapERPCharacteristicLongText(final SessionContext ctx, final ClassificationAttribute item)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedClassificationAttribute.getSapERPCharacteristicLongText requires a session language", 0 );
		}
		return (String)item.getLocalizedProperty( ctx, SapmodelConstants.Attributes.ClassificationAttribute.SAPERPCHARACTERISTICLONGTEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClassificationAttribute.sapERPCharacteristicLongText</code> attribute.
	 * @return the sapERPCharacteristicLongText - Original Characteristic Long Text in SAP ERP
	 */
	public String getSapERPCharacteristicLongText(final ClassificationAttribute item)
	{
		return getSapERPCharacteristicLongText( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClassificationAttribute.sapERPCharacteristicLongText</code> attribute. 
	 * @return the localized sapERPCharacteristicLongText - Original Characteristic Long Text in SAP ERP
	 */
	public Map<Language,String> getAllSapERPCharacteristicLongText(final SessionContext ctx, final ClassificationAttribute item)
	{
		return (Map<Language,String>)item.getAllLocalizedProperties(ctx,SapmodelConstants.Attributes.ClassificationAttribute.SAPERPCHARACTERISTICLONGTEXT,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClassificationAttribute.sapERPCharacteristicLongText</code> attribute. 
	 * @return the localized sapERPCharacteristicLongText - Original Characteristic Long Text in SAP ERP
	 */
	public Map<Language,String> getAllSapERPCharacteristicLongText(final ClassificationAttribute item)
	{
		return getAllSapERPCharacteristicLongText( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClassificationAttribute.sapERPCharacteristicLongText</code> attribute. 
	 * @param value the sapERPCharacteristicLongText - Original Characteristic Long Text in SAP ERP
	 */
	public void setSapERPCharacteristicLongText(final SessionContext ctx, final ClassificationAttribute item, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedClassificationAttribute.setSapERPCharacteristicLongText requires a session language", 0 );
		}
		item.setLocalizedProperty(ctx, SapmodelConstants.Attributes.ClassificationAttribute.SAPERPCHARACTERISTICLONGTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClassificationAttribute.sapERPCharacteristicLongText</code> attribute. 
	 * @param value the sapERPCharacteristicLongText - Original Characteristic Long Text in SAP ERP
	 */
	public void setSapERPCharacteristicLongText(final ClassificationAttribute item, final String value)
	{
		setSapERPCharacteristicLongText( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClassificationAttribute.sapERPCharacteristicLongText</code> attribute. 
	 * @param value the sapERPCharacteristicLongText - Original Characteristic Long Text in SAP ERP
	 */
	public void setAllSapERPCharacteristicLongText(final SessionContext ctx, final ClassificationAttribute item, final Map<Language,String> value)
	{
		item.setAllLocalizedProperties(ctx,SapmodelConstants.Attributes.ClassificationAttribute.SAPERPCHARACTERISTICLONGTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClassificationAttribute.sapERPCharacteristicLongText</code> attribute. 
	 * @param value the sapERPCharacteristicLongText - Original Characteristic Long Text in SAP ERP
	 */
	public void setAllSapERPCharacteristicLongText(final ClassificationAttribute item, final Map<Language,String> value)
	{
		setAllSapERPCharacteristicLongText( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.sapIsReplicated</code> attribute.
	 * @return the sapIsReplicated - Indicates if the customer has been replicated to the SAP system
	 */
	public Boolean isSapIsReplicated(final SessionContext ctx, final Customer item)
	{
		return (Boolean)item.getProperty( ctx, SapmodelConstants.Attributes.Customer.SAPISREPLICATED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.sapIsReplicated</code> attribute.
	 * @return the sapIsReplicated - Indicates if the customer has been replicated to the SAP system
	 */
	public Boolean isSapIsReplicated(final Customer item)
	{
		return isSapIsReplicated( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.sapIsReplicated</code> attribute. 
	 * @return the sapIsReplicated - Indicates if the customer has been replicated to the SAP system
	 */
	public boolean isSapIsReplicatedAsPrimitive(final SessionContext ctx, final Customer item)
	{
		Boolean value = isSapIsReplicated( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.sapIsReplicated</code> attribute. 
	 * @return the sapIsReplicated - Indicates if the customer has been replicated to the SAP system
	 */
	public boolean isSapIsReplicatedAsPrimitive(final Customer item)
	{
		return isSapIsReplicatedAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.sapIsReplicated</code> attribute. 
	 * @param value the sapIsReplicated - Indicates if the customer has been replicated to the SAP system
	 */
	public void setSapIsReplicated(final SessionContext ctx, final Customer item, final Boolean value)
	{
		item.setProperty(ctx, SapmodelConstants.Attributes.Customer.SAPISREPLICATED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.sapIsReplicated</code> attribute. 
	 * @param value the sapIsReplicated - Indicates if the customer has been replicated to the SAP system
	 */
	public void setSapIsReplicated(final Customer item, final Boolean value)
	{
		setSapIsReplicated( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.sapIsReplicated</code> attribute. 
	 * @param value the sapIsReplicated - Indicates if the customer has been replicated to the SAP system
	 */
	public void setSapIsReplicated(final SessionContext ctx, final Customer item, final boolean value)
	{
		setSapIsReplicated( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.sapIsReplicated</code> attribute. 
	 * @param value the sapIsReplicated - Indicates if the customer has been replicated to the SAP system
	 */
	public void setSapIsReplicated(final Customer item, final boolean value)
	{
		setSapIsReplicated( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.sapLogicalSystemGlobalConfig</code> attribute.
	 * @return the sapLogicalSystemGlobalConfig
	 */
	public Set<SAPLogicalSystem> getSapLogicalSystemGlobalConfig(final SessionContext ctx, final GenericItem item)
	{
		return (Set<SAPLogicalSystem>)SAPGLOBALCONFIG2LOGSYSTEMSAPLOGICALSYSTEMGLOBALCONFIGHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.sapLogicalSystemGlobalConfig</code> attribute.
	 * @return the sapLogicalSystemGlobalConfig
	 */
	public Set<SAPLogicalSystem> getSapLogicalSystemGlobalConfig(final SAPGlobalConfiguration item)
	{
		return getSapLogicalSystemGlobalConfig( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPGlobalConfiguration.sapLogicalSystemGlobalConfig</code> attribute. 
	 * @param value the sapLogicalSystemGlobalConfig
	 */
	public void setSapLogicalSystemGlobalConfig(final SessionContext ctx, final GenericItem item, final Set<SAPLogicalSystem> value)
	{
		SAPGLOBALCONFIG2LOGSYSTEMSAPLOGICALSYSTEMGLOBALCONFIGHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPGlobalConfiguration.sapLogicalSystemGlobalConfig</code> attribute. 
	 * @param value the sapLogicalSystemGlobalConfig
	 */
	public void setSapLogicalSystemGlobalConfig(final SAPGlobalConfiguration item, final Set<SAPLogicalSystem> value)
	{
		setSapLogicalSystemGlobalConfig( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sapLogicalSystemGlobalConfig. 
	 * @param value the item to add to sapLogicalSystemGlobalConfig
	 */
	public void addToSapLogicalSystemGlobalConfig(final SessionContext ctx, final GenericItem item, final SAPLogicalSystem value)
	{
		SAPGLOBALCONFIG2LOGSYSTEMSAPLOGICALSYSTEMGLOBALCONFIGHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sapLogicalSystemGlobalConfig. 
	 * @param value the item to add to sapLogicalSystemGlobalConfig
	 */
	public void addToSapLogicalSystemGlobalConfig(final SAPGlobalConfiguration item, final SAPLogicalSystem value)
	{
		addToSapLogicalSystemGlobalConfig( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sapLogicalSystemGlobalConfig. 
	 * @param value the item to remove from sapLogicalSystemGlobalConfig
	 */
	public void removeFromSapLogicalSystemGlobalConfig(final SessionContext ctx, final GenericItem item, final SAPLogicalSystem value)
	{
		SAPGLOBALCONFIG2LOGSYSTEMSAPLOGICALSYSTEMGLOBALCONFIGHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sapLogicalSystemGlobalConfig. 
	 * @param value the item to remove from sapLogicalSystemGlobalConfig
	 */
	public void removeFromSapLogicalSystemGlobalConfig(final SAPGlobalConfiguration item, final SAPLogicalSystem value)
	{
		removeFromSapLogicalSystemGlobalConfig( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Consignment.sapOrder</code> attribute.
	 * @return the sapOrder
	 */
	public SAPOrder getSapOrder(final SessionContext ctx, final Consignment item)
	{
		return (SAPOrder)item.getProperty( ctx, SapmodelConstants.Attributes.Consignment.SAPORDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Consignment.sapOrder</code> attribute.
	 * @return the sapOrder
	 */
	public SAPOrder getSapOrder(final Consignment item)
	{
		return getSapOrder( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Consignment.sapOrder</code> attribute. 
	 * @param value the sapOrder
	 */
	protected void setSapOrder(final SessionContext ctx, final Consignment item, final SAPOrder value)
	{
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+SapmodelConstants.Attributes.Consignment.SAPORDER+"' is not changeable", 0 );
		}
		item.setProperty(ctx, SapmodelConstants.Attributes.Consignment.SAPORDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Consignment.sapOrder</code> attribute. 
	 * @param value the sapOrder
	 */
	protected void setSapOrder(final Consignment item, final SAPOrder value)
	{
		setSapOrder( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.sapOrders</code> attribute.
	 * @return the sapOrders
	 */
	public Set<SAPOrder> getSapOrders(final SessionContext ctx, final Order item)
	{
		return (Set<SAPOrder>)ORDER2SAPORDERSAPORDERSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.sapOrders</code> attribute.
	 * @return the sapOrders
	 */
	public Set<SAPOrder> getSapOrders(final Order item)
	{
		return getSapOrders( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.sapOrders</code> attribute. 
	 * @param value the sapOrders
	 */
	public void setSapOrders(final SessionContext ctx, final Order item, final Set<SAPOrder> value)
	{
		ORDER2SAPORDERSAPORDERSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.sapOrders</code> attribute. 
	 * @param value the sapOrders
	 */
	public void setSapOrders(final Order item, final Set<SAPOrder> value)
	{
		setSapOrders( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sapOrders. 
	 * @param value the item to add to sapOrders
	 */
	public void addToSapOrders(final SessionContext ctx, final Order item, final SAPOrder value)
	{
		ORDER2SAPORDERSAPORDERSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sapOrders. 
	 * @param value the item to add to sapOrders
	 */
	public void addToSapOrders(final Order item, final SAPOrder value)
	{
		addToSapOrders( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sapOrders. 
	 * @param value the item to remove from sapOrders
	 */
	public void removeFromSapOrders(final SessionContext ctx, final Order item, final SAPOrder value)
	{
		ORDER2SAPORDERSAPORDERSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sapOrders. 
	 * @param value the item to remove from sapOrders
	 */
	public void removeFromSapOrders(final Order item, final SAPOrder value)
	{
		removeFromSapOrders( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapPaymentModes</code> attribute.
	 * @return the sapPaymentModes
	 */
	public Set<SAPPaymentMode> getSapPaymentModes(final SessionContext ctx, final GenericItem item)
	{
		return (Set<SAPPaymentMode>)SAPCONFIGPAYMENTRELATIONSAPPAYMENTMODESHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapPaymentModes</code> attribute.
	 * @return the sapPaymentModes
	 */
	public Set<SAPPaymentMode> getSapPaymentModes(final SAPConfiguration item)
	{
		return getSapPaymentModes( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapPaymentModes</code> attribute. 
	 * @param value the sapPaymentModes
	 */
	public void setSapPaymentModes(final SessionContext ctx, final GenericItem item, final Set<SAPPaymentMode> value)
	{
		SAPCONFIGPAYMENTRELATIONSAPPAYMENTMODESHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapPaymentModes</code> attribute. 
	 * @param value the sapPaymentModes
	 */
	public void setSapPaymentModes(final SAPConfiguration item, final Set<SAPPaymentMode> value)
	{
		setSapPaymentModes( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sapPaymentModes. 
	 * @param value the item to add to sapPaymentModes
	 */
	public void addToSapPaymentModes(final SessionContext ctx, final GenericItem item, final SAPPaymentMode value)
	{
		SAPCONFIGPAYMENTRELATIONSAPPAYMENTMODESHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sapPaymentModes. 
	 * @param value the item to add to sapPaymentModes
	 */
	public void addToSapPaymentModes(final SAPConfiguration item, final SAPPaymentMode value)
	{
		addToSapPaymentModes( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sapPaymentModes. 
	 * @param value the item to remove from sapPaymentModes
	 */
	public void removeFromSapPaymentModes(final SessionContext ctx, final GenericItem item, final SAPPaymentMode value)
	{
		SAPCONFIGPAYMENTRELATIONSAPPAYMENTMODESHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sapPaymentModes. 
	 * @param value the item to remove from sapPaymentModes
	 */
	public void removeFromSapPaymentModes(final SAPConfiguration item, final SAPPaymentMode value)
	{
		removeFromSapPaymentModes( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.sapPlant</code> attribute.
	 * @return the sapPlant - Sap Plant mapped to hybris warehouse
	 */
	public Warehouse getSapPlant(final SessionContext ctx, final Product item)
	{
		return (Warehouse)item.getProperty( ctx, SapmodelConstants.Attributes.Product.SAPPLANT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.sapPlant</code> attribute.
	 * @return the sapPlant - Sap Plant mapped to hybris warehouse
	 */
	public Warehouse getSapPlant(final Product item)
	{
		return getSapPlant( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.sapPlant</code> attribute. 
	 * @param value the sapPlant - Sap Plant mapped to hybris warehouse
	 */
	public void setSapPlant(final SessionContext ctx, final Product item, final Warehouse value)
	{
		item.setProperty(ctx, SapmodelConstants.Attributes.Product.SAPPLANT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.sapPlant</code> attribute. 
	 * @param value the sapPlant - Sap Plant mapped to hybris warehouse
	 */
	public void setSapPlant(final Product item, final Warehouse value)
	{
		setSapPlant( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapPlantLogSysOrg</code> attribute.
	 * @return the sapPlantLogSysOrg
	 */
	public Set<SAPPlantLogSysOrg> getSapPlantLogSysOrg(final SessionContext ctx, final GenericItem item)
	{
		return (Set<SAPPlantLogSysOrg>)SAPCONFIG2PLANTLOGSYSORGSAPPLANTLOGSYSORGHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapPlantLogSysOrg</code> attribute.
	 * @return the sapPlantLogSysOrg
	 */
	public Set<SAPPlantLogSysOrg> getSapPlantLogSysOrg(final SAPConfiguration item)
	{
		return getSapPlantLogSysOrg( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapPlantLogSysOrg</code> attribute. 
	 * @param value the sapPlantLogSysOrg
	 */
	public void setSapPlantLogSysOrg(final SessionContext ctx, final GenericItem item, final Set<SAPPlantLogSysOrg> value)
	{
		SAPCONFIG2PLANTLOGSYSORGSAPPLANTLOGSYSORGHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.sapPlantLogSysOrg</code> attribute. 
	 * @param value the sapPlantLogSysOrg
	 */
	public void setSapPlantLogSysOrg(final SAPConfiguration item, final Set<SAPPlantLogSysOrg> value)
	{
		setSapPlantLogSysOrg( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sapPlantLogSysOrg. 
	 * @param value the item to add to sapPlantLogSysOrg
	 */
	public void addToSapPlantLogSysOrg(final SessionContext ctx, final GenericItem item, final SAPPlantLogSysOrg value)
	{
		SAPCONFIG2PLANTLOGSYSORGSAPPLANTLOGSYSORGHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sapPlantLogSysOrg. 
	 * @param value the item to add to sapPlantLogSysOrg
	 */
	public void addToSapPlantLogSysOrg(final SAPConfiguration item, final SAPPlantLogSysOrg value)
	{
		addToSapPlantLogSysOrg( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sapPlantLogSysOrg. 
	 * @param value the item to remove from sapPlantLogSysOrg
	 */
	public void removeFromSapPlantLogSysOrg(final SessionContext ctx, final GenericItem item, final SAPPlantLogSysOrg value)
	{
		SAPCONFIG2PLANTLOGSYSORGSAPPLANTLOGSYSORGHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sapPlantLogSysOrg. 
	 * @param value the item to remove from sapPlantLogSysOrg
	 */
	public void removeFromSapPlantLogSysOrg(final SAPConfiguration item, final SAPPlantLogSysOrg value)
	{
		removeFromSapPlantLogSysOrg( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.sapPricingConditions</code> attribute.
	 * @return the sapPricingConditions - SAP pricing conditions
	 */
	public Set<SAPPricingCondition> getSapPricingConditions(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Set<SAPPricingCondition>)ORDERENTRY2SAPPRICINGCONDITIONSAPPRICINGCONDITIONSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.sapPricingConditions</code> attribute.
	 * @return the sapPricingConditions - SAP pricing conditions
	 */
	public Set<SAPPricingCondition> getSapPricingConditions(final AbstractOrderEntry item)
	{
		return getSapPricingConditions( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.sapPricingConditions</code> attribute. 
	 * @param value the sapPricingConditions - SAP pricing conditions
	 */
	public void setSapPricingConditions(final SessionContext ctx, final AbstractOrderEntry item, final Set<SAPPricingCondition> value)
	{
		ORDERENTRY2SAPPRICINGCONDITIONSAPPRICINGCONDITIONSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.sapPricingConditions</code> attribute. 
	 * @param value the sapPricingConditions - SAP pricing conditions
	 */
	public void setSapPricingConditions(final AbstractOrderEntry item, final Set<SAPPricingCondition> value)
	{
		setSapPricingConditions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sapPricingConditions. 
	 * @param value the item to add to sapPricingConditions - SAP pricing conditions
	 */
	public void addToSapPricingConditions(final SessionContext ctx, final AbstractOrderEntry item, final SAPPricingCondition value)
	{
		ORDERENTRY2SAPPRICINGCONDITIONSAPPRICINGCONDITIONSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sapPricingConditions. 
	 * @param value the item to add to sapPricingConditions - SAP pricing conditions
	 */
	public void addToSapPricingConditions(final AbstractOrderEntry item, final SAPPricingCondition value)
	{
		addToSapPricingConditions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sapPricingConditions. 
	 * @param value the item to remove from sapPricingConditions - SAP pricing conditions
	 */
	public void removeFromSapPricingConditions(final SessionContext ctx, final AbstractOrderEntry item, final SAPPricingCondition value)
	{
		ORDERENTRY2SAPPRICINGCONDITIONSAPPRICINGCONDITIONSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sapPricingConditions. 
	 * @param value the item to remove from sapPricingConditions - SAP pricing conditions
	 */
	public void removeFromSapPricingConditions(final AbstractOrderEntry item, final SAPPricingCondition value)
	{
		removeFromSapPricingConditions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.sapProductSalesAreaToCatalogMapping</code> attribute.
	 * @return the sapProductSalesAreaToCatalogMapping
	 */
	public Set<SAPProductSalesAreaToCatalogMapping> getSapProductSalesAreaToCatalogMapping(final SessionContext ctx, final GenericItem item)
	{
		return (Set<SAPProductSalesAreaToCatalogMapping>)SAPGLOBALCONFIGSAPPRODUCTSALESAREATOCATALOGMAPPINGRELATIONSAPPRODUCTSALESAREATOCATALOGMAPPINGHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.sapProductSalesAreaToCatalogMapping</code> attribute.
	 * @return the sapProductSalesAreaToCatalogMapping
	 */
	public Set<SAPProductSalesAreaToCatalogMapping> getSapProductSalesAreaToCatalogMapping(final SAPGlobalConfiguration item)
	{
		return getSapProductSalesAreaToCatalogMapping( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPGlobalConfiguration.sapProductSalesAreaToCatalogMapping</code> attribute. 
	 * @param value the sapProductSalesAreaToCatalogMapping
	 */
	public void setSapProductSalesAreaToCatalogMapping(final SessionContext ctx, final GenericItem item, final Set<SAPProductSalesAreaToCatalogMapping> value)
	{
		SAPGLOBALCONFIGSAPPRODUCTSALESAREATOCATALOGMAPPINGRELATIONSAPPRODUCTSALESAREATOCATALOGMAPPINGHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPGlobalConfiguration.sapProductSalesAreaToCatalogMapping</code> attribute. 
	 * @param value the sapProductSalesAreaToCatalogMapping
	 */
	public void setSapProductSalesAreaToCatalogMapping(final SAPGlobalConfiguration item, final Set<SAPProductSalesAreaToCatalogMapping> value)
	{
		setSapProductSalesAreaToCatalogMapping( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sapProductSalesAreaToCatalogMapping. 
	 * @param value the item to add to sapProductSalesAreaToCatalogMapping
	 */
	public void addToSapProductSalesAreaToCatalogMapping(final SessionContext ctx, final GenericItem item, final SAPProductSalesAreaToCatalogMapping value)
	{
		SAPGLOBALCONFIGSAPPRODUCTSALESAREATOCATALOGMAPPINGRELATIONSAPPRODUCTSALESAREATOCATALOGMAPPINGHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sapProductSalesAreaToCatalogMapping. 
	 * @param value the item to add to sapProductSalesAreaToCatalogMapping
	 */
	public void addToSapProductSalesAreaToCatalogMapping(final SAPGlobalConfiguration item, final SAPProductSalesAreaToCatalogMapping value)
	{
		addToSapProductSalesAreaToCatalogMapping( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sapProductSalesAreaToCatalogMapping. 
	 * @param value the item to remove from sapProductSalesAreaToCatalogMapping
	 */
	public void removeFromSapProductSalesAreaToCatalogMapping(final SessionContext ctx, final GenericItem item, final SAPProductSalesAreaToCatalogMapping value)
	{
		SAPGLOBALCONFIGSAPPRODUCTSALESAREATOCATALOGMAPPINGRELATIONSAPPRODUCTSALESAREATOCATALOGMAPPINGHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sapProductSalesAreaToCatalogMapping. 
	 * @param value the item to remove from sapProductSalesAreaToCatalogMapping
	 */
	public void removeFromSapProductSalesAreaToCatalogMapping(final SAPGlobalConfiguration item, final SAPProductSalesAreaToCatalogMapping value)
	{
		removeFromSapProductSalesAreaToCatalogMapping( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.sapReplicationInfo</code> attribute.
	 * @return the sapReplicationInfo - Information related to the replication to the SAP system
	 */
	public String getSapReplicationInfo(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, SapmodelConstants.Attributes.Customer.SAPREPLICATIONINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.sapReplicationInfo</code> attribute.
	 * @return the sapReplicationInfo - Information related to the replication to the SAP system
	 */
	public String getSapReplicationInfo(final Customer item)
	{
		return getSapReplicationInfo( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.sapReplicationInfo</code> attribute. 
	 * @param value the sapReplicationInfo - Information related to the replication to the SAP system
	 */
	public void setSapReplicationInfo(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, SapmodelConstants.Attributes.Customer.SAPREPLICATIONINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.sapReplicationInfo</code> attribute. 
	 * @param value the sapReplicationInfo - Information related to the replication to the SAP system
	 */
	public void setSapReplicationInfo(final Customer item, final String value)
	{
		setSapReplicationInfo( getSession().getSessionContext(), item, value );
	}
	
}
