package com.mall.cn.model;

import java.math.BigDecimal;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table pms_member_price
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class PmsMemberPrice {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_member_price.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_member_price.product_id
     *
     * @mbggenerated
     */
    private Long productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_member_price.member_level_id
     *
     * @mbggenerated
     */
    private Long memberLevelId;

    /**
     * Database Column Remarks:
     *   会员价格
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_member_price.member_price
     *
     * @mbggenerated
     */
    private BigDecimal memberPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_member_price.member_level_name
     *
     * @mbggenerated
     */
    private String memberLevelName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_member_price.id
     *
     * @return the value of pms_member_price.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_member_price.id
     *
     * @param id the value for pms_member_price.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_member_price.product_id
     *
     * @return the value of pms_member_price.product_id
     *
     * @mbggenerated
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_member_price.product_id
     *
     * @param productId the value for pms_member_price.product_id
     *
     * @mbggenerated
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_member_price.member_level_id
     *
     * @return the value of pms_member_price.member_level_id
     *
     * @mbggenerated
     */
    public Long getMemberLevelId() {
        return memberLevelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_member_price.member_level_id
     *
     * @param memberLevelId the value for pms_member_price.member_level_id
     *
     * @mbggenerated
     */
    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_member_price.member_price
     *
     * @return the value of pms_member_price.member_price
     *
     * @mbggenerated
     */
    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_member_price.member_price
     *
     * @param memberPrice the value for pms_member_price.member_price
     *
     * @mbggenerated
     */
    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_member_price.member_level_name
     *
     * @return the value of pms_member_price.member_level_name
     *
     * @mbggenerated
     */
    public String getMemberLevelName() {
        return memberLevelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_member_price.member_level_name
     *
     * @param memberLevelName the value for pms_member_price.member_level_name
     *
     * @mbggenerated
     */
    public void setMemberLevelName(String memberLevelName) {
        this.memberLevelName = memberLevelName;
    }
}