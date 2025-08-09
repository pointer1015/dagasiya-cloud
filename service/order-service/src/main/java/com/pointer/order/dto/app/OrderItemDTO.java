package com.pointer.order.dto.app;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemDTO {
    private String orderItemId;
    private Long skuId;
    private String goodsName;
    private String goodsImage;
    private Integer quantity;
    private BigDecimal price;
    private Integer priceType; // 0-原价，1-秒杀价
    private BigDecimal totalPrice;
    private String attrsJson;
} 