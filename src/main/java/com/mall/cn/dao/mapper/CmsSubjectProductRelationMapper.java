package com.mall.cn.dao.mapper;

import com.mall.cn.model.CmsSubjectProductRelation;
import com.mall.cn.model.CmsSubjectProductRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsSubjectProductRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbggenerated
     */
    int countByExample(CmsSubjectProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbggenerated
     */
    int deleteByExample(CmsSubjectProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbggenerated
     */
    int insert(CmsSubjectProductRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbggenerated
     */
    int insertSelective(CmsSubjectProductRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbggenerated
     */
    List<CmsSubjectProductRelation> selectByExample(CmsSubjectProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CmsSubjectProductRelation record, @Param("example") CmsSubjectProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CmsSubjectProductRelation record, @Param("example") CmsSubjectProductRelationExample example);
}