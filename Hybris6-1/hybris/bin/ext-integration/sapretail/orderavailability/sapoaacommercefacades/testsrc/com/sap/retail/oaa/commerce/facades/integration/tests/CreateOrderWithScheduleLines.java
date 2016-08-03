/*****************************************************************************
    Class:        CreateOrderWithScheduleLines
    Copyright (c) 2015, SAP SE, Germany, All rights reserved.

 *****************************************************************************/
package com.sap.retail.oaa.commerce.facades.integration.tests;

import static org.junit.Assert.assertNotNull;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.commerceservices.customer.CustomerAccountService;
import de.hybris.platform.commerceservices.util.GuidKeyGenerator;
import de.hybris.platform.core.Registry;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.impex.jalo.ImpExException;
import de.hybris.platform.order.OrderService;
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

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sap.retail.oaa.model.model.ScheduleLineModel;


@IntegrationTest
@SuppressWarnings("javadoc")
public class CreateOrderWithScheduleLines extends ServicelayerTransactionalTest
{
	private static final String TEST_BASESITE_UID = "testSite";
	private static final String TEST_BASESTORE_UID = "testStore";

	@Resource
	private ModelService modelService;
	@Resource
	private ProductService productService;
	@Resource
	private CommonI18NService commonI18NService;
	@Resource
	private BaseSiteService baseSiteService;
	@Resource
	private UserService userService;
	@Resource
	private GuidKeyGenerator guidKeyGenerator;
	@Resource
	private BaseStoreService baseStoreService;
	@Resource
	private CatalogVersionService catalogVersionService;
	@Resource
	private CustomerAccountService customerAccountService;
	@Resource
	private UnitService unitService;
	@Resource
	private OrderService orderService;


	private CurrencyModel currency;
	private String orderGuid;


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
		currency = commonI18NService.getCurrency("EUR");
		baseSiteService.setCurrentBaseSite(baseSiteService.getBaseSiteForUID(TEST_BASESITE_UID), false);

		final CatalogVersionModel catalogVersionModel = catalogVersionService.getCatalogVersion("testCatalog", "Online");
		assertNotNull(catalogVersionModel);
		catalogVersionService.setSessionCatalogVersions(Collections.singletonList(catalogVersionModel));

		final UserModel user = createUser("user");

		setupEmptyOrder(user);
		userService.setCurrentUser(user);
	}

	private void setupEmptyOrder(final UserModel user)
	{
		final OrderModel order = modelService.create(OrderModel.class);
		final ScheduleLineModel scheduleLine1 = modelService.create(ScheduleLineModel.class);
		final ScheduleLineModel scheduleLine2 = modelService.create(ScheduleLineModel.class);
		final List<ScheduleLineModel> scheduleLines = new ArrayList<ScheduleLineModel>();
		final List<AbstractOrderEntryModel> entries = new ArrayList<AbstractOrderEntryModel>();
		final BaseStoreModel baseStore = baseStoreService.getBaseStoreForUid(TEST_BASESTORE_UID);
		final BaseSiteModel baseSite = baseSiteService.getCurrentBaseSite();

		baseStore.setExternalTaxEnabled(Boolean.FALSE);
		baseStore.setUid(TEST_BASESTORE_UID);

		order.setStore(baseStore);
		order.setCurrency(currency);
		order.setDate(new Date());
		order.setNet(Boolean.TRUE);
		order.setUser(user);
		order.setGuid(guidKeyGenerator.generate().toString());
		order.setSite(baseSite);

		order.setEntries(entries);
		orderService.addNewEntry(order, productService.getProductForCode("HW1210-3423"), 5, unitService.getUnitForCode("pieces"));


		scheduleLine1.setConfirmedQuantity(new Double(4));
		//		scheduleLine1.setQuantityUnit("PC");
		scheduleLine1.setConfirmedDate(new Date(2015, 8, 20));
		scheduleLine1.setOwner(order.getEntries().get(0));
		scheduleLines.add(scheduleLine1);
		scheduleLine2.setConfirmedQuantity(new Double(1));
		//		scheduleLine2.setQuantityUnit("PC");
		scheduleLine2.setConfirmedDate(new Date(2015, 8, 25));
		scheduleLine2.setOwner(order.getEntries().get(0));
		scheduleLines.add(scheduleLine2);

		order.getEntries().get(0).setScheduleLines(scheduleLines);

		orderGuid = order.getGuid();
		order.setCode(orderGuid);

		modelService.saveAll();
	}

	private UserModel createUser(final String uid)
	{
		final CustomerModel user = modelService.create(CustomerModel.class);
		user.setUid(uid);
		user.setName(uid);
		modelService.save(user);
		return user;
	}

	@Test
	public void testAddScheduleLines()
	{
		final OrderModel order = customerAccountService.getOrderForCode(orderGuid,
				baseStoreService.getBaseStoreForUid(TEST_BASESTORE_UID));
		Assert.assertNotNull(order);

		final ScheduleLineModel scheduleLine1 = order.getEntries().get(0).getScheduleLines().get(0);
		Assert.assertEquals(new Double(4), scheduleLine1.getConfirmedQuantity());
		//		Assert.assertEquals("PC", scheduleLine1.getQuantityUnit());
		Assert.assertEquals(new Date(2015, 8, 20), scheduleLine1.getConfirmedDate());

		final ScheduleLineModel scheduleLine2 = order.getEntries().get(0).getScheduleLines().get(1);
		Assert.assertEquals(new Double(1), scheduleLine2.getConfirmedQuantity());
		//		Assert.assertEquals("PC", scheduleLine2.getQuantityUnit());
		Assert.assertEquals(new Date(2015, 8, 25), scheduleLine2.getConfirmedDate());
	}
}
