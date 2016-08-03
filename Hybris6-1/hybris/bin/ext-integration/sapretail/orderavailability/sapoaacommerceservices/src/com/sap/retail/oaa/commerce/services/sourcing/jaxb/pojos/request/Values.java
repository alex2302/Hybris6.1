/*****************************************************************************
    Class:        Values
    Copyright (c) 2015, SAP SE, Germany, All rights reserved.

 *****************************************************************************/
package com.sap.retail.oaa.commerce.services.sourcing.jaxb.pojos.request;

import javax.xml.bind.annotation.XmlElement;


/**
 * Jaxb Pojo for XML creation
 */
public class Values
{
	private SourcingRequest sourcing;

	public Values()
	{
		super();
	}

	/**
	 * @param sourcing
	 */
	public Values(final SourcingRequest sourcing)
	{
		super();
		this.sourcing = sourcing;
	}

	@XmlElement(name = "SOURCING")
	public SourcingRequest getSourcing()
	{
		return sourcing;
	}

	/**
	 * @param sourcing
	 *           the sourcing to set
	 */
	public void setSourcing(final SourcingRequest sourcing)
	{
		this.sourcing = sourcing;
	}

	@Override
	public String toString()
	{
		return "Values [sourcing=" + sourcing.toString() + "]";
	}

}
