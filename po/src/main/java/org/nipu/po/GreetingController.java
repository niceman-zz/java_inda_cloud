package org.nipu.po;

import ch.qos.logback.classic.Logger;
import org.nipu.po.order.clients.GreetingService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private static final Logger log = (Logger) LoggerFactory.getLogger(GreetingController.class);

    @Autowired
    private GreetingService greetingService;

    @RequestMapping(path="/greeting")
    public String greeting() {
        log.info("Greeting service has been called");
        return greetingService.greeting();
    }
}
