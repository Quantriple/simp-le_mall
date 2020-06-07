package com.mall.cn.dao.mapper;

import com.mall.cn.model.UmsAdminLoginLog;
import com.mall.cn.model.UmsAdminLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsAdminLoginLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_login_log
     *
     * @mbggenerated
     */
    int countByExample(UmsAdminLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_login_log
     *
     * @mbggenerated
     */
    int deleteByExample(UmsAdminLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_login_log
     *
     * @mbggenerated
     */
    int insert(UmsAdminLoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_login_log
     *
     * @mbggenerated
     */
    int insertSelective(UmsAdminLoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_login_log
     *
     * @mbggenerated
     */
    List<UmsAdminLoginLog> selectByExample(UmsAdminLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_login_log
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UmsAdminLoginLog record, @Param("example") UmsAdminLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_login_log
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UmsAdminLoginLog record, @Param("example") UmsAdminLoginLogExample example);
}