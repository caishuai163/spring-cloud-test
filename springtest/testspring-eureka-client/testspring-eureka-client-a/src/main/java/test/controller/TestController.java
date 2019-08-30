package test.controller;

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
        return "this is a return : " + plus.hello(key);
    }
}
