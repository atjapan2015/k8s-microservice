package com.microservice.school;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.microservice.school.entity.TUser;
import com.microservice.school.mapper.TUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class WrapperTests {

    @Autowired
    private TUserMapper tUserMapper;

    @Test
    public void testWrapper1() {
        QueryWrapper<TUser> wrapper = new QueryWrapper<>();
        wrapper.isNotNull("name").isNotNull("email").ge("age", 12);
        wrapper.orderByDesc("id");
        tUserMapper.selectList(wrapper).forEach(System.out::println);

        wrapper = new QueryWrapper<>();
        wrapper.eq("name", "Jone");
        TUser tUser = tUserMapper.selectOne(wrapper);
        System.out.println(tUser);

        wrapper = new QueryWrapper<>();
        wrapper.between("age", 20, 30);
        Integer count = tUserMapper.selectCount(wrapper);
        System.out.println(count);

        wrapper = new QueryWrapper<>();
        wrapper.notLike("name", "e").likeRight("email", "t");
        List<Map<String, Object>> maps = tUserMapper.selectMaps(wrapper);
        maps.forEach(System.out::println);

        wrapper = new QueryWrapper<>();
        wrapper.inSql("id", "select id from t_user where id < 3");
        List<Object> objects = tUserMapper.selectObjs(wrapper);
        objects.forEach(System.out::println);

    }
}
