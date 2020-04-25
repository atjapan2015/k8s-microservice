package com.microservice.school;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.microservice.school.entity.TUser;
import com.microservice.school.entity.ext.TUserExt;
import com.microservice.school.mapper.TUserMapper;
import com.microservice.school.mapper.ext.TUserExtMapper;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
class SchoolApplicationTests {

    @Autowired
    private TUserMapper tUserMapper;

    @Autowired
    private TUserExtMapper tUserExtMapper;


    @Test
    void contextLoads() {
    }

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<TUser> resultList = tUserMapper.selectList(null);
        Assert.assertEquals(5, resultList.size());
        resultList.forEach(System.out::println);
    }

    @Test
    public void testSelectByBatchIds() {
        System.out.println(("----- selectByBatchIds method test ------"));
        List<TUser> resultList = tUserMapper.selectBatchIds(Arrays.asList(1L, 2L, 3L));
        Assert.assertEquals(3, resultList.size());
        resultList.forEach(System.out::println);
    }

    @Test
    public void testSelectByMap() {
        System.out.println(("----- selectByMap method test ------"));
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Jone");
        List<TUser> resultList = tUserMapper.selectByMap(map);
        Assert.assertEquals(1, resultList.size());
        resultList.forEach(System.out::println);
    }

    @Test
    public void testSelectPage() {
        System.out.println(("----- selectPage method test ------"));
        Page<TUser> page = new Page<>(1, 5);
        Page<TUser> tUserPage = tUserMapper.selectPage(page, null);
        tUserPage.getRecords().forEach(System.out::println);
    }


    @Test
    public void testInsert() {
        System.out.println(("----- insert method test ------"));
        TUserExt tUser = new TUserExt();
        tUser.setName("test");
        tUserExtMapper.insert(tUser);
    }

    @Test
    public void testUpdate() {
        System.out.println(("----- update method test ------"));
        TUserExt tUser = new TUserExt();
        tUser.setId(5L);
        tUser.setName("test");
        tUserExtMapper.updateById(tUser);
    }

    @Test
    public void testOptimisticLocker() {

        System.out.println(("----- optimistic locker method test ------"));
        TUserExt tUser = tUserExtMapper.selectById(5L);
        tUser.setName("test");
        tUserExtMapper.updateById(tUser);
    }

    @Test
    public void testOptimisticLocker2() {

        System.out.println(("----- optimistic locker2 method test ------"));
        TUserExt tUser1 = tUserExtMapper.selectById(5L);
        tUser1.setName("test1");

        TUserExt tUser2 = tUserExtMapper.selectById(5L);
        tUser2.setName("test2");
        tUserExtMapper.updateById(tUser2);

        tUserExtMapper.updateById(tUser1);
    }

    @Test
    public void testDelete() {
        TUserExt tUser = tUserExtMapper.selectById(5L);
        System.out.println(tUser);
        tUserExtMapper.deleteById(5L);
        tUser = tUserExtMapper.selectById(5L);
        System.out.println(tUser);
    }
}
