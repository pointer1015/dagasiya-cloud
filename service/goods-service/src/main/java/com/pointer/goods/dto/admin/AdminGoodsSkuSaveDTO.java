package com.pointer.goods.dto.admin;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AdminGoodsSkuSaveDTO {
    private Long skuId;         // 编辑时携带
    private Long goodsId;       // 新建时可不传，由父DTO承载
    private String skuCode;
    private String attrsJson;
    private String barCode;
    private BigDecimal originPrice;
    private BigDecimal price;
    private String imageUrl;
    private Double weight;
    private String spec;
    private Integer status;     // 0-下线，1-上线
} 