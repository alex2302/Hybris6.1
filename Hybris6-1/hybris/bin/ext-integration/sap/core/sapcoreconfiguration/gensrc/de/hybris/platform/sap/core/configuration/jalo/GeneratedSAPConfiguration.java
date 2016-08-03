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

import de.hybris.platform.basecommerce.constants.BasecommerceConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.sap.core.configuration.constants.SapcoreconfigurationConstants;
import de.hybris.platform.sap.core.configuration.jalo.SAPRFCDestination;
import de.hybris.platform.store.BaseStore;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem SAPConfiguration}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSAPConfiguration extends GenericItem
{
	/** Qualifier of the <code>SAPConfiguration.core_name</code> attribute **/
	public static final String CORE_NAME = "core_name";
	/** Qualifier of the <code>SAPConfiguration.baseStores</code> attribute **/
	public static final String BASESTORES = "baseStores";
	/** Qualifier of the <code>SAPConfiguration.SAPRFCDestination</code> attribute **/
	public static final String SAPRFCDESTINATION = "SAPRFCDestination";
	/**
	* {@link OneToManyHandler} for handling 1:n BASESTORES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BaseStore> BASESTORESHANDLER = new OneToManyHandler<BaseStore>(
	BasecommerceConstants.TC.BASESTORE,
	false,
	"SAPConfiguration",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SAPRFCDESTINATION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSAPConfiguration> SAPRFCDESTINATIONHANDLER = new BidirectionalOneToManyHandler<GeneratedSAPConfiguration>(
	SapcoreconfigurationConstants.TC.SAPCONFIGURATION,
	false,
	"SAPRFCDestination",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CORE_NAME, AttributeMode.INITIAL);
		tmp.put(SAPRFCDESTINATION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.baseStores</code> attribute.
	 * @return the baseStores
	 */
	public Collection<BaseStore> getBaseStores(final SessionContext ctx)
	{
		return BASESTORESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.baseStores</code> attribute.
	 * @return the baseStores
	 */
	public Collection<BaseStore> getBaseStores()
	{
		return getBaseStores( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.baseStores</code> attribute. 
	 * @param value the baseStores
	 */
	public void setBaseStores(final SessionContext ctx, final Collection<BaseStore> value)
	{
		BASESTORESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.baseStores</code> attribute. 
	 * @param value the baseStores
	 */
	public void setBaseStores(final Collection<BaseStore> value)
	{
		setBaseStores( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to baseStores. 
	 * @param value the item to add to baseStores
	 */
	public void addToBaseStores(final SessionContext ctx, final BaseStore value)
	{
		BASESTORESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to baseStores. 
	 * @param value the item to add to baseStores
	 */
	public void addToBaseStores(final BaseStore value)
	{
		addToBaseStores( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from baseStores. 
	 * @param value the item to remove from baseStores
	 */
	public void removeFromBaseStores(final SessionContext ctx, final BaseStore value)
	{
		BASESTORESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from baseStores. 
	 * @param value the item to remove from baseStores
	 */
	public void removeFromBaseStores(final BaseStore value)
	{
		removeFromBaseStores( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.core_name</code> attribute.
	 * @return the core_name - Name
	 */
	public String getCore_name(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CORE_NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.core_name</code> attribute.
	 * @return the core_name - Name
	 */
	public String getCore_name()
	{
		return getCore_name( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.core_name</code> attribute. 
	 * @param value the core_name - Name
	 */
	public void setCore_name(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CORE_NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.core_name</code> attribute. 
	 * @param value the core_name - Name
	 */
	public void setCore_name(final String value)
	{
		setCore_name( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		SAPRFCDESTINATIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.SAPRFCDestination</code> attribute.
	 * @return the SAPRFCDestination
	 */
	public SAPRFCDestination getSAPRFCDestination(final SessionContext ctx)
	{
		return (SAPRFCDestination)getProperty( ctx, SAPRFCDESTINATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.SAPRFCDestination</code> attribute.
	 * @return the SAPRFCDestination
	 */
	public SAPRFCDestination getSAPRFCDestination()
	{
		return getSAPRFCDestination( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.SAPRFCDestination</code> attribute. 
	 * @param value the SAPRFCDestination
	 */
	public void setSAPRFCDestination(final SessionContext ctx, final SAPRFCDestination value)
	{
		SAPRFCDESTINATIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.SAPRFCDestination</code> attribute. 
	 * @param value the SAPRFCDestination
	 */
	public void setSAPRFCDestination(final SAPRFCDestination value)
	{
		setSAPRFCDestination( getSession().getSessionContext(), value );
	}
	
}
