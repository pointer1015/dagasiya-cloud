package com.pointer.goods.dto.app;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AppGoodsBriefDTO {
    private Long goodsId;
    private String goodsName;
    private String imageUrl;
    private BigDecimal minPrice;
    private Integer status;
} 