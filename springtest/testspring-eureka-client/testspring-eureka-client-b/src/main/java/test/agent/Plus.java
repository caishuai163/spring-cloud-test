package test.agent;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import test.agent.hystrix.PlusHystrix;

@RefreshScope // 动态刷新
@FeignClient(name = "${call.client.name.c}", fallback = PlusHystrix.class)
//@FeignClient(name = "spring-cloud-client-c", fallback = PlusHystrix.class)
public interface Plus {
    @RequestMapping(value = "/test2")
    public String getConfig();
}
