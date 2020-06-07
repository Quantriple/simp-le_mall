package com.mall.cn.dao.mapper;

import com.mall.cn.model.UmsMemberStatisticsInfo;
import com.mall.cn.model.UmsMemberStatisticsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberStatisticsInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_statistics_info
     *
     * @mbggenerated
     */
    int countByExample(UmsMemberStatisticsInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_statistics_info
     *
     * @mbggenerated
     */
    int deleteByExample(UmsMemberStatisticsInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_statistics_info
     *
     * @mbggenerated
     */
    int insert(UmsMemberStatisticsInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_statistics_info
     *
     * @mbggenerated
     */
    int insertSelective(UmsMemberStatisticsInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_statistics_info
     *
     * @mbggenerated
     */
    List<UmsMemberStatisticsInfo> selectByExample(UmsMemberStatisticsInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_statistics_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UmsMemberStatisticsInfo record, @Param("example") UmsMemberStatisticsInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_statistics_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UmsMemberStatisticsInfo record, @Param("example") UmsMemberStatisticsInfoExample example);
}