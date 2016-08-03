/**
 *
 */
package com.sap.retail.oaa.validators;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.acceleratorstorefrontcommons.checkout.steps.validation.ValidationResults;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Test;

import com.sap.retail.oaa.commerce.facades.checkout.OaaCheckoutFacade;


/**
 * @author SAP
 *
 */
@UnitTest
public class ResponsiveDeliveryAddressCheckoutStepValidatorTest
{

	private final ResponsiveDeliveryAddressCheckoutStepValidator classUnderTest = new ResponsiveDeliveryAddressCheckoutStepValidator();

	@Test
	public void testValidateOnExit_Success()
	{
		final OaaCheckoutFacade oaaCheckoutFacadeMock = EasyMock.createNiceMock(OaaCheckoutFacade.class);
		EasyMock.expect(Boolean.valueOf(oaaCheckoutFacadeMock.doSourcingForSessionCart())).andReturn(new Boolean(true));
		EasyMock.replay(oaaCheckoutFacadeMock);
		classUnderTest.setOaaCheckoutFacade(oaaCheckoutFacadeMock);

		Assert.assertEquals(ValidationResults.SUCCESS, classUnderTest.validateOnExit());
	}
}
