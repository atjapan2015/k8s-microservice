package com.microservice.school;

import com.microservice.school.entity.Emp;
import com.microservice.school.mapper.EmpMapper;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class SchoolApplicationTests {

    @Autowired
    private EmpMapper empMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void testSelectEmp() {
        System.out.println(("----- selectAll method test ------"));
        List<Emp> empList = empMapper.selectList(null);
        Assert.assertEquals(14, empList.size());
        empList.forEach(System.out::println);
    }
}
