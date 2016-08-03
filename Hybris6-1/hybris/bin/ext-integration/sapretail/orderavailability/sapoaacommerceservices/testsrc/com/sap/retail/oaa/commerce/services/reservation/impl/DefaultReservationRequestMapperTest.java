/**
 *
 */
package com.sap.retail.oaa.commerce.services.reservation.impl;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.order.OrderModel;

import org.junit.Assert;
import org.junit.Test;

import com.sap.retail.oaa.commerce.services.reservation.jaxb.pojos.request.ReservationAbapRequest;



/**
 * @author SAP
 *
 */
@UnitTest
public class DefaultReservationRequestMapperTest
{

	private final DefaultReservationRequestMapper classUnderTest = new DefaultReservationRequestMapper();

	@Test
	public void testMapOrderToReservationRequest()
	{
		final OrderModel order = new OrderModel();
		order.setCode("123");
		final ReservationAbapRequest rootObject = classUnderTest.mapOrderToReservationRequest(order);

		Assert.assertEquals("123", rootObject.getValues().getReservation().getOrderId());
		Assert.assertEquals("O", rootObject.getValues().getReservation().getStatus());

	}

}
