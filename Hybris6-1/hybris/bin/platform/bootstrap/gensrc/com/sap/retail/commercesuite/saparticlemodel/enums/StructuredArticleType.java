package com.sap.retail.commercesuite.saparticlemodel.enums;

import de.hybris.platform.core.HybrisEnumValue;

/**
 * Generated enum StructuredArticleType declared at extension saparticlemodel.
 * <p/>
 * Structured Article Type.
 */
@SuppressWarnings("PMD")
public enum StructuredArticleType implements HybrisEnumValue
{
	/**
	 * Generated enum value for StructuredArticleType.DISPLAY declared at extension saparticlemodel.
	 */
	DISPLAY("DISPLAY"),
	/**
	 * Generated enum value for StructuredArticleType.SALES_SET declared at extension saparticlemodel.
	 */
	SALES_SET("SALES_SET"),
	/**
	 * Generated enum value for StructuredArticleType.PREPACK declared at extension saparticlemodel.
	 */
	PREPACK("PREPACK");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "StructuredArticleType";
	
	/**<i>Generated simple class name constant.</i>*/
	public final static String SIMPLE_CLASSNAME = "StructuredArticleType";
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private StructuredArticleType(final String code)
	{
		this.code = code.intern();
	}
	
	
	/**
	 * Gets the code of this enum value.
	 *  
	 * @return code of value
	 */
	@Override
	public String getCode()
	{
		return this.code;
	}
	
	/**
	 * Gets the type this enum value belongs to.
	 *  
	 * @return code of type
	 */
	@Override
	public String getType()
	{
		return SIMPLE_CLASSNAME;
	}
	
}
