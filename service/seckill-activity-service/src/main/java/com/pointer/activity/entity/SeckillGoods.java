package com.pointer.activity.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SeckillGoods {

    private Long seckillGoodsId;
    private Long activityId;
    private Long goodsId;
    private BigDecimal seckillPrice;
    // 秒杀库存量
    private Integer seckillStock;
    // 初始库存量
    private Integer initStock;
    // 乐观锁版本号
    private Integer version;
}
