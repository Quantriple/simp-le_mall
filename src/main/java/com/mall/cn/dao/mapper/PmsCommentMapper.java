package com.mall.cn.dao.mapper;

import com.mall.cn.model.PmsComment;
import com.mall.cn.model.PmsCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbggenerated
     */
    int countByExample(PmsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbggenerated
     */
    int deleteByExample(PmsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbggenerated
     */
    int insert(PmsComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbggenerated
     */
    int insertSelective(PmsComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbggenerated
     */
    List<PmsComment> selectByExampleWithBLOBs(PmsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbggenerated
     */
    List<PmsComment> selectByExample(PmsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PmsComment record, @Param("example") PmsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") PmsComment record, @Param("example") PmsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PmsComment record, @Param("example") PmsCommentExample example);
}