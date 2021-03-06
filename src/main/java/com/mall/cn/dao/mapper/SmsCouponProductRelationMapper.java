package com.mall.cn.dao.mapper;

import com.mall.cn.model.SmsCouponProductRelation;
import com.mall.cn.model.SmsCouponProductRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsCouponProductRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_product_relation
     *
     * @mbggenerated
     */
    int countByExample(SmsCouponProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_product_relation
     *
     * @mbggenerated
     */
    int deleteByExample(SmsCouponProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_product_relation
     *
     * @mbggenerated
     */
    int insert(SmsCouponProductRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_product_relation
     *
     * @mbggenerated
     */
    int insertSelective(SmsCouponProductRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_product_relation
     *
     * @mbggenerated
     */
    List<SmsCouponProductRelation> selectByExample(SmsCouponProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_product_relation
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SmsCouponProductRelation record, @Param("example") SmsCouponProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_product_relation
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SmsCouponProductRelation record, @Param("example") SmsCouponProductRelationExample example);
}