package org.nipu.pc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingService {
    @RequestMapping("/greeting")
    public String greeting() {
        return "Hello from product catalog2";
    }
}
