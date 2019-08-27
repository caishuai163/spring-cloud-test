package test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "spring-cloud-producer")
public interface Plus {
	@RequestMapping(value = "/test")
	public int hello(@RequestParam("a") int a, @RequestParam("b") int b);
}
