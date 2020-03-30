package org.nipu.po;

import org.nipu.po.order.clients.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @Autowired
    private GreetingService greetingService;

    @RequestMapping(path="/greeting")
    public String greeting() {
        return greetingService.greeting();
    }
}
