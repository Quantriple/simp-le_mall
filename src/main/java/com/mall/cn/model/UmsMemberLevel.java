package com.mall.cn.model;

import java.math.BigDecimal;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ums_member_level
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class UmsMemberLevel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_level.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_level.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_level.growth_point
     *
     * @mbggenerated
     */
    private Integer growthPoint;

    /**
     * Database Column Remarks:
     *   是否为默认等级：0->不是；1->是
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_level.default_status
     *
     * @mbggenerated
     */
    private Integer defaultStatus;

    /**
     * Database Column Remarks:
     *   免运费标准
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_level.free_freight_point
     *
     * @mbggenerated
     */
    private BigDecimal freeFreightPoint;

    /**
     * Database Column Remarks:
     *   每次评价获取的成长值
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_level.comment_growth_point
     *
     * @mbggenerated
     */
    private Integer commentGrowthPoint;

    /**
     * Database Column Remarks:
     *   是否有免邮特权
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_level.priviledge_free_freight
     *
     * @mbggenerated
     */
    private Integer priviledgeFreeFreight;

    /**
     * Database Column Remarks:
     *   是否有签到特权
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_level.priviledge_sign_in
     *
     * @mbggenerated
     */
    private Integer priviledgeSignIn;

    /**
     * Database Column Remarks:
     *   是否有评论获奖励特权
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_level.priviledge_comment
     *
     * @mbggenerated
     */
    private Integer priviledgeComment;

    /**
     * Database Column Remarks:
     *   是否有专享活动特权
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_level.priviledge_promotion
     *
     * @mbggenerated
     */
    private Integer priviledgePromotion;

    /**
     * Database Column Remarks:
     *   是否有会员价格特权
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_level.priviledge_member_price
     *
     * @mbggenerated
     */
    private Integer priviledgeMemberPrice;

    /**
     * Database Column Remarks:
     *   是否有生日特权
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_level.priviledge_birthday
     *
     * @mbggenerated
     */
    private Integer priviledgeBirthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_level.note
     *
     * @mbggenerated
     */
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_level.id
     *
     * @return the value of ums_member_level.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_level.id
     *
     * @param id the value for ums_member_level.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_level.name
     *
     * @return the value of ums_member_level.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_level.name
     *
     * @param name the value for ums_member_level.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_level.growth_point
     *
     * @return the value of ums_member_level.growth_point
     *
     * @mbggenerated
     */
    public Integer getGrowthPoint() {
        return growthPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_level.growth_point
     *
     * @param growthPoint the value for ums_member_level.growth_point
     *
     * @mbggenerated
     */
    public void setGrowthPoint(Integer growthPoint) {
        this.growthPoint = growthPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_level.default_status
     *
     * @return the value of ums_member_level.default_status
     *
     * @mbggenerated
     */
    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_level.default_status
     *
     * @param defaultStatus the value for ums_member_level.default_status
     *
     * @mbggenerated
     */
    public void setDefaultStatus(Integer defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_level.free_freight_point
     *
     * @return the value of ums_member_level.free_freight_point
     *
     * @mbggenerated
     */
    public BigDecimal getFreeFreightPoint() {
        return freeFreightPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_level.free_freight_point
     *
     * @param freeFreightPoint the value for ums_member_level.free_freight_point
     *
     * @mbggenerated
     */
    public void setFreeFreightPoint(BigDecimal freeFreightPoint) {
        this.freeFreightPoint = freeFreightPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_level.comment_growth_point
     *
     * @return the value of ums_member_level.comment_growth_point
     *
     * @mbggenerated
     */
    public Integer getCommentGrowthPoint() {
        return commentGrowthPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_level.comment_growth_point
     *
     * @param commentGrowthPoint the value for ums_member_level.comment_growth_point
     *
     * @mbggenerated
     */
    public void setCommentGrowthPoint(Integer commentGrowthPoint) {
        this.commentGrowthPoint = commentGrowthPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_level.priviledge_free_freight
     *
     * @return the value of ums_member_level.priviledge_free_freight
     *
     * @mbggenerated
     */
    public Integer getPriviledgeFreeFreight() {
        return priviledgeFreeFreight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_level.priviledge_free_freight
     *
     * @param priviledgeFreeFreight the value for ums_member_level.priviledge_free_freight
     *
     * @mbggenerated
     */
    public void setPriviledgeFreeFreight(Integer priviledgeFreeFreight) {
        this.priviledgeFreeFreight = priviledgeFreeFreight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_level.priviledge_sign_in
     *
     * @return the value of ums_member_level.priviledge_sign_in
     *
     * @mbggenerated
     */
    public Integer getPriviledgeSignIn() {
        return priviledgeSignIn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_level.priviledge_sign_in
     *
     * @param priviledgeSignIn the value for ums_member_level.priviledge_sign_in
     *
     * @mbggenerated
     */
    public void setPriviledgeSignIn(Integer priviledgeSignIn) {
        this.priviledgeSignIn = priviledgeSignIn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_level.priviledge_comment
     *
     * @return the value of ums_member_level.priviledge_comment
     *
     * @mbggenerated
     */
    public Integer getPriviledgeComment() {
        return priviledgeComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_level.priviledge_comment
     *
     * @param priviledgeComment the value for ums_member_level.priviledge_comment
     *
     * @mbggenerated
     */
    public void setPriviledgeComment(Integer priviledgeComment) {
        this.priviledgeComment = priviledgeComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_level.priviledge_promotion
     *
     * @return the value of ums_member_level.priviledge_promotion
     *
     * @mbggenerated
     */
    public Integer getPriviledgePromotion() {
        return priviledgePromotion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_level.priviledge_promotion
     *
     * @param priviledgePromotion the value for ums_member_level.priviledge_promotion
     *
     * @mbggenerated
     */
    public void setPriviledgePromotion(Integer priviledgePromotion) {
        this.priviledgePromotion = priviledgePromotion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_level.priviledge_member_price
     *
     * @return the value of ums_member_level.priviledge_member_price
     *
     * @mbggenerated
     */
    public Integer getPriviledgeMemberPrice() {
        return priviledgeMemberPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_level.priviledge_member_price
     *
     * @param priviledgeMemberPrice the value for ums_member_level.priviledge_member_price
     *
     * @mbggenerated
     */
    public void setPriviledgeMemberPrice(Integer priviledgeMemberPrice) {
        this.priviledgeMemberPrice = priviledgeMemberPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_level.priviledge_birthday
     *
     * @return the value of ums_member_level.priviledge_birthday
     *
     * @mbggenerated
     */
    public Integer getPriviledgeBirthday() {
        return priviledgeBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_level.priviledge_birthday
     *
     * @param priviledgeBirthday the value for ums_member_level.priviledge_birthday
     *
     * @mbggenerated
     */
    public void setPriviledgeBirthday(Integer priviledgeBirthday) {
        this.priviledgeBirthday = priviledgeBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_level.note
     *
     * @return the value of ums_member_level.note
     *
     * @mbggenerated
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_level.note
     *
     * @param note the value for ums_member_level.note
     *
     * @mbggenerated
     */
    public void setNote(String note) {
        this.note = note;
    }
}