/**
 *
 */
package com.sap.retail.oaa.commerce.facades.integration.tests;

import static org.junit.Assert.assertNotNull;

import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.Registry;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.product.UnitModel;
import de.hybris.platform.impex.jalo.ImpExException;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.site.BaseSiteService;
import de.hybris.platform.store.BaseStoreModel;
import de.hybris.platform.store.services.BaseStoreService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sap.retail.oaa.commerce.services.atp.ATPService;
import com.sap.retail.oaa.commerce.services.atp.pojos.ATPAvailability;


/**
 * @author SAP
 *
 */
public class CallATPFromStoreFinder extends ServicelayerTransactionalTest
{

	private static final String TEST_BASESITE_UID = "testSite";
	private static final String productName = "ROC_SA_1";
	private static final String TEST_BASESTORE_UID = "testStore";
	private static final String unitCode = "PCE";
	private static final String source = "OAS1";

	@Resource
	private CatalogVersionService catalogVersionService;
	@Resource
	private BaseSiteService baseSiteService;
	@Resource
	private BaseStoreService baseStoreService;
	@Resource
	private ATPService oaaCommerceATPService;

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

		final List<BaseStoreModel> storeList = new ArrayList<BaseStoreModel>();
		storeList.add(baseStoreService.getBaseStoreForUid(TEST_BASESTORE_UID));

		baseSiteService.setCurrentBaseSite(baseSiteService.getBaseSiteForUID(TEST_BASESITE_UID), false);
		baseSiteService.getCurrentBaseSite().setStores(storeList);

		final CatalogVersionModel catalogVersionModel = catalogVersionService.getCatalogVersion("testCatalog", "Online");
		assertNotNull(catalogVersionModel);

		catalogVersionService.setSessionCatalogVersions(Collections.singletonList(catalogVersionModel));
	}

	@Test
	public void callATP()
	{
		final ProductModel product = new ProductModel();
		final UnitModel unit = new UnitModel();
		unit.setCode(unitCode);

		product.setCode(productName);
		product.setUnit(unit);

		final List<ATPAvailability> availability = oaaCommerceATPService.callRestAvailabilityServiceForProductAndSource(product,
				source);

		assertNotNull(availability);

		Assert.assertFalse(availability.isEmpty());
	}
}
