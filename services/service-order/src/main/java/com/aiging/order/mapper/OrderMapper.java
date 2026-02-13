package com.aiging.order.mapper;

import com.aiging.order.bean.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
    Order selectByPrimaryKey(Long orderId);
}
