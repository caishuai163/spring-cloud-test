package test.agent;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import test.agent.hystrix.PlusHystrix;

@FeignClient(name = "${call.client.name}", fallback = PlusHystrix.class)
public interface Plus {
    @RequestMapping(value = "/test")
    public String hello(@RequestParam("key") String a);
}
