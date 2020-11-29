package com.carsonlius.springcloudconsumer.web;

import com.carsonlius.springcloudconsumer.common.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {
    @Resource
    private RestTemplate restTemplate;


    @GetMapping(value = "/test")
    public Object test()
    {
        /**
         * getForEntity 发送GET请求
         * 参数1 需要访问的具体请求路径
         * 参数2 本次请求后服务器的返回的数据类型()
         * 参数3 可变长度的object类型的数据，表示本次请求中的参数
         *
         * */
//        ResponseEntity<String> responseEntity =  restTemplate.getForEntity("http://localhost:8091/test", String.class);
        ResponseEntity<String> responseEntity =  restTemplate.getForEntity("http://EUREKA-PROVIDER/test", String.class);
        System.out.println("result body:" + responseEntity.getBody());
        System.out.println("result statusCode:" + responseEntity.getStatusCode());
        System.out.println("result headers:" + responseEntity.getHeaders());


        Response response = new Response();
        response.setStatus(0);
        response.setMessage("success");
        Map<String, Object> data = new HashMap<>();
        data.put("words", "hello world");
        data.put("result", responseEntity.getBody());
        response.setData(data);
        return response;
    }
}
