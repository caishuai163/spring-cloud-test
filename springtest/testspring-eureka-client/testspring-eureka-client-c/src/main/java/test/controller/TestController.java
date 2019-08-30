package test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RefreshScope  // 这个东西一定要放在要修改的属性的类上面，否则 呵呵
public class TestController {

    @Value("${my.key}")
    private String key;

    @RequestMapping("test")
    public ResponseEntity<Object> plus(int a, int b) {
        if (Math.random() > 0.3d) {
            return ResponseEntity.badRequest().body(a + b);
        }
        return ResponseEntity.ok().body(a + b);
    }

    @RequestMapping("test2")
    public ResponseEntity<Object> test2() {
        return ResponseEntity.ok().body(key);
    }
}
