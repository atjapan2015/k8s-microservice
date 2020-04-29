package site.k8scloud.course.service.impl;

import site.k8scloud.course.entity.Emp;
import site.k8scloud.course.mapper.EmpMapper;
import site.k8scloud.course.service.EmpService;
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
