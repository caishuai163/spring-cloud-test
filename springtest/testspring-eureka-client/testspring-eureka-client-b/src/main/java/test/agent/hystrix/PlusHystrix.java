package test.agent.hystrix;

import org.springframework.stereotype.Component;

import test.agent.Plus;

@Component
public class PlusHystrix implements Plus {

    @Override
    public int hello(int a, int b) {
        return -1;
    }

}
