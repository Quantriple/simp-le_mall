package com.mall.cn.dao.mapper;

import com.mall.cn.model.CmsMemberReport;
import com.mall.cn.model.CmsMemberReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsMemberReportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_member_report
     *
     * @mbggenerated
     */
    int countByExample(CmsMemberReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_member_report
     *
     * @mbggenerated
     */
    int deleteByExample(CmsMemberReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_member_report
     *
     * @mbggenerated
     */
    int insert(CmsMemberReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_member_report
     *
     * @mbggenerated
     */
    int insertSelective(CmsMemberReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_member_report
     *
     * @mbggenerated
     */
    List<CmsMemberReport> selectByExample(CmsMemberReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_member_report
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CmsMemberReport record, @Param("example") CmsMemberReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_member_report
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CmsMemberReport record, @Param("example") CmsMemberReportExample example);
}