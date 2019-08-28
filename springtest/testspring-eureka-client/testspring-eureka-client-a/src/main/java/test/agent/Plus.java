package test.agent;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import test.agent.hystrix.PlusHystrix;

@FeignClient(name = "spring-cloud-client-b", fallback = PlusHystrix.class)
public interface Plus {
    @RequestMapping(value = "/test")
    public int hello(@RequestParam("a") int a, @RequestParam("b") int b);
}
