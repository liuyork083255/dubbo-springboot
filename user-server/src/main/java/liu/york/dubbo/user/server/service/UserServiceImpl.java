package liu.york.dubbo.user.server.service;

import com.alibaba.dubbo.config.annotation.Service;
import liu.york.dubbo.api.model.User;
import liu.york.dubbo.api.user.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * Note:这里需要特别注意，虽然接口 {@link UserService} 加了注解 {@link com.alibaba.dubbo.config.annotation.Service}
 * 但是测试下来，具体的实现类是不会继承这个或者是没有扫描到，这里跟spring-cloud中的FeignClient api有区别
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> query() {
        User u1 = new User();
        User u2 = new User();

        u1.setUsername("张三");u1.setPassword("123456");
        u2.setUsername("李四");u2.setPassword("654321");

        return Arrays.asList(u1, u2);

    }
}