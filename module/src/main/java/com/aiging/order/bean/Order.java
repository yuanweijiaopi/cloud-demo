package com.aiging.order.bean;

import lombok.Data;

/**
 * @ClassName order
 * @Description TODO
 * @Author aql
 * @Date 2026/2/5 17:26
 * @Version 1.0
 **/
@Data
public class Order {
    private Long orderId;
    private String orderName;
    private Integer orderNum;

}
