package com.mall.cn.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ums_admin_role_relation
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class UmsAdminRoleRelation {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_admin_role_relation.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_admin_role_relation.admin_id
     *
     * @mbggenerated
     */
    private Long adminId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_admin_role_relation.role_id
     *
     * @mbggenerated
     */
    private Long roleId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin_role_relation.id
     *
     * @return the value of ums_admin_role_relation.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin_role_relation.id
     *
     * @param id the value for ums_admin_role_relation.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin_role_relation.admin_id
     *
     * @return the value of ums_admin_role_relation.admin_id
     *
     * @mbggenerated
     */
    public Long getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin_role_relation.admin_id
     *
     * @param adminId the value for ums_admin_role_relation.admin_id
     *
     * @mbggenerated
     */
    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_admin_role_relation.role_id
     *
     * @return the value of ums_admin_role_relation.role_id
     *
     * @mbggenerated
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_admin_role_relation.role_id
     *
     * @param roleId the value for ums_admin_role_relation.role_id
     *
     * @mbggenerated
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}