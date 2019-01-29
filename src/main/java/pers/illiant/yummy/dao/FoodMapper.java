package pers.illiant.yummy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import pers.illiant.yummy.entity.Food;

@Mapper
public interface FoodMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer foodid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbg.generated
     */
    int insert(Food record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbg.generated
     */
    Food selectByPrimaryKey(Integer foodid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbg.generated
     */
    List<Food> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Food record);
}