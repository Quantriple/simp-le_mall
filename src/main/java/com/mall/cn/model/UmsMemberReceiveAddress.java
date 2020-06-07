package com.mall.cn.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ums_member_receive_address
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class UmsMemberReceiveAddress {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_receive_address.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_receive_address.member_id
     *
     * @mbggenerated
     */
    private Long memberId;

    /**
     * Database Column Remarks:
     *   收货人名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_receive_address.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_receive_address.phone_number
     *
     * @mbggenerated
     */
    private String phoneNumber;

    /**
     * Database Column Remarks:
     *   是否为默认
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_receive_address.default_status
     *
     * @mbggenerated
     */
    private Integer defaultStatus;

    /**
     * Database Column Remarks:
     *   邮政编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_receive_address.post_code
     *
     * @mbggenerated
     */
    private String postCode;

    /**
     * Database Column Remarks:
     *   省份/直辖市
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_receive_address.province
     *
     * @mbggenerated
     */
    private String province;

    /**
     * Database Column Remarks:
     *   城市
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_receive_address.city
     *
     * @mbggenerated
     */
    private String city;

    /**
     * Database Column Remarks:
     *   区
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_receive_address.region
     *
     * @mbggenerated
     */
    private String region;

    /**
     * Database Column Remarks:
     *   详细地址(街道)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_receive_address.detail_address
     *
     * @mbggenerated
     */
    private String detailAddress;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_receive_address.id
     *
     * @return the value of ums_member_receive_address.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_receive_address.id
     *
     * @param id the value for ums_member_receive_address.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_receive_address.member_id
     *
     * @return the value of ums_member_receive_address.member_id
     *
     * @mbggenerated
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_receive_address.member_id
     *
     * @param memberId the value for ums_member_receive_address.member_id
     *
     * @mbggenerated
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_receive_address.name
     *
     * @return the value of ums_member_receive_address.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_receive_address.name
     *
     * @param name the value for ums_member_receive_address.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_receive_address.phone_number
     *
     * @return the value of ums_member_receive_address.phone_number
     *
     * @mbggenerated
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_receive_address.phone_number
     *
     * @param phoneNumber the value for ums_member_receive_address.phone_number
     *
     * @mbggenerated
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_receive_address.default_status
     *
     * @return the value of ums_member_receive_address.default_status
     *
     * @mbggenerated
     */
    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_receive_address.default_status
     *
     * @param defaultStatus the value for ums_member_receive_address.default_status
     *
     * @mbggenerated
     */
    public void setDefaultStatus(Integer defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_receive_address.post_code
     *
     * @return the value of ums_member_receive_address.post_code
     *
     * @mbggenerated
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_receive_address.post_code
     *
     * @param postCode the value for ums_member_receive_address.post_code
     *
     * @mbggenerated
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_receive_address.province
     *
     * @return the value of ums_member_receive_address.province
     *
     * @mbggenerated
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_receive_address.province
     *
     * @param province the value for ums_member_receive_address.province
     *
     * @mbggenerated
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_receive_address.city
     *
     * @return the value of ums_member_receive_address.city
     *
     * @mbggenerated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_receive_address.city
     *
     * @param city the value for ums_member_receive_address.city
     *
     * @mbggenerated
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_receive_address.region
     *
     * @return the value of ums_member_receive_address.region
     *
     * @mbggenerated
     */
    public String getRegion() {
        return region;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_receive_address.region
     *
     * @param region the value for ums_member_receive_address.region
     *
     * @mbggenerated
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_receive_address.detail_address
     *
     * @return the value of ums_member_receive_address.detail_address
     *
     * @mbggenerated
     */
    public String getDetailAddress() {
        return detailAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_receive_address.detail_address
     *
     * @param detailAddress the value for ums_member_receive_address.detail_address
     *
     * @mbggenerated
     */
    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }
}