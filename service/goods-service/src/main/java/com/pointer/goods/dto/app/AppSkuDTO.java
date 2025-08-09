package com.pointer.goods.dto.app;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AppSkuDTO {
    private Long skuId;
    private String attrsJson;
    private BigDecimal price;
    private String imageUrl;
    private Integer availableStock; // 可选：从库存服务聚合
} 