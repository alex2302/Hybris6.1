/**
 *
 */
package com.sap.retail.oaa.orderexchange.actions;

import de.hybris.platform.orderprocessing.model.OrderProcessModel;
import de.hybris.platform.sap.yorderfulfillment.actions.CheckSAPOrderAction;

import org.apache.log4j.Logger;

import com.sap.retail.oaa.commerce.services.reservation.ReservationService;
import com.sap.retail.oaa.commerce.services.reservation.exception.ReservationException;


/**
 * This OAA specific action is derived from CheckSAPOrderAction. It updates the temporary reservation in CAR with the
 * order id and changes the reservation form 'C' (Cart) to 'O' (Order).
 */
public class CheckSAPOaaOrderAction extends CheckSAPOrderAction
{
	private static final Logger LOG = Logger.getLogger(CheckSAPOaaOrderAction.class);


	private ReservationService reservationService;

	public ReservationService getReservationService()
	{
		return reservationService;
	}

	public void setReservationService(final ReservationService reservationService)
	{
		this.reservationService = reservationService;
	}


	@Override
	public Transition executeAction(final OrderProcessModel process)
	{
		// call parent action
		if (super.executeAction(process) == Transition.NOK)
		{
			return Transition.NOK;
		}

		// hybris order was persisted -> update temporay reservation with status 'O' (Order)
		try
		{
			reservationService.callRestService(process.getOrder());
		}
		catch (final ReservationException e)
		{
			LOG.error("Error when updating OAA reservations", e);
			return Transition.NOK;
		}
		return Transition.OK;
	}

}
