package com.pointer.order.dto.app;

import lombok.Data;

@Data
public class OrderItemCreateDTO {
    private Long skuId;
    private Long seckillGoodsId; // 秒杀时需要
    private Integer quantity;
} 