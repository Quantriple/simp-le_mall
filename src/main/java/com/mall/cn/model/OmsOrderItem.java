package com.mall.cn.model;

import java.math.BigDecimal;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table oms_order_item
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class OmsOrderItem {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   订单id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.order_id
     *
     * @mbggenerated
     */
    private Long orderId;

    /**
     * Database Column Remarks:
     *   订单编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.order_sn
     *
     * @mbggenerated
     */
    private String orderSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_id
     *
     * @mbggenerated
     */
    private Long productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_pic
     *
     * @mbggenerated
     */
    private String productPic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_name
     *
     * @mbggenerated
     */
    private String productName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_brand
     *
     * @mbggenerated
     */
    private String productBrand;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_sn
     *
     * @mbggenerated
     */
    private String productSn;

    /**
     * Database Column Remarks:
     *   销售价格
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_price
     *
     * @mbggenerated
     */
    private BigDecimal productPrice;

    /**
     * Database Column Remarks:
     *   购买数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_quantity
     *
     * @mbggenerated
     */
    private Integer productQuantity;

    /**
     * Database Column Remarks:
     *   商品sku编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_sku_id
     *
     * @mbggenerated
     */
    private Long productSkuId;

    /**
     * Database Column Remarks:
     *   商品sku条码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_sku_code
     *
     * @mbggenerated
     */
    private String productSkuCode;

    /**
     * Database Column Remarks:
     *   商品分类id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_category_id
     *
     * @mbggenerated
     */
    private Long productCategoryId;

    /**
     * Database Column Remarks:
     *   商品的销售属性
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.sp1
     *
     * @mbggenerated
     */
    private String sp1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.sp2
     *
     * @mbggenerated
     */
    private String sp2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.sp3
     *
     * @mbggenerated
     */
    private String sp3;

    /**
     * Database Column Remarks:
     *   商品促销名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.promotion_name
     *
     * @mbggenerated
     */
    private String promotionName;

    /**
     * Database Column Remarks:
     *   商品促销分解金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.promotion_amount
     *
     * @mbggenerated
     */
    private BigDecimal promotionAmount;

    /**
     * Database Column Remarks:
     *   优惠券优惠分解金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.coupon_amount
     *
     * @mbggenerated
     */
    private BigDecimal couponAmount;

    /**
     * Database Column Remarks:
     *   积分优惠分解金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.integration_amount
     *
     * @mbggenerated
     */
    private BigDecimal integrationAmount;

    /**
     * Database Column Remarks:
     *   该商品经过优惠后的分解金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.real_amount
     *
     * @mbggenerated
     */
    private BigDecimal realAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.gift_integration
     *
     * @mbggenerated
     */
    private Integer giftIntegration;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.gift_growth
     *
     * @mbggenerated
     */
    private Integer giftGrowth;

    /**
     * Database Column Remarks:
     *   商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_attr
     *
     * @mbggenerated
     */
    private String productAttr;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.id
     *
     * @return the value of oms_order_item.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.id
     *
     * @param id the value for oms_order_item.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.order_id
     *
     * @return the value of oms_order_item.order_id
     *
     * @mbggenerated
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.order_id
     *
     * @param orderId the value for oms_order_item.order_id
     *
     * @mbggenerated
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.order_sn
     *
     * @return the value of oms_order_item.order_sn
     *
     * @mbggenerated
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.order_sn
     *
     * @param orderSn the value for oms_order_item.order_sn
     *
     * @mbggenerated
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_id
     *
     * @return the value of oms_order_item.product_id
     *
     * @mbggenerated
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_id
     *
     * @param productId the value for oms_order_item.product_id
     *
     * @mbggenerated
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_pic
     *
     * @return the value of oms_order_item.product_pic
     *
     * @mbggenerated
     */
    public String getProductPic() {
        return productPic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_pic
     *
     * @param productPic the value for oms_order_item.product_pic
     *
     * @mbggenerated
     */
    public void setProductPic(String productPic) {
        this.productPic = productPic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_name
     *
     * @return the value of oms_order_item.product_name
     *
     * @mbggenerated
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_name
     *
     * @param productName the value for oms_order_item.product_name
     *
     * @mbggenerated
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_brand
     *
     * @return the value of oms_order_item.product_brand
     *
     * @mbggenerated
     */
    public String getProductBrand() {
        return productBrand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_brand
     *
     * @param productBrand the value for oms_order_item.product_brand
     *
     * @mbggenerated
     */
    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_sn
     *
     * @return the value of oms_order_item.product_sn
     *
     * @mbggenerated
     */
    public String getProductSn() {
        return productSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_sn
     *
     * @param productSn the value for oms_order_item.product_sn
     *
     * @mbggenerated
     */
    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_price
     *
     * @return the value of oms_order_item.product_price
     *
     * @mbggenerated
     */
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_price
     *
     * @param productPrice the value for oms_order_item.product_price
     *
     * @mbggenerated
     */
    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_quantity
     *
     * @return the value of oms_order_item.product_quantity
     *
     * @mbggenerated
     */
    public Integer getProductQuantity() {
        return productQuantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_quantity
     *
     * @param productQuantity the value for oms_order_item.product_quantity
     *
     * @mbggenerated
     */
    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_sku_id
     *
     * @return the value of oms_order_item.product_sku_id
     *
     * @mbggenerated
     */
    public Long getProductSkuId() {
        return productSkuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_sku_id
     *
     * @param productSkuId the value for oms_order_item.product_sku_id
     *
     * @mbggenerated
     */
    public void setProductSkuId(Long productSkuId) {
        this.productSkuId = productSkuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_sku_code
     *
     * @return the value of oms_order_item.product_sku_code
     *
     * @mbggenerated
     */
    public String getProductSkuCode() {
        return productSkuCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_sku_code
     *
     * @param productSkuCode the value for oms_order_item.product_sku_code
     *
     * @mbggenerated
     */
    public void setProductSkuCode(String productSkuCode) {
        this.productSkuCode = productSkuCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_category_id
     *
     * @return the value of oms_order_item.product_category_id
     *
     * @mbggenerated
     */
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_category_id
     *
     * @param productCategoryId the value for oms_order_item.product_category_id
     *
     * @mbggenerated
     */
    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.sp1
     *
     * @return the value of oms_order_item.sp1
     *
     * @mbggenerated
     */
    public String getSp1() {
        return sp1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.sp1
     *
     * @param sp1 the value for oms_order_item.sp1
     *
     * @mbggenerated
     */
    public void setSp1(String sp1) {
        this.sp1 = sp1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.sp2
     *
     * @return the value of oms_order_item.sp2
     *
     * @mbggenerated
     */
    public String getSp2() {
        return sp2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.sp2
     *
     * @param sp2 the value for oms_order_item.sp2
     *
     * @mbggenerated
     */
    public void setSp2(String sp2) {
        this.sp2 = sp2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.sp3
     *
     * @return the value of oms_order_item.sp3
     *
     * @mbggenerated
     */
    public String getSp3() {
        return sp3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.sp3
     *
     * @param sp3 the value for oms_order_item.sp3
     *
     * @mbggenerated
     */
    public void setSp3(String sp3) {
        this.sp3 = sp3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.promotion_name
     *
     * @return the value of oms_order_item.promotion_name
     *
     * @mbggenerated
     */
    public String getPromotionName() {
        return promotionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.promotion_name
     *
     * @param promotionName the value for oms_order_item.promotion_name
     *
     * @mbggenerated
     */
    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.promotion_amount
     *
     * @return the value of oms_order_item.promotion_amount
     *
     * @mbggenerated
     */
    public BigDecimal getPromotionAmount() {
        return promotionAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.promotion_amount
     *
     * @param promotionAmount the value for oms_order_item.promotion_amount
     *
     * @mbggenerated
     */
    public void setPromotionAmount(BigDecimal promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.coupon_amount
     *
     * @return the value of oms_order_item.coupon_amount
     *
     * @mbggenerated
     */
    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.coupon_amount
     *
     * @param couponAmount the value for oms_order_item.coupon_amount
     *
     * @mbggenerated
     */
    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.integration_amount
     *
     * @return the value of oms_order_item.integration_amount
     *
     * @mbggenerated
     */
    public BigDecimal getIntegrationAmount() {
        return integrationAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.integration_amount
     *
     * @param integrationAmount the value for oms_order_item.integration_amount
     *
     * @mbggenerated
     */
    public void setIntegrationAmount(BigDecimal integrationAmount) {
        this.integrationAmount = integrationAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.real_amount
     *
     * @return the value of oms_order_item.real_amount
     *
     * @mbggenerated
     */
    public BigDecimal getRealAmount() {
        return realAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.real_amount
     *
     * @param realAmount the value for oms_order_item.real_amount
     *
     * @mbggenerated
     */
    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.gift_integration
     *
     * @return the value of oms_order_item.gift_integration
     *
     * @mbggenerated
     */
    public Integer getGiftIntegration() {
        return giftIntegration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.gift_integration
     *
     * @param giftIntegration the value for oms_order_item.gift_integration
     *
     * @mbggenerated
     */
    public void setGiftIntegration(Integer giftIntegration) {
        this.giftIntegration = giftIntegration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.gift_growth
     *
     * @return the value of oms_order_item.gift_growth
     *
     * @mbggenerated
     */
    public Integer getGiftGrowth() {
        return giftGrowth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.gift_growth
     *
     * @param giftGrowth the value for oms_order_item.gift_growth
     *
     * @mbggenerated
     */
    public void setGiftGrowth(Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_attr
     *
     * @return the value of oms_order_item.product_attr
     *
     * @mbggenerated
     */
    public String getProductAttr() {
        return productAttr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_attr
     *
     * @param productAttr the value for oms_order_item.product_attr
     *
     * @mbggenerated
     */
    public void setProductAttr(String productAttr) {
        this.productAttr = productAttr;
    }
}