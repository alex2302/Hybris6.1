/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE or an SAP affiliate company.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 *
 *
 */
package de.hybris.platform.assistedserviceservices.utils;

import de.hybris.platform.core.model.user.UserModel;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;


/**
 * Class represents Assisted Service emulation parameters.
 */
public class AssistedServiceSession
{
	private final Map asmSessionParams = new HashMap<String, String>();
	private String flashErrorMessage = null;
	private String flashErrorMessageArgs = null;

	public Map<String, Object> getAsmSessionParametersMap()
	{
		return Collections.unmodifiableMap(asmSessionParams);
	}

	public UserModel getAgent()
	{
		return (UserModel) asmSessionParams.get(AGENT);
	}

	public void setAgent(final UserModel agent)
	{
		asmSessionParams.put(AGENT, agent);
	}

	public UserModel getEmulatedCustomer()
	{
		return (UserModel) asmSessionParams.get(EMULATED_CUSTOMER);
	}

	public void setEmulatedCustomer(final UserModel emulatedCustomer)
	{
		asmSessionParams.put(EMULATED_CUSTOMER, emulatedCustomer);
	}

	public void setSavedEmulationData(final CustomerEmulationParams emulationParams)
	{
		asmSessionParams.put(EMULATION_PARAM, emulationParams);
		if (emulationParams == null)
		{
			asmSessionParams.remove("customerId");
			asmSessionParams.remove("customerName");
			asmSessionParams.remove("cartId");
		}
		else
		{
			asmSessionParams.put("customerId", emulationParams.getUserId());
			asmSessionParams.put("customerName", emulationParams.getUserId());
			asmSessionParams.put("cartId", emulationParams.getCartId());
		}
	}

	public CustomerEmulationParams getSavedEmulationData()
	{
		return (CustomerEmulationParams) asmSessionParams.get(EMULATION_PARAM);
	}

	public void setInitialAgentAuthorities(final Collection<? extends GrantedAuthority> authorities)
	{
		asmSessionParams.put(INITIAL_AGENT_AUTHORITIES, authorities);
	}

	public Collection<? extends GrantedAuthority> getInitialAgentAuthorities()
	{
		return (Collection<? extends GrantedAuthority>) asmSessionParams.get(INITIAL_AGENT_AUTHORITIES);
	}

	public void setFlashErrorMessage(final String flashErrorMessage)
	{
		this.flashErrorMessage = flashErrorMessage;
	}

	public String getFlashErrorMessage()
	{
		final String flashErrorMessage = this.flashErrorMessage == null ? null : new String(this.flashErrorMessage);
		this.flashErrorMessage = null;
		return flashErrorMessage;
	}

	/**
	 * @return the flashErrorMessageArgs
	 */
	public String getFlashErrorMessageArgs()
	{
		final String flashErrorMessageArgs = this.flashErrorMessageArgs == null ? null : new String(this.flashErrorMessageArgs);
		this.flashErrorMessageArgs = null;
		return flashErrorMessageArgs;
	}

	/**
	 * @param flashErrorMessageArgs
	 *           the flashErrorMessageArgs to set
	 */
	public void setFlashErrorMessageArgs(final String flashErrorMessageArgs)
	{
		this.flashErrorMessageArgs = flashErrorMessageArgs;
	}

	public static final String AGENT = "agent";
	public static final String EMULATED_CUSTOMER = "emulatedUser";
	public static final String EMULATION_PARAM = "emulationParams";
	public static final String INITIAL_AGENT_AUTHORITIES = "initialAgentAuthorities";


}