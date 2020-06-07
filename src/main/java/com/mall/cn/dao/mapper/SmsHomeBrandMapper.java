package com.mall.cn.dao.mapper;

import com.mall.cn.model.SmsHomeBrand;
import com.mall.cn.model.SmsHomeBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsHomeBrandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
     *
     * @mbggenerated
     */
    int countByExample(SmsHomeBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
     *
     * @mbggenerated
     */
    int deleteByExample(SmsHomeBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
     *
     * @mbggenerated
     */
    int insert(SmsHomeBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
     *
     * @mbggenerated
     */
    int insertSelective(SmsHomeBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
     *
     * @mbggenerated
     */
    List<SmsHomeBrand> selectByExample(SmsHomeBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SmsHomeBrand record, @Param("example") SmsHomeBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_brand
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SmsHomeBrand record, @Param("example") SmsHomeBrandExample example);
}