package pers.illiant.yummy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import pers.illiant.yummy.entity.UpdateRequest;

@Mapper
public interface UpdateRequestMapper {



    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table update_request
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer requestId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table update_request
     *
     * @mbg.generated
     */
    int insert(UpdateRequest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table update_request
     *
     * @mbg.generated
     */
    UpdateRequest selectByPrimaryKey(Integer requestId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table update_request
     *
     * @mbg.generated
     */
    List<UpdateRequest> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table update_request
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UpdateRequest record);
}