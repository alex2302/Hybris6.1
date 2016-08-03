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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem ReferenceDistributionChannelMapping}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedReferenceDistributionChannelMapping extends GenericItem
{
	/** Qualifier of the <code>ReferenceDistributionChannelMapping.salesOrganization</code> attribute **/
	public static final String SALESORGANIZATION = "salesOrganization";
	/** Qualifier of the <code>ReferenceDistributionChannelMapping.distChannel</code> attribute **/
	public static final String DISTCHANNEL = "distChannel";
	/** Qualifier of the <code>ReferenceDistributionChannelMapping.distChannelName</code> attribute **/
	public static final String DISTCHANNELNAME = "distChannelName";
	/** Qualifier of the <code>ReferenceDistributionChannelMapping.refDistChannelConditions</code> attribute **/
	public static final String REFDISTCHANNELCONDITIONS = "refDistChannelConditions";
	/** Qualifier of the <code>ReferenceDistributionChannelMapping.refDistChannelConditionsName</code> attribute **/
	public static final String REFDISTCHANNELCONDITIONSNAME = "refDistChannelConditionsName";
	/** Qualifier of the <code>ReferenceDistributionChannelMapping.refDistChannelCustMat</code> attribute **/
	public static final String REFDISTCHANNELCUSTMAT = "refDistChannelCustMat";
	/** Qualifier of the <code>ReferenceDistributionChannelMapping.refDistChannelCustMatName</code> attribute **/
	public static final String REFDISTCHANNELCUSTMATNAME = "refDistChannelCustMatName";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SALESORGANIZATION, AttributeMode.INITIAL);
		tmp.put(DISTCHANNEL, AttributeMode.INITIAL);
		tmp.put(DISTCHANNELNAME, AttributeMode.INITIAL);
		tmp.put(REFDISTCHANNELCONDITIONS, AttributeMode.INITIAL);
		tmp.put(REFDISTCHANNELCONDITIONSNAME, AttributeMode.INITIAL);
		tmp.put(REFDISTCHANNELCUSTMAT, AttributeMode.INITIAL);
		tmp.put(REFDISTCHANNELCUSTMATNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.distChannel</code> attribute.
	 * @return the distChannel - Distribution Channel
	 */
	public String getDistChannel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DISTCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.distChannel</code> attribute.
	 * @return the distChannel - Distribution Channel
	 */
	public String getDistChannel()
	{
		return getDistChannel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDistributionChannelMapping.distChannel</code> attribute. 
	 * @param value the distChannel - Distribution Channel
	 */
	public void setDistChannel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DISTCHANNEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDistributionChannelMapping.distChannel</code> attribute. 
	 * @param value the distChannel - Distribution Channel
	 */
	public void setDistChannel(final String value)
	{
		setDistChannel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.distChannelName</code> attribute.
	 * @return the distChannelName - Distribution Channel Name
	 */
	public String getDistChannelName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedReferenceDistributionChannelMapping.getDistChannelName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DISTCHANNELNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.distChannelName</code> attribute.
	 * @return the distChannelName - Distribution Channel Name
	 */
	public String getDistChannelName()
	{
		return getDistChannelName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.distChannelName</code> attribute. 
	 * @return the localized distChannelName - Distribution Channel Name
	 */
	public Map<Language,String> getAllDistChannelName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DISTCHANNELNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.distChannelName</code> attribute. 
	 * @return the localized distChannelName - Distribution Channel Name
	 */
	public Map<Language,String> getAllDistChannelName()
	{
		return getAllDistChannelName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDistributionChannelMapping.distChannelName</code> attribute. 
	 * @param value the distChannelName - Distribution Channel Name
	 */
	public void setDistChannelName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedReferenceDistributionChannelMapping.setDistChannelName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DISTCHANNELNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDistributionChannelMapping.distChannelName</code> attribute. 
	 * @param value the distChannelName - Distribution Channel Name
	 */
	public void setDistChannelName(final String value)
	{
		setDistChannelName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDistributionChannelMapping.distChannelName</code> attribute. 
	 * @param value the distChannelName - Distribution Channel Name
	 */
	public void setAllDistChannelName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DISTCHANNELNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDistributionChannelMapping.distChannelName</code> attribute. 
	 * @param value the distChannelName - Distribution Channel Name
	 */
	public void setAllDistChannelName(final Map<Language,String> value)
	{
		setAllDistChannelName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.refDistChannelConditions</code> attribute.
	 * @return the refDistChannelConditions - Reference distribution channel for conditions
	 */
	public String getRefDistChannelConditions(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REFDISTCHANNELCONDITIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.refDistChannelConditions</code> attribute.
	 * @return the refDistChannelConditions - Reference distribution channel for conditions
	 */
	public String getRefDistChannelConditions()
	{
		return getRefDistChannelConditions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDistributionChannelMapping.refDistChannelConditions</code> attribute. 
	 * @param value the refDistChannelConditions - Reference distribution channel for conditions
	 */
	public void setRefDistChannelConditions(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REFDISTCHANNELCONDITIONS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDistributionChannelMapping.refDistChannelConditions</code> attribute. 
	 * @param value the refDistChannelConditions - Reference distribution channel for conditions
	 */
	public void setRefDistChannelConditions(final String value)
	{
		setRefDistChannelConditions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.refDistChannelConditionsName</code> attribute.
	 * @return the refDistChannelConditionsName - Reference distribution channel name for conditions
	 */
	public String getRefDistChannelConditionsName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedReferenceDistributionChannelMapping.getRefDistChannelConditionsName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, REFDISTCHANNELCONDITIONSNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.refDistChannelConditionsName</code> attribute.
	 * @return the refDistChannelConditionsName - Reference distribution channel name for conditions
	 */
	public String getRefDistChannelConditionsName()
	{
		return getRefDistChannelConditionsName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.refDistChannelConditionsName</code> attribute. 
	 * @return the localized refDistChannelConditionsName - Reference distribution channel name for conditions
	 */
	public Map<Language,String> getAllRefDistChannelConditionsName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,REFDISTCHANNELCONDITIONSNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.refDistChannelConditionsName</code> attribute. 
	 * @return the localized refDistChannelConditionsName - Reference distribution channel name for conditions
	 */
	public Map<Language,String> getAllRefDistChannelConditionsName()
	{
		return getAllRefDistChannelConditionsName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDistributionChannelMapping.refDistChannelConditionsName</code> attribute. 
	 * @param value the refDistChannelConditionsName - Reference distribution channel name for conditions
	 */
	public void setRefDistChannelConditionsName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedReferenceDistributionChannelMapping.setRefDistChannelConditionsName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, REFDISTCHANNELCONDITIONSNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDistributionChannelMapping.refDistChannelConditionsName</code> attribute. 
	 * @param value the refDistChannelConditionsName - Reference distribution channel name for conditions
	 */
	public void setRefDistChannelConditionsName(final String value)
	{
		setRefDistChannelConditionsName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDistributionChannelMapping.refDistChannelConditionsName</code> attribute. 
	 * @param value the refDistChannelConditionsName - Reference distribution channel name for conditions
	 */
	public void setAllRefDistChannelConditionsName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,REFDISTCHANNELCONDITIONSNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDistributionChannelMapping.refDistChannelConditionsName</code> attribute. 
	 * @param value the refDistChannelConditionsName - Reference distribution channel name for conditions
	 */
	public void setAllRefDistChannelConditionsName(final Map<Language,String> value)
	{
		setAllRefDistChannelConditionsName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.refDistChannelCustMat</code> attribute.
	 * @return the refDistChannelCustMat - Reference distribution channel for customer and material masters
	 */
	public String getRefDistChannelCustMat(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REFDISTCHANNELCUSTMAT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.refDistChannelCustMat</code> attribute.
	 * @return the refDistChannelCustMat - Reference distribution channel for customer and material masters
	 */
	public String getRefDistChannelCustMat()
	{
		return getRefDistChannelCustMat( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDistributionChannelMapping.refDistChannelCustMat</code> attribute. 
	 * @param value the refDistChannelCustMat - Reference distribution channel for customer and material masters
	 */
	public void setRefDistChannelCustMat(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REFDISTCHANNELCUSTMAT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDistributionChannelMapping.refDistChannelCustMat</code> attribute. 
	 * @param value the refDistChannelCustMat - Reference distribution channel for customer and material masters
	 */
	public void setRefDistChannelCustMat(final String value)
	{
		setRefDistChannelCustMat( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.refDistChannelCustMatName</code> attribute.
	 * @return the refDistChannelCustMatName - Reference distribution channel name for customer and material masters
	 */
	public String getRefDistChannelCustMatName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedReferenceDistributionChannelMapping.getRefDistChannelCustMatName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, REFDISTCHANNELCUSTMATNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.refDistChannelCustMatName</code> attribute.
	 * @return the refDistChannelCustMatName - Reference distribution channel name for customer and material masters
	 */
	public String getRefDistChannelCustMatName()
	{
		return getRefDistChannelCustMatName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.refDistChannelCustMatName</code> attribute. 
	 * @return the localized refDistChannelCustMatName - Reference distribution channel name for customer and material masters
	 */
	public Map<Language,String> getAllRefDistChannelCustMatName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,REFDISTCHANNELCUSTMATNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.refDistChannelCustMatName</code> attribute. 
	 * @return the localized refDistChannelCustMatName - Reference distribution channel name for customer and material masters
	 */
	public Map<Language,String> getAllRefDistChannelCustMatName()
	{
		return getAllRefDistChannelCustMatName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDistributionChannelMapping.refDistChannelCustMatName</code> attribute. 
	 * @param value the refDistChannelCustMatName - Reference distribution channel name for customer and material masters
	 */
	public void setRefDistChannelCustMatName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedReferenceDistributionChannelMapping.setRefDistChannelCustMatName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, REFDISTCHANNELCUSTMATNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDistributionChannelMapping.refDistChannelCustMatName</code> attribute. 
	 * @param value the refDistChannelCustMatName - Reference distribution channel name for customer and material masters
	 */
	public void setRefDistChannelCustMatName(final String value)
	{
		setRefDistChannelCustMatName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDistributionChannelMapping.refDistChannelCustMatName</code> attribute. 
	 * @param value the refDistChannelCustMatName - Reference distribution channel name for customer and material masters
	 */
	public void setAllRefDistChannelCustMatName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,REFDISTCHANNELCUSTMATNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDistributionChannelMapping.refDistChannelCustMatName</code> attribute. 
	 * @param value the refDistChannelCustMatName - Reference distribution channel name for customer and material masters
	 */
	public void setAllRefDistChannelCustMatName(final Map<Language,String> value)
	{
		setAllRefDistChannelCustMatName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.salesOrganization</code> attribute.
	 * @return the salesOrganization - Sales Organization
	 */
	public String getSalesOrganization(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORGANIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReferenceDistributionChannelMapping.salesOrganization</code> attribute.
	 * @return the salesOrganization - Sales Organization
	 */
	public String getSalesOrganization()
	{
		return getSalesOrganization( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDistributionChannelMapping.salesOrganization</code> attribute. 
	 * @param value the salesOrganization - Sales Organization
	 */
	public void setSalesOrganization(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORGANIZATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReferenceDistributionChannelMapping.salesOrganization</code> attribute. 
	 * @param value the salesOrganization - Sales Organization
	 */
	public void setSalesOrganization(final String value)
	{
		setSalesOrganization( getSession().getSessionContext(), value );
	}
	
}
