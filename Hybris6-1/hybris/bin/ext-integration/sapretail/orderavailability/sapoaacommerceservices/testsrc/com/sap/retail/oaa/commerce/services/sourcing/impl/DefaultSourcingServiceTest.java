/**
 *
 */
package com.sap.retail.oaa.commerce.services.sourcing.impl;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.commerceservices.service.data.CommerceCheckoutParameter;
import de.hybris.platform.core.model.order.CartModel;

import java.net.URI;
import java.net.URISyntaxException;

import org.easymock.EasyMock;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.sap.retail.oaa.commerce.services.rest.util.impl.AuthenticationResult;
import com.sap.retail.oaa.commerce.services.rest.util.impl.AuthenticationService;
import com.sap.retail.oaa.commerce.services.rest.util.impl.DefaultHttpEntityBuilder;
import com.sap.retail.oaa.commerce.services.rest.util.impl.DefaultHttpHeaderProvider;
import com.sap.retail.oaa.commerce.services.rest.util.impl.DefaultRestInitializationStrategy;
import com.sap.retail.oaa.commerce.services.rest.util.impl.DefaultURLProvider;
import com.sap.retail.oaa.commerce.services.sourcing.exception.SourcingException;
import com.sap.retail.oaa.commerce.services.sourcing.jaxb.pojos.request.SourcingAbapRequest;
import com.sap.retail.oaa.commerce.services.sourcing.jaxb.pojos.response.SourcingResponse;




/**
 * @author SAP
 *
 */
@UnitTest
public class DefaultSourcingServiceTest
{

	private DefaultSourcingService classUnderTest = null;

	@Test
	public void testCallRestService() throws SourcingException, URISyntaxException
	{
		classUnderTest = new DefaultSourcingService();

		final String targetUrl = "http://www.sap.com";
		final String password = "password";
		final String user = "username";
		final String sapCarClient = "sapCarClient";


		final DefaultRestInitializationStrategy restInitializationStrategyMock = EasyMock
				.createNiceMock(DefaultRestInitializationStrategy.class);
		restInitializationStrategyMock.initializeConfigurationWithBaseStore(classUnderTest);
		EasyMock.expectLastCall();
		EasyMock.replay(restInitializationStrategyMock);

		classUnderTest.setRestInitializationStrategy(restInitializationStrategyMock);


		final AuthenticationService authenticationServiceMock = EasyMock.createNiceMock(AuthenticationService.class);
		EasyMock
				.expect(authenticationServiceMock.execute(EasyMock.anyObject(String.class), EasyMock.anyObject(String.class),
						EasyMock.anyObject(String.class), EasyMock.anyObject(String.class), EasyMock.anyObject(String.class)))
				.andReturn(new AuthenticationResult());
		EasyMock.replay(authenticationServiceMock);
		classUnderTest.setAuthenticationService(authenticationServiceMock);


		final DefaultHttpHeaderProvider httpHeaderProviderMock = EasyMock.createNiceMock(DefaultHttpHeaderProvider.class);
		EasyMock
				.expect(httpHeaderProviderMock.compileHttpHeader(EasyMock.anyObject(String.class), EasyMock.anyObject(String.class)))
				.andReturn(new HttpHeaders());
		EasyMock.expect(httpHeaderProviderMock.appendCsrfToHeader(EasyMock.anyObject(HttpHeaders.class),
				EasyMock.anyObject(HttpHeaders.class))).andReturn(new HttpHeaders());
		EasyMock.expect(httpHeaderProviderMock.appendCookieToHeader(EasyMock.anyObject(HttpHeaders.class),
				EasyMock.anyObject(HttpHeaders.class))).andReturn(new HttpHeaders());
		EasyMock.replay(httpHeaderProviderMock);
		classUnderTest.setHttpHeaderProvider(httpHeaderProviderMock);


		final CommerceCheckoutParameter parameter = new CommerceCheckoutParameter();
		final CartModel cartModel = new CartModel();
		parameter.setCart(cartModel);

		final DefaultSourcingRequestMapper requestMapperMock = EasyMock.createNiceMock(DefaultSourcingRequestMapper.class);
		EasyMock.expect(requestMapperMock.mapCartToSourcingRequest(cartModel, false)).andReturn(new SourcingAbapRequest());
		EasyMock.replay(requestMapperMock);
		classUnderTest.setCartMapper(requestMapperMock);

		final DefaultSourcingResultHandler sourcingResultHandlerMock = EasyMock.createNiceMock(DefaultSourcingResultHandler.class);
		sourcingResultHandlerMock.persistSourcingResultInCart(EasyMock.anyObject(SourcingResponse.class),
				EasyMock.anyObject(CartModel.class));
		EasyMock.expectLastCall();
		classUnderTest.setSourcingResultHandler(sourcingResultHandlerMock);



		final HttpEntity<SourcingAbapRequest> entity = new HttpEntity<SourcingAbapRequest>(null, null);
		final DefaultHttpEntityBuilder httpEntityBuilderMock = EasyMock.createNiceMock(DefaultHttpEntityBuilder.class);
		EasyMock.expect(httpEntityBuilderMock.createHttpEntityForSourcing(EasyMock.anyObject(HttpHeaders.class),
				EasyMock.anyObject(SourcingAbapRequest.class))).andReturn(entity).anyTimes();
		EasyMock.replay(httpEntityBuilderMock);
		classUnderTest.setHttpEntityBuilder(httpEntityBuilderMock);

		final ResponseEntity responseMock = EasyMock.createNiceMock(ResponseEntity.class);
		EasyMock.expect(responseMock.getBody()).andReturn(new SourcingResponse()).anyTimes();
		EasyMock.replay(responseMock);

		final URI targetUri = new URI(targetUrl);


		final RestTemplate restTemplateMock = EasyMock.createNiceMock(RestTemplate.class);
		EasyMock.expect(restTemplateMock.exchange(targetUri, HttpMethod.PUT, entity, SourcingResponse.class))
				.andReturn(responseMock).anyTimes();
		EasyMock.replay(restTemplateMock);
		classUnderTest.setRestTemplate(restTemplateMock);

		final DefaultURLProvider urlProviderMock = EasyMock.createNiceMock(DefaultURLProvider.class);
		EasyMock.expect(urlProviderMock.compileURI(EasyMock.anyObject(String.class), EasyMock.anyObject(String.class),
				EasyMock.anyObject(String.class))).andReturn(targetUri).anyTimes();
		EasyMock.replay(urlProviderMock);
		classUnderTest.setUrlProvider(urlProviderMock);


		classUnderTest.setPassword(password);
		classUnderTest.setUser(user);
		classUnderTest.setTargetUrl(targetUrl);
		classUnderTest.setSapCarClient(sapCarClient);


		classUnderTest.callRestServiceAndPersistResult(parameter.getCart());
	}





}
