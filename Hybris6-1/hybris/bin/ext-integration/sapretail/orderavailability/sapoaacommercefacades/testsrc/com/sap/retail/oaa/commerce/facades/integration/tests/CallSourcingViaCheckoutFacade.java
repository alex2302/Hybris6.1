/**
 *
 */
package com.sap.retail.oaa.commerce.facades.integration.tests;

import static org.junit.Assert.assertNotNull;

import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.commerceservices.enums.PickupInStoreMode;
import de.hybris.platform.commerceservices.order.CommerceCheckoutService;
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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.BeforeClass;

import com.sap.retail.oaa.commerce.facades.checkout.OaaCheckoutFacade;
import com.sap.retail.oaa.commerce.services.sourcing.strategy.SourcingStrategy;


//@IntegrationTest
@SuppressWarnings("javadoc")
public class CallSourcingViaCheckoutFacade extends ServicelayerTransactionalTest
{
	private static final String TEST_BASESITE_UID = "testSite";
	private static final String TEST_BASESTORE_UID = "testStore";
	private static final String userName = "ahertz";

	@Resource
	private OaaCheckoutFacade checkoutFacade;
	@Resource
	private CartService cartService;
	@Resource
	private BaseSiteService baseSiteService;
	@Resource
	private ModelService modelService;
	@Resource
	private BaseStoreService baseStoreService;
	@Resource
	private CommonI18NService commonI18NService;
	@Resource
	private GuidKeyGenerator guidKeyGenerator;
	@Resource
	private UserService userService;
	@Resource
	private ProductService productService;
	@Resource
	private UnitService unitService;
	@Resource
	private CatalogVersionService catalogVersionService;
	@Resource
	private SourcingStrategy oaaCommerceSourcingStrategy;
	@Resource
	private CommerceCheckoutService commerceCheckoutService;


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

		userService.setCurrentUser(userService.getUserForUID(userName));

		baseSiteService.setCurrentBaseSite(baseSiteService.getBaseSiteForUID(TEST_BASESITE_UID), false);
		final CatalogVersionModel catalogVersionModel = catalogVersionService.getCatalogVersion("testCatalog", "Online");
		assertNotNull(catalogVersionModel);

		catalogVersionService.setSessionCatalogVersions(Collections.singletonList(catalogVersionModel));

		setCartWithEntries();
		prepareSourcingStrategy();
	}

	private void prepareSourcingStrategy()
	{


		//((DefaultCheckoutService) commerceCheckoutService).setSourcingStrategy(oaaCommerceSourcingStrategy);
		//((DefaultCheckoutFacade) checkoutFacade).setCommerceCheckoutService(commerceCheckoutService);
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
		cart.setUser(userService.getUserForUID(userName));
		cart.setGuid(guidKeyGenerator.generate().toString());
		cart.setSite(baseSite);

		cart.setEntries(entries);

		cartService.addNewEntry(cart, productService.getProductForCode("ROC_SA_1"), 5, unitService.getUnitForCode("PCE"));

		orderGuid = cart.getGuid();
		cart.setCode(orderGuid);
		modelService.saveAll();
	}


	//TODO reactivate test
	//	@Test
	//	public void testSourcingCall()
	//	{
	//		checkoutFacade.prepareCartForCheckout();
	//
	//		Assert.assertTrue(checkoutFacade.setDefaultDeliveryAddressForCheckout());
	//
	//		final CartModel cart = cartService.getSessionCart();
	//
	//		Assert.assertNotNull(cart);
	//
	//		Assert.assertNotNull(cart.getEntries().get(0).getSapSource());
	//		Assert.assertNotNull(cart.getEntries().get(0).getScheduleLines().get(0)); //Have at least one Schedule Line
	//	}
}
