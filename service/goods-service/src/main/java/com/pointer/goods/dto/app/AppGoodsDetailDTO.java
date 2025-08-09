package com.pointer.goods.dto.app;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class AppGoodsDetailDTO {
    private Long goodsId;
    private String goodsName;
    private String description;
    private String imageUrl;
    private String detailImageUrl;
    private Integer status;

    private BigDecimal minPrice;
    private BigDecimal maxPrice;

    private List<AppSkuDTO> skus;
} 