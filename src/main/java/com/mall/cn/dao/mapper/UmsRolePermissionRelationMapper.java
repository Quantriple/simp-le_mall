package com.mall.cn.dao.mapper;

import com.mall.cn.model.UmsRolePermissionRelation;
import com.mall.cn.model.UmsRolePermissionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsRolePermissionRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_permission_relation
     *
     * @mbggenerated
     */
    int countByExample(UmsRolePermissionRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_permission_relation
     *
     * @mbggenerated
     */
    int deleteByExample(UmsRolePermissionRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_permission_relation
     *
     * @mbggenerated
     */
    int insert(UmsRolePermissionRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_permission_relation
     *
     * @mbggenerated
     */
    int insertSelective(UmsRolePermissionRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_permission_relation
     *
     * @mbggenerated
     */
    List<UmsRolePermissionRelation> selectByExample(UmsRolePermissionRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_permission_relation
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UmsRolePermissionRelation record, @Param("example") UmsRolePermissionRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_permission_relation
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UmsRolePermissionRelation record, @Param("example") UmsRolePermissionRelationExample example);
}