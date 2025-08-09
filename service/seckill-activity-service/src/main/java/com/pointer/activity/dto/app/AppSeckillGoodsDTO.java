package com.pointer.activity.dto.app;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AppSeckillGoodsDTO {
    private Long seckillGoodsId;
    private Long skuId;
    private BigDecimal seckillPrice;
    private Integer limitPerUser;
    private Integer status;
} 