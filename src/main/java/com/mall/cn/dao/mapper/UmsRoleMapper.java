package com.mall.cn.dao.mapper;

import com.mall.cn.model.UmsRole;
import com.mall.cn.model.UmsRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbggenerated
     */
    int countByExample(UmsRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbggenerated
     */
    int deleteByExample(UmsRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbggenerated
     */
    int insert(UmsRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbggenerated
     */
    int insertSelective(UmsRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbggenerated
     */
    List<UmsRole> selectByExample(UmsRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UmsRole record, @Param("example") UmsRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UmsRole record, @Param("example") UmsRoleExample example);
}