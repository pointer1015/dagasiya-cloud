package com.pointer.activity.entity;

import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Schema(name = "秒杀商品", description = "活动下的秒杀商品实体")
public class SeckillGoods {

    @Schema(description = "秒杀商品ID")
    private Long seckillGoodsId;

    @Schema(description = "活动ID")
    private Long activityId;

    @Schema(description = "商品ID（兼容字段）")
    private Long goodsId;     // 建议逐步废弃，使用 skuId

    @Schema(description = "SKU ID")
    private Long skuId;       // 新增：SKU 维度

    @Schema(description = "秒杀价")
    private BigDecimal seckillPrice;

    @Schema(description = "秒杀库存")
    private Integer seckillStock;

    @Schema(description = "初始库存")
    private Integer initStock;

    @Schema(description = "已售数量")
    private Integer soldStock;

    @Schema(description = "每人限购（覆盖活动级）")
    private Integer limitPerUser;

    @Schema(description = "状态：0-下线，1-上线")
    private Integer status;

    @Schema(description = "版本号（乐观锁）")
    private Integer version;

    @Schema(description = "创建时间")
    private Date createTime;

    @Schema(description = "更新时间")
    private Date updateTime;

    @Schema(description = "软删标识：0-否，1-是")
    private Integer deleted;
}
