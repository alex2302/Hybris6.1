/*****************************************************************************
    Class:        SourcingRequest
    Copyright (c) 2015, SAP SE, Germany, All rights reserved.

 *****************************************************************************/
package com.sap.retail.oaa.commerce.services.sourcing.jaxb.pojos.request;

import javax.xml.bind.annotation.XmlElement;


/**
 * Jaxb Pojo for XML creation
 */
public class SourcingRequest
{
	private String oaaProfileId;
	private String consumerId;
	private String reservationStatus;
	private CartRequest cart;
	private String execAllStrategies = "";

	public SourcingRequest()
	{
		super();
	}

	public SourcingRequest(final String oaaProfileId, final String consumerId, final String reservationStatus,
			final CartRequest cart)
	{
		super();
		this.oaaProfileId = oaaProfileId;
		this.consumerId = consumerId;
		this.reservationStatus = reservationStatus;
		this.cart = cart;
	}

	@XmlElement(name = "OAA_PROFILE_ID")
	public String getOaaProfileId()
	{
		return oaaProfileId;
	}

	/**
	 * @param oaaProfileId
	 *           the oaaProfileId to set
	 */
	public void setOaaProfileId(final String oaaProfileId)
	{
		this.oaaProfileId = oaaProfileId;
	}

	@XmlElement(name = "CONSUMER_ID")
	public String getConsumerId()
	{
		return consumerId;
	}

	/**
	 * @param consumerId
	 *           the consumerId to set
	 */
	public void setConsumerId(final String consumerId)
	{
		this.consumerId = consumerId;
	}

	@XmlElement(name = "RESERVATION_STATUS")
	public String getReservationStatus()
	{
		return reservationStatus;
	}

	/**
	 * @param reservationStatus
	 *           the reservationStatus to set
	 */
	public void setReservationStatus(final String reservationStatus)
	{
		this.reservationStatus = reservationStatus;
	}

	@XmlElement(name = "CART")
	public CartRequest getCart()
	{
		return cart;
	}

	/**
	 * @param cart
	 *           the cart to set
	 */
	public void setCart(final CartRequest cart)
	{
		this.cart = cart;
	}

	@XmlElement(name = "EXEC_ALL_STRATEGIES")
	public String getExecAllStrategies()
	{
		return execAllStrategies;
	}

	/**
	 * @param execAllStrategies
	 *           the execAllStrategies to set
	 */
	public void setExecAllStrategies(final String execAllStrategies)
	{
		this.execAllStrategies = execAllStrategies;
	}

	@Override
	public String toString()
	{
		return "Sourcing [oaaProfileId=" + oaaProfileId + ", consumerId=" + consumerId + ", reservationStatus=" + reservationStatus
				+ ", execAllStrategies='" + execAllStrategies + "', cart=" + cart.toString() + "]";
	}

}
