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
    public int plus(int a, int b) {
        if (Math.random() > 0.5d) {
            throw new RuntimeException("hehe");
        }
        return plus.hello(a, b) + b;
    }
}
