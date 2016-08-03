/*****************************************************************************
    Class:        ReservationRequest
    Copyright (c) 2015, SAP SE, Germany, All rights reserved.

 *****************************************************************************/
package com.sap.retail.oaa.commerce.services.reservation.jaxb.pojos.request;

import javax.xml.bind.annotation.XmlElement;


/**
 * Jaxb Pojo for XML creation
 */
public class ReservationRequest
{
	private String orderId;
	private String status;

	public ReservationRequest()
	{
		super();
	}

	public ReservationRequest(final String orderId, final String status)
	{
		super();
		this.setOrderId(orderId);
		this.setStatus(status);
	}

	/**
	 * @return the orderId
	 */
	@XmlElement(name = "ORDER_ID")
	public String getOrderId()
	{
		return orderId;
	}

	/**
	 * @param orderId
	 *           the orderId to set
	 */
	public void setOrderId(final String orderId)
	{
		this.orderId = orderId;
	}

	/**
	 * @return the status
	 */
	@XmlElement(name = "RESV_STATUS")
	public String getStatus()
	{
		return status;
	}

	/**
	 * @param status
	 *           the status to set
	 */
	public void setStatus(final String status)
	{
		this.status = status;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "ReservationRequest [orderId=" + orderId + ", status=" + status + "]";
	}

}
