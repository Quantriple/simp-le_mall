package com.mall.cn.model;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table cms_subject
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class CmsSubject {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_subject.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_subject.category_id
     *
     * @mbggenerated
     */
    private Long categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_subject.title
     *
     * @mbggenerated
     */
    private String title;

    /**
     * Database Column Remarks:
     *   专题主图
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_subject.pic
     *
     * @mbggenerated
     */
    private String pic;

    /**
     * Database Column Remarks:
     *   关联产品数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_subject.product_count
     *
     * @mbggenerated
     */
    private Integer productCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_subject.recommend_status
     *
     * @mbggenerated
     */
    private Integer recommendStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_subject.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_subject.collect_count
     *
     * @mbggenerated
     */
    private Integer collectCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_subject.read_count
     *
     * @mbggenerated
     */
    private Integer readCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_subject.comment_count
     *
     * @mbggenerated
     */
    private Integer commentCount;

    /**
     * Database Column Remarks:
     *   画册图片用逗号分割
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_subject.album_pics
     *
     * @mbggenerated
     */
    private String albumPics;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_subject.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * Database Column Remarks:
     *   显示状态：0->不显示；1->显示
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_subject.show_status
     *
     * @mbggenerated
     */
    private Integer showStatus;

    /**
     * Database Column Remarks:
     *   转发数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_subject.forward_count
     *
     * @mbggenerated
     */
    private Integer forwardCount;

    /**
     * Database Column Remarks:
     *   专题分类名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_subject.category_name
     *
     * @mbggenerated
     */
    private String categoryName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_subject.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_subject.id
     *
     * @return the value of cms_subject.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_subject.id
     *
     * @param id the value for cms_subject.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_subject.category_id
     *
     * @return the value of cms_subject.category_id
     *
     * @mbggenerated
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_subject.category_id
     *
     * @param categoryId the value for cms_subject.category_id
     *
     * @mbggenerated
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_subject.title
     *
     * @return the value of cms_subject.title
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_subject.title
     *
     * @param title the value for cms_subject.title
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_subject.pic
     *
     * @return the value of cms_subject.pic
     *
     * @mbggenerated
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_subject.pic
     *
     * @param pic the value for cms_subject.pic
     *
     * @mbggenerated
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_subject.product_count
     *
     * @return the value of cms_subject.product_count
     *
     * @mbggenerated
     */
    public Integer getProductCount() {
        return productCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_subject.product_count
     *
     * @param productCount the value for cms_subject.product_count
     *
     * @mbggenerated
     */
    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_subject.recommend_status
     *
     * @return the value of cms_subject.recommend_status
     *
     * @mbggenerated
     */
    public Integer getRecommendStatus() {
        return recommendStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_subject.recommend_status
     *
     * @param recommendStatus the value for cms_subject.recommend_status
     *
     * @mbggenerated
     */
    public void setRecommendStatus(Integer recommendStatus) {
        this.recommendStatus = recommendStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_subject.create_time
     *
     * @return the value of cms_subject.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_subject.create_time
     *
     * @param createTime the value for cms_subject.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_subject.collect_count
     *
     * @return the value of cms_subject.collect_count
     *
     * @mbggenerated
     */
    public Integer getCollectCount() {
        return collectCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_subject.collect_count
     *
     * @param collectCount the value for cms_subject.collect_count
     *
     * @mbggenerated
     */
    public void setCollectCount(Integer collectCount) {
        this.collectCount = collectCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_subject.read_count
     *
     * @return the value of cms_subject.read_count
     *
     * @mbggenerated
     */
    public Integer getReadCount() {
        return readCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_subject.read_count
     *
     * @param readCount the value for cms_subject.read_count
     *
     * @mbggenerated
     */
    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_subject.comment_count
     *
     * @return the value of cms_subject.comment_count
     *
     * @mbggenerated
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_subject.comment_count
     *
     * @param commentCount the value for cms_subject.comment_count
     *
     * @mbggenerated
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_subject.album_pics
     *
     * @return the value of cms_subject.album_pics
     *
     * @mbggenerated
     */
    public String getAlbumPics() {
        return albumPics;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_subject.album_pics
     *
     * @param albumPics the value for cms_subject.album_pics
     *
     * @mbggenerated
     */
    public void setAlbumPics(String albumPics) {
        this.albumPics = albumPics;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_subject.description
     *
     * @return the value of cms_subject.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_subject.description
     *
     * @param description the value for cms_subject.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_subject.show_status
     *
     * @return the value of cms_subject.show_status
     *
     * @mbggenerated
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_subject.show_status
     *
     * @param showStatus the value for cms_subject.show_status
     *
     * @mbggenerated
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_subject.forward_count
     *
     * @return the value of cms_subject.forward_count
     *
     * @mbggenerated
     */
    public Integer getForwardCount() {
        return forwardCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_subject.forward_count
     *
     * @param forwardCount the value for cms_subject.forward_count
     *
     * @mbggenerated
     */
    public void setForwardCount(Integer forwardCount) {
        this.forwardCount = forwardCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_subject.category_name
     *
     * @return the value of cms_subject.category_name
     *
     * @mbggenerated
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_subject.category_name
     *
     * @param categoryName the value for cms_subject.category_name
     *
     * @mbggenerated
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_subject.content
     *
     * @return the value of cms_subject.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_subject.content
     *
     * @param content the value for cms_subject.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content;
    }
}