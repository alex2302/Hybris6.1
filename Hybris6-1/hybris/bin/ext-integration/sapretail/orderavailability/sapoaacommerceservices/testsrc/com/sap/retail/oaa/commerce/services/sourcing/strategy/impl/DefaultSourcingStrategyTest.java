/**
 *
 */
package com.sap.retail.oaa.commerce.services.sourcing.strategy.impl;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.order.CartModel;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.sap.retail.oaa.commerce.services.sourcing.SourcingService;
import com.sap.retail.oaa.commerce.services.sourcing.exception.SourcingException;


/**
 * @author SAP
 *
 */
@UnitTest
public class DefaultSourcingStrategyTest
{
	private DefaultSourcingStrategy classUnderTest;

	@Before
	public void setup()
	{
		classUnderTest = new DefaultSourcingStrategy();




	}


	@Test
	public void testdoSourcing_True()
	{
		final SourcingService sourcingServiceMock = EasyMock.createNiceMock(SourcingService.class);
		sourcingServiceMock.callRestServiceAndPersistResult(EasyMock.anyObject(CartModel.class));
		EasyMock.expectLastCall();
		EasyMock.replay(sourcingServiceMock);


		classUnderTest.setSourcingService(sourcingServiceMock);

		final CartModel cartModel = new CartModel();
		Assert.assertTrue(classUnderTest.doSourcing(cartModel));
	}

	@Test
	public void testdoSourcing_False()
	{

		final SourcingService sourcingServiceMock = EasyMock.createNiceMock(SourcingService.class);
		sourcingServiceMock.callRestServiceAndPersistResult(EasyMock.anyObject(CartModel.class));
		EasyMock.expectLastCall().andThrow(new SourcingException());
		EasyMock.replay(sourcingServiceMock);

		classUnderTest.setSourcingService(sourcingServiceMock);

		final CartModel cartModel = new CartModel();
		Assert.assertFalse(classUnderTest.doSourcing(cartModel));
	}



}
