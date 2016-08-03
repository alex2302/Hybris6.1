/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 31, 2016 4:07:33 PM                     ---
 * ----------------------------------------------------------------
 */
package sap.hybris.integration.models.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Locale;

/**
 * Generated model class for type ReferenceDistributionChannelMapping first defined at extension sapmodel.
 * <p>
 * Distribution Channel per Sales Organization - Assign Master Data. Filled from ERP view V_TVKOV_ST.
 */
@SuppressWarnings("all")
public class ReferenceDistributionChannelMappingModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ReferenceDistributionChannelMapping";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReferenceDistributionChannelMapping.salesOrganization</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SALESORGANIZATION = "salesOrganization";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReferenceDistributionChannelMapping.distChannel</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String DISTCHANNEL = "distChannel";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReferenceDistributionChannelMapping.distChannelName</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String DISTCHANNELNAME = "distChannelName";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReferenceDistributionChannelMapping.refDistChannelConditions</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String REFDISTCHANNELCONDITIONS = "refDistChannelConditions";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReferenceDistributionChannelMapping.refDistChannelConditionsName</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String REFDISTCHANNELCONDITIONSNAME = "refDistChannelConditionsName";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReferenceDistributionChannelMapping.refDistChannelCustMat</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String REFDISTCHANNELCUSTMAT = "refDistChannelCustMat";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReferenceDistributionChannelMapping.refDistChannelCustMatName</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String REFDISTCHANNELCUSTMATNAME = "refDistChannelCustMatName";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ReferenceDistributionChannelMappingModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ReferenceDistributionChannelMappingModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _distChannel initial attribute declared by type <code>ReferenceDistributionChannelMapping</code> at extension <code>sapmodel</code>
	 * @param _refDistChannelConditions initial attribute declared by type <code>ReferenceDistributionChannelMapping</code> at extension <code>sapmodel</code>
	 * @param _refDistChannelCustMat initial attribute declared by type <code>ReferenceDistributionChannelMapping</code> at extension <code>sapmodel</code>
	 * @param _salesOrganization initial attribute declared by type <code>ReferenceDistributionChannelMapping</code> at extension <code>sapmodel</code>
	 */
	@Deprecated
	public ReferenceDistributionChannelMappingModel(final String _distChannel, final String _refDistChannelConditions, final String _refDistChannelCustMat, final String _salesOrganization)
	{
		super();
		setDistChannel(_distChannel);
		setRefDistChannelConditions(_refDistChannelConditions);
		setRefDistChannelCustMat(_refDistChannelCustMat);
		setSalesOrganization(_salesOrganization);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _distChannel initial attribute declared by type <code>ReferenceDistributionChannelMapping</code> at extension <code>sapmodel</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _refDistChannelConditions initial attribute declared by type <code>ReferenceDistributionChannelMapping</code> at extension <code>sapmodel</code>
	 * @param _refDistChannelCustMat initial attribute declared by type <code>ReferenceDistributionChannelMapping</code> at extension <code>sapmodel</code>
	 * @param _salesOrganization initial attribute declared by type <code>ReferenceDistributionChannelMapping</code> at extension <code>sapmodel</code>
	 */
	@Deprecated
	public ReferenceDistributionChannelMappingModel(final String _distChannel, final ItemModel _owner, final String _refDistChannelConditions, final String _refDistChannelCustMat, final String _salesOrganization)
	{
		super();
		setDistChannel(_distChannel);
		setOwner(_owner);
		setRefDistChannelConditions(_refDistChannelConditions);
		setRefDistChannelCustMat(_refDistChannelCustMat);
		setSalesOrganization(_salesOrganization);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.distChannel</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the distChannel - Distribution Channel
	 */
	@Accessor(qualifier = "distChannel", type = Accessor.Type.GETTER)
	public String getDistChannel()
	{
		return getPersistenceContext().getPropertyValue(DISTCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.distChannelName</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the distChannelName - Distribution Channel Name
	 */
	@Accessor(qualifier = "distChannelName", type = Accessor.Type.GETTER)
	public String getDistChannelName()
	{
		return getDistChannelName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.distChannelName</code> attribute defined at extension <code>sapmodel</code>. 
	 * @param loc the value localization key 
	 * @return the distChannelName - Distribution Channel Name
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "distChannelName", type = Accessor.Type.GETTER)
	public String getDistChannelName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(DISTCHANNELNAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.refDistChannelConditions</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the refDistChannelConditions - Reference distribution channel for conditions
	 */
	@Accessor(qualifier = "refDistChannelConditions", type = Accessor.Type.GETTER)
	public String getRefDistChannelConditions()
	{
		return getPersistenceContext().getPropertyValue(REFDISTCHANNELCONDITIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.refDistChannelConditionsName</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the refDistChannelConditionsName - Reference distribution channel name for conditions
	 */
	@Accessor(qualifier = "refDistChannelConditionsName", type = Accessor.Type.GETTER)
	public String getRefDistChannelConditionsName()
	{
		return getRefDistChannelConditionsName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.refDistChannelConditionsName</code> attribute defined at extension <code>sapmodel</code>. 
	 * @param loc the value localization key 
	 * @return the refDistChannelConditionsName - Reference distribution channel name for conditions
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "refDistChannelConditionsName", type = Accessor.Type.GETTER)
	public String getRefDistChannelConditionsName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(REFDISTCHANNELCONDITIONSNAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.refDistChannelCustMat</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the refDistChannelCustMat - Reference distribution channel for customer and material masters
	 */
	@Accessor(qualifier = "refDistChannelCustMat", type = Accessor.Type.GETTER)
	public String getRefDistChannelCustMat()
	{
		return getPersistenceContext().getPropertyValue(REFDISTCHANNELCUSTMAT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.refDistChannelCustMatName</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the refDistChannelCustMatName - Reference distribution channel name for customer and material masters
	 */
	@Accessor(qualifier = "refDistChannelCustMatName", type = Accessor.Type.GETTER)
	public String getRefDistChannelCustMatName()
	{
		return getRefDistChannelCustMatName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.refDistChannelCustMatName</code> attribute defined at extension <code>sapmodel</code>. 
	 * @param loc the value localization key 
	 * @return the refDistChannelCustMatName - Reference distribution channel name for customer and material masters
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "refDistChannelCustMatName", type = Accessor.Type.GETTER)
	public String getRefDistChannelCustMatName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(REFDISTCHANNELCUSTMATNAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.salesOrganization</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the salesOrganization - Sales Organization
	 */
	@Accessor(qualifier = "salesOrganization", type = Accessor.Type.GETTER)
	public String getSalesOrganization()
	{
		return getPersistenceContext().getPropertyValue(SALESORGANIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReferenceDistributionChannelMapping.distChannel</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the distChannel - Distribution Channel
	 */
	@Accessor(qualifier = "distChannel", type = Accessor.Type.SETTER)
	public void setDistChannel(final String value)
	{
		getPersistenceContext().setPropertyValue(DISTCHANNEL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReferenceDistributionChannelMapping.distChannelName</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the distChannelName - Distribution Channel Name
	 */
	@Accessor(qualifier = "distChannelName", type = Accessor.Type.SETTER)
	public void setDistChannelName(final String value)
	{
		setDistChannelName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>ReferenceDistributionChannelMapping.distChannelName</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the distChannelName - Distribution Channel Name
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "distChannelName", type = Accessor.Type.SETTER)
	public void setDistChannelName(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(DISTCHANNELNAME, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReferenceDistributionChannelMapping.refDistChannelConditions</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the refDistChannelConditions - Reference distribution channel for conditions
	 */
	@Accessor(qualifier = "refDistChannelConditions", type = Accessor.Type.SETTER)
	public void setRefDistChannelConditions(final String value)
	{
		getPersistenceContext().setPropertyValue(REFDISTCHANNELCONDITIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReferenceDistributionChannelMapping.refDistChannelConditionsName</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the refDistChannelConditionsName - Reference distribution channel name for conditions
	 */
	@Accessor(qualifier = "refDistChannelConditionsName", type = Accessor.Type.SETTER)
	public void setRefDistChannelConditionsName(final String value)
	{
		setRefDistChannelConditionsName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>ReferenceDistributionChannelMapping.refDistChannelConditionsName</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the refDistChannelConditionsName - Reference distribution channel name for conditions
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "refDistChannelConditionsName", type = Accessor.Type.SETTER)
	public void setRefDistChannelConditionsName(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(REFDISTCHANNELCONDITIONSNAME, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReferenceDistributionChannelMapping.refDistChannelCustMat</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the refDistChannelCustMat - Reference distribution channel for customer and material masters
	 */
	@Accessor(qualifier = "refDistChannelCustMat", type = Accessor.Type.SETTER)
	public void setRefDistChannelCustMat(final String value)
	{
		getPersistenceContext().setPropertyValue(REFDISTCHANNELCUSTMAT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReferenceDistributionChannelMapping.refDistChannelCustMatName</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the refDistChannelCustMatName - Reference distribution channel name for customer and material masters
	 */
	@Accessor(qualifier = "refDistChannelCustMatName", type = Accessor.Type.SETTER)
	public void setRefDistChannelCustMatName(final String value)
	{
		setRefDistChannelCustMatName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>ReferenceDistributionChannelMapping.refDistChannelCustMatName</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the refDistChannelCustMatName - Reference distribution channel name for customer and material masters
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "refDistChannelCustMatName", type = Accessor.Type.SETTER)
	public void setRefDistChannelCustMatName(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(REFDISTCHANNELCUSTMATNAME, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReferenceDistributionChannelMapping.salesOrganization</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the salesOrganization - Sales Organization
	 */
	@Accessor(qualifier = "salesOrganization", type = Accessor.Type.SETTER)
	public void setSalesOrganization(final String value)
	{
		getPersistenceContext().setPropertyValue(SALESORGANIZATION, value);
	}
	
}
