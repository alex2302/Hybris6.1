/*****************************************************************************
    Class:        DefaultReservationRequestMapper
    Copyright (c) 2015, SAP SE, Germany, All rights reserved.
 *****************************************************************************/
package com.sap.retail.oaa.commerce.services.reservation.impl;

import de.hybris.platform.core.model.order.OrderModel;

import com.sap.retail.oaa.commerce.services.constants.SapoaacommerceservicesConstants;
import com.sap.retail.oaa.commerce.services.reservation.ReservationRequestMapper;
import com.sap.retail.oaa.commerce.services.reservation.jaxb.pojos.request.ReservationAbapRequest;
import com.sap.retail.oaa.commerce.services.reservation.jaxb.pojos.request.ReservationRequest;
import com.sap.retail.oaa.commerce.services.reservation.jaxb.pojos.request.ReservationValuesRequest;



/**
 * Default Request Mapper for reservation Service.
 */
public class DefaultReservationRequestMapper implements ReservationRequestMapper
{

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.sap.retail.oaa.commerce.services.reservation.CartToReservationRequestMapper#mapCartToReservationRequest(de.
	 * hybris.platform.core.model.order.CartModel)
	 */
	@Override
	public ReservationAbapRequest mapOrderToReservationRequest(final OrderModel order)
	{
		final ReservationAbapRequest abap = new ReservationAbapRequest();
		final ReservationValuesRequest values = new ReservationValuesRequest();
		final ReservationRequest reservation = new ReservationRequest();

		reservation.setOrderId(order.getCode());
		reservation.setStatus(SapoaacommerceservicesConstants.RESERVATION_STATUS_ORDER);
		values.setReservation(reservation);
		abap.setValues(values);

		return abap;
	}
}
