package com.mall.cn.dao.mapper;

import com.mall.cn.model.SmsHomeAdvertise;
import com.mall.cn.model.SmsHomeAdvertiseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsHomeAdvertiseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbggenerated
     */
    int countByExample(SmsHomeAdvertiseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbggenerated
     */
    int deleteByExample(SmsHomeAdvertiseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbggenerated
     */
    int insert(SmsHomeAdvertise record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbggenerated
     */
    int insertSelective(SmsHomeAdvertise record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbggenerated
     */
    List<SmsHomeAdvertise> selectByExample(SmsHomeAdvertiseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SmsHomeAdvertise record, @Param("example") SmsHomeAdvertiseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_advertise
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SmsHomeAdvertise record, @Param("example") SmsHomeAdvertiseExample example);
}