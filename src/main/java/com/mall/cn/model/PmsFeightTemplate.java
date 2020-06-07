package com.mall.cn.model;

import java.math.BigDecimal;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table pms_feight_template
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class PmsFeightTemplate {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_feight_template.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_feight_template.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * Database Column Remarks:
     *   计费类型:0->按重量；1->按件数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_feight_template.charge_type
     *
     * @mbggenerated
     */
    private Integer chargeType;

    /**
     * Database Column Remarks:
     *   首重kg
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_feight_template.first_weight
     *
     * @mbggenerated
     */
    private BigDecimal firstWeight;

    /**
     * Database Column Remarks:
     *   首费（元）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_feight_template.first_fee
     *
     * @mbggenerated
     */
    private BigDecimal firstFee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_feight_template.continue_weight
     *
     * @mbggenerated
     */
    private BigDecimal continueWeight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_feight_template.continme_fee
     *
     * @mbggenerated
     */
    private BigDecimal continmeFee;

    /**
     * Database Column Remarks:
     *   目的地（省、市）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_feight_template.dest
     *
     * @mbggenerated
     */
    private String dest;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_feight_template.id
     *
     * @return the value of pms_feight_template.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_feight_template.id
     *
     * @param id the value for pms_feight_template.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_feight_template.name
     *
     * @return the value of pms_feight_template.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_feight_template.name
     *
     * @param name the value for pms_feight_template.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_feight_template.charge_type
     *
     * @return the value of pms_feight_template.charge_type
     *
     * @mbggenerated
     */
    public Integer getChargeType() {
        return chargeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_feight_template.charge_type
     *
     * @param chargeType the value for pms_feight_template.charge_type
     *
     * @mbggenerated
     */
    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_feight_template.first_weight
     *
     * @return the value of pms_feight_template.first_weight
     *
     * @mbggenerated
     */
    public BigDecimal getFirstWeight() {
        return firstWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_feight_template.first_weight
     *
     * @param firstWeight the value for pms_feight_template.first_weight
     *
     * @mbggenerated
     */
    public void setFirstWeight(BigDecimal firstWeight) {
        this.firstWeight = firstWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_feight_template.first_fee
     *
     * @return the value of pms_feight_template.first_fee
     *
     * @mbggenerated
     */
    public BigDecimal getFirstFee() {
        return firstFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_feight_template.first_fee
     *
     * @param firstFee the value for pms_feight_template.first_fee
     *
     * @mbggenerated
     */
    public void setFirstFee(BigDecimal firstFee) {
        this.firstFee = firstFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_feight_template.continue_weight
     *
     * @return the value of pms_feight_template.continue_weight
     *
     * @mbggenerated
     */
    public BigDecimal getContinueWeight() {
        return continueWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_feight_template.continue_weight
     *
     * @param continueWeight the value for pms_feight_template.continue_weight
     *
     * @mbggenerated
     */
    public void setContinueWeight(BigDecimal continueWeight) {
        this.continueWeight = continueWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_feight_template.continme_fee
     *
     * @return the value of pms_feight_template.continme_fee
     *
     * @mbggenerated
     */
    public BigDecimal getContinmeFee() {
        return continmeFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_feight_template.continme_fee
     *
     * @param continmeFee the value for pms_feight_template.continme_fee
     *
     * @mbggenerated
     */
    public void setContinmeFee(BigDecimal continmeFee) {
        this.continmeFee = continmeFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_feight_template.dest
     *
     * @return the value of pms_feight_template.dest
     *
     * @mbggenerated
     */
    public String getDest() {
        return dest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_feight_template.dest
     *
     * @param dest the value for pms_feight_template.dest
     *
     * @mbggenerated
     */
    public void setDest(String dest) {
        this.dest = dest;
    }
}