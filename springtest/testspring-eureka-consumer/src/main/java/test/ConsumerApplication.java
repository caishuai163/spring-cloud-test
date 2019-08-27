package test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(ConsumerApplication.class, args);
		Plus bean = run.getBean(Plus.class);
		for (int i = 0; i < 10; i++) {
			int hello = bean.hello(1, 2);
			LOGGER.info("res is : {}", hello);
		}
	}

}