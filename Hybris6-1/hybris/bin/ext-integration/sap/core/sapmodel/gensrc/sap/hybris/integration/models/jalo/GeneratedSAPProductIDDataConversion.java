/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 31, 2016 4:07:33 PM                     ---
 * ----------------------------------------------------------------
 */
package sap.hybris.integration.models.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import sap.hybris.integration.models.constants.SapmodelConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem SAPProductIDDataConversion}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSAPProductIDDataConversion extends GenericItem
{
	/** Qualifier of the <code>SAPProductIDDataConversion.conversionID</code> attribute **/
	public static final String CONVERSIONID = "conversionID";
	/** Qualifier of the <code>SAPProductIDDataConversion.matnrLength</code> attribute **/
	public static final String MATNRLENGTH = "matnrLength";
	/** Qualifier of the <code>SAPProductIDDataConversion.displayLeadingZeros</code> attribute **/
	public static final String DISPLAYLEADINGZEROS = "displayLeadingZeros";
	/** Qualifier of the <code>SAPProductIDDataConversion.displayLexicographic</code> attribute **/
	public static final String DISPLAYLEXICOGRAPHIC = "displayLexicographic";
	/** Qualifier of the <code>SAPProductIDDataConversion.mask</code> attribute **/
	public static final String MASK = "mask";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CONVERSIONID, AttributeMode.INITIAL);
		tmp.put(MATNRLENGTH, AttributeMode.INITIAL);
		tmp.put(DISPLAYLEADINGZEROS, AttributeMode.INITIAL);
		tmp.put(DISPLAYLEXICOGRAPHIC, AttributeMode.INITIAL);
		tmp.put(MASK, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductIDDataConversion.conversionID</code> attribute.
	 * @return the conversionID - Conversion ID
	 */
	public String getConversionID(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONVERSIONID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductIDDataConversion.conversionID</code> attribute.
	 * @return the conversionID - Conversion ID
	 */
	public String getConversionID()
	{
		return getConversionID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPProductIDDataConversion.conversionID</code> attribute. 
	 * @param value the conversionID - Conversion ID
	 */
	public void setConversionID(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONVERSIONID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPProductIDDataConversion.conversionID</code> attribute. 
	 * @param value the conversionID - Conversion ID
	 */
	public void setConversionID(final String value)
	{
		setConversionID( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductIDDataConversion.displayLeadingZeros</code> attribute.
	 * @return the displayLeadingZeros - Indicator: Display material number with leading zeros
	 */
	public Boolean isDisplayLeadingZeros(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DISPLAYLEADINGZEROS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductIDDataConversion.displayLeadingZeros</code> attribute.
	 * @return the displayLeadingZeros - Indicator: Display material number with leading zeros
	 */
	public Boolean isDisplayLeadingZeros()
	{
		return isDisplayLeadingZeros( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductIDDataConversion.displayLeadingZeros</code> attribute. 
	 * @return the displayLeadingZeros - Indicator: Display material number with leading zeros
	 */
	public boolean isDisplayLeadingZerosAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDisplayLeadingZeros( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductIDDataConversion.displayLeadingZeros</code> attribute. 
	 * @return the displayLeadingZeros - Indicator: Display material number with leading zeros
	 */
	public boolean isDisplayLeadingZerosAsPrimitive()
	{
		return isDisplayLeadingZerosAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPProductIDDataConversion.displayLeadingZeros</code> attribute. 
	 * @param value the displayLeadingZeros - Indicator: Display material number with leading zeros
	 */
	public void setDisplayLeadingZeros(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DISPLAYLEADINGZEROS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPProductIDDataConversion.displayLeadingZeros</code> attribute. 
	 * @param value the displayLeadingZeros - Indicator: Display material number with leading zeros
	 */
	public void setDisplayLeadingZeros(final Boolean value)
	{
		setDisplayLeadingZeros( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPProductIDDataConversion.displayLeadingZeros</code> attribute. 
	 * @param value the displayLeadingZeros - Indicator: Display material number with leading zeros
	 */
	public void setDisplayLeadingZeros(final SessionContext ctx, final boolean value)
	{
		setDisplayLeadingZeros( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPProductIDDataConversion.displayLeadingZeros</code> attribute. 
	 * @param value the displayLeadingZeros - Indicator: Display material number with leading zeros
	 */
	public void setDisplayLeadingZeros(final boolean value)
	{
		setDisplayLeadingZeros( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductIDDataConversion.displayLexicographic</code> attribute.
	 * @return the displayLexicographic - Indicator for lexicographical material numbers
	 */
	public Boolean isDisplayLexicographic(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DISPLAYLEXICOGRAPHIC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductIDDataConversion.displayLexicographic</code> attribute.
	 * @return the displayLexicographic - Indicator for lexicographical material numbers
	 */
	public Boolean isDisplayLexicographic()
	{
		return isDisplayLexicographic( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductIDDataConversion.displayLexicographic</code> attribute. 
	 * @return the displayLexicographic - Indicator for lexicographical material numbers
	 */
	public boolean isDisplayLexicographicAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDisplayLexicographic( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductIDDataConversion.displayLexicographic</code> attribute. 
	 * @return the displayLexicographic - Indicator for lexicographical material numbers
	 */
	public boolean isDisplayLexicographicAsPrimitive()
	{
		return isDisplayLexicographicAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPProductIDDataConversion.displayLexicographic</code> attribute. 
	 * @param value the displayLexicographic - Indicator for lexicographical material numbers
	 */
	public void setDisplayLexicographic(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DISPLAYLEXICOGRAPHIC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPProductIDDataConversion.displayLexicographic</code> attribute. 
	 * @param value the displayLexicographic - Indicator for lexicographical material numbers
	 */
	public void setDisplayLexicographic(final Boolean value)
	{
		setDisplayLexicographic( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPProductIDDataConversion.displayLexicographic</code> attribute. 
	 * @param value the displayLexicographic - Indicator for lexicographical material numbers
	 */
	public void setDisplayLexicographic(final SessionContext ctx, final boolean value)
	{
		setDisplayLexicographic( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPProductIDDataConversion.displayLexicographic</code> attribute. 
	 * @param value the displayLexicographic - Indicator for lexicographical material numbers
	 */
	public void setDisplayLexicographic(final boolean value)
	{
		setDisplayLexicographic( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductIDDataConversion.mask</code> attribute.
	 * @return the mask - Template for material number conversion
	 */
	public String getMask(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MASK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductIDDataConversion.mask</code> attribute.
	 * @return the mask - Template for material number conversion
	 */
	public String getMask()
	{
		return getMask( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPProductIDDataConversion.mask</code> attribute. 
	 * @param value the mask - Template for material number conversion
	 */
	public void setMask(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MASK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPProductIDDataConversion.mask</code> attribute. 
	 * @param value the mask - Template for material number conversion
	 */
	public void setMask(final String value)
	{
		setMask( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductIDDataConversion.matnrLength</code> attribute.
	 * @return the matnrLength - Length of the material number
	 */
	public Integer getMatnrLength(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MATNRLENGTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductIDDataConversion.matnrLength</code> attribute.
	 * @return the matnrLength - Length of the material number
	 */
	public Integer getMatnrLength()
	{
		return getMatnrLength( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductIDDataConversion.matnrLength</code> attribute. 
	 * @return the matnrLength - Length of the material number
	 */
	public int getMatnrLengthAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMatnrLength( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductIDDataConversion.matnrLength</code> attribute. 
	 * @return the matnrLength - Length of the material number
	 */
	public int getMatnrLengthAsPrimitive()
	{
		return getMatnrLengthAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPProductIDDataConversion.matnrLength</code> attribute. 
	 * @param value the matnrLength - Length of the material number
	 */
	public void setMatnrLength(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MATNRLENGTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPProductIDDataConversion.matnrLength</code> attribute. 
	 * @param value the matnrLength - Length of the material number
	 */
	public void setMatnrLength(final Integer value)
	{
		setMatnrLength( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPProductIDDataConversion.matnrLength</code> attribute. 
	 * @param value the matnrLength - Length of the material number
	 */
	public void setMatnrLength(final SessionContext ctx, final int value)
	{
		setMatnrLength( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SAPProductIDDataConversion.matnrLength</code> attribute. 
	 * @param value the matnrLength - Length of the material number
	 */
	public void setMatnrLength(final int value)
	{
		setMatnrLength( getSession().getSessionContext(), value );
	}
	
}
