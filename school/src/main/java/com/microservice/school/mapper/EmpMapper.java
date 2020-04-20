package com.microservice.school.mapper;

import com.microservice.school.entity.Emp;
import com.microservice.school.entity.EmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbg.generated Mon Apr 20 21:41:24 CST 2020
     */
    long countByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbg.generated Mon Apr 20 21:41:24 CST 2020
     */
    int deleteByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbg.generated Mon Apr 20 21:41:24 CST 2020
     */
    int deleteByPrimaryKey(Short empno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbg.generated Mon Apr 20 21:41:24 CST 2020
     */
    int insert(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbg.generated Mon Apr 20 21:41:24 CST 2020
     */
    int insertSelective(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbg.generated Mon Apr 20 21:41:24 CST 2020
     */
    List<Emp> selectByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbg.generated Mon Apr 20 21:41:24 CST 2020
     */
    Emp selectByPrimaryKey(Short empno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbg.generated Mon Apr 20 21:41:24 CST 2020
     */
    int updateByExampleSelective(@Param("record") Emp record, @Param("example") EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbg.generated Mon Apr 20 21:41:24 CST 2020
     */
    int updateByExample(@Param("record") Emp record, @Param("example") EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbg.generated Mon Apr 20 21:41:24 CST 2020
     */
    int updateByPrimaryKeySelective(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbg.generated Mon Apr 20 21:41:24 CST 2020
     */
    int updateByPrimaryKey(Emp record);
}