package com.aiging.product;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.List;

/**
 * @ClassName DiscoveryTest
 * @Description TODO
 * @Author aql
 * @Date 2026/1/28 16:27
 * @Version 1.0
 **/

@SpringBootTest
public class DiscoveryTest {

    @Resource
    DiscoveryClient discoveryClient;

    @Test
    void discoveryClientTest(){
        for (String service : discoveryClient.getServices()) {
            System.out.println(service);

            //获取ip+port
            List<ServiceInstance> instances = discoveryClient.getInstances(service);
            for (ServiceInstance instance : instances) {
                System.out.println(instance);
            }
        }
    }
}
