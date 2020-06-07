package com.mall.cn.dao.mapper;

import com.mall.cn.model.OmsOrderItem;
import com.mall.cn.model.OmsOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsOrderItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_item
     *
     * @mbggenerated
     */
    int countByExample(OmsOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_item
     *
     * @mbggenerated
     */
    int deleteByExample(OmsOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_item
     *
     * @mbggenerated
     */
    int insert(OmsOrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_item
     *
     * @mbggenerated
     */
    int insertSelective(OmsOrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_item
     *
     * @mbggenerated
     */
    List<OmsOrderItem> selectByExample(OmsOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_item
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") OmsOrderItem record, @Param("example") OmsOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_item
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") OmsOrderItem record, @Param("example") OmsOrderItemExample example);
}