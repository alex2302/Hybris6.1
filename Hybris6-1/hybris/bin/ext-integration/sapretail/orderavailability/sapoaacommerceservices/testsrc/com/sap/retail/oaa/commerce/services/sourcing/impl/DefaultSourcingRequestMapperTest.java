/**
 *
 */
package com.sap.retail.oaa.commerce.services.sourcing.impl;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.c2l.RegionModel;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.order.delivery.DeliveryModeModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.product.UnitModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.sap.core.configuration.ConfigurationPropertyAccess;
import de.hybris.platform.sap.core.configuration.impl.DefaultSAPConfigurationService;
import de.hybris.platform.storelocator.model.PointOfServiceModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.sap.retail.oaa.commerce.services.common.jaxb.pojos.request.CartItem;
import com.sap.retail.oaa.commerce.services.common.jaxb.pojos.request.CartItems;
import com.sap.retail.oaa.commerce.services.common.util.impl.DefaultServiceUtils;
import com.sap.retail.oaa.commerce.services.sourcing.exception.SourcingException;
import com.sap.retail.oaa.commerce.services.sourcing.jaxb.pojos.request.CartRequest;
import com.sap.retail.oaa.commerce.services.sourcing.jaxb.pojos.request.SourcingAbapRequest;
import com.sap.retail.oaa.commerce.services.sourcing.jaxb.pojos.request.SourcingRequest;
import com.sap.retail.oaa.commerce.services.sourcing.jaxb.pojos.request.Values;
import com.sap.retail.oaa.model.constants.SapoaamodelConstants;


/**
 * @author SAP
 *
 */
@UnitTest
public class DefaultSourcingRequestMapperTest
{
	/**
	 *
	 */
	private static final String DELIVERY_POINT_OF_SERVICE_NAME = "OAS1";
	private static final String OAA_PROFILE = "OAA_PROF";
	private static final String OAA_CONSUMER_ID = "OAA_CON";
	private static final String CART_ID = "et5qGeBzScWAghr5nAhzxg==";
	private static final String CART_GUID = "7ade6a19-e073-49c5-8082-1af99c0873c6";
	private static final String CART_ITEM_ID_1 = "000000000000000123";
	private static final String CART_ITEM_ID_2 = "000000000000000124";
	private static final Integer CART_ITEM_1_ENTRY_NO = new Integer(1);
	private static final Integer CART_ITEM_2_ENTRY_NO = new Integer(2);
	private static final String UNIT_PCE = "ST";
	private static final Long CART_ITEM_1_QTY = new Long(1);
	private static final Long CART_ITEM_2_QTY = new Long(2);
	private static final Double CART_TOTAL_PRICE = new Double(20);
	private static final Double CART_DELIVERY_COST = new Double(4);
	private static final String CART_CURRENCY = "EUR";
	private static final Double CART_ITEM_1_TOTAL_PRICE = new Double(7);
	private static final Double CART_ITEM_2_TOTAL_PRICE = new Double(9);
	private static final String DELIVERY_MODE = "ANY_DELIVERY_MODE";
	private static final String CONFIG_PROPERTY_SAP_DELIVERY_MODES = "sapDeliveryModes";

	private DefaultSourcingRequestMapper classUnderTest;
	private DefaultSAPConfigurationService sapCoreConfigurationService;

	@Before
	public void setup()
	{
		classUnderTest = new DefaultSourcingRequestMapper();

		classUnderTest.setServiceUtils(new DefaultServiceUtils());
	}

	@Test
	public void testMapCartToATPRequest()
	{
		final CartModel cartModel = new CartModel();
		cartModel.setGuid(CART_GUID);
		cartModel.setCode(CART_ID);

		cartModel.setTotalPrice(CART_TOTAL_PRICE);
		cartModel.setDeliveryCost(CART_DELIVERY_COST);

		final CurrencyModel currencyModel = new CurrencyModel();
		currencyModel.setIsocode(CART_CURRENCY);
		cartModel.setCurrency(currencyModel);

		final DeliveryModeModel deliveryModeModel = new DeliveryModeModel();
		deliveryModeModel.setCode(DELIVERY_MODE);
		cartModel.setDeliveryMode(deliveryModeModel);

		final CountryModel countryModel = new CountryModel();
		countryModel.setSapCode("TestSAPCode");
		final AddressModel addressModel = new AddressModel();
		addressModel.setCountry(countryModel);
		addressModel.setDistrict("TestDistrict");
		addressModel.setPobox("TestPobox");
		addressModel.setPostalcode("TestPobox");
		addressModel.setStreetname("TestStreetName");
		addressModel.setStreetnumber("TestStreetNumber");
		addressModel.setTown("TestTown");
		final RegionModel regionModel = new RegionModel();
		regionModel.setIsocodeShort(RegionModel.ISOCODESHORT);
		addressModel.setRegion(regionModel);
		cartModel.setDeliveryAddress(addressModel);

		final List<AbstractOrderEntryModel> entries = new ArrayList<>();

		final AbstractOrderEntryModel item1 = new AbstractOrderEntryModel();
		final ProductModel productModel1 = new ProductModel();
		productModel1.setCode(CART_ITEM_ID_1);
		final UnitModel unitModel = new UnitModel();
		unitModel.setCode(UNIT_PCE);
		item1.setEntryNumber(CART_ITEM_1_ENTRY_NO);
		item1.setProduct(productModel1);
		item1.setQuantity(CART_ITEM_1_QTY);
		item1.setUnit(unitModel);
		item1.setTotalPrice(CART_ITEM_1_TOTAL_PRICE);
		final PointOfServiceModel deliveryPointOfService = new PointOfServiceModel();
		deliveryPointOfService.setName(DELIVERY_POINT_OF_SERVICE_NAME);
		item1.setDeliveryPointOfService(deliveryPointOfService);
		entries.add(item1);

		final AbstractOrderEntryModel item2 = new AbstractOrderEntryModel();
		final ProductModel productModel2 = new ProductModel();
		productModel2.setCode(CART_ITEM_ID_2);
		item2.setEntryNumber(CART_ITEM_2_ENTRY_NO);
		item2.setProduct(productModel2);
		item2.setQuantity(CART_ITEM_2_QTY);
		item2.setUnit(unitModel);
		item2.setTotalPrice(CART_ITEM_2_TOTAL_PRICE);
		entries.add(item2);

		cartModel.setEntries(entries);

		// Partial mock for method getPropertyAccessCollection
		sapCoreConfigurationService = EasyMock.createMockBuilder(DefaultSAPConfigurationService.class)
				.addMockedMethod("getPropertyAccessCollection").createMock();
		EasyMock.expect(sapCoreConfigurationService.getPropertyAccessCollection(CONFIG_PROPERTY_SAP_DELIVERY_MODES)).andReturn(
				new ArrayList<ConfigurationPropertyAccess>());
		EasyMock.replay(sapCoreConfigurationService);

		final Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(SapoaamodelConstants.PROPERTY_SAPOAA_CONSUMERID, OAA_CONSUMER_ID);
		properties.put(SapoaamodelConstants.PROPERTY_SAPOAA_OAAPROFILE, OAA_PROFILE);
		sapCoreConfigurationService.setProperties(properties);

		classUnderTest.setSapCoreConfigurationService(sapCoreConfigurationService);


		try
		{
			final SourcingAbapRequest abapReq = classUnderTest.mapCartToSourcingRequest(cartModel, true);
			assertNotNullObjAndObjToString(abapReq);

			final Values valReq = abapReq.getValues();
			assertNotNullObjAndObjToString(valReq);

			final SourcingRequest sourcingRequest = valReq.getSourcing();
			assertNotNullObjAndObjToString(sourcingRequest);

			final CartRequest cartReq = sourcingRequest.getCart();
			assertNotNullObjAndObjToString(cartReq);

			final String cartId = cartReq.getExternalId();
			Assert.assertEquals(CART_ID, cartId);

			Assert.assertEquals(CART_TOTAL_PRICE, cartReq.getTotalPrice());
			Assert.assertEquals(CART_DELIVERY_COST, cartReq.getDeliveryCost());
			Assert.assertEquals(CART_CURRENCY, cartReq.getCurrencyIsoCode());

			final CartItems cartItems = cartReq.getItems();
			assertNotNullObjAndObjToString(cartItems);

			final List<CartItem> cartItemList = cartItems.getItems();
			assertNotNullObjAndObjToString(cartItemList);
			Assert.assertEquals(2, cartItemList.size());

			final CartItem cartItem1 = cartItemList.get(0);
			Assert.assertEquals(CART_ITEM_ID_1, cartItem1.getArticleId());
			Assert.assertEquals(CART_ITEM_1_QTY.toString(), cartItem1.getQuantity());
			final String cartGuidWoDashes = CART_GUID.replaceAll("-", "");
			Assert.assertEquals(cartGuidWoDashes + "-" + CART_ITEM_1_ENTRY_NO.toString(), cartItem1.getExternalId());
			Assert.assertEquals(CART_ITEM_1_TOTAL_PRICE, cartItem1.getItemTotalPrice());
			Assert.assertEquals(DELIVERY_POINT_OF_SERVICE_NAME, cartItem1.getSource());
			Assert.assertEquals(cartItem1.getSourcePreselected(), "X");

			final CartItem cartItem2 = cartItemList.get(1);
			Assert.assertEquals(CART_ITEM_ID_2, cartItem2.getArticleId());
			Assert.assertEquals(CART_ITEM_2_QTY.toString(), cartItem2.getQuantity());
			Assert.assertEquals(cartGuidWoDashes + "-" + CART_ITEM_2_ENTRY_NO.toString(), cartItem2.getExternalId());
			Assert.assertEquals(CART_ITEM_2_TOTAL_PRICE, cartItem2.getItemTotalPrice());
			Assert.assertNull(cartItem2.getSource());
			Assert.assertNull(cartItem2.getSourcePreselected());

		}
		catch (final SourcingException e)
		{
			Assert.fail("No Exception expected, but it was: " + e.getMessage());
		}
	}

	@Test
	public void mapCartToSourcingRequestExceptionTest()
	{
		final CartModel cartModel = new CartModel();


		// Partial mock for method getPropertyAccessCollection
		sapCoreConfigurationService = EasyMock.createMockBuilder(DefaultSAPConfigurationService.class)
				.addMockedMethod("getPropertyAccessCollection").createMock();
		EasyMock.expect(sapCoreConfigurationService.getPropertyAccessCollection(CONFIG_PROPERTY_SAP_DELIVERY_MODES))
				.andReturn(new ArrayList<ConfigurationPropertyAccess>()).anyTimes();
		EasyMock.replay(sapCoreConfigurationService);

		final Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(SapoaamodelConstants.PROPERTY_SAPOAA_CONSUMERID, OAA_CONSUMER_ID);
		sapCoreConfigurationService.setProperties(properties);
		classUnderTest.setSapCoreConfigurationService(sapCoreConfigurationService);

		assertMapCartToSourcingRequestException(cartModel);

		properties.clear();
		properties.put(SapoaamodelConstants.PROPERTY_SAPOAA_OAAPROFILE, OAA_PROFILE);

		assertMapCartToSourcingRequestException(cartModel);

		properties.clear();
		properties.put(SapoaamodelConstants.PROPERTY_SAPOAA_OAAPROFILE, OAA_PROFILE);
		properties.put(SapoaamodelConstants.PROPERTY_SAPOAA_CONSUMERID, OAA_CONSUMER_ID);
		cartModel.setGuid("AWrongCartGUID!!!");

		assertMapCartToSourcingRequestException(cartModel);
	}

	private void assertMapCartToSourcingRequestException(final CartModel cartModel)
	{
		try
		{
			classUnderTest.mapCartToSourcingRequest(cartModel, false);
			Assert.fail("SourcingException expected, but no Exception is thrown.");
		}
		catch (final SourcingException e)
		{
			Assert.assertNotNull(e.getMessage());
		}
	}

	private void assertNotNullObjAndObjToString(final Object obj)
	{
		Assert.assertNotNull(obj);
		Assert.assertNotNull(obj.toString());
	}

}
