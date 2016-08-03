/*****************************************************************************
    Class:        SourcingResultCartItemResponse
    Copyright (c) 2015, SAP SE, Germany, All rights reserved.

 *****************************************************************************/
package com.sap.retail.oaa.commerce.services.sourcing.jaxb.pojos.response;

import javax.xml.bind.annotation.XmlElement;


/**
 * Jaxb Pojo for XML reading
 */
public class SourcingResultCartItemResponse
{
	private String externalId;
	private String source;
	private AvailabilityResponse availability;

	@XmlElement(name = "EXTERNAL_ID")
	public String getExternalId()
	{
		return externalId;
	}

	/**
	 * @param externalId
	 *           the externalId to set
	 */
	public void setExternalId(final String externalId)
	{
		this.externalId = externalId;
	}

	@XmlElement(name = "SOURCE")
	public String getSource()
	{
		return source;
	}

	/**
	 * @param source
	 *           the source to set
	 */
	public void setSource(final String source)
	{
		this.source = source;
	}

	@XmlElement(name = "AVAILABILITY")
	public AvailabilityResponse getAvailability()
	{
		return availability;
	}

	/**
	 * @param availability
	 *           the availability to set
	 */
	public void setAvailability(final AvailabilityResponse availability)
	{
		this.availability = availability;
	}
}
