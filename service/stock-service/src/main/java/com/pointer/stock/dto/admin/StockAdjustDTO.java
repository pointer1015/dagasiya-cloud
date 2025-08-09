package com.pointer.stock.dto.admin;

import lombok.Data;

@Data
public class StockAdjustDTO {
    private Long skuId;
    private Integer delta;
    private String reason;
    private String operator;
} 