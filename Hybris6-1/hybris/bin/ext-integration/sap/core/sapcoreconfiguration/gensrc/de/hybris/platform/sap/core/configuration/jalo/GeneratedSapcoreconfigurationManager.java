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
package de.hybris.platform.sap.core.configuration.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.sap.core.configuration.constants.SapcoreconfigurationConstants;
import de.hybris.platform.sap.core.configuration.jalo.RFCDestinationAttribute;
import de.hybris.platform.sap.core.configuration.jalo.SAPAdministration;
import de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration;
import de.hybris.platform.sap.core.configuration.jalo.SAPGlobalConfiguration;
import de.hybris.platform.sap.core.configuration.jalo.SAPHTTPDestination;
import de.hybris.platform.sap.core.configuration.jalo.SAPRFCDestination;
import de.hybris.platform.store.BaseStore;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>SapcoreconfigurationManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSapcoreconfigurationManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("SAPConfiguration", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.store.BaseStore", Collections.unmodifiableMap(tmp));
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
	
	public RFCDestinationAttribute createRFCDestinationAttribute(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapcoreconfigurationConstants.TC.RFCDESTINATIONATTRIBUTE );
			return (RFCDestinationAttribute)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating RFCDestinationAttribute : "+e.getMessage(), 0 );
		}
	}
	
	public RFCDestinationAttribute createRFCDestinationAttribute(final Map attributeValues)
	{
		return createRFCDestinationAttribute( getSession().getSessionContext(), attributeValues );
	}
	
	public SAPAdministration createSAPAdministration(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapcoreconfigurationConstants.TC.SAPADMINISTRATION );
			return (SAPAdministration)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SAPAdministration : "+e.getMessage(), 0 );
		}
	}
	
	public SAPAdministration createSAPAdministration(final Map attributeValues)
	{
		return createSAPAdministration( getSession().getSessionContext(), attributeValues );
	}
	
	public SAPConfiguration createSAPConfiguration(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapcoreconfigurationConstants.TC.SAPCONFIGURATION );
			return (SAPConfiguration)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SAPConfiguration : "+e.getMessage(), 0 );
		}
	}
	
	public SAPConfiguration createSAPConfiguration(final Map attributeValues)
	{
		return createSAPConfiguration( getSession().getSessionContext(), attributeValues );
	}
	
	public SAPGlobalConfiguration createSAPGlobalConfiguration(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapcoreconfigurationConstants.TC.SAPGLOBALCONFIGURATION );
			return (SAPGlobalConfiguration)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SAPGlobalConfiguration : "+e.getMessage(), 0 );
		}
	}
	
	public SAPGlobalConfiguration createSAPGlobalConfiguration(final Map attributeValues)
	{
		return createSAPGlobalConfiguration( getSession().getSessionContext(), attributeValues );
	}
	
	public SAPHTTPDestination createSAPHTTPDestination(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapcoreconfigurationConstants.TC.SAPHTTPDESTINATION );
			return (SAPHTTPDestination)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SAPHTTPDestination : "+e.getMessage(), 0 );
		}
	}
	
	public SAPHTTPDestination createSAPHTTPDestination(final Map attributeValues)
	{
		return createSAPHTTPDestination( getSession().getSessionContext(), attributeValues );
	}
	
	public SAPRFCDestination createSAPRFCDestination(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapcoreconfigurationConstants.TC.SAPRFCDESTINATION );
			return (SAPRFCDestination)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SAPRFCDestination : "+e.getMessage(), 0 );
		}
	}
	
	public SAPRFCDestination createSAPRFCDestination(final Map attributeValues)
	{
		return createSAPRFCDestination( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return SapcoreconfigurationConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.SAPConfiguration</code> attribute.
	 * @return the SAPConfiguration
	 */
	public SAPConfiguration getSAPConfiguration(final SessionContext ctx, final BaseStore item)
	{
		return (SAPConfiguration)item.getProperty( ctx, SapcoreconfigurationConstants.Attributes.BaseStore.SAPCONFIGURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseStore.SAPConfiguration</code> attribute.
	 * @return the SAPConfiguration
	 */
	public SAPConfiguration getSAPConfiguration(final BaseStore item)
	{
		return getSAPConfiguration( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseStore.SAPConfiguration</code> attribute. 
	 * @param value the SAPConfiguration
	 */
	public void setSAPConfiguration(final SessionContext ctx, final BaseStore item, final SAPConfiguration value)
	{
		item.setProperty(ctx, SapcoreconfigurationConstants.Attributes.BaseStore.SAPCONFIGURATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseStore.SAPConfiguration</code> attribute. 
	 * @param value the SAPConfiguration
	 */
	public void setSAPConfiguration(final BaseStore item, final SAPConfiguration value)
	{
		setSAPConfiguration( getSession().getSessionContext(), item, value );
	}
	
}
