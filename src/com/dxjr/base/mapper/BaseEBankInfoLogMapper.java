package com.dxjr.base.mapper;

import com.dxjr.base.entity.BaseEBankInfoLog;

public interface BaseEBankInfoLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_bankinfo_log
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_bankinfo_log
     *
     * @mbggenerated
     */
    int insert(BaseEBankInfoLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_bankinfo_log
     *
     * @mbggenerated
     */
    int insertSelective(BaseEBankInfoLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_bankinfo_log
     *
     * @mbggenerated
     */
    BaseEBankInfoLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_bankinfo_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BaseEBankInfoLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table e_bankinfo_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BaseEBankInfoLog record);
}