/*****************************************************************************
    Interface:		ReservationRequestMapper
    Copyright (c) 2015, SAP SE, Germany, All rights reserved.
 *****************************************************************************/
package com.sap.retail.oaa.commerce.services.reservation;

import de.hybris.platform.core.model.order.OrderModel;

import com.sap.retail.oaa.commerce.services.reservation.jaxb.pojos.request.ReservationAbapRequest;



/**
 * Request Mapper for reservation REST Service
 */
public interface ReservationRequestMapper
{

	/**
	 * Map Order model to a request for OAA reservation REST Service
	 *
	 * @param orderModel
	 * @return Abap
	 */
	ReservationAbapRequest mapOrderToReservationRequest(OrderModel orderModel);

}
