package site.k8scloud.course.service.impl;

import site.k8scloud.course.entity.TUser;
import site.k8scloud.course.mapper.TUserMapper;
import site.k8scloud.course.service.TUserService;
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
