package test.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.agent.Plus;

@RestController
public class TestController {

    @Autowired
    private Plus plus;

    @RequestMapping("test")
    public String plus(String key) {
        if (!StringUtils.equals("key", key)) {
            // 为了测试熔断， 好像返回非200就可以了
            throw new RuntimeException("hehe");
        }
        return "key : " + plus.getConfig();
    }
}
