package com.aiging.config;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ResTemplate
 * @Description TODO
 * @Author aql
 * @Date 2026/2/6 11:33
 * @Version 1.0
 **/
@AutoConfiguration
public class ResTemplate {

    @Bean
    @LoadBalanced
    public RestTemplate resTemplate(){
        return new RestTemplate();
    }
}
