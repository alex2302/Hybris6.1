/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 31, 2016 4:07:33 PM                     ---
 * ----------------------------------------------------------------
 */
package sap.hybris.integration.models.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SAPProductIDDataConversion first defined at extension sapmodel.
 */
@SuppressWarnings("all")
public class SAPProductIDDataConversionModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SAPProductIDDataConversion";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPProductIDDataConversion.conversionID</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String CONVERSIONID = "conversionID";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPProductIDDataConversion.matnrLength</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String MATNRLENGTH = "matnrLength";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPProductIDDataConversion.displayLeadingZeros</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String DISPLAYLEADINGZEROS = "displayLeadingZeros";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPProductIDDataConversion.displayLexicographic</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String DISPLAYLEXICOGRAPHIC = "displayLexicographic";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPProductIDDataConversion.mask</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String MASK = "mask";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPProductIDDataConversionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPProductIDDataConversionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public SAPProductIDDataConversionModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductIDDataConversion.conversionID</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the conversionID - Conversion ID
	 */
	@Accessor(qualifier = "conversionID", type = Accessor.Type.GETTER)
	public String getConversionID()
	{
		return getPersistenceContext().getPropertyValue(CONVERSIONID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductIDDataConversion.displayLeadingZeros</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the displayLeadingZeros - Indicator: Display material number with leading zeros
	 */
	@Accessor(qualifier = "displayLeadingZeros", type = Accessor.Type.GETTER)
	public Boolean getDisplayLeadingZeros()
	{
		return getPersistenceContext().getPropertyValue(DISPLAYLEADINGZEROS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductIDDataConversion.displayLexicographic</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the displayLexicographic - Indicator for lexicographical material numbers
	 */
	@Accessor(qualifier = "displayLexicographic", type = Accessor.Type.GETTER)
	public Boolean getDisplayLexicographic()
	{
		return getPersistenceContext().getPropertyValue(DISPLAYLEXICOGRAPHIC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductIDDataConversion.mask</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the mask - Template for material number conversion
	 */
	@Accessor(qualifier = "mask", type = Accessor.Type.GETTER)
	public String getMask()
	{
		return getPersistenceContext().getPropertyValue(MASK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPProductIDDataConversion.matnrLength</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the matnrLength - Length of the material number
	 */
	@Accessor(qualifier = "matnrLength", type = Accessor.Type.GETTER)
	public Integer getMatnrLength()
	{
		return getPersistenceContext().getPropertyValue(MATNRLENGTH);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPProductIDDataConversion.conversionID</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the conversionID - Conversion ID
	 */
	@Accessor(qualifier = "conversionID", type = Accessor.Type.SETTER)
	public void setConversionID(final String value)
	{
		getPersistenceContext().setPropertyValue(CONVERSIONID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPProductIDDataConversion.displayLeadingZeros</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the displayLeadingZeros - Indicator: Display material number with leading zeros
	 */
	@Accessor(qualifier = "displayLeadingZeros", type = Accessor.Type.SETTER)
	public void setDisplayLeadingZeros(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(DISPLAYLEADINGZEROS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPProductIDDataConversion.displayLexicographic</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the displayLexicographic - Indicator for lexicographical material numbers
	 */
	@Accessor(qualifier = "displayLexicographic", type = Accessor.Type.SETTER)
	public void setDisplayLexicographic(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(DISPLAYLEXICOGRAPHIC, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPProductIDDataConversion.mask</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the mask - Template for material number conversion
	 */
	@Accessor(qualifier = "mask", type = Accessor.Type.SETTER)
	public void setMask(final String value)
	{
		getPersistenceContext().setPropertyValue(MASK, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPProductIDDataConversion.matnrLength</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the matnrLength - Length of the material number
	 */
	@Accessor(qualifier = "matnrLength", type = Accessor.Type.SETTER)
	public void setMatnrLength(final Integer value)
	{
		getPersistenceContext().setPropertyValue(MATNRLENGTH, value);
	}
	
}
