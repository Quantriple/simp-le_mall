package com.mall.cn.model;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table cms_subject_comment
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class CmsSubjectComment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_subject_comment.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_subject_comment.subject_id
     *
     * @mbggenerated
     */
    private Long subjectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_subject_comment.member_nick_name
     *
     * @mbggenerated
     */
    private String memberNickName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_subject_comment.member_icon
     *
     * @mbggenerated
     */
    private String memberIcon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_subject_comment.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_subject_comment.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_subject_comment.show_status
     *
     * @mbggenerated
     */
    private Integer showStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_subject_comment.id
     *
     * @return the value of cms_subject_comment.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_subject_comment.id
     *
     * @param id the value for cms_subject_comment.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_subject_comment.subject_id
     *
     * @return the value of cms_subject_comment.subject_id
     *
     * @mbggenerated
     */
    public Long getSubjectId() {
        return subjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_subject_comment.subject_id
     *
     * @param subjectId the value for cms_subject_comment.subject_id
     *
     * @mbggenerated
     */
    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_subject_comment.member_nick_name
     *
     * @return the value of cms_subject_comment.member_nick_name
     *
     * @mbggenerated
     */
    public String getMemberNickName() {
        return memberNickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_subject_comment.member_nick_name
     *
     * @param memberNickName the value for cms_subject_comment.member_nick_name
     *
     * @mbggenerated
     */
    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_subject_comment.member_icon
     *
     * @return the value of cms_subject_comment.member_icon
     *
     * @mbggenerated
     */
    public String getMemberIcon() {
        return memberIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_subject_comment.member_icon
     *
     * @param memberIcon the value for cms_subject_comment.member_icon
     *
     * @mbggenerated
     */
    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_subject_comment.content
     *
     * @return the value of cms_subject_comment.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_subject_comment.content
     *
     * @param content the value for cms_subject_comment.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_subject_comment.create_time
     *
     * @return the value of cms_subject_comment.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_subject_comment.create_time
     *
     * @param createTime the value for cms_subject_comment.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_subject_comment.show_status
     *
     * @return the value of cms_subject_comment.show_status
     *
     * @mbggenerated
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_subject_comment.show_status
     *
     * @param showStatus the value for cms_subject_comment.show_status
     *
     * @mbggenerated
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }
}