package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient // producer
@EnableFeignClients // consumer
@EnableCircuitBreaker // 熔断监控
@RefreshScope // 动态刷新
public class C2Application {
    public static void main(String[] args) {
        SpringApplication.run(C2Application.class, args);
    }
}
