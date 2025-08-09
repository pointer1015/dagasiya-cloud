package com.pointer.goods.entity;

import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Schema(name = "商品SKU", description = "商品SKU实体")
public class GoodsSku {
    @Schema(description = "SKU主键")
    private Long skuId;

    @Schema(description = "SPU主键")
    private Long goodsId;

    @Schema(description = "外部编码/条码")
    private String skuCode;

    @Schema(description = "规格属性JSON")
    private String attrsJson;

    @Schema(description = "条码")
    private String barCode;

    @Schema(description = "原价")
    private BigDecimal originPrice;

    @Schema(description = "现价")
    private BigDecimal price;

    @Schema(description = "SKU图片")
    private String imageUrl;

    @Schema(description = "重量(kg)")
    private Double weight;

    @Schema(description = "规格文本")
    private String spec;

    @Schema(description = "状态：0-下线，1-上线")
    private Integer status;

    @Schema(description = "创建时间")
    private Date createTime;

    @Schema(description = "更新时间")
    private Date updateTime;

    @Schema(description = "软删标识：0-否，1-是")
    private Integer deleted;
} 