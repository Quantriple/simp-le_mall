package com.mall.cn.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ums_member_product_category_relation
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class UmsMemberProductCategoryRelation {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_product_category_relation.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_product_category_relation.member_id
     *
     * @mbggenerated
     */
    private Long memberId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_product_category_relation.product_category_id
     *
     * @mbggenerated
     */
    private Long productCategoryId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_product_category_relation.id
     *
     * @return the value of ums_member_product_category_relation.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_product_category_relation.id
     *
     * @param id the value for ums_member_product_category_relation.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_product_category_relation.member_id
     *
     * @return the value of ums_member_product_category_relation.member_id
     *
     * @mbggenerated
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_product_category_relation.member_id
     *
     * @param memberId the value for ums_member_product_category_relation.member_id
     *
     * @mbggenerated
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_product_category_relation.product_category_id
     *
     * @return the value of ums_member_product_category_relation.product_category_id
     *
     * @mbggenerated
     */
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_product_category_relation.product_category_id
     *
     * @param productCategoryId the value for ums_member_product_category_relation.product_category_id
     *
     * @mbggenerated
     */
    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }
}