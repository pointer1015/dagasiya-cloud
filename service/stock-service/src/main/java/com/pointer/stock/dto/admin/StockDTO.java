package com.pointer.stock.dto.admin;

import lombok.Data;

@Data
public class StockDTO {
    private Long skuId;
    private Integer totalStock;
    private Integer availableStock;
    private Integer lockStock;
} 