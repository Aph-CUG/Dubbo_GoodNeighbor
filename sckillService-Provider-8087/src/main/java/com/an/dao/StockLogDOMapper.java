package com.an.dao;


import com.an.dataobject.StockLogDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockLogDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_log
     *
     * @mbg.generated Mon Feb 25 23:42:11 CST 2019
     */
    int deleteByPrimaryKey(String stockLogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_log
     *
     * @mbg.generated Mon Feb 25 23:42:11 CST 2019
     */
    int insert(StockLogDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_log
     *
     * @mbg.generated Mon Feb 25 23:42:11 CST 2019
     */
    int insertSelective(StockLogDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_log
     *
     * @mbg.generated Mon Feb 25 23:42:11 CST 2019
     */
    StockLogDO selectByPrimaryKey(String stockLogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_log
     *
     * @mbg.generated Mon Feb 25 23:42:11 CST 2019
     */
    int updateByPrimaryKeySelective(StockLogDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_log
     *
     * @mbg.generated Mon Feb 25 23:42:11 CST 2019
     */
    int updateByPrimaryKey(StockLogDO record);
}