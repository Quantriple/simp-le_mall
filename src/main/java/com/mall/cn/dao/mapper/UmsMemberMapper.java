package com.mall.cn.dao.mapper;

import com.mall.cn.model.UmsMember;
import com.mall.cn.model.UmsMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbggenerated
     */
    int countByExample(UmsMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbggenerated
     */
    int deleteByExample(UmsMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbggenerated
     */
    int insert(UmsMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbggenerated
     */
    int insertSelective(UmsMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbggenerated
     */
    List<UmsMember> selectByExample(UmsMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UmsMember record, @Param("example") UmsMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UmsMember record, @Param("example") UmsMemberExample example);
}