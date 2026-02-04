package com.aiging.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName OrderMainApplication
 * @Description TODO
 * @Author aql
 * @Date 2026/1/28 10:37
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderMainApplication.class, args);
    }
}
