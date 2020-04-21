package com.microservice.school.service.impl;

import com.microservice.school.entity.Emp;
import com.microservice.school.mapper.EmpMapper;
import com.microservice.school.service.EmpService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author atjapan2015
 * @since 2020-04-21
 */
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements EmpService {

}
