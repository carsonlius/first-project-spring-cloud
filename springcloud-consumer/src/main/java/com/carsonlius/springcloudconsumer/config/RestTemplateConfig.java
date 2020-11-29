package com.carsonlius.springcloudconsumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    /**
     * 交给springboot维护一个模版对象
     * @LoadBalanced
     *    标记当前restTemplate视同ribbon负载均衡访问服务提供者,当使用注册中心后，必须开启这个配置；默认ribbon的负载均衡策略是轮询的
     * */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate()
    {
        return new RestTemplate();
    }
}
