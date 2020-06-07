package com.mall.cn.model;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table oms_order_return_reason
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class OmsOrderReturnReason {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_reason.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   退货类型
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_reason.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_reason.sort
     *
     * @mbggenerated
     */
    private Integer sort;

    /**
     * Database Column Remarks:
     *   状态：0->不启用；1->启用
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_reason.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * Database Column Remarks:
     *   添加时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_reason.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_reason.id
     *
     * @return the value of oms_order_return_reason.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_reason.id
     *
     * @param id the value for oms_order_return_reason.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_reason.name
     *
     * @return the value of oms_order_return_reason.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_reason.name
     *
     * @param name the value for oms_order_return_reason.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_reason.sort
     *
     * @return the value of oms_order_return_reason.sort
     *
     * @mbggenerated
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_reason.sort
     *
     * @param sort the value for oms_order_return_reason.sort
     *
     * @mbggenerated
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_reason.status
     *
     * @return the value of oms_order_return_reason.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_reason.status
     *
     * @param status the value for oms_order_return_reason.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_reason.create_time
     *
     * @return the value of oms_order_return_reason.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_reason.create_time
     *
     * @param createTime the value for oms_order_return_reason.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}