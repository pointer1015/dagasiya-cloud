package com.pointer.stock.entity;

import lombok.Data;

@Data
public class Stock {

    private Long stockId;          // 库存ID
    private Long goodsId;          // 商品ID
    private Integer totalStock;    // 总库存
    private Integer availableStock; // 可用库存
    private Integer lockStock;     // 锁定库存
}
