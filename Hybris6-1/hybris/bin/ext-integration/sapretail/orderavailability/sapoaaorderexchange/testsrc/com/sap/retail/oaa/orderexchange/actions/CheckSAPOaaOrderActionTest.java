package com.sap.retail.oaa.orderexchange.actions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.orderprocessing.model.OrderProcessModel;
import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction.Transition;
import de.hybris.platform.servicelayer.model.ModelService;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import com.sap.retail.oaa.commerce.services.reservation.exception.ReservationException;
import com.sap.retail.oaa.commerce.services.reservation.impl.DefaultReservationService;


@UnitTest
@SuppressWarnings("javadoc")
public class CheckSAPOaaOrderActionTest
{
	private CheckSAPOaaOrderAction classUnderTest;

	@Before
	public void setup()
	{
		this.classUnderTest = new CheckSAPOaaOrderAction();
	}

	@Test
	/** Test should fail as order is null and hence parent action CheckSAPOrderAction will fail (Transition.NOK). */
	public void testParentActionNOK()
	{
		final OrderProcessModel process = new OrderProcessModel();

		final DefaultReservationService reservationServiceMock = EasyMock.createNiceMock(DefaultReservationService.class);
		classUnderTest.setReservationService(reservationServiceMock);
		assertNotNull(classUnderTest.getReservationService());

		assertEquals(Transition.NOK, classUnderTest.executeAction(process));
	}


	@Test
	/** Test should fail due to error with reservation service. */
	public void testErrorReservationService()
	{
		final OrderProcessModel process = new OrderProcessModel();

		final OrderModel order = new OrderModel();
		process.setOrder(order);

		final ModelService modelServiceMock = EasyMock.createNiceMock(ModelService.class);
		EasyMock.replay(modelServiceMock);
		classUnderTest.setModelService(modelServiceMock);

		final DefaultReservationService reservationServiceMock = EasyMock.createNiceMock(DefaultReservationService.class);
		reservationServiceMock.callRestService(order);
		EasyMock.expectLastCall().andThrow(new ReservationException("Error Reservation Service"));
		EasyMock.replay(reservationServiceMock);
		classUnderTest.setReservationService(reservationServiceMock);

		assertEquals(Transition.NOK, classUnderTest.executeAction(process));
	}

	@Test
	/** Should test successful CheckSAPOaaOrderAction (Transition.OK). */
	public void testSuccess()
	{
		final OrderProcessModel process = new OrderProcessModel();

		final OrderModel order = new OrderModel();
		process.setOrder(order);

		final ModelService modelServiceMock = EasyMock.createNiceMock(ModelService.class);
		EasyMock.replay(modelServiceMock);
		classUnderTest.setModelService(modelServiceMock);

		final DefaultReservationService reservationServiceMock = EasyMock.createNiceMock(DefaultReservationService.class);
		EasyMock.replay(reservationServiceMock);
		classUnderTest.setReservationService(reservationServiceMock);

		assertEquals(Transition.OK, classUnderTest.executeAction(process));
	}

}
