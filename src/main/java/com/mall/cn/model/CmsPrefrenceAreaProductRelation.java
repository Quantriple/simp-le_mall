package com.mall.cn.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table cms_prefrence_area_product_relation
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class CmsPrefrenceAreaProductRelation {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_prefrence_area_product_relation.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_prefrence_area_product_relation.prefrence_area_id
     *
     * @mbggenerated
     */
    private Long prefrenceAreaId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_prefrence_area_product_relation.product_id
     *
     * @mbggenerated
     */
    private Long productId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_prefrence_area_product_relation.id
     *
     * @return the value of cms_prefrence_area_product_relation.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_prefrence_area_product_relation.id
     *
     * @param id the value for cms_prefrence_area_product_relation.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_prefrence_area_product_relation.prefrence_area_id
     *
     * @return the value of cms_prefrence_area_product_relation.prefrence_area_id
     *
     * @mbggenerated
     */
    public Long getPrefrenceAreaId() {
        return prefrenceAreaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_prefrence_area_product_relation.prefrence_area_id
     *
     * @param prefrenceAreaId the value for cms_prefrence_area_product_relation.prefrence_area_id
     *
     * @mbggenerated
     */
    public void setPrefrenceAreaId(Long prefrenceAreaId) {
        this.prefrenceAreaId = prefrenceAreaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_prefrence_area_product_relation.product_id
     *
     * @return the value of cms_prefrence_area_product_relation.product_id
     *
     * @mbggenerated
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_prefrence_area_product_relation.product_id
     *
     * @param productId the value for cms_prefrence_area_product_relation.product_id
     *
     * @mbggenerated
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }
}