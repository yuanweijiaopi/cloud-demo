package com.aiging.order.service;

import com.aiging.order.bean.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiging.order.mapper.OrderMapper;

/**
 * @ClassName OrderService
 * @Description TODO
 * @Author aql
 * @Date 2026/2/10 14:39
 * @Version 1.0
 **/
@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public Order selectOrderById(Long orderId) {
        return orderMapper.selectByPrimaryKey(orderId);
    }

}
