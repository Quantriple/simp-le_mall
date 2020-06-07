package com.mall.cn.model;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sms_flash_promotion_session
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class SmsFlashPromotionSession {
    /**
     * Database Column Remarks:
     *   编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_flash_promotion_session.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   场次名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_flash_promotion_session.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * Database Column Remarks:
     *   每日开始时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_flash_promotion_session.start_time
     *
     * @mbggenerated
     */
    private Date startTime;

    /**
     * Database Column Remarks:
     *   每日结束时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_flash_promotion_session.end_time
     *
     * @mbggenerated
     */
    private Date endTime;

    /**
     * Database Column Remarks:
     *   启用状态：0->不启用；1->启用
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_flash_promotion_session.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_flash_promotion_session.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_session.id
     *
     * @return the value of sms_flash_promotion_session.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_session.id
     *
     * @param id the value for sms_flash_promotion_session.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_session.name
     *
     * @return the value of sms_flash_promotion_session.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_session.name
     *
     * @param name the value for sms_flash_promotion_session.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_session.start_time
     *
     * @return the value of sms_flash_promotion_session.start_time
     *
     * @mbggenerated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_session.start_time
     *
     * @param startTime the value for sms_flash_promotion_session.start_time
     *
     * @mbggenerated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_session.end_time
     *
     * @return the value of sms_flash_promotion_session.end_time
     *
     * @mbggenerated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_session.end_time
     *
     * @param endTime the value for sms_flash_promotion_session.end_time
     *
     * @mbggenerated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_session.status
     *
     * @return the value of sms_flash_promotion_session.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_session.status
     *
     * @param status the value for sms_flash_promotion_session.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_session.create_time
     *
     * @return the value of sms_flash_promotion_session.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_session.create_time
     *
     * @param createTime the value for sms_flash_promotion_session.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}