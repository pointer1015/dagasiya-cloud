package com.pointer.activity.dto.admin;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AdminSeckillGoodsSaveDTO {
    private Long seckillGoodsId;  // 编辑时携带
    private Long activityId;      // 新建时可不传，由父DTO承载
    private Long goodsId;         // 兼容字段
    private Long skuId;
    private BigDecimal seckillPrice;
    private Integer seckillStock;
    private Integer limitPerUser;
    private Integer status;       // 0-下线，1-上线
} 