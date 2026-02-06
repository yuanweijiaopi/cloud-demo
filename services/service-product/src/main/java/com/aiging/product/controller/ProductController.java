package com.aiging.product.controller;

import com.aiging.product.bean.Product;
import com.aiging.product.service.ProductService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ProductController
 * @Description TODO
 * @Author aql
 * @Date 2026/2/5 10:55
 * @Version 1.0
 **/
@RestController
public class ProductController {

    @Resource
    private ProductService productService;

    @GetMapping("/product")
    public Product getProduct(Long productId){
        return productService.getProductById(productId);
    }


    @GetMapping("/product/getProductFormRemote")
    public Product getProductFormRemote(Long productId){
        return productService.getProductFormRemote(productId);
    }
}
