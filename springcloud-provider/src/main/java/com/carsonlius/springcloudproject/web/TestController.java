package com.carsonlius.springcloudproject.web;

import com.carsonlius.springcloudproject.common.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public Object test(){
       return new Response(0, "eureka response 20201129");
    }
}
