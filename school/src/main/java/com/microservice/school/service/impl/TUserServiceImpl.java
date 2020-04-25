package com.microservice.school.service.impl;

import com.microservice.school.entity.TUser;
import com.microservice.school.mapper.TUserMapper;
import com.microservice.school.service.TUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author atjapan2015
 * @since 2020-04-25
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserService {

}
