package com.pointer.goods.entity;

import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Schema(name = "商品SPU", description = "商品（SPU）实体")
public class Goods {

    @Schema(description = "SPU主键")
    private Long goodsId;

    @Schema(description = "商品名称")
    private String goodsName;

    @Schema(description = "商品描述")
    private String description;

    @Schema(description = "参考价格")
    private BigDecimal price;

    @Schema(description = "类目")
    private String category;

    @Schema(description = "品牌")
    private String brand;

    @Schema(description = "主图URL")
    private String imageUrl;

    @Schema(description = "详情图URL")
    private String detailImageUrl;

    @Schema(description = "状态：0-下线，1-上线")
    private Integer status;

    @Schema(description = "创建时间")
    private Date createTime;

    @Schema(description = "更新时间")
    private Date updateTime;

    @Schema(description = "软删标识：0-否，1-是")
    private Integer deleted;
}
