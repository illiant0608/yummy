package pers.illiant.yummy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import pers.illiant.yummy.entity.OrderProduct;

@Mapper
public interface OrderProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_product
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("orderId") Integer orderId, @Param("foodName") String foodName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_product
     *
     * @mbg.generated
     */
    int insert(OrderProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_product
     *
     * @mbg.generated
     */
    OrderProduct selectByPrimaryKey(@Param("orderId") Integer orderId, @Param("foodName") String foodName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_product
     *
     * @mbg.generated
     */
    List<OrderProduct> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_product
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(OrderProduct record);

    List<OrderProduct> selectByOrderId(Integer orderId);
}