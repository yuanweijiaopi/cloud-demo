package com.aiging.product.service;

import com.aiging.product.bean.Product;
import jakarta.annotation.Resource;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName ProductService
 * @Description TODO
 * @Author aql
 * @Date 2026/2/5 10:56
 * @Version 1.0
 **/
@Service
public class ProductService {

    private final String serviceName = "service-product";

    @Resource
    RestTemplate restTemplate;

    @Resource
    private DiscoveryClient discoveryClient;

    @Resource
    private LoadBalancerClient loadBalancerClient;

    public Product getProductById(Long productId) {
        Product product = new Product();
        product.setId(productId);
        product.setPrice(new BigDecimal("99"));
        product.setProductName("Apple");
        product.setNum(20);
        System.out.println("hello");
        return product;
    }

    // 开启@LoadBalanced 之后 不用再选择实例 导致把IP地址当作服务名再次解析
    public Product getProductFormRemote(Long productId){
        List<ServiceInstance> instances = discoveryClient.getInstances(serviceName);

        ServiceInstance serviceInstance = instances.get(0);
        String url = "http://" + serviceInstance.getHost()+ ":" + serviceInstance.getPort() + "/product?productId=" + productId;
        System.out.println(url);
        return restTemplate.getForObject(url,Product.class);
    }


    public Product getProductFormRemoteByLoadBalancerClient(Long productId){
        String url = "http://service-product/product?productId=" + productId;
        System.out.println(url);
        return restTemplate.getForObject(url, Product.class);
    }
}
