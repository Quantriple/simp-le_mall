package com.mall.cn.dao.mapper;

import com.mall.cn.model.SmsHomeNewProduct;
import com.mall.cn.model.SmsHomeNewProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsHomeNewProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_new_product
     *
     * @mbggenerated
     */
    int countByExample(SmsHomeNewProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_new_product
     *
     * @mbggenerated
     */
    int deleteByExample(SmsHomeNewProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_new_product
     *
     * @mbggenerated
     */
    int insert(SmsHomeNewProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_new_product
     *
     * @mbggenerated
     */
    int insertSelective(SmsHomeNewProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_new_product
     *
     * @mbggenerated
     */
    List<SmsHomeNewProduct> selectByExample(SmsHomeNewProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_new_product
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SmsHomeNewProduct record, @Param("example") SmsHomeNewProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_home_new_product
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SmsHomeNewProduct record, @Param("example") SmsHomeNewProductExample example);
}