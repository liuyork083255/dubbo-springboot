package liu.york.dubbo.api.user;

import com.alibaba.dubbo.config.annotation.Service;
import liu.york.dubbo.api.model.User;

import java.util.List;

@Service
public interface UserService {

    List<User> query();

}