package com.mall.cn.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sms_coupon_product_relation
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class SmsCouponProductRelation {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon_product_relation.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon_product_relation.coupon_id
     *
     * @mbggenerated
     */
    private Long couponId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon_product_relation.product_id
     *
     * @mbggenerated
     */
    private Long productId;

    /**
     * Database Column Remarks:
     *   商品名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon_product_relation.product_name
     *
     * @mbggenerated
     */
    private String productName;

    /**
     * Database Column Remarks:
     *   商品编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_coupon_product_relation.product_sn
     *
     * @mbggenerated
     */
    private String productSn;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon_product_relation.id
     *
     * @return the value of sms_coupon_product_relation.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon_product_relation.id
     *
     * @param id the value for sms_coupon_product_relation.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon_product_relation.coupon_id
     *
     * @return the value of sms_coupon_product_relation.coupon_id
     *
     * @mbggenerated
     */
    public Long getCouponId() {
        return couponId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon_product_relation.coupon_id
     *
     * @param couponId the value for sms_coupon_product_relation.coupon_id
     *
     * @mbggenerated
     */
    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon_product_relation.product_id
     *
     * @return the value of sms_coupon_product_relation.product_id
     *
     * @mbggenerated
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon_product_relation.product_id
     *
     * @param productId the value for sms_coupon_product_relation.product_id
     *
     * @mbggenerated
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon_product_relation.product_name
     *
     * @return the value of sms_coupon_product_relation.product_name
     *
     * @mbggenerated
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon_product_relation.product_name
     *
     * @param productName the value for sms_coupon_product_relation.product_name
     *
     * @mbggenerated
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_coupon_product_relation.product_sn
     *
     * @return the value of sms_coupon_product_relation.product_sn
     *
     * @mbggenerated
     */
    public String getProductSn() {
        return productSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_coupon_product_relation.product_sn
     *
     * @param productSn the value for sms_coupon_product_relation.product_sn
     *
     * @mbggenerated
     */
    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }
}