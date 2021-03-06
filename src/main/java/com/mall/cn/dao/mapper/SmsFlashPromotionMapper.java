package com.mall.cn.dao.mapper;

import com.mall.cn.model.SmsFlashPromotion;
import com.mall.cn.model.SmsFlashPromotionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsFlashPromotionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion
     *
     * @mbggenerated
     */
    int countByExample(SmsFlashPromotionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion
     *
     * @mbggenerated
     */
    int deleteByExample(SmsFlashPromotionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion
     *
     * @mbggenerated
     */
    int insert(SmsFlashPromotion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion
     *
     * @mbggenerated
     */
    int insertSelective(SmsFlashPromotion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion
     *
     * @mbggenerated
     */
    List<SmsFlashPromotion> selectByExample(SmsFlashPromotionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SmsFlashPromotion record, @Param("example") SmsFlashPromotionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SmsFlashPromotion record, @Param("example") SmsFlashPromotionExample example);
}