package com.carsonlius.eurekaserver.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Test {

    @GetMapping(value = "/test")
    public Object test()
    {
        Map<String,String> map = new HashMap<>();
        map.put("hello", "world");

        return map;
    }

}
