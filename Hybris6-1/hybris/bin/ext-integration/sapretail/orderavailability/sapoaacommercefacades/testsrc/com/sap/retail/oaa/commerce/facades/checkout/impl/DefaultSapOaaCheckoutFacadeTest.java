/**
 *
 */
package com.sap.retail.oaa.commerce.facades.checkout.impl;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.order.CartModel;

import org.easymock.EasyMock;
import org.junit.Test;

import com.sap.retail.oaa.commerce.services.sourcing.strategy.SourcingStrategy;


/**
 * @author SAP
 *
 */
@UnitTest
public class DefaultSapOaaCheckoutFacadeTest
{

	private DefaultSapOaaCheckoutFacade classUnderTest;


	@Test
	public void soSourcingForSessionCart()
	{

		classUnderTest = EasyMock.createMockBuilder(DefaultSapOaaCheckoutFacade.class).addMockedMethod("getCart").createMock();
		EasyMock.expect(classUnderTest.getCart()).andReturn(new CartModel());
		EasyMock.replay(classUnderTest);

		final SourcingStrategy sourcingStrategyMock = EasyMock.createNiceMock(SourcingStrategy.class);
		EasyMock.expect(Boolean.valueOf(sourcingStrategyMock.doSourcing(EasyMock.anyObject(CartModel.class))))
				.andReturn(new Boolean(true));
		EasyMock.replay(sourcingStrategyMock);

		EasyMock.createMockBuilder(DefaultSapOaaCheckoutFacade.class);


		classUnderTest.setSourcingStrategy(sourcingStrategyMock);

		classUnderTest.doSourcingForSessionCart();

	}


}
