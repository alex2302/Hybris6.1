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
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.sap.core.configuration.constants.SapcoreconfigurationConstants;
import de.hybris.platform.sap.core.configuration.jalo.SAPRFCDestination;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem RFCDestinationAttribute}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRFCDestinationAttribute extends GenericItem
{
	/** Qualifier of the <code>RFCDestinationAttribute.jcoattr_name</code> attribute **/
	public static final String JCOATTR_NAME = "jcoattr_name";
	/** Qualifier of the <code>RFCDestinationAttribute.jcoattr_value</code> attribute **/
	public static final String JCOATTR_VALUE = "jcoattr_value";
	/** Qualifier of the <code>RFCDestinationAttribute.SAPRFCDestination</code> attribute **/
	public static final String SAPRFCDESTINATION = "SAPRFCDestination";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SAPRFCDESTINATION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedRFCDestinationAttribute> SAPRFCDESTINATIONHANDLER = new BidirectionalOneToManyHandler<GeneratedRFCDestinationAttribute>(
	SapcoreconfigurationConstants.TC.RFCDESTINATIONATTRIBUTE,
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
		tmp.put(JCOATTR_NAME, AttributeMode.INITIAL);
		tmp.put(JCOATTR_VALUE, AttributeMode.INITIAL);
		tmp.put(SAPRFCDESTINATION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		SAPRFCDESTINATIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RFCDestinationAttribute.jcoattr_name</code> attribute.
	 * @return the jcoattr_name - Name
	 */
	public String getJcoattr_name(final SessionContext ctx)
	{
		return (String)getProperty( ctx, JCOATTR_NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RFCDestinationAttribute.jcoattr_name</code> attribute.
	 * @return the jcoattr_name - Name
	 */
	public String getJcoattr_name()
	{
		return getJcoattr_name( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RFCDestinationAttribute.jcoattr_name</code> attribute. 
	 * @param value the jcoattr_name - Name
	 */
	public void setJcoattr_name(final SessionContext ctx, final String value)
	{
		setProperty(ctx, JCOATTR_NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RFCDestinationAttribute.jcoattr_name</code> attribute. 
	 * @param value the jcoattr_name - Name
	 */
	public void setJcoattr_name(final String value)
	{
		setJcoattr_name( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RFCDestinationAttribute.jcoattr_value</code> attribute.
	 * @return the jcoattr_value - Value
	 */
	public String getJcoattr_value(final SessionContext ctx)
	{
		return (String)getProperty( ctx, JCOATTR_VALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RFCDestinationAttribute.jcoattr_value</code> attribute.
	 * @return the jcoattr_value - Value
	 */
	public String getJcoattr_value()
	{
		return getJcoattr_value( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RFCDestinationAttribute.jcoattr_value</code> attribute. 
	 * @param value the jcoattr_value - Value
	 */
	public void setJcoattr_value(final SessionContext ctx, final String value)
	{
		setProperty(ctx, JCOATTR_VALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RFCDestinationAttribute.jcoattr_value</code> attribute. 
	 * @param value the jcoattr_value - Value
	 */
	public void setJcoattr_value(final String value)
	{
		setJcoattr_value( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RFCDestinationAttribute.SAPRFCDestination</code> attribute.
	 * @return the SAPRFCDestination
	 */
	public SAPRFCDestination getSAPRFCDestination(final SessionContext ctx)
	{
		return (SAPRFCDestination)getProperty( ctx, SAPRFCDESTINATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RFCDestinationAttribute.SAPRFCDestination</code> attribute.
	 * @return the SAPRFCDestination
	 */
	public SAPRFCDestination getSAPRFCDestination()
	{
		return getSAPRFCDestination( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RFCDestinationAttribute.SAPRFCDestination</code> attribute. 
	 * @param value the SAPRFCDestination
	 */
	public void setSAPRFCDestination(final SessionContext ctx, final SAPRFCDestination value)
	{
		SAPRFCDESTINATIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RFCDestinationAttribute.SAPRFCDestination</code> attribute. 
	 * @param value the SAPRFCDestination
	 */
	public void setSAPRFCDestination(final SAPRFCDestination value)
	{
		setSAPRFCDestination( getSession().getSessionContext(), value );
	}
	
}
