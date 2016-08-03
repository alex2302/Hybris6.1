/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 31, 2016 4:07:33 PM                     ---
 * ----------------------------------------------------------------
 */
package com.sap.retail.commercesuite.saparticlemodel.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.product.UnitModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type ArticleComponent first defined at extension saparticlemodel.
 */
@SuppressWarnings("all")
public class ArticleComponentModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ArticleComponent";
	
	/**<i>Generated relation code constant for relation <code>ArticleComponents</code> defining source attribute <code>structuredArticle</code> in extension <code>saparticlemodel</code>.</i>*/
	public final static String _ARTICLECOMPONENTS = "ArticleComponents";
	
	/** <i>Generated constant</i> - Attribute key of <code>ArticleComponent.component</code> attribute defined at extension <code>saparticlemodel</code>. */
	public static final String COMPONENT = "component";
	
	/** <i>Generated constant</i> - Attribute key of <code>ArticleComponent.quantity</code> attribute defined at extension <code>saparticlemodel</code>. */
	public static final String QUANTITY = "quantity";
	
	/** <i>Generated constant</i> - Attribute key of <code>ArticleComponent.unit</code> attribute defined at extension <code>saparticlemodel</code>. */
	public static final String UNIT = "unit";
	
	/** <i>Generated constant</i> - Attribute key of <code>ArticleComponent.structuredArticlePOS</code> attribute defined at extension <code>saparticlemodel</code>. */
	public static final String STRUCTUREDARTICLEPOS = "structuredArticlePOS";
	
	/** <i>Generated constant</i> - Attribute key of <code>ArticleComponent.structuredArticle</code> attribute defined at extension <code>saparticlemodel</code>. */
	public static final String STRUCTUREDARTICLE = "structuredArticle";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ArticleComponentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ArticleComponentModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _component initial attribute declared by type <code>ArticleComponent</code> at extension <code>saparticlemodel</code>
	 * @param _structuredArticle initial attribute declared by type <code>ArticleComponent</code> at extension <code>saparticlemodel</code>
	 */
	@Deprecated
	public ArticleComponentModel(final ProductModel _component, final ProductModel _structuredArticle)
	{
		super();
		setComponent(_component);
		setStructuredArticle(_structuredArticle);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _component initial attribute declared by type <code>ArticleComponent</code> at extension <code>saparticlemodel</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _structuredArticle initial attribute declared by type <code>ArticleComponent</code> at extension <code>saparticlemodel</code>
	 */
	@Deprecated
	public ArticleComponentModel(final ProductModel _component, final ItemModel _owner, final ProductModel _structuredArticle)
	{
		super();
		setComponent(_component);
		setOwner(_owner);
		setStructuredArticle(_structuredArticle);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ArticleComponent.component</code> attribute defined at extension <code>saparticlemodel</code>. 
	 * @return the component - Component Article
	 */
	@Accessor(qualifier = "component", type = Accessor.Type.GETTER)
	public ProductModel getComponent()
	{
		return getPersistenceContext().getPropertyValue(COMPONENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ArticleComponent.quantity</code> attribute defined at extension <code>saparticlemodel</code>. 
	 * @return the quantity - Quantity
	 */
	@Accessor(qualifier = "quantity", type = Accessor.Type.GETTER)
	public Integer getQuantity()
	{
		return getPersistenceContext().getPropertyValue(QUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ArticleComponent.structuredArticle</code> attribute defined at extension <code>saparticlemodel</code>. 
	 * @return the structuredArticle
	 */
	@Accessor(qualifier = "structuredArticle", type = Accessor.Type.GETTER)
	public ProductModel getStructuredArticle()
	{
		return getPersistenceContext().getPropertyValue(STRUCTUREDARTICLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ArticleComponent.unit</code> attribute defined at extension <code>saparticlemodel</code>. 
	 * @return the unit - Unit of measure
	 */
	@Accessor(qualifier = "unit", type = Accessor.Type.GETTER)
	public UnitModel getUnit()
	{
		return getPersistenceContext().getPropertyValue(UNIT);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ArticleComponent.component</code> attribute defined at extension <code>saparticlemodel</code>. 
	 *  
	 * @param value the component - Component Article
	 */
	@Accessor(qualifier = "component", type = Accessor.Type.SETTER)
	public void setComponent(final ProductModel value)
	{
		getPersistenceContext().setPropertyValue(COMPONENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ArticleComponent.quantity</code> attribute defined at extension <code>saparticlemodel</code>. 
	 *  
	 * @param value the quantity - Quantity
	 */
	@Accessor(qualifier = "quantity", type = Accessor.Type.SETTER)
	public void setQuantity(final Integer value)
	{
		getPersistenceContext().setPropertyValue(QUANTITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>ArticleComponent.structuredArticle</code> attribute defined at extension <code>saparticlemodel</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the structuredArticle
	 */
	@Accessor(qualifier = "structuredArticle", type = Accessor.Type.SETTER)
	public void setStructuredArticle(final ProductModel value)
	{
		getPersistenceContext().setPropertyValue(STRUCTUREDARTICLE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ArticleComponent.unit</code> attribute defined at extension <code>saparticlemodel</code>. 
	 *  
	 * @param value the unit - Unit of measure
	 */
	@Accessor(qualifier = "unit", type = Accessor.Type.SETTER)
	public void setUnit(final UnitModel value)
	{
		getPersistenceContext().setPropertyValue(UNIT, value);
	}
	
}
