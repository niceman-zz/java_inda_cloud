package org.nipu.pc;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingService {
    private static final Logger log = (Logger) LoggerFactory.getLogger(GreetingService.class);

    @Value("${server.port}")
    private String serverPort;

    @Value("${hello.value}")
    private String catalogType;

    @RequestMapping("/greeting")
    public String greeting() {
        String msg = String.format("Hello from %s, port: %s", catalogType, serverPort);
        log.info(msg);
        return msg;
    }
}
