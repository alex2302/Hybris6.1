package com.sap.retail.oaa.commerce.services.atp.impl;

/*****************************************************************************
 Class:        DefaultATPService
 Copyright (c) 2015, SAP SE, Germany, All rights reserved.
 *****************************************************************************/
import de.hybris.platform.core.model.product.ProductModel;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.util.UriComponentsBuilder;

import com.sap.retail.oaa.commerce.services.atp.ATPResultHandler;
import com.sap.retail.oaa.commerce.services.atp.ATPService;
import com.sap.retail.oaa.commerce.services.atp.exception.ATPException;
import com.sap.retail.oaa.commerce.services.atp.jaxb.pojos.response.ATPBatchResponse;
import com.sap.retail.oaa.commerce.services.atp.jaxb.pojos.response.ATPResponse;
import com.sap.retail.oaa.commerce.services.atp.pojos.ATPAvailability;
import com.sap.retail.oaa.commerce.services.atp.pojos.ATPProductAvailability;
import com.sap.retail.oaa.commerce.services.common.util.ServiceUtils;
import com.sap.retail.oaa.commerce.services.rest.impl.DefaultAbstractOaaRestService;
import com.sap.retail.oaa.commerce.services.rest.util.HttpEntityBuilder;
import com.sap.retail.oaa.commerce.services.rest.util.HttpHeaderProvider;
import com.sap.retail.oaa.commerce.services.rest.util.OaaRestServiceConsumer;
import com.sap.retail.oaa.commerce.services.rest.util.URLProvider;
import com.sap.retail.oaa.commerce.services.rest.util.exception.RestInitializationException;


/**
 * Default ATP service
 */
public class DefaultATPService extends DefaultAbstractOaaRestService implements ATPService, OaaRestServiceConsumer
{
	private static final Logger LOG = Logger.getLogger(DefaultATPService.class);

	private static final String SERVICE_PATH = "/sap/car/rest/oaa/availability";
	private static final String SERVICE_QUERY_PARAM = "?q=";
	private static final String SERVICE_QUERY_PARAM_SOURCES = "sources?q=";
	private static final String QUERY_PARAM_OAA_PROFILE_ID = "oaaProfile";
	private static final String QUERY_PARAM_EXTERNAL_ID = "externalId";
	private static final String QUERY_PARAM_EXTERNAL_IDS = "externalIds";
	private static final String QUERY_PARAM_UNIT = "unit";

	private static final String ATP_ERROR_MESSAGE = "Error when calling ATP web service.";

	private HttpHeaderProvider httpHeaderProvider;
	private URLProvider urlProvider;
	private HttpEntityBuilder httpEntityBuilder;
	private ATPResultHandler atpResultHandler;
	private ServiceUtils serviceUtils;

	private String oaaProfileId;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.sap.retail.oaa.commerce.services.atp.ATPService#callRestAvailabilityServiceForProduct(java.lang.String,
	 * de.hybris.platform.core.model.product.ProductModel)
	 */
	@Override
	public List<ATPAvailability> callRestAvailabilityServiceForProduct(final String cartGuid, final String itemId,
			final ProductModel product) throws ATPException
	{
		HttpEntity entity = null;

		try
		{
			initializeConfiguration();
			validate(product);

			final String resourceServicePath = buildRessourceServicePath(product);

			entity = prepareRestCall();
			final MultiValueMap<String, String> uriQueryParameters = compileUriQueryParameters(cartGuid, itemId, product.getUnit()
					.getCode());

			return exchangeRestTemplateAndExtractATPResult(resourceServicePath, entity, uriQueryParameters);
		}
		catch (final IllegalArgumentException | URISyntaxException | RestClientException | ATPException e)
		{
			LOG.error(ATP_ERROR_MESSAGE);
			throw new ATPException(e);
		}

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.sap.retail.oaa.commerce.services.atp.ATPService#callRestAvailabilityServiceForProductAndSource(
	 * de.hybris.platform.core.model.product.ProductModel, java.lang.String)
	 */
	@Override
	public List<ATPAvailability> callRestAvailabilityServiceForProductAndSource(final String cartGuid, final String itemId,
			final ProductModel product, final String source) throws ATPException
	{
		HttpEntity entity = null;

		try
		{
			initializeConfiguration();
			validate(product, source);

			final String resourceServicePath = buildRessourceServicePath(product, source);

			entity = prepareRestCall();
			final MultiValueMap<String, String> uriQueryParameters = compileUriQueryParameters(cartGuid, itemId, product.getUnit()
					.getCode());

			return exchangeRestTemplateAndExtractATPResult(resourceServicePath, entity, uriQueryParameters);
		}
		catch (final IllegalArgumentException | URISyntaxException | RestClientException | ATPException e)
		{
			LOG.error(ATP_ERROR_MESSAGE);
			throw new ATPException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.sap.retail.oaa.commerce.services.atp.ATPService#callRestAvailabilityServiceForProductAndSource(de.hybris.
	 * platform .core.model.product.ProductModel, java.lang.String)
	 */
	@Override
	public List<ATPAvailability> callRestAvailabilityServiceForProductAndSource(final ProductModel product, final String source)
			throws ATPException
	{
		return this.callRestAvailabilityServiceForProductAndSource(null, null, product, source);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.sap.retail.oaa.commerce.services.atp.ATPService#callRestAvailabilityServiceForProducts(java.util.List)
	 */
	@Override
	public List<ATPProductAvailability> callRestAvailabilityServiceForProducts(final String cartGuid,
			final List<String> itemIdList, final String productUnit, final List<ProductModel> productList) throws ATPException
	{
		HttpEntity entity = null;
		try
		{
			initializeConfiguration();
			validate(productList);

			final String resourceServicePath = buildBatchRessourceServicePath(productList);
			entity = prepareRestCall();
			final MultiValueMap<String, String> uriQueryParameters = compileUriQueryParameters(cartGuid, itemIdList, productUnit);

			return exchangeRestTemplateAndExtractATPBatchResult(resourceServicePath, entity, uriQueryParameters);
		}
		catch (final IllegalArgumentException | URISyntaxException | RestClientException | ATPException e)
		{
			LOG.error(ATP_ERROR_MESSAGE);
			throw new ATPException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.sap.retail.oaa.commerce.services.atp.ATPService#callRestAvailabilityServiceForProductAndSources(de.hybris.
	 * platform.core.model.product.ProductModel, java.util.List)
	 */
	@Override
	public List<ATPProductAvailability> callRestAvailabilityServiceForProductAndSources(final String cartGuid,
			final String itemId, final ProductModel product, final List<String> sourcesList) throws ATPException
	{
		HttpEntity entity = null;

		try
		{
			initializeConfiguration();
			validate(product, sourcesList);

			final String resourceServicePath = buildBatchRessourceServicePath(product, sourcesList);

			entity = prepareRestCall();
			final MultiValueMap<String, String> uriQueryParameters = compileUriQueryParameters(cartGuid, itemId, product.getUnit()
					.getCode());

			return exchangeRestTemplateAndExtractATPBatchResult(resourceServicePath, entity, uriQueryParameters);
		}
		catch (final IllegalArgumentException | URISyntaxException | RestClientException | ATPException e)
		{
			LOG.error(ATP_ERROR_MESSAGE);
			throw new ATPException(e);
		}
	}


	/**
	 * @return HttpEntity
	 */
	public HttpEntity prepareRestCall()
	{
		HttpEntity entity;
		final HttpHeaders header = compileHTTPHeader();

		entity = httpEntityBuilder.createHttpEntity(header);
		return entity;
	}

	/**
	 * @param atpResultHandler
	 */
	public void setAtpResultHandler(final ATPResultHandler atpResultHandler)
	{
		this.atpResultHandler = atpResultHandler;
	}

	/**
	 * @return the atpResultHandler
	 */
	protected ATPResultHandler getAtpResultHandler()
	{
		return atpResultHandler;
	}

	/**
	 * @param httpHeaderProvider
	 */
	public void setHttpHeaderProvider(final HttpHeaderProvider httpHeaderProvider)
	{
		this.httpHeaderProvider = httpHeaderProvider;
	}

	/**
	 * @return the httpHeaderProvider
	 */
	protected HttpHeaderProvider getHttpHeaderProvider()
	{
		return httpHeaderProvider;
	}

	/**
	 * @param urlProvider
	 */
	public void setUrlProvider(final URLProvider urlProvider)
	{
		this.urlProvider = urlProvider;
	}

	/**
	 * @return the urlProvider
	 */
	protected URLProvider getUrlProvider()
	{
		return urlProvider;
	}

	/**
	 * Set oaa profile Id
	 */
	@Override
	public void setOaaProfile(final String oaaProfileId)
	{
		this.oaaProfileId = oaaProfileId;

	}

	/**
	 * @param httpEntityBuilder
	 *           the httpEntityBuilder to set
	 */
	public void setHttpEntityBuilder(final HttpEntityBuilder httpEntityBuilder)
	{
		this.httpEntityBuilder = httpEntityBuilder;
	}

	/**
	 * @return the httpEntityBuilder
	 */
	protected HttpEntityBuilder getHttpEntityBuilder()
	{
		return httpEntityBuilder;
	}

	/**
	 * @param serviceUtils
	 *           the serviceUtils to set
	 */
	public void setServiceUtils(final ServiceUtils serviceUtils)
	{
		this.serviceUtils = serviceUtils;
	}

	/**
	 * @return the serviceUtils
	 */
	protected ServiceUtils getServiceUtils()
	{
		return serviceUtils;
	}

	/**
	 * @return the oaaProfileId
	 */
	public String getOaaProfileId()
	{
		return oaaProfileId;
	}

	/**
	 * @param oaaProfileId
	 *           the oaaProfileId to set
	 */
	public void setOaaProfileId(final String oaaProfileId)
	{
		this.oaaProfileId = oaaProfileId;
	}


	/**
	 * Encapsulated of Rest template exchange call. Extracts and converts response to result POJO
	 *
	 * @param resourceServicePath
	 * @param entity
	 * @param queryParameters
	 * @return list of ATPProductAvailability
	 * @throws ATPException
	 * @throws RestClientException
	 */
	private List<ATPProductAvailability> exchangeRestTemplateAndExtractATPBatchResult(final String resourceServicePath,
			final HttpEntity entity, final MultiValueMap<String, String> queryParameters) throws URISyntaxException
	{
		final URI compileURI = urlProvider.compileURI(this.targetUrl, resourceServicePath, this.sapCarClient);

		final UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromUri(compileURI);
		uriBuilder.queryParams(queryParameters);

		final URI finalUri = uriBuilder.build().encode().toUri();

		final ResponseEntity<ATPBatchResponse> response = restTemplate.exchange(finalUri, HttpMethod.GET, entity,
				ATPBatchResponse.class);

		List<ATPProductAvailability> batchResult = new ArrayList<>();
		if (response != null)
		{
			batchResult = atpResultHandler.extractATPProductAvailabilityFromATPBatchResponse(response.getBody());
		}
		return batchResult;
	}

	/**
	 * Encapsulated of Rest template exchange call. Extracts and converts response to result POJO
	 *
	 * @param resourceServicePath
	 * @param entity
	 * @param queryParameters
	 * @return list of ATPAvailability
	 * @throws ATPException
	 * @throws RestClientException
	 */
	private List<ATPAvailability> exchangeRestTemplateAndExtractATPResult(final String resourceServicePath,
			final HttpEntity entity, final MultiValueMap<String, String> queryParameters) throws URISyntaxException
	{
		final URI compileURI = urlProvider.compileURI(this.targetUrl, resourceServicePath, this.sapCarClient);

		final UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromUri(compileURI);
		uriBuilder.queryParams(queryParameters);

		final URI finalUri = uriBuilder.build().encode().toUri();

		final ResponseEntity<ATPResponse> response = restTemplate.exchange(finalUri, HttpMethod.GET, entity, ATPResponse.class);

		List<ATPAvailability> atpResult = new ArrayList<>();
		if (response != null)
		{
			atpResult = atpResultHandler.extractATPAvailabilityFromATPResponse(response.getBody());
		}
		return atpResult;
	}


	/**
	 * Assembles the resource service path string for product ATP call
	 *
	 * @param product
	 * @return assembled service path
	 */
	private String buildRessourceServicePath(final ProductModel product)
	{
		final StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(SERVICE_PATH);
		strBuilder.append('/');
		strBuilder.append(product.getCode());
		return strBuilder.toString();
	}

	/**
	 * Assembles the resource service path string for product / source ATP call
	 *
	 * @param product
	 * @param source
	 * @return assembled service path
	 */
	private String buildRessourceServicePath(final ProductModel product, final String source)
	{
		final StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(SERVICE_PATH);
		strBuilder.append('/');
		strBuilder.append(product.getCode());
		strBuilder.append('/');
		strBuilder.append(source);
		return strBuilder.toString();
	}

	/**
	 * Assembles the resource service path string for batch call
	 *
	 * @param productList
	 * @return assembled service path
	 */
	private String buildBatchRessourceServicePath(final List<ProductModel> productList)
	{
		final StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(SERVICE_PATH);
		strBuilder.append(SERVICE_QUERY_PARAM);

		final Iterator<ProductModel> productIterator = productList.iterator();
		while (productIterator.hasNext())
		{
			final ProductModel product = productIterator.next();
			strBuilder.append(product.getCode());
			if (productIterator.hasNext())
			{
				strBuilder.append(',');
			}
		}
		return strBuilder.toString();
	}


	/**
	 * Assembles the resource service path string for batch call
	 *
	 * @param product
	 * @param sourcesList
	 * @return assembled service path
	 */
	private String buildBatchRessourceServicePath(final ProductModel product, final List<String> sourcesList)
	{
		final StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(SERVICE_PATH);
		strBuilder.append('/');
		strBuilder.append(product.getCode());
		strBuilder.append('/');
		strBuilder.append(SERVICE_QUERY_PARAM_SOURCES);

		final Iterator<String> sourcesIterator = sourcesList.iterator();
		while (sourcesIterator.hasNext())
		{
			final String source = sourcesIterator.next();
			strBuilder.append(source);
			if (sourcesIterator.hasNext())
			{
				strBuilder.append(',');
			}
		}
		return strBuilder.toString();
	}

	/**
	 * Validates if an OAA profile, product and list of sources are set
	 *
	 * @param productModel
	 * @param sourcesList
	 * @throws IllegalArgumentException
	 */
	private void validate(final ProductModel productModel, final List<String> sourcesList)
	{
		this.validate(productModel);
		if (sourcesList == null || sourcesList.isEmpty())
		{
			throw new IllegalArgumentException("Source is not maintained");
		}
	}


	/**
	 * Validates if an OAA profile and product are set
	 *
	 * @param productModel
	 */
	private void validate(final ProductModel productModel)
	{
		if (oaaProfileId == null || oaaProfileId.isEmpty())
		{
			throw new IllegalArgumentException("OAA Profile is not maintained");
		}

		this.validateProductModel(productModel);
	}

	/**
	 * Validates if an OAA profile, product and source are set
	 *
	 * @param productModel
	 * @throws IllegalArgumentException
	 */
	private void validate(final ProductModel productModel, final String source)
	{
		this.validate(productModel);
		if (source == null || source.isEmpty())
		{
			throw new IllegalArgumentException("Source is not maintained");
		}
	}


	/**
	 * Validates if an OAA profile and product list are set
	 *
	 * @param productModelList
	 * @throws IllegalArgumentException
	 */
	private void validate(final List<ProductModel> productModelList)
	{
		if (this.oaaProfileId == null)
		{
			throw new IllegalArgumentException("OAA Profile is not maintained");
		}
		else if (productModelList == null || productModelList.isEmpty())
		{
			throw new IllegalArgumentException("Product list cannot be null or empty");
		}
		else
		{
			for (final ProductModel productModel : productModelList)
			{
				this.validateProductModel(productModel);
			}
		}
	}

	/**
	 * Validates if a product is set
	 *
	 * @param productModel
	 * @throws IllegalArgumentException
	 */
	private void validateProductModel(final ProductModel productModel)
	{
		if (productModel == null || productModel.getCode() == null)
		{
			throw new IllegalArgumentException("Product cannot be null");
		}
	}

	/**
	 * Set HTTP headers for calling availability service
	 *
	 * @return httpHeaders
	 */
	private HttpHeaders compileHTTPHeader()
	{
		final HttpHeaders header = httpHeaderProvider.compileHttpHeader(password, user);
		header.add(HttpHeaders.ACCEPT, MediaType.APPLICATION_XML_VALUE);
		return header;
	}

	/**
	 * Set URI Query Parameters for calling availability service
	 *
	 * @return URI Query parameters
	 */
	private MultiValueMap<String, String> compileUriQueryParameters(final String cartId, final String itemId,
			final String productUnit)
	{
		final MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<>();
		multiValueMap.set(QUERY_PARAM_OAA_PROFILE_ID, oaaProfileId);
		multiValueMap.set(QUERY_PARAM_UNIT, productUnit);

		if (cartId != null && !cartId.isEmpty() && itemId != null && !itemId.isEmpty())
		{
			final String externalId = serviceUtils.createExternalIdForItem(itemId, cartId);
			multiValueMap.set(QUERY_PARAM_EXTERNAL_ID, externalId);
		}
		return multiValueMap;
	}

	/**
	 * Set URI Query Parameters for calling availability service
	 *
	 * @return URI Query parameters
	 */
	private MultiValueMap<String, String> compileUriQueryParameters(final String cartId, final List<String> itemIdList,
			final String productUnit)
	{
		final MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<>();
		multiValueMap.set(QUERY_PARAM_OAA_PROFILE_ID, oaaProfileId);
		multiValueMap.set(QUERY_PARAM_UNIT, productUnit);

		if (cartId != null && !cartId.isEmpty())
		{
			multiValueMap.add(QUERY_PARAM_EXTERNAL_IDS, buildExternalIdQueryParam(cartId, itemIdList));
		}
		return multiValueMap;
	}

	/**
	 * Assembles the external IDs as query parameter.
	 *
	 * @param cartId
	 * @param itemIdList
	 * @return externalIdQueryParam as string
	 */
	private String buildExternalIdQueryParam(final String cartId, final List<String> itemIdList)
	{
		final StringBuilder strBuilder = new StringBuilder();
		String itemId;
		final Iterator<String> itemIdIterator = itemIdList.iterator();
		while (itemIdIterator.hasNext())
		{
			itemId = itemIdIterator.next();
			if (itemId != null && !itemId.isEmpty())
			{
				if (strBuilder.length() > 0)
				{
					strBuilder.append(',');
				}
				strBuilder.append(serviceUtils.createExternalIdForItem(itemId, cartId));
			}
		}
		return strBuilder.toString();
	}

	/**
	 * Initialize RestInitializationStrategy
	 */
	private void initializeConfiguration()
	{
		try
		{
			restInitializationStrategy.initializeConfigurationWithBaseStore(this);
		}
		catch (final RestInitializationException e)
		{
			LOG.error("Error during initialization of ATP rest call", e);
			throw new ATPException(e.getMessage());
		}

	}

}
