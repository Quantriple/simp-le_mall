package com.mall.cn.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ums_member_statistics_info
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class UmsMemberStatisticsInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.member_id
     *
     * @mbggenerated
     */
    private Long memberId;

    /**
     * Database Column Remarks:
     *   累计消费金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.consume_amount
     *
     * @mbggenerated
     */
    private BigDecimal consumeAmount;

    /**
     * Database Column Remarks:
     *   订单数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.order_count
     *
     * @mbggenerated
     */
    private Integer orderCount;

    /**
     * Database Column Remarks:
     *   优惠券数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.coupon_count
     *
     * @mbggenerated
     */
    private Integer couponCount;

    /**
     * Database Column Remarks:
     *   评价数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.comment_count
     *
     * @mbggenerated
     */
    private Integer commentCount;

    /**
     * Database Column Remarks:
     *   退货数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.return_order_count
     *
     * @mbggenerated
     */
    private Integer returnOrderCount;

    /**
     * Database Column Remarks:
     *   登录次数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.login_count
     *
     * @mbggenerated
     */
    private Integer loginCount;

    /**
     * Database Column Remarks:
     *   关注数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.attend_count
     *
     * @mbggenerated
     */
    private Integer attendCount;

    /**
     * Database Column Remarks:
     *   粉丝数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.fans_count
     *
     * @mbggenerated
     */
    private Integer fansCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.collect_product_count
     *
     * @mbggenerated
     */
    private Integer collectProductCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.collect_subject_count
     *
     * @mbggenerated
     */
    private Integer collectSubjectCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.collect_topic_count
     *
     * @mbggenerated
     */
    private Integer collectTopicCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.collect_comment_count
     *
     * @mbggenerated
     */
    private Integer collectCommentCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.invite_friend_count
     *
     * @mbggenerated
     */
    private Integer inviteFriendCount;

    /**
     * Database Column Remarks:
     *   最后一次下订单时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_statistics_info.recent_order_time
     *
     * @mbggenerated
     */
    private Date recentOrderTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.id
     *
     * @return the value of ums_member_statistics_info.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.id
     *
     * @param id the value for ums_member_statistics_info.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.member_id
     *
     * @return the value of ums_member_statistics_info.member_id
     *
     * @mbggenerated
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.member_id
     *
     * @param memberId the value for ums_member_statistics_info.member_id
     *
     * @mbggenerated
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.consume_amount
     *
     * @return the value of ums_member_statistics_info.consume_amount
     *
     * @mbggenerated
     */
    public BigDecimal getConsumeAmount() {
        return consumeAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.consume_amount
     *
     * @param consumeAmount the value for ums_member_statistics_info.consume_amount
     *
     * @mbggenerated
     */
    public void setConsumeAmount(BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.order_count
     *
     * @return the value of ums_member_statistics_info.order_count
     *
     * @mbggenerated
     */
    public Integer getOrderCount() {
        return orderCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.order_count
     *
     * @param orderCount the value for ums_member_statistics_info.order_count
     *
     * @mbggenerated
     */
    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.coupon_count
     *
     * @return the value of ums_member_statistics_info.coupon_count
     *
     * @mbggenerated
     */
    public Integer getCouponCount() {
        return couponCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.coupon_count
     *
     * @param couponCount the value for ums_member_statistics_info.coupon_count
     *
     * @mbggenerated
     */
    public void setCouponCount(Integer couponCount) {
        this.couponCount = couponCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.comment_count
     *
     * @return the value of ums_member_statistics_info.comment_count
     *
     * @mbggenerated
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.comment_count
     *
     * @param commentCount the value for ums_member_statistics_info.comment_count
     *
     * @mbggenerated
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.return_order_count
     *
     * @return the value of ums_member_statistics_info.return_order_count
     *
     * @mbggenerated
     */
    public Integer getReturnOrderCount() {
        return returnOrderCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.return_order_count
     *
     * @param returnOrderCount the value for ums_member_statistics_info.return_order_count
     *
     * @mbggenerated
     */
    public void setReturnOrderCount(Integer returnOrderCount) {
        this.returnOrderCount = returnOrderCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.login_count
     *
     * @return the value of ums_member_statistics_info.login_count
     *
     * @mbggenerated
     */
    public Integer getLoginCount() {
        return loginCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.login_count
     *
     * @param loginCount the value for ums_member_statistics_info.login_count
     *
     * @mbggenerated
     */
    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.attend_count
     *
     * @return the value of ums_member_statistics_info.attend_count
     *
     * @mbggenerated
     */
    public Integer getAttendCount() {
        return attendCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.attend_count
     *
     * @param attendCount the value for ums_member_statistics_info.attend_count
     *
     * @mbggenerated
     */
    public void setAttendCount(Integer attendCount) {
        this.attendCount = attendCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.fans_count
     *
     * @return the value of ums_member_statistics_info.fans_count
     *
     * @mbggenerated
     */
    public Integer getFansCount() {
        return fansCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.fans_count
     *
     * @param fansCount the value for ums_member_statistics_info.fans_count
     *
     * @mbggenerated
     */
    public void setFansCount(Integer fansCount) {
        this.fansCount = fansCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.collect_product_count
     *
     * @return the value of ums_member_statistics_info.collect_product_count
     *
     * @mbggenerated
     */
    public Integer getCollectProductCount() {
        return collectProductCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.collect_product_count
     *
     * @param collectProductCount the value for ums_member_statistics_info.collect_product_count
     *
     * @mbggenerated
     */
    public void setCollectProductCount(Integer collectProductCount) {
        this.collectProductCount = collectProductCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.collect_subject_count
     *
     * @return the value of ums_member_statistics_info.collect_subject_count
     *
     * @mbggenerated
     */
    public Integer getCollectSubjectCount() {
        return collectSubjectCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.collect_subject_count
     *
     * @param collectSubjectCount the value for ums_member_statistics_info.collect_subject_count
     *
     * @mbggenerated
     */
    public void setCollectSubjectCount(Integer collectSubjectCount) {
        this.collectSubjectCount = collectSubjectCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.collect_topic_count
     *
     * @return the value of ums_member_statistics_info.collect_topic_count
     *
     * @mbggenerated
     */
    public Integer getCollectTopicCount() {
        return collectTopicCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.collect_topic_count
     *
     * @param collectTopicCount the value for ums_member_statistics_info.collect_topic_count
     *
     * @mbggenerated
     */
    public void setCollectTopicCount(Integer collectTopicCount) {
        this.collectTopicCount = collectTopicCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.collect_comment_count
     *
     * @return the value of ums_member_statistics_info.collect_comment_count
     *
     * @mbggenerated
     */
    public Integer getCollectCommentCount() {
        return collectCommentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.collect_comment_count
     *
     * @param collectCommentCount the value for ums_member_statistics_info.collect_comment_count
     *
     * @mbggenerated
     */
    public void setCollectCommentCount(Integer collectCommentCount) {
        this.collectCommentCount = collectCommentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.invite_friend_count
     *
     * @return the value of ums_member_statistics_info.invite_friend_count
     *
     * @mbggenerated
     */
    public Integer getInviteFriendCount() {
        return inviteFriendCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.invite_friend_count
     *
     * @param inviteFriendCount the value for ums_member_statistics_info.invite_friend_count
     *
     * @mbggenerated
     */
    public void setInviteFriendCount(Integer inviteFriendCount) {
        this.inviteFriendCount = inviteFriendCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_statistics_info.recent_order_time
     *
     * @return the value of ums_member_statistics_info.recent_order_time
     *
     * @mbggenerated
     */
    public Date getRecentOrderTime() {
        return recentOrderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_statistics_info.recent_order_time
     *
     * @param recentOrderTime the value for ums_member_statistics_info.recent_order_time
     *
     * @mbggenerated
     */
    public void setRecentOrderTime(Date recentOrderTime) {
        this.recentOrderTime = recentOrderTime;
    }
}