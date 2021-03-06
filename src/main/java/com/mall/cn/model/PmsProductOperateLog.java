package com.mall.cn.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table pms_product_operate_log
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class PmsProductOperateLog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_operate_log.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_operate_log.product_id
     *
     * @mbggenerated
     */
    private Long productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_operate_log.price_old
     *
     * @mbggenerated
     */
    private BigDecimal priceOld;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_operate_log.price_new
     *
     * @mbggenerated
     */
    private BigDecimal priceNew;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_operate_log.sale_price_old
     *
     * @mbggenerated
     */
    private BigDecimal salePriceOld;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_operate_log.sale_price_new
     *
     * @mbggenerated
     */
    private BigDecimal salePriceNew;

    /**
     * Database Column Remarks:
     *   赠送的积分
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_operate_log.gift_point_old
     *
     * @mbggenerated
     */
    private Integer giftPointOld;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_operate_log.gift_point_new
     *
     * @mbggenerated
     */
    private Integer giftPointNew;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_operate_log.use_point_limit_old
     *
     * @mbggenerated
     */
    private Integer usePointLimitOld;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_operate_log.use_point_limit_new
     *
     * @mbggenerated
     */
    private Integer usePointLimitNew;

    /**
     * Database Column Remarks:
     *   操作人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_operate_log.operate_man
     *
     * @mbggenerated
     */
    private String operateMan;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_operate_log.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_operate_log.id
     *
     * @return the value of pms_product_operate_log.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_operate_log.id
     *
     * @param id the value for pms_product_operate_log.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_operate_log.product_id
     *
     * @return the value of pms_product_operate_log.product_id
     *
     * @mbggenerated
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_operate_log.product_id
     *
     * @param productId the value for pms_product_operate_log.product_id
     *
     * @mbggenerated
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_operate_log.price_old
     *
     * @return the value of pms_product_operate_log.price_old
     *
     * @mbggenerated
     */
    public BigDecimal getPriceOld() {
        return priceOld;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_operate_log.price_old
     *
     * @param priceOld the value for pms_product_operate_log.price_old
     *
     * @mbggenerated
     */
    public void setPriceOld(BigDecimal priceOld) {
        this.priceOld = priceOld;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_operate_log.price_new
     *
     * @return the value of pms_product_operate_log.price_new
     *
     * @mbggenerated
     */
    public BigDecimal getPriceNew() {
        return priceNew;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_operate_log.price_new
     *
     * @param priceNew the value for pms_product_operate_log.price_new
     *
     * @mbggenerated
     */
    public void setPriceNew(BigDecimal priceNew) {
        this.priceNew = priceNew;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_operate_log.sale_price_old
     *
     * @return the value of pms_product_operate_log.sale_price_old
     *
     * @mbggenerated
     */
    public BigDecimal getSalePriceOld() {
        return salePriceOld;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_operate_log.sale_price_old
     *
     * @param salePriceOld the value for pms_product_operate_log.sale_price_old
     *
     * @mbggenerated
     */
    public void setSalePriceOld(BigDecimal salePriceOld) {
        this.salePriceOld = salePriceOld;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_operate_log.sale_price_new
     *
     * @return the value of pms_product_operate_log.sale_price_new
     *
     * @mbggenerated
     */
    public BigDecimal getSalePriceNew() {
        return salePriceNew;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_operate_log.sale_price_new
     *
     * @param salePriceNew the value for pms_product_operate_log.sale_price_new
     *
     * @mbggenerated
     */
    public void setSalePriceNew(BigDecimal salePriceNew) {
        this.salePriceNew = salePriceNew;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_operate_log.gift_point_old
     *
     * @return the value of pms_product_operate_log.gift_point_old
     *
     * @mbggenerated
     */
    public Integer getGiftPointOld() {
        return giftPointOld;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_operate_log.gift_point_old
     *
     * @param giftPointOld the value for pms_product_operate_log.gift_point_old
     *
     * @mbggenerated
     */
    public void setGiftPointOld(Integer giftPointOld) {
        this.giftPointOld = giftPointOld;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_operate_log.gift_point_new
     *
     * @return the value of pms_product_operate_log.gift_point_new
     *
     * @mbggenerated
     */
    public Integer getGiftPointNew() {
        return giftPointNew;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_operate_log.gift_point_new
     *
     * @param giftPointNew the value for pms_product_operate_log.gift_point_new
     *
     * @mbggenerated
     */
    public void setGiftPointNew(Integer giftPointNew) {
        this.giftPointNew = giftPointNew;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_operate_log.use_point_limit_old
     *
     * @return the value of pms_product_operate_log.use_point_limit_old
     *
     * @mbggenerated
     */
    public Integer getUsePointLimitOld() {
        return usePointLimitOld;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_operate_log.use_point_limit_old
     *
     * @param usePointLimitOld the value for pms_product_operate_log.use_point_limit_old
     *
     * @mbggenerated
     */
    public void setUsePointLimitOld(Integer usePointLimitOld) {
        this.usePointLimitOld = usePointLimitOld;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_operate_log.use_point_limit_new
     *
     * @return the value of pms_product_operate_log.use_point_limit_new
     *
     * @mbggenerated
     */
    public Integer getUsePointLimitNew() {
        return usePointLimitNew;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_operate_log.use_point_limit_new
     *
     * @param usePointLimitNew the value for pms_product_operate_log.use_point_limit_new
     *
     * @mbggenerated
     */
    public void setUsePointLimitNew(Integer usePointLimitNew) {
        this.usePointLimitNew = usePointLimitNew;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_operate_log.operate_man
     *
     * @return the value of pms_product_operate_log.operate_man
     *
     * @mbggenerated
     */
    public String getOperateMan() {
        return operateMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_operate_log.operate_man
     *
     * @param operateMan the value for pms_product_operate_log.operate_man
     *
     * @mbggenerated
     */
    public void setOperateMan(String operateMan) {
        this.operateMan = operateMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_operate_log.create_time
     *
     * @return the value of pms_product_operate_log.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_operate_log.create_time
     *
     * @param createTime the value for pms_product_operate_log.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}