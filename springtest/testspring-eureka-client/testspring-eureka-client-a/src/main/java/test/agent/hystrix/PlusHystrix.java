package test.agent.hystrix;

import org.springframework.stereotype.Component;

import test.agent.Plus;

@Component
public class PlusHystrix implements Plus {

    @Override
    public String hello(String a) {
        return "this is a bug";
    }


}
