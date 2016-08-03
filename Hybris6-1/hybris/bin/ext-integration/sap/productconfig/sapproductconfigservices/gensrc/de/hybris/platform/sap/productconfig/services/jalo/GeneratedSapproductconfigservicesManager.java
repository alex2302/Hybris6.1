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
package de.hybris.platform.sap.productconfig.services.jalo;

import de.hybris.platform.catalog.jalo.classification.ClassificationAttribute;
import de.hybris.platform.catalog.jalo.classification.ClassificationAttributeValue;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.media.MediaContainer;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.sap.productconfig.services.constants.SapproductconfigservicesConstants;
import de.hybris.platform.sap.productconfig.services.jalo.CMSCartConfigurationRestriction;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>SapproductconfigservicesManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSapproductconfigservicesManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("cpqMedia", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.catalog.jalo.classification.ClassificationAttribute", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("cpqMedia", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.catalog.jalo.classification.ClassificationAttributeValue", Collections.unmodifiableMap(tmp));
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
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClassificationAttribute.cpqMedia</code> attribute.
	 * @return the cpqMedia - It is a media container with images corresponding to the characteristic
	 */
	public MediaContainer getCpqMedia(final SessionContext ctx, final ClassificationAttribute item)
	{
		return (MediaContainer)item.getProperty( ctx, SapproductconfigservicesConstants.Attributes.ClassificationAttribute.CPQMEDIA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClassificationAttribute.cpqMedia</code> attribute.
	 * @return the cpqMedia - It is a media container with images corresponding to the characteristic
	 */
	public MediaContainer getCpqMedia(final ClassificationAttribute item)
	{
		return getCpqMedia( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClassificationAttribute.cpqMedia</code> attribute. 
	 * @param value the cpqMedia - It is a media container with images corresponding to the characteristic
	 */
	public void setCpqMedia(final SessionContext ctx, final ClassificationAttribute item, final MediaContainer value)
	{
		item.setProperty(ctx, SapproductconfigservicesConstants.Attributes.ClassificationAttribute.CPQMEDIA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClassificationAttribute.cpqMedia</code> attribute. 
	 * @param value the cpqMedia - It is a media container with images corresponding to the characteristic
	 */
	public void setCpqMedia(final ClassificationAttribute item, final MediaContainer value)
	{
		setCpqMedia( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClassificationAttributeValue.cpqMedia</code> attribute.
	 * @return the cpqMedia - It is a media container with images corresponding to the value
	 */
	public MediaContainer getCpqMedia(final SessionContext ctx, final ClassificationAttributeValue item)
	{
		return (MediaContainer)item.getProperty( ctx, SapproductconfigservicesConstants.Attributes.ClassificationAttributeValue.CPQMEDIA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClassificationAttributeValue.cpqMedia</code> attribute.
	 * @return the cpqMedia - It is a media container with images corresponding to the value
	 */
	public MediaContainer getCpqMedia(final ClassificationAttributeValue item)
	{
		return getCpqMedia( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClassificationAttributeValue.cpqMedia</code> attribute. 
	 * @param value the cpqMedia - It is a media container with images corresponding to the value
	 */
	public void setCpqMedia(final SessionContext ctx, final ClassificationAttributeValue item, final MediaContainer value)
	{
		item.setProperty(ctx, SapproductconfigservicesConstants.Attributes.ClassificationAttributeValue.CPQMEDIA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClassificationAttributeValue.cpqMedia</code> attribute. 
	 * @param value the cpqMedia - It is a media container with images corresponding to the value
	 */
	public void setCpqMedia(final ClassificationAttributeValue item, final MediaContainer value)
	{
		setCpqMedia( getSession().getSessionContext(), item, value );
	}
	
	public CMSCartConfigurationRestriction createCMSCartConfigurationRestriction(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SapproductconfigservicesConstants.TC.CMSCARTCONFIGURATIONRESTRICTION );
			return (CMSCartConfigurationRestriction)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CMSCartConfigurationRestriction : "+e.getMessage(), 0 );
		}
	}
	
	public CMSCartConfigurationRestriction createCMSCartConfigurationRestriction(final Map attributeValues)
	{
		return createCMSCartConfigurationRestriction( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return SapproductconfigservicesConstants.EXTENSIONNAME;
	}
	
}
