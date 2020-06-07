package com.mall.cn.model;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sms_home_advertise
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class SmsHomeAdvertise {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_advertise.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_advertise.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * Database Column Remarks:
     *   轮播位置：0->PC首页轮播；1->app首页轮播
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_advertise.type
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_advertise.pic
     *
     * @mbggenerated
     */
    private String pic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_advertise.start_time
     *
     * @mbggenerated
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_advertise.end_time
     *
     * @mbggenerated
     */
    private Date endTime;

    /**
     * Database Column Remarks:
     *   上下线状态：0->下线；1->上线
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_advertise.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * Database Column Remarks:
     *   点击数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_advertise.click_count
     *
     * @mbggenerated
     */
    private Integer clickCount;

    /**
     * Database Column Remarks:
     *   下单数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_advertise.order_count
     *
     * @mbggenerated
     */
    private Integer orderCount;

    /**
     * Database Column Remarks:
     *   链接地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_advertise.url
     *
     * @mbggenerated
     */
    private String url;

    /**
     * Database Column Remarks:
     *   备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_advertise.note
     *
     * @mbggenerated
     */
    private String note;

    /**
     * Database Column Remarks:
     *   排序
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_home_advertise.sort
     *
     * @mbggenerated
     */
    private Integer sort;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_advertise.id
     *
     * @return the value of sms_home_advertise.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_advertise.id
     *
     * @param id the value for sms_home_advertise.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_advertise.name
     *
     * @return the value of sms_home_advertise.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_advertise.name
     *
     * @param name the value for sms_home_advertise.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_advertise.type
     *
     * @return the value of sms_home_advertise.type
     *
     * @mbggenerated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_advertise.type
     *
     * @param type the value for sms_home_advertise.type
     *
     * @mbggenerated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_advertise.pic
     *
     * @return the value of sms_home_advertise.pic
     *
     * @mbggenerated
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_advertise.pic
     *
     * @param pic the value for sms_home_advertise.pic
     *
     * @mbggenerated
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_advertise.start_time
     *
     * @return the value of sms_home_advertise.start_time
     *
     * @mbggenerated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_advertise.start_time
     *
     * @param startTime the value for sms_home_advertise.start_time
     *
     * @mbggenerated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_advertise.end_time
     *
     * @return the value of sms_home_advertise.end_time
     *
     * @mbggenerated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_advertise.end_time
     *
     * @param endTime the value for sms_home_advertise.end_time
     *
     * @mbggenerated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_advertise.status
     *
     * @return the value of sms_home_advertise.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_advertise.status
     *
     * @param status the value for sms_home_advertise.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_advertise.click_count
     *
     * @return the value of sms_home_advertise.click_count
     *
     * @mbggenerated
     */
    public Integer getClickCount() {
        return clickCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_advertise.click_count
     *
     * @param clickCount the value for sms_home_advertise.click_count
     *
     * @mbggenerated
     */
    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_advertise.order_count
     *
     * @return the value of sms_home_advertise.order_count
     *
     * @mbggenerated
     */
    public Integer getOrderCount() {
        return orderCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_advertise.order_count
     *
     * @param orderCount the value for sms_home_advertise.order_count
     *
     * @mbggenerated
     */
    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_advertise.url
     *
     * @return the value of sms_home_advertise.url
     *
     * @mbggenerated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_advertise.url
     *
     * @param url the value for sms_home_advertise.url
     *
     * @mbggenerated
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_advertise.note
     *
     * @return the value of sms_home_advertise.note
     *
     * @mbggenerated
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_advertise.note
     *
     * @param note the value for sms_home_advertise.note
     *
     * @mbggenerated
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_home_advertise.sort
     *
     * @return the value of sms_home_advertise.sort
     *
     * @mbggenerated
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_home_advertise.sort
     *
     * @param sort the value for sms_home_advertise.sort
     *
     * @mbggenerated
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}