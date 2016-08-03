/**
 *
 */
package com.sap.retail.oaa.commerce.services.reservation.impl;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.order.OrderModel;

import java.net.URI;
import java.net.URISyntaxException;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.sap.retail.oaa.commerce.services.constants.SapoaacommerceservicesConstants;
import com.sap.retail.oaa.commerce.services.reservation.jaxb.pojos.request.ReservationAbapRequest;
import com.sap.retail.oaa.commerce.services.reservation.jaxb.pojos.response.ReservationResponse;
import com.sap.retail.oaa.commerce.services.reservation.jaxb.pojos.response.ReservationResultResponse;
import com.sap.retail.oaa.commerce.services.rest.util.impl.AuthenticationResult;
import com.sap.retail.oaa.commerce.services.rest.util.impl.AuthenticationService;
import com.sap.retail.oaa.commerce.services.rest.util.impl.DefaultHttpEntityBuilder;
import com.sap.retail.oaa.commerce.services.rest.util.impl.DefaultHttpHeaderProvider;
import com.sap.retail.oaa.commerce.services.rest.util.impl.DefaultRestInitializationStrategy;
import com.sap.retail.oaa.commerce.services.rest.util.impl.DefaultURLProvider;
import com.sap.retail.oaa.commerce.services.sourcing.exception.SourcingException;


/**
 * @author SAP
 *
 */
@UnitTest
public class DefaultReservationServiceTest
{
	private static final String ORDER_ID = "1234567890";
	private DefaultReservationService classUnderTest = null;

	@Test
	public void callRestService() throws SourcingException, URISyntaxException
	{
		final String targetUrl = "http://www.sap.com";
		final String password = "password";
		final String user = "username";
		final String sapCarClient = "sapCarClient";

		classUnderTest = new DefaultReservationService();

		final DefaultRestInitializationStrategy restInitializationStrategyMock = EasyMock
				.createNiceMock(DefaultRestInitializationStrategy.class);
		restInitializationStrategyMock.initializeConfigurationWithoutBaseStore(classUnderTest);
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


		final OrderModel order = new OrderModel();
		order.setGuid("123-456");

		final DefaultReservationRequestMapper requestMapperMock = EasyMock.createNiceMock(DefaultReservationRequestMapper.class);
		EasyMock.expect(requestMapperMock.mapOrderToReservationRequest(order)).andReturn(new ReservationAbapRequest());
		EasyMock.replay(requestMapperMock);
		classUnderTest.setRequestMapper(requestMapperMock);



		final HttpEntity<ReservationAbapRequest> entity = new HttpEntity<ReservationAbapRequest>(null, null);
		final DefaultHttpEntityBuilder httpEntityBuilderMock = EasyMock.createNiceMock(DefaultHttpEntityBuilder.class);
		EasyMock.expect(httpEntityBuilderMock.createHttpEntity(EasyMock.anyObject(HttpHeaders.class),
				EasyMock.anyObject(ReservationAbapRequest.class))).andReturn(entity).anyTimes();
		EasyMock.replay(httpEntityBuilderMock);
		classUnderTest.setHttpEntityBuilder(httpEntityBuilderMock);



		final URI targetUri = new URI(targetUrl);

		final ResponseEntity responseMock = EasyMock.createNiceMock(ResponseEntity.class);
		EasyMock.expect(responseMock.getBody()).andReturn(getDefaultReservationResponse()).anyTimes();
		EasyMock.replay(responseMock);

		final RestTemplate restTemplateMock = EasyMock.createNiceMock(RestTemplate.class);
		EasyMock.expect(restTemplateMock.exchange(targetUri, HttpMethod.PUT, entity, ReservationResponse.class))
				.andReturn(responseMock).anyTimes();
		EasyMock.replay(restTemplateMock);
		classUnderTest.setRestTemplate(restTemplateMock);

		final DefaultURLProvider urlProviderMock = EasyMock.createNiceMock(DefaultURLProvider.class);
		EasyMock.expect(urlProviderMock.compileURI(EasyMock.anyObject(String.class), EasyMock.anyObject(String.class),
				EasyMock.anyObject(String.class))).andReturn(targetUri);
		EasyMock.replay(urlProviderMock);
		classUnderTest.setUrlProvider(urlProviderMock);

		classUnderTest.setPassword(password);
		classUnderTest.setUser(user);
		classUnderTest.setTargetUrl(targetUrl);
		classUnderTest.setSapCarClient(sapCarClient);

		final ReservationResponse response = classUnderTest.callRestService(order);
		Assert.assertNotNull(response);
		Assert.assertNotNull(response.toString());
	}


	private ReservationResponse getDefaultReservationResponse()
	{
		final ReservationResponse response = new ReservationResponse();
		final ReservationResultResponse reservationResult = new ReservationResultResponse();
		reservationResult.setOrderId(ORDER_ID);
		reservationResult.setResvStatus(SapoaacommerceservicesConstants.RESERVATION_STATUS_ORDER);
		response.setReservationResult(reservationResult);

		return response;
	}
}
