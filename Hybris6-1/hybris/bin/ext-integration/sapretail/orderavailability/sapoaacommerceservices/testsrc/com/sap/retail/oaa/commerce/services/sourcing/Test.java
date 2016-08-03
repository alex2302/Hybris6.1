/**
 *
 */
package com.sap.retail.oaa.commerce.services.sourcing;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;






/**
 * @author d046583
 *
 */
public class Test
{

	/**
	 * @param args
	 * @throws DecoderException
	 */
	public static void main(final String[] args) throws DecoderException
	{
		String guid = "7a7969f5f-c774-ceb87-b28b7f29bfe898";
		guid = guid.replace("-", "");

		final Hex hex = new Hex();
		final Object decodedHex = hex.decode(guid);

		Base64.encodeBase64String((byte[]) decodedHex);





	}
}
