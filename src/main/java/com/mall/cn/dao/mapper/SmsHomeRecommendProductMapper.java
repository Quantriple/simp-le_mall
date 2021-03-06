package com.mall.cn.dao.mapper;

import com.mall.cn.model.SmsHomeRecommendProduct;
import com.mall.cn.model.SmsHomeRecommendProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsHomeRecommendProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_product
     *
     * @mbggenerated
     */
    int countByExample(SmsHomeRecommendProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_product
     *
     * @mbggenerated
     */
    int deleteByExample(SmsHomeRecommendProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_product
     *
     * @mbggenerated
     */
    int insert(SmsHomeRecommendProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_product
     *
     * @mbggenerated
     */
    int insertSelective(SmsHomeRecommendProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_product
     *
     * @mbggenerated
     */
    List<SmsHomeRecommendProduct> selectByExample(SmsHomeRecommendProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_product
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SmsHomeRecommendProduct record, @Param("example") SmsHomeRecommendProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_recommend_product
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SmsHomeRecommendProduct record, @Param("example") SmsHomeRecommendProductExample example);
}