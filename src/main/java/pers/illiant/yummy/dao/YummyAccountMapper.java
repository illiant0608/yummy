package pers.illiant.yummy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import pers.illiant.yummy.entity.YummyAccount;

@Mapper
public interface YummyAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yummy_account
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer accountId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yummy_account
     *
     * @mbg.generated
     */
    int insert(YummyAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yummy_account
     *
     * @mbg.generated
     */
    YummyAccount selectByPrimaryKey(Integer accountId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yummy_account
     *
     * @mbg.generated
     */
    List<YummyAccount> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yummy_account
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(YummyAccount record);
}