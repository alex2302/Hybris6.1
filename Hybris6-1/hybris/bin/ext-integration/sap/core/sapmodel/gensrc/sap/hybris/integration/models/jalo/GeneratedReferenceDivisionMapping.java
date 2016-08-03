/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 31, 2016 4:07:33 PM                     ---
 * ----------------------------------------------------------------
 */
package sap.hybris.integration.models.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import sap.hybris.integration.models.constants.SapmodelConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem ReferenceDivisionMapping}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedReferenceDivisionMapping extends GenericItem
{
	/** Qualifier of the <code>ReferenceDivisionMapping.salesOrganization</code> attribute **/
	public static final String SALESORGANIZATION = "salesOrganization";
	/** Qualifier of the <code>ReferenceDivisionMapping.division</code> attribute **/
	public static final String DIVISION = "division";
	/** Qualifier of the <code>ReferenceDivisionMapping.divisionName</code> attribute **/
	public static final String DIVISIONNAME = "divisionName";
	/** Qualifier of the <code>ReferenceDivisionMapping.refDivisionConditions</code> attribute **/
	public static final String REFDIVISIONCONDITIONS = "refDivisionConditions";
	/** Qualifier of the <code>ReferenceDivisionMapping.refDivisionConditionsName</code> attribute **/
	public static final String REFDIVISIONCONDITIONSNAME = "refDivisionConditionsName";
	/** Qualifier of the <code>ReferenceDivisionMapping.refDivisionCustomer</code> attribute **/
	public static final String REFDIVISIONCUSTOMER = "refDivisionCustomer";
	/** Qualifier of the <code>ReferenceDivisionMapping.refDivisionCustomerName</code> attribute **/
	public static final String REFDIVISIONCUSTOMERNAME = "refDivisionCustomerName";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SALESORGANIZATION, AttributeMode.INITIAL);
		tmp.put(DIVISION, AttributeMode.INITIAL);
		tmp.put(DIVISIONNAME, AttributeMode.INITIAL);
		tmp.put(REFDIVISIONCONDITIONS, AttributeMode.INITIAL);
		tmp.put(REFDIVISIONCONDITIONSNAME, AttributeMode.INITIAL);
		tmp.put(REFDIVISIONCUSTOMER, AttributeMode.INITIAL);
		tmp.put(REFDIVISIONCUSTOMERNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.division</code> attribute.
	 * @return the division - Division
	 */
	public String getDivision(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DIVISION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.division</code> attribute.
	 * @return the division - Division
	 */
	public String getDivision()
	{
		return getDivision( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDivisionMapping.division</code> attribute. 
	 * @param value the division - Division
	 */
	public void setDivision(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DIVISION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDivisionMapping.division</code> attribute. 
	 * @param value the division - Division
	 */
	public void setDivision(final String value)
	{
		setDivision( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.divisionName</code> attribute.
	 * @return the divisionName - Division Name
	 */
	public String getDivisionName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedReferenceDivisionMapping.getDivisionName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DIVISIONNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.divisionName</code> attribute.
	 * @return the divisionName - Division Name
	 */
	public String getDivisionName()
	{
		return getDivisionName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.divisionName</code> attribute. 
	 * @return the localized divisionName - Division Name
	 */
	public Map<Language,String> getAllDivisionName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DIVISIONNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.divisionName</code> attribute. 
	 * @return the localized divisionName - Division Name
	 */
	public Map<Language,String> getAllDivisionName()
	{
		return getAllDivisionName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDivisionMapping.divisionName</code> attribute. 
	 * @param value the divisionName - Division Name
	 */
	public void setDivisionName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedReferenceDivisionMapping.setDivisionName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DIVISIONNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDivisionMapping.divisionName</code> attribute. 
	 * @param value the divisionName - Division Name
	 */
	public void setDivisionName(final String value)
	{
		setDivisionName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDivisionMapping.divisionName</code> attribute. 
	 * @param value the divisionName - Division Name
	 */
	public void setAllDivisionName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DIVISIONNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDivisionMapping.divisionName</code> attribute. 
	 * @param value the divisionName - Division Name
	 */
	public void setAllDivisionName(final Map<Language,String> value)
	{
		setAllDivisionName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.refDivisionConditions</code> attribute.
	 * @return the refDivisionConditions - Reference division for conditions
	 */
	public String getRefDivisionConditions(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REFDIVISIONCONDITIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.refDivisionConditions</code> attribute.
	 * @return the refDivisionConditions - Reference division for conditions
	 */
	public String getRefDivisionConditions()
	{
		return getRefDivisionConditions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDivisionMapping.refDivisionConditions</code> attribute. 
	 * @param value the refDivisionConditions - Reference division for conditions
	 */
	public void setRefDivisionConditions(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REFDIVISIONCONDITIONS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDivisionMapping.refDivisionConditions</code> attribute. 
	 * @param value the refDivisionConditions - Reference division for conditions
	 */
	public void setRefDivisionConditions(final String value)
	{
		setRefDivisionConditions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.refDivisionConditionsName</code> attribute.
	 * @return the refDivisionConditionsName - Reference division name for conditions
	 */
	public String getRefDivisionConditionsName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedReferenceDivisionMapping.getRefDivisionConditionsName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, REFDIVISIONCONDITIONSNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.refDivisionConditionsName</code> attribute.
	 * @return the refDivisionConditionsName - Reference division name for conditions
	 */
	public String getRefDivisionConditionsName()
	{
		return getRefDivisionConditionsName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.refDivisionConditionsName</code> attribute. 
	 * @return the localized refDivisionConditionsName - Reference division name for conditions
	 */
	public Map<Language,String> getAllRefDivisionConditionsName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,REFDIVISIONCONDITIONSNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.refDivisionConditionsName</code> attribute. 
	 * @return the localized refDivisionConditionsName - Reference division name for conditions
	 */
	public Map<Language,String> getAllRefDivisionConditionsName()
	{
		return getAllRefDivisionConditionsName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDivisionMapping.refDivisionConditionsName</code> attribute. 
	 * @param value the refDivisionConditionsName - Reference division name for conditions
	 */
	public void setRefDivisionConditionsName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedReferenceDivisionMapping.setRefDivisionConditionsName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, REFDIVISIONCONDITIONSNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDivisionMapping.refDivisionConditionsName</code> attribute. 
	 * @param value the refDivisionConditionsName - Reference division name for conditions
	 */
	public void setRefDivisionConditionsName(final String value)
	{
		setRefDivisionConditionsName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDivisionMapping.refDivisionConditionsName</code> attribute. 
	 * @param value the refDivisionConditionsName - Reference division name for conditions
	 */
	public void setAllRefDivisionConditionsName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,REFDIVISIONCONDITIONSNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDivisionMapping.refDivisionConditionsName</code> attribute. 
	 * @param value the refDivisionConditionsName - Reference division name for conditions
	 */
	public void setAllRefDivisionConditionsName(final Map<Language,String> value)
	{
		setAllRefDivisionConditionsName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.refDivisionCustomer</code> attribute.
	 * @return the refDivisionCustomer - Reference division for customer
	 */
	public String getRefDivisionCustomer(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REFDIVISIONCUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.refDivisionCustomer</code> attribute.
	 * @return the refDivisionCustomer - Reference division for customer
	 */
	public String getRefDivisionCustomer()
	{
		return getRefDivisionCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDivisionMapping.refDivisionCustomer</code> attribute. 
	 * @param value the refDivisionCustomer - Reference division for customer
	 */
	public void setRefDivisionCustomer(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REFDIVISIONCUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDivisionMapping.refDivisionCustomer</code> attribute. 
	 * @param value the refDivisionCustomer - Reference division for customer
	 */
	public void setRefDivisionCustomer(final String value)
	{
		setRefDivisionCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.refDivisionCustomerName</code> attribute.
	 * @return the refDivisionCustomerName - Reference division name for customer
	 */
	public String getRefDivisionCustomerName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedReferenceDivisionMapping.getRefDivisionCustomerName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, REFDIVISIONCUSTOMERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.refDivisionCustomerName</code> attribute.
	 * @return the refDivisionCustomerName - Reference division name for customer
	 */
	public String getRefDivisionCustomerName()
	{
		return getRefDivisionCustomerName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.refDivisionCustomerName</code> attribute. 
	 * @return the localized refDivisionCustomerName - Reference division name for customer
	 */
	public Map<Language,String> getAllRefDivisionCustomerName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,REFDIVISIONCUSTOMERNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.refDivisionCustomerName</code> attribute. 
	 * @return the localized refDivisionCustomerName - Reference division name for customer
	 */
	public Map<Language,String> getAllRefDivisionCustomerName()
	{
		return getAllRefDivisionCustomerName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDivisionMapping.refDivisionCustomerName</code> attribute. 
	 * @param value the refDivisionCustomerName - Reference division name for customer
	 */
	public void setRefDivisionCustomerName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedReferenceDivisionMapping.setRefDivisionCustomerName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, REFDIVISIONCUSTOMERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDivisionMapping.refDivisionCustomerName</code> attribute. 
	 * @param value the refDivisionCustomerName - Reference division name for customer
	 */
	public void setRefDivisionCustomerName(final String value)
	{
		setRefDivisionCustomerName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDivisionMapping.refDivisionCustomerName</code> attribute. 
	 * @param value the refDivisionCustomerName - Reference division name for customer
	 */
	public void setAllRefDivisionCustomerName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,REFDIVISIONCUSTOMERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDivisionMapping.refDivisionCustomerName</code> attribute. 
	 * @param value the refDivisionCustomerName - Reference division name for customer
	 */
	public void setAllRefDivisionCustomerName(final Map<Language,String> value)
	{
		setAllRefDivisionCustomerName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.salesOrganization</code> attribute.
	 * @return the salesOrganization - Sales Organization
	 */
	public String getSalesOrganization(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORGANIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDivisionMapping.salesOrganization</code> attribute.
	 * @return the salesOrganization - Sales Organization
	 */
	public String getSalesOrganization()
	{
		return getSalesOrganization( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDivisionMapping.salesOrganization</code> attribute. 
	 * @param value the salesOrganization - Sales Organization
	 */
	public void setSalesOrganization(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORGANIZATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDivisionMapping.salesOrganization</code> attribute. 
	 * @param value the salesOrganization - Sales Organization
	 */
	public void setSalesOrganization(final String value)
	{
		setSalesOrganization( getSession().getSessionContext(), value );
	}
	
}
