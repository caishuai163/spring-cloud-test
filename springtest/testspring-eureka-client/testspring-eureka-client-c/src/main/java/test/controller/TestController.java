package test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("test")
    public ResponseEntity<Object> plus(int a, int b) {
        if (Math.random() > 0.3d) {
            return ResponseEntity.badRequest().body(a + b);
        }
        return ResponseEntity.ok().body(a + b);
    }
}
