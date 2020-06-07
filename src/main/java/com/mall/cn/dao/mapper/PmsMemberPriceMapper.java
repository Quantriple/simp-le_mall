package com.mall.cn.dao.mapper;

import com.mall.cn.model.PmsMemberPrice;
import com.mall.cn.model.PmsMemberPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsMemberPriceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbggenerated
     */
    int countByExample(PmsMemberPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbggenerated
     */
    int deleteByExample(PmsMemberPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbggenerated
     */
    int insert(PmsMemberPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbggenerated
     */
    int insertSelective(PmsMemberPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbggenerated
     */
    List<PmsMemberPrice> selectByExample(PmsMemberPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PmsMemberPrice record, @Param("example") PmsMemberPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_member_price
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PmsMemberPrice record, @Param("example") PmsMemberPriceExample example);
}