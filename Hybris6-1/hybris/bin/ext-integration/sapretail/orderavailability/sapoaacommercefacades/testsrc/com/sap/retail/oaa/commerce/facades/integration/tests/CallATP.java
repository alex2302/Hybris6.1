/**
 *
 */
package com.sap.retail.oaa.commerce.facades.integration.tests;

import static org.junit.Assert.assertNotNull;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.commercefacades.order.CartFacade;
import de.hybris.platform.commercefacades.order.data.CartModificationData;
import de.hybris.platform.commercefacades.order.impl.DefaultCartFacade;
import de.hybris.platform.commercefacades.product.PriceDataFactory;
import de.hybris.platform.commerceservices.delivery.DeliveryService;
import de.hybris.platform.commerceservices.enums.PickupInStoreMode;
import de.hybris.platform.commerceservices.order.CommerceCartModificationException;
import de.hybris.platform.commerceservices.order.CommerceCartService;
import de.hybris.platform.commerceservices.order.impl.DefaultCommerceCartService;
import de.hybris.platform.commerceservices.util.GuidKeyGenerator;
import de.hybris.platform.core.Registry;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.impex.jalo.ImpExException;
import de.hybris.platform.order.CartService;
import de.hybris.platform.product.ProductService;
import de.hybris.platform.product.UnitService;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.site.BaseSiteService;
import de.hybris.platform.store.BaseStoreModel;
import de.hybris.platform.store.services.BaseStoreService;
import de.hybris.platform.storelocator.pos.PointOfServiceService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sap.retail.oaa.commerce.services.order.impl.DefaultSapOaaCommerceAddToCartStrategy;
import com.sap.retail.oaa.commerce.services.order.impl.DefaultSapOaaCommerceUpdateCartEntryStrategy;
import com.sap.retail.oaa.commerce.services.strategies.impl.DefaultSapOaaCartValidationStrategy;


/**
 * @author SAP
 *
 */
@IntegrationTest
@SuppressWarnings("javadoc")
public class CallATP extends ServicelayerTransactionalTest
{
	/**
	 *
	 */
	private static final String PRODUCT_CODE = "ROC_SA_1";
	private static final String TEST_BASESITE_UID = "testSite";
	private static final String TEST_BASESTORE_UID = "testStore";
	private static final String USERNAME = "ahertz";
	private static final long DEFAULT_CART_ITEM_QTY = 5;

	@Resource
	private CartFacade cartFacade;
	@Resource
	private DefaultSapOaaCartValidationStrategy cartValidationStrategy;
	@Resource
	private DefaultSapOaaCommerceUpdateCartEntryStrategy commerceUpdateCartEntryStrategy;
	@Resource
	private DefaultSapOaaCommerceAddToCartStrategy commerceAddToCartStrategy;
	@Resource
	private PointOfServiceService pointOfServiceService;
	@Resource
	private DeliveryService deliveryService;
	@Resource
	private PriceDataFactory priceDataFactory;
	@Resource
	private CommerceCartService commerceCartService;
	@Resource
	private BaseSiteService baseSiteService;
	@Resource
	private UserService userService;
	@Resource
	private ProductService productService;
	@Resource
	private CartService cartService;


	@Resource
	private ModelService modelService;
	@Resource
	private BaseStoreService baseStoreService;
	@Resource
	private CommonI18NService commonI18NService;
	@Resource
	private GuidKeyGenerator guidKeyGenerator;
	@Resource
	private UnitService unitService;
	@Resource
	private CatalogVersionService catalogVersionService;


	@BeforeClass
	public static void tenantStuff()
	{
		Registry.setCurrentTenantByID("junit");
	}


	@Before
	public void setUp() throws ImpExException
	{
		importCsv("/sapoaacommercefacades/test/testData2.csv", "utf-8");
		importCsv("/commerceservices/test/testCommerceCart.csv", "utf-8");
		importCsv("/sapoaacommercefacades/test/testData.csv", "utf-8");

		userService.setCurrentUser(userService.getUserForUID(USERNAME));

		baseSiteService.setCurrentBaseSite(baseSiteService.getBaseSiteForUID(TEST_BASESITE_UID), false);
		final CatalogVersionModel catalogVersionModel = catalogVersionService.getCatalogVersion("testCatalog", "Online");
		assertNotNull(catalogVersionModel);

		catalogVersionService.setSessionCatalogVersions(Collections.singletonList(catalogVersionModel));

		setCartWithEntries();
		prepareATPStrategy();
	}

	private void setCartWithEntries()
	{
		String orderGuid;
		BaseStoreModel baseStore;


		final CartModel cart = cartService.getSessionCart();
		final List<AbstractOrderEntryModel> entries = new ArrayList<AbstractOrderEntryModel>();
		baseStore = baseStoreService.getBaseStoreForUid(TEST_BASESTORE_UID);
		baseStore.setPickupInStoreMode(PickupInStoreMode.BUY_AND_COLLECT);
		final BaseSiteModel baseSite = baseSiteService.getCurrentBaseSite();
		final CurrencyModel currency = commonI18NService.getCurrency("EUR");

		baseStore.setExternalTaxEnabled(Boolean.FALSE);
		baseStore.setUid(TEST_BASESTORE_UID);

		cart.setStore(baseStore);
		cart.setCurrency(currency);
		cart.setDate(new Date());
		cart.setNet(Boolean.TRUE);
		cart.setUser(userService.getUserForUID(USERNAME));
		cart.setGuid(guidKeyGenerator.generate().toString());
		cart.setSite(baseSite);

		cart.setEntries(entries);

		cartService.addNewEntry(cart, productService.getProductForCode(PRODUCT_CODE), DEFAULT_CART_ITEM_QTY,
				unitService.getUnitForCode("PCE"));

		orderGuid = cart.getGuid();
		cart.setCode(orderGuid);
		modelService.saveAll();
	}

	/**
	 *
	 */
	private void prepareATPStrategy()
	{
		((DefaultCommerceCartService) commerceCartService).setCartValidationStrategy(cartValidationStrategy);
		((DefaultCommerceCartService) commerceCartService).setCommerceAddToCartStrategy(commerceAddToCartStrategy);
		((DefaultCommerceCartService) commerceCartService).setCommerceUpdateCartEntryStrategy(commerceUpdateCartEntryStrategy);

		((DefaultCartFacade) cartFacade).setCommerceCartService(commerceCartService);
	}

	@Test
	public void callATPWhenAddToCart()
	{
		final long ADD_QTY = 2;

		CartModificationData cartModificationData;
		try
		{
			cartModificationData = cartFacade.addToCart(PRODUCT_CODE, ADD_QTY);

			Assert.assertNotNull(cartModificationData);
			Assert.assertEquals(ADD_QTY, cartModificationData.getQuantityAdded());
			Assert.assertEquals(ADD_QTY, cartModificationData.getQuantity());
		}
		catch (final CommerceCartModificationException e)
		{
			Assert.fail("No Exception expected, but it was: " + e.getMessage());
		}
	}

	@Test
	public void callATPWhenUpdateCart()
	{
		final long UPDATE_QTY = 7;
		CartModificationData cartModificationData;
		try
		{
			cartModificationData = cartFacade.updateCartEntry(0, UPDATE_QTY);

			Assert.assertNotNull(cartModificationData);
			Assert.assertEquals(UPDATE_QTY, cartModificationData.getQuantity());
			Assert.assertEquals(UPDATE_QTY - DEFAULT_CART_ITEM_QTY, cartModificationData.getQuantityAdded());
		}
		catch (final CommerceCartModificationException e)
		{
			Assert.fail("No Exception expected, but it was: " + e.getMessage());
		}
	}

	@Test
	public void callATPWhenEnteringCheckout()
	{
		List<CartModificationData> cartModificationDataList = new ArrayList<>();
		try
		{
			cartModificationDataList = cartFacade.validateCartData();

			// we expect that no errors occurred and therefore the list is empty
			Assert.assertNotNull(cartModificationDataList);
			Assert.assertEquals(0, cartModificationDataList.size());
			if (cartModificationDataList.size() > 0)
			{
				System.out.println(cartModificationDataList.get(0).getStatusMessage());
			}

		}
		catch (final CommerceCartModificationException e)
		{
			Assert.fail("No Exception expected, but it was: " + e.getMessage());
		}
	}
}
