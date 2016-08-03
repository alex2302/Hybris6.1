/**
 *
 */
package com.sap.retail.oaa.commerce.services.order.impl;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.order.CartEntryModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.order.CartService;

import java.util.ArrayList;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.sap.retail.oaa.commerce.services.order.SapOaaCartAdjustmentStrategy;


/**
 * @author SAP
 *
 */
@UnitTest
public class DefaultSapOaaCommerceUpdateCartEntryStrategyTest
{
	private DefaultSapOaaCommerceUpdateCartEntryStrategy classUnderTest = null;

	@Before
	public void setup()
	{
		classUnderTest = new DefaultSapOaaCommerceUpdateCartEntryStrategy();
	}

	@Test
	public void getAllowedCartAdjustmentForProductTest()
	{
		final long qtyToAdd = 10;
		final Long stockAvailQty = new Long("5");
		final CartModel cartModel = new CartModel();
		final ProductModel productModel = new ProductModel();

		// Mock the CartService because of usage in checkCartLevel()-method
		final CartService cartServiceMock = EasyMock.createNiceMock(CartService.class);
		EasyMock.expect(cartServiceMock.getEntriesForProduct(cartModel, productModel)).andReturn(new ArrayList<CartEntryModel>());
		EasyMock.replay(cartServiceMock);
		classUnderTest.setCartService(cartServiceMock);

		// Create OaaCartAdjustmentStrategyMock
		final SapOaaCartAdjustmentStrategy oaaCartAdjustmentStrategyMock = EasyMock
				.createNiceMock(SapOaaCartAdjustmentStrategy.class);
		EasyMock.expect(
				oaaCartAdjustmentStrategyMock.determineAllowedCartAdjustmentForProduct(cartModel, productModel, qtyToAdd, 0, null))
				.andReturn(stockAvailQty);
		EasyMock.replay(oaaCartAdjustmentStrategyMock);
		classUnderTest.setOaaCartAdjustmentStrategy(oaaCartAdjustmentStrategyMock);


		final long actualAllowedQty = classUnderTest.getAllowedCartAdjustmentForProduct(cartModel, productModel, qtyToAdd, null);

		Assert.assertEquals(stockAvailQty.longValue(), actualAllowedQty);
	}
}
