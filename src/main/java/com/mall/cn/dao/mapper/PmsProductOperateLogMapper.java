package com.mall.cn.dao.mapper;

import com.mall.cn.model.PmsProductOperateLog;
import com.mall.cn.model.PmsProductOperateLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductOperateLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_operate_log
     *
     * @mbggenerated
     */
    int countByExample(PmsProductOperateLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_operate_log
     *
     * @mbggenerated
     */
    int deleteByExample(PmsProductOperateLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_operate_log
     *
     * @mbggenerated
     */
    int insert(PmsProductOperateLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_operate_log
     *
     * @mbggenerated
     */
    int insertSelective(PmsProductOperateLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_operate_log
     *
     * @mbggenerated
     */
    List<PmsProductOperateLog> selectByExample(PmsProductOperateLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_operate_log
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PmsProductOperateLog record, @Param("example") PmsProductOperateLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_operate_log
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PmsProductOperateLog record, @Param("example") PmsProductOperateLogExample example);
}