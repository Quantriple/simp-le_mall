package com.mall.cn.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table pms_album_pic
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class PmsAlbumPic {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_album_pic.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_album_pic.album_id
     *
     * @mbggenerated
     */
    private Long albumId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_album_pic.pic
     *
     * @mbggenerated
     */
    private String pic;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_album_pic.id
     *
     * @return the value of pms_album_pic.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_album_pic.id
     *
     * @param id the value for pms_album_pic.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_album_pic.album_id
     *
     * @return the value of pms_album_pic.album_id
     *
     * @mbggenerated
     */
    public Long getAlbumId() {
        return albumId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_album_pic.album_id
     *
     * @param albumId the value for pms_album_pic.album_id
     *
     * @mbggenerated
     */
    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_album_pic.pic
     *
     * @return the value of pms_album_pic.pic
     *
     * @mbggenerated
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_album_pic.pic
     *
     * @param pic the value for pms_album_pic.pic
     *
     * @mbggenerated
     */
    public void setPic(String pic) {
        this.pic = pic;
    }
}