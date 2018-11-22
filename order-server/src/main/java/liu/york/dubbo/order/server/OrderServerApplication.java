package liu.york.dubbo.order.server;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/**
 * 这里设置扫描路径 {@link com.alibaba.dubbo.config.annotation.Service} 注解
 */
@SpringBootApplication
@DubboComponentScan(basePackages = "liu.york.dubbo.order.server.service")
public class OrderServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServerApplication.class, args);
	}
}
