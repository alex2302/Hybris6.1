/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 31, 2016 4:07:33 PM                     ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.sapcustomerb2b.jalo;

import com.sap.hybris.sapcustomerb2b.constants.Sapcustomerb2bConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>Sapcustomerb2bManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSapcustomerb2bManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("replicateregisteredb2buser", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.sap.core.configuration.jalo.SAPConfiguration", Collections.unmodifiableMap(tmp));
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
	
	@Override
	public String getName()
	{
		return Sapcustomerb2bConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.replicateregisteredb2buser</code> attribute.
	 * @return the replicateregisteredb2buser - Replicate Registered B2B Users
	 */
	public Boolean isReplicateregisteredb2buser(final SessionContext ctx, final GenericItem item)
	{
		return (Boolean)item.getProperty( ctx, Sapcustomerb2bConstants.Attributes.SAPConfiguration.REPLICATEREGISTEREDB2BUSER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.replicateregisteredb2buser</code> attribute.
	 * @return the replicateregisteredb2buser - Replicate Registered B2B Users
	 */
	public Boolean isReplicateregisteredb2buser(final SAPConfiguration item)
	{
		return isReplicateregisteredb2buser( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.replicateregisteredb2buser</code> attribute. 
	 * @return the replicateregisteredb2buser - Replicate Registered B2B Users
	 */
	public boolean isReplicateregisteredb2buserAsPrimitive(final SessionContext ctx, final SAPConfiguration item)
	{
		Boolean value = isReplicateregisteredb2buser( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.replicateregisteredb2buser</code> attribute. 
	 * @return the replicateregisteredb2buser - Replicate Registered B2B Users
	 */
	public boolean isReplicateregisteredb2buserAsPrimitive(final SAPConfiguration item)
	{
		return isReplicateregisteredb2buserAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.replicateregisteredb2buser</code> attribute. 
	 * @param value the replicateregisteredb2buser - Replicate Registered B2B Users
	 */
	public void setReplicateregisteredb2buser(final SessionContext ctx, final GenericItem item, final Boolean value)
	{
		item.setProperty(ctx, Sapcustomerb2bConstants.Attributes.SAPConfiguration.REPLICATEREGISTEREDB2BUSER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.replicateregisteredb2buser</code> attribute. 
	 * @param value the replicateregisteredb2buser - Replicate Registered B2B Users
	 */
	public void setReplicateregisteredb2buser(final SAPConfiguration item, final Boolean value)
	{
		setReplicateregisteredb2buser( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.replicateregisteredb2buser</code> attribute. 
	 * @param value the replicateregisteredb2buser - Replicate Registered B2B Users
	 */
	public void setReplicateregisteredb2buser(final SessionContext ctx, final SAPConfiguration item, final boolean value)
	{
		setReplicateregisteredb2buser( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPConfiguration.replicateregisteredb2buser</code> attribute. 
	 * @param value the replicateregisteredb2buser - Replicate Registered B2B Users
	 */
	public void setReplicateregisteredb2buser(final SAPConfiguration item, final boolean value)
	{
		setReplicateregisteredb2buser( getSession().getSessionContext(), item, value );
	}
	
}
