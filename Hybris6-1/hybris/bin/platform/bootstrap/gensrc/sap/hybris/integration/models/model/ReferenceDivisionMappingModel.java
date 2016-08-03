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
 * Generated model class for type ReferenceDivisionMapping first defined at extension sapmodel.
 * <p>
 * Divisions per Sales Organization - Assign Master Data. Filled from ERP view V_TVKOS_ST.
 */
@SuppressWarnings("all")
public class ReferenceDivisionMappingModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ReferenceDivisionMapping";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReferenceDivisionMapping.salesOrganization</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SALESORGANIZATION = "salesOrganization";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReferenceDivisionMapping.division</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String DIVISION = "division";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReferenceDivisionMapping.divisionName</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String DIVISIONNAME = "divisionName";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReferenceDivisionMapping.refDivisionConditions</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String REFDIVISIONCONDITIONS = "refDivisionConditions";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReferenceDivisionMapping.refDivisionConditionsName</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String REFDIVISIONCONDITIONSNAME = "refDivisionConditionsName";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReferenceDivisionMapping.refDivisionCustomer</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String REFDIVISIONCUSTOMER = "refDivisionCustomer";
	
	/** <i>Generated constant</i> - Attribute key of <code>ReferenceDivisionMapping.refDivisionCustomerName</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String REFDIVISIONCUSTOMERNAME = "refDivisionCustomerName";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ReferenceDivisionMappingModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ReferenceDivisionMappingModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _division initial attribute declared by type <code>ReferenceDivisionMapping</code> at extension <code>sapmodel</code>
	 * @param _refDivisionConditions initial attribute declared by type <code>ReferenceDivisionMapping</code> at extension <code>sapmodel</code>
	 * @param _refDivisionCustomer initial attribute declared by type <code>ReferenceDivisionMapping</code> at extension <code>sapmodel</code>
	 * @param _salesOrganization initial attribute declared by type <code>ReferenceDivisionMapping</code> at extension <code>sapmodel</code>
	 */
	@Deprecated
	public ReferenceDivisionMappingModel(final String _division, final String _refDivisionConditions, final String _refDivisionCustomer, final String _salesOrganization)
	{
		super();
		setDivision(_division);
		setRefDivisionConditions(_refDivisionConditions);
		setRefDivisionCustomer(_refDivisionCustomer);
		setSalesOrganization(_salesOrganization);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _division initial attribute declared by type <code>ReferenceDivisionMapping</code> at extension <code>sapmodel</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _refDivisionConditions initial attribute declared by type <code>ReferenceDivisionMapping</code> at extension <code>sapmodel</code>
	 * @param _refDivisionCustomer initial attribute declared by type <code>ReferenceDivisionMapping</code> at extension <code>sapmodel</code>
	 * @param _salesOrganization initial attribute declared by type <code>ReferenceDivisionMapping</code> at extension <code>sapmodel</code>
	 */
	@Deprecated
	public ReferenceDivisionMappingModel(final String _division, final ItemModel _owner, final String _refDivisionConditions, final String _refDivisionCustomer, final String _salesOrganization)
	{
		super();
		setDivision(_division);
		setOwner(_owner);
		setRefDivisionConditions(_refDivisionConditions);
		setRefDivisionCustomer(_refDivisionCustomer);
		setSalesOrganization(_salesOrganization);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.division</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the division - Division
	 */
	@Accessor(qualifier = "division", type = Accessor.Type.GETTER)
	public String getDivision()
	{
		return getPersistenceContext().getPropertyValue(DIVISION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.divisionName</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the divisionName - Division Name
	 */
	@Accessor(qualifier = "divisionName", type = Accessor.Type.GETTER)
	public String getDivisionName()
	{
		return getDivisionName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.divisionName</code> attribute defined at extension <code>sapmodel</code>. 
	 * @param loc the value localization key 
	 * @return the divisionName - Division Name
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "divisionName", type = Accessor.Type.GETTER)
	public String getDivisionName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(DIVISIONNAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.refDivisionConditions</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the refDivisionConditions - Reference division for conditions
	 */
	@Accessor(qualifier = "refDivisionConditions", type = Accessor.Type.GETTER)
	public String getRefDivisionConditions()
	{
		return getPersistenceContext().getPropertyValue(REFDIVISIONCONDITIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.refDivisionConditionsName</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the refDivisionConditionsName - Reference division name for conditions
	 */
	@Accessor(qualifier = "refDivisionConditionsName", type = Accessor.Type.GETTER)
	public String getRefDivisionConditionsName()
	{
		return getRefDivisionConditionsName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.refDivisionConditionsName</code> attribute defined at extension <code>sapmodel</code>. 
	 * @param loc the value localization key 
	 * @return the refDivisionConditionsName - Reference division name for conditions
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "refDivisionConditionsName", type = Accessor.Type.GETTER)
	public String getRefDivisionConditionsName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(REFDIVISIONCONDITIONSNAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.refDivisionCustomer</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the refDivisionCustomer - Reference division for customer
	 */
	@Accessor(qualifier = "refDivisionCustomer", type = Accessor.Type.GETTER)
	public String getRefDivisionCustomer()
	{
		return getPersistenceContext().getPropertyValue(REFDIVISIONCUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.refDivisionCustomerName</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the refDivisionCustomerName - Reference division name for customer
	 */
	@Accessor(qualifier = "refDivisionCustomerName", type = Accessor.Type.GETTER)
	public String getRefDivisionCustomerName()
	{
		return getRefDivisionCustomerName(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.refDivisionCustomerName</code> attribute defined at extension <code>sapmodel</code>. 
	 * @param loc the value localization key 
	 * @return the refDivisionCustomerName - Reference division name for customer
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "refDivisionCustomerName", type = Accessor.Type.GETTER)
	public String getRefDivisionCustomerName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(REFDIVISIONCUSTOMERNAME, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.salesOrganization</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the salesOrganization - Sales Organization
	 */
	@Accessor(qualifier = "salesOrganization", type = Accessor.Type.GETTER)
	public String getSalesOrganization()
	{
		return getPersistenceContext().getPropertyValue(SALESORGANIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReferenceDivisionMapping.division</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the division - Division
	 */
	@Accessor(qualifier = "division", type = Accessor.Type.SETTER)
	public void setDivision(final String value)
	{
		getPersistenceContext().setPropertyValue(DIVISION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReferenceDivisionMapping.divisionName</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the divisionName - Division Name
	 */
	@Accessor(qualifier = "divisionName", type = Accessor.Type.SETTER)
	public void setDivisionName(final String value)
	{
		setDivisionName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>ReferenceDivisionMapping.divisionName</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the divisionName - Division Name
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "divisionName", type = Accessor.Type.SETTER)
	public void setDivisionName(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(DIVISIONNAME, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReferenceDivisionMapping.refDivisionConditions</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the refDivisionConditions - Reference division for conditions
	 */
	@Accessor(qualifier = "refDivisionConditions", type = Accessor.Type.SETTER)
	public void setRefDivisionConditions(final String value)
	{
		getPersistenceContext().setPropertyValue(REFDIVISIONCONDITIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReferenceDivisionMapping.refDivisionConditionsName</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the refDivisionConditionsName - Reference division name for conditions
	 */
	@Accessor(qualifier = "refDivisionConditionsName", type = Accessor.Type.SETTER)
	public void setRefDivisionConditionsName(final String value)
	{
		setRefDivisionConditionsName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>ReferenceDivisionMapping.refDivisionConditionsName</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the refDivisionConditionsName - Reference division name for conditions
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "refDivisionConditionsName", type = Accessor.Type.SETTER)
	public void setRefDivisionConditionsName(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(REFDIVISIONCONDITIONSNAME, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReferenceDivisionMapping.refDivisionCustomer</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the refDivisionCustomer - Reference division for customer
	 */
	@Accessor(qualifier = "refDivisionCustomer", type = Accessor.Type.SETTER)
	public void setRefDivisionCustomer(final String value)
	{
		getPersistenceContext().setPropertyValue(REFDIVISIONCUSTOMER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReferenceDivisionMapping.refDivisionCustomerName</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the refDivisionCustomerName - Reference division name for customer
	 */
	@Accessor(qualifier = "refDivisionCustomerName", type = Accessor.Type.SETTER)
	public void setRefDivisionCustomerName(final String value)
	{
		setRefDivisionCustomerName(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>ReferenceDivisionMapping.refDivisionCustomerName</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the refDivisionCustomerName - Reference division name for customer
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "refDivisionCustomerName", type = Accessor.Type.SETTER)
	public void setRefDivisionCustomerName(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(REFDIVISIONCUSTOMERNAME, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ReferenceDivisionMapping.salesOrganization</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the salesOrganization - Sales Organization
	 */
	@Accessor(qualifier = "salesOrganization", type = Accessor.Type.SETTER)
	public void setSalesOrganization(final String value)
	{
		getPersistenceContext().setPropertyValue(SALESORGANIZATION, value);
	}
	
}
