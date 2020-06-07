package com.mall.cn.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table pms_product_attribute
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class PmsProductAttribute {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_attribute.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_attribute.product_attribute_category_id
     *
     * @mbggenerated
     */
    private Long productAttributeCategoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_attribute.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * Database Column Remarks:
     *   属性选择类型：0->唯一；1->单选；2->多选
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_attribute.select_type
     *
     * @mbggenerated
     */
    private Integer selectType;

    /**
     * Database Column Remarks:
     *   属性录入方式：0->手工录入；1->从列表中选取
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_attribute.input_type
     *
     * @mbggenerated
     */
    private Integer inputType;

    /**
     * Database Column Remarks:
     *   可选值列表，以逗号隔开
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_attribute.input_list
     *
     * @mbggenerated
     */
    private String inputList;

    /**
     * Database Column Remarks:
     *   排序字段：最高的可以单独上传图片
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_attribute.sort
     *
     * @mbggenerated
     */
    private Integer sort;

    /**
     * Database Column Remarks:
     *   分类筛选样式：1->普通；1->颜色
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_attribute.filter_type
     *
     * @mbggenerated
     */
    private Integer filterType;

    /**
     * Database Column Remarks:
     *   检索类型；0->不需要进行检索；1->关键字检索；2->范围检索
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_attribute.search_type
     *
     * @mbggenerated
     */
    private Integer searchType;

    /**
     * Database Column Remarks:
     *   相同属性产品是否关联；0->不关联；1->关联
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_attribute.related_status
     *
     * @mbggenerated
     */
    private Integer relatedStatus;

    /**
     * Database Column Remarks:
     *   是否支持手动新增；0->不支持；1->支持
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_attribute.hand_add_status
     *
     * @mbggenerated
     */
    private Integer handAddStatus;

    /**
     * Database Column Remarks:
     *   属性的类型；0->规格；1->参数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_attribute.type
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute.id
     *
     * @return the value of pms_product_attribute.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute.id
     *
     * @param id the value for pms_product_attribute.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute.product_attribute_category_id
     *
     * @return the value of pms_product_attribute.product_attribute_category_id
     *
     * @mbggenerated
     */
    public Long getProductAttributeCategoryId() {
        return productAttributeCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute.product_attribute_category_id
     *
     * @param productAttributeCategoryId the value for pms_product_attribute.product_attribute_category_id
     *
     * @mbggenerated
     */
    public void setProductAttributeCategoryId(Long productAttributeCategoryId) {
        this.productAttributeCategoryId = productAttributeCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute.name
     *
     * @return the value of pms_product_attribute.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute.name
     *
     * @param name the value for pms_product_attribute.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute.select_type
     *
     * @return the value of pms_product_attribute.select_type
     *
     * @mbggenerated
     */
    public Integer getSelectType() {
        return selectType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute.select_type
     *
     * @param selectType the value for pms_product_attribute.select_type
     *
     * @mbggenerated
     */
    public void setSelectType(Integer selectType) {
        this.selectType = selectType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute.input_type
     *
     * @return the value of pms_product_attribute.input_type
     *
     * @mbggenerated
     */
    public Integer getInputType() {
        return inputType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute.input_type
     *
     * @param inputType the value for pms_product_attribute.input_type
     *
     * @mbggenerated
     */
    public void setInputType(Integer inputType) {
        this.inputType = inputType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute.input_list
     *
     * @return the value of pms_product_attribute.input_list
     *
     * @mbggenerated
     */
    public String getInputList() {
        return inputList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute.input_list
     *
     * @param inputList the value for pms_product_attribute.input_list
     *
     * @mbggenerated
     */
    public void setInputList(String inputList) {
        this.inputList = inputList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute.sort
     *
     * @return the value of pms_product_attribute.sort
     *
     * @mbggenerated
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute.sort
     *
     * @param sort the value for pms_product_attribute.sort
     *
     * @mbggenerated
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute.filter_type
     *
     * @return the value of pms_product_attribute.filter_type
     *
     * @mbggenerated
     */
    public Integer getFilterType() {
        return filterType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute.filter_type
     *
     * @param filterType the value for pms_product_attribute.filter_type
     *
     * @mbggenerated
     */
    public void setFilterType(Integer filterType) {
        this.filterType = filterType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute.search_type
     *
     * @return the value of pms_product_attribute.search_type
     *
     * @mbggenerated
     */
    public Integer getSearchType() {
        return searchType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute.search_type
     *
     * @param searchType the value for pms_product_attribute.search_type
     *
     * @mbggenerated
     */
    public void setSearchType(Integer searchType) {
        this.searchType = searchType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute.related_status
     *
     * @return the value of pms_product_attribute.related_status
     *
     * @mbggenerated
     */
    public Integer getRelatedStatus() {
        return relatedStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute.related_status
     *
     * @param relatedStatus the value for pms_product_attribute.related_status
     *
     * @mbggenerated
     */
    public void setRelatedStatus(Integer relatedStatus) {
        this.relatedStatus = relatedStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute.hand_add_status
     *
     * @return the value of pms_product_attribute.hand_add_status
     *
     * @mbggenerated
     */
    public Integer getHandAddStatus() {
        return handAddStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute.hand_add_status
     *
     * @param handAddStatus the value for pms_product_attribute.hand_add_status
     *
     * @mbggenerated
     */
    public void setHandAddStatus(Integer handAddStatus) {
        this.handAddStatus = handAddStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute.type
     *
     * @return the value of pms_product_attribute.type
     *
     * @mbggenerated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute.type
     *
     * @param type the value for pms_product_attribute.type
     *
     * @mbggenerated
     */
    public void setType(Integer type) {
        this.type = type;
    }
}