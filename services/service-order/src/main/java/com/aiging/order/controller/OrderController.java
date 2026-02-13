package com.aiging.order.controller;

import com.aiging.order.service.OrderService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author aql
 * @Date 2026/2/10 14:38
 * @Version 1.0
 **/
@RefreshScope
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @Value("${order.timeout}")
    String orderTimeOut;
    @Value("${order.auto-confirm}")
    String orderAutoConfirm;

    @GetMapping("/config")
    public String config(){
        return "orderTimeOut:" + orderTimeOut  + "orderAutoConfirm" + orderAutoConfirm;
    }

}
