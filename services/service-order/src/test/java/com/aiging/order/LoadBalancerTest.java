package com.aiging.order;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;

/**
 * @ClassName LoadBalancerTest
 * @Description TODO
 * @Author aql
 * @Date 2026/2/6 15:33
 * @Version 1.0
 **/
@SpringBootTest
public class LoadBalancerTest {

    @Resource
    private LoadBalancerClient loadBalancerClient;

    @Resource
    private DiscoveryClient discoveryClient;

    @Test
    void test(){
        ServiceInstance choose = loadBalancerClient.choose("service-order");

        System.out.println("choose = " + choose.getHost() + ":" + choose.getPort());

         choose = loadBalancerClient.choose("service-order");
        System.out.println("choose = " + choose.getHost() + ":" + choose.getPort());

         choose = loadBalancerClient.choose("service-order");
        System.out.println("choose = " + choose.getHost() + ":" + choose.getPort());

         choose = loadBalancerClient.choose("service-order");
        System.out.println("choose = " + choose.getHost() + ":" + choose.getPort());

    }
}
