package com.mall.cn.dao.mapper;

import com.mall.cn.model.SmsFlashPromotionLog;
import com.mall.cn.model.SmsFlashPromotionLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsFlashPromotionLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_log
     *
     * @mbggenerated
     */
    int countByExample(SmsFlashPromotionLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_log
     *
     * @mbggenerated
     */
    int deleteByExample(SmsFlashPromotionLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_log
     *
     * @mbggenerated
     */
    int insert(SmsFlashPromotionLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_log
     *
     * @mbggenerated
     */
    int insertSelective(SmsFlashPromotionLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_log
     *
     * @mbggenerated
     */
    List<SmsFlashPromotionLog> selectByExample(SmsFlashPromotionLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_log
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SmsFlashPromotionLog record, @Param("example") SmsFlashPromotionLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_log
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SmsFlashPromotionLog record, @Param("example") SmsFlashPromotionLogExample example);
}