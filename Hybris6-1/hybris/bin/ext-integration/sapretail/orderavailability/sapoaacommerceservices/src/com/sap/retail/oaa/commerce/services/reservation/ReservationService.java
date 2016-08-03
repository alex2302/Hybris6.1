package com.sap.retail.oaa.commerce.services.reservation;

import de.hybris.platform.core.model.order.OrderModel;

import com.sap.retail.oaa.commerce.services.reservation.exception.ReservationException;
import com.sap.retail.oaa.commerce.services.reservation.jaxb.pojos.response.ReservationResponse;



/**
 * Reservation Service which calls the OAA reservation service to update a reservation to an order, after the order is
 * confirmed.
 */
public interface ReservationService
{

	/**
	 * Call the REST service to update the temporary reservation and return reservation response.
	 *
	 * @param order
	 * @return reservationResponse
	 */
	ReservationResponse callRestService(final OrderModel order) throws ReservationException;

}
