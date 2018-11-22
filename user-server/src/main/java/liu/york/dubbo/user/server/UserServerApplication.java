package liu.york.dubbo.user.server;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 这里设置扫描路径 {@link com.alibaba.dubbo.config.annotation.Service} 注解
 */
@DubboComponentScan(basePackages = "liu.york.dubbo.user.server.service")
@SpringBootApplication
public class UserServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServerApplication.class, args);
	}
}
