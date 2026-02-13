package com.aiging.order.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName OrderProperties
 * @Description TODO
 * @Author aql
 * @Date 2026/2/11 10:28
 * @Version 1.0
 **/
@Component
@ConfigurationProperties(prefix = "order")
@Data
public class OrderProperties {
    String timeout;

    String autoConfirm;
}
