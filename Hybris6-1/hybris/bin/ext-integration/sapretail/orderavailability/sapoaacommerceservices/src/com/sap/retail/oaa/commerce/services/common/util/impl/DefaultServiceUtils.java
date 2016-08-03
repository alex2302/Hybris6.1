/*****************************************************************************
    Class:        DefaultServiceUtils
    Copyright (c) 2015, SAP SE, Germany, All rights reserved.

 *****************************************************************************/
package com.sap.retail.oaa.commerce.services.common.util.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.TimeZone;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.apache.log4j.Logger;

import com.sap.retail.oaa.commerce.services.common.jaxb.pojos.response.Message;
import com.sap.retail.oaa.commerce.services.common.jaxb.pojos.response.MessagesList;
import com.sap.retail.oaa.commerce.services.common.util.ServiceUtils;


/**
 * REST Service Utility Class
 */
public class DefaultServiceUtils implements ServiceUtils
{
	private static final Logger LOG = Logger.getLogger(ServiceUtils.class);
	private TimeZone timeZone = TimeZone.getTimeZone("UTC");
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	private String leadingZeroFormatter = "%018d";


	@Override
	public String convertGuidToBase64(final String cartGuid) throws DecoderException
	{
		final String sapGuid = cartGuid.replace("-", "");
		final Hex hex = new Hex();
		byte[] sapGuidAsDecodedHex;

		sapGuidAsDecodedHex = (byte[]) hex.decode(sapGuid);

		return Base64.getEncoder().encodeToString(sapGuidAsDecodedHex);
	}

	@Override
	public String addLeadingZeros(final String productCode)
	{

		if (isNumeric(productCode))
		{
			String productCodeWithLeadingZeros;
			productCodeWithLeadingZeros = String.format(leadingZeroFormatter, formatStringtoInt(productCode));
			return productCodeWithLeadingZeros;
		}
		else
		{
			return productCode;
		}
	}

	@Override
	public boolean isNumeric(final String str)
	{
		try
		{
			Integer.parseInt(str);
		}
		catch (final NumberFormatException nfe)
		{
			return false;
		}
		return true;
	}

	@Override
	public Integer formatStringtoInt(final String str)
	{
		return Integer.valueOf(str);
	}

	@Override
	public boolean logMessageResponseAndCheckMessageType(final Logger logger, final MessagesList messages)
	{
		boolean hasErrorMessage = false;

		if (messages == null || messages.getMessages() == null)
		{
			return hasErrorMessage;
		}

		for (final Message message : messages.getMessages())
		{
			if ("E".equalsIgnoreCase(message.getType()))
			{
				logger.error(message.getMessageText());
				hasErrorMessage = true;
			}
			else if ("W".equalsIgnoreCase(message.getType()))
			{
				logger.warn(message.getMessageText());
			}
			else
			{
				logger.info(message.getMessageText());
			}
		}
		return hasErrorMessage;
	}

	@Override
	public Date parseStringToDate(final String dateAsString)
	{
		Date date = null;
		try
		{
			date = dateFormat.parse(dateAsString);
		}
		catch (final ParseException e)
		{
			LOG.error("Error while parsing date" + e);
		}

		return date;
	}

	@Override
	public String removeLeadingZeros(final String productCode)
	{
		if (this.isNumeric(productCode))
		{
			return this.formatStringtoInt(productCode).toString();
		}
		return productCode;
	}

	@Override
	public String formatDateToString(final Date date)
	{
		return dateFormat.format(date);
	}

	/**
	 * @param dateFormat
	 */
	public void setDateFormat(final String dateFormat)
	{
		this.dateFormat = new SimpleDateFormat(dateFormat);
		this.dateFormat.setTimeZone(timeZone);
	}

	/**
	 * @param timeZone
	 */
	public void setTimeZone(final String timeZone)
	{
		this.timeZone = TimeZone.getTimeZone(timeZone);
		this.dateFormat.setTimeZone(this.timeZone);
	}

	/**
	 * @param leadingZeroFormatter
	 *           the leadingZeroFormatter to set
	 */
	public void setLeadingZeroFormatter(final String leadingZeroFormatter)
	{
		this.leadingZeroFormatter = leadingZeroFormatter;
	}

	/**
	 * @param itemNo
	 * @param guid
	 * @return String
	 */
	@Override
	public String createExternalIdForItem(final String itemNo, final String guid)
	{
		final String cartGuid = guid.replace("-", "");
		final StringBuilder externalItemId = new StringBuilder(cartGuid);
		externalItemId.append('-');
		externalItemId.append(itemNo);
		return externalItemId.toString();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.sap.retail.oaa.commerce.services.common.util.ServiceUtils#extractItemIdFromExternalId(java.lang.String)
	 */
	@Override
	public String extractItemIdFromExternalId(final String externalId)
	{
		return externalId.split("-")[1];
	}


}
