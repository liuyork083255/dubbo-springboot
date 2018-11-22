package liu.york.dubbo.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import liu.york.dubbo.api.model.Order;
import liu.york.dubbo.api.model.User;
import liu.york.dubbo.api.order.OrderService;
import liu.york.dubbo.api.user.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConsumerService {

    @Reference
    private UserService userService;

    /**
     * 如果服务order-provider已经提供了，但是消费者没有使用，那么其实可以通过dubbo管理页面查看，那些被消费者引入，那些没有
     */
//    @Reference
//    private OrderService orderService;

    public List<User> queryUser(){
        return userService.query();
    }

    public List<Order> queryOrder(){
//        return orderService.query();
        return null;
    }

}