package com.aiging.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ResTemplate
 * @Description TODO
 * @Author aql
 * @Date 2026/2/6 11:33
 * @Version 1.0
 **/
@Configuration
public class ResTemplate {

    @Bean
    public RestTemplate resTemplate(){
        return new RestTemplate();
    }
}
