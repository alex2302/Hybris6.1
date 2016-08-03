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
package de.hybris.platform.secureportaladdon.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.commerceservices.model.process.StoreFrontCustomerProcessModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.secureportaladdon.model.B2BRegistrationModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type B2BRegistrationProcess first defined at extension secureportaladdon.
 */
@SuppressWarnings("all")
public class B2BRegistrationProcessModel extends StoreFrontCustomerProcessModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "B2BRegistrationProcess";
	
	/** <i>Generated constant</i> - Attribute key of <code>B2BRegistrationProcess.registration</code> attribute defined at extension <code>secureportaladdon</code>. */
	public static final String REGISTRATION = "registration";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public B2BRegistrationProcessModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public B2BRegistrationProcessModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 * @param _processDefinitionName initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 */
	@Deprecated
	public B2BRegistrationProcessModel(final String _code, final String _processDefinitionName)
	{
		super();
		setCode(_code);
		setProcessDefinitionName(_processDefinitionName);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _processDefinitionName initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 */
	@Deprecated
	public B2BRegistrationProcessModel(final String _code, final ItemModel _owner, final String _processDefinitionName)
	{
		super();
		setCode(_code);
		setOwner(_owner);
		setProcessDefinitionName(_processDefinitionName);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BRegistrationProcess.registration</code> attribute defined at extension <code>secureportaladdon</code>. 
	 * @return the registration
	 */
	@Accessor(qualifier = "registration", type = Accessor.Type.GETTER)
	public B2BRegistrationModel getRegistration()
	{
		return getPersistenceContext().getPropertyValue(REGISTRATION);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>B2BRegistrationProcess.registration</code> attribute defined at extension <code>secureportaladdon</code>. 
	 *  
	 * @param value the registration
	 */
	@Accessor(qualifier = "registration", type = Accessor.Type.SETTER)
	public void setRegistration(final B2BRegistrationModel value)
	{
		getPersistenceContext().setPropertyValue(REGISTRATION, value);
	}
	
}
