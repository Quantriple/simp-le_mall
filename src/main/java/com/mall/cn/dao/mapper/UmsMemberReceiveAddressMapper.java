package com.mall.cn.dao.mapper;

import com.mall.cn.model.UmsMemberReceiveAddress;
import com.mall.cn.model.UmsMemberReceiveAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberReceiveAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbggenerated
     */
    int countByExample(UmsMemberReceiveAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbggenerated
     */
    int deleteByExample(UmsMemberReceiveAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbggenerated
     */
    int insert(UmsMemberReceiveAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbggenerated
     */
    int insertSelective(UmsMemberReceiveAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbggenerated
     */
    List<UmsMemberReceiveAddress> selectByExample(UmsMemberReceiveAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UmsMemberReceiveAddress record, @Param("example") UmsMemberReceiveAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UmsMemberReceiveAddress record, @Param("example") UmsMemberReceiveAddressExample example);
}