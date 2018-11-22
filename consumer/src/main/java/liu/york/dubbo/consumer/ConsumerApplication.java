package liu.york.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 作为消费者，这里扫描主要是{@link Reference},官方文档是这样演示的，但是测试下来，这里可以不用指定，应该是高版本默认扫描了
 * spring-boot根路径下面所有注解吧
 */
@SpringBootApplication
@DubboComponentScan(basePackages = "liu.york.dubbo.consumer.service")
public class ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}
}
