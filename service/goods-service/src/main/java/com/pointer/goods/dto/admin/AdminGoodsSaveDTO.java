package com.pointer.goods.dto.admin;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class AdminGoodsSaveDTO {
    private Long goodsId;           // 编辑时携带
    private String goodsName;
    private String description;
    private String category;
    private String brand;
    private String imageUrl;
    private String detailImageUrl;
    private Integer status;         // 0-下线，1-上线
    private BigDecimal price;       // SPU展示参考价

    private List<AdminGoodsSkuSaveDTO> skus;
} 