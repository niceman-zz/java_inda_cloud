package org.nipu.pc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingService {
    @Value("${server.port}")
    private String serverPort;  // set from command line to allow multiple instances run

    @RequestMapping("/greeting")
    public String greeting() {
        return "Hello from product catalog:" + serverPort;
    }
}
