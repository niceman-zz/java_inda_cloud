package org.nipu.po.order.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="product-catalog")
public interface GreetingService {
    @RequestMapping(method = RequestMethod.GET, path = "/greeting")
    String greeting();
}
