package com.mall.cn.dao.mapper;

import com.mall.cn.model.CmsSubjectComment;
import com.mall.cn.model.CmsSubjectCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsSubjectCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbggenerated
     */
    int countByExample(CmsSubjectCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbggenerated
     */
    int deleteByExample(CmsSubjectCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbggenerated
     */
    int insert(CmsSubjectComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbggenerated
     */
    int insertSelective(CmsSubjectComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbggenerated
     */
    List<CmsSubjectComment> selectByExample(CmsSubjectCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CmsSubjectComment record, @Param("example") CmsSubjectCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_comment
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CmsSubjectComment record, @Param("example") CmsSubjectCommentExample example);
}