package liu.york.dubbo.api.order;

import com.alibaba.dubbo.config.annotation.Service;
import liu.york.dubbo.api.model.Order;

import java.util.List;

@Service
public interface OrderService {

    List<Order> query();

}