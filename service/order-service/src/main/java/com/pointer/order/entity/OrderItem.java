package com.pointer.order.entity;

import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Schema(name = "订单明细", description = "订单明细实体")
public class OrderItem {

    @Schema(description = "订单ID")
    private String orderId;

    @Schema(description = "订单明细ID")
    private String orderItemId;

    @Schema(description = "商品ID（兼容字段，建议使用SKU）")
    private Long goodsId; // 建议逐步废弃，使用 skuId

    @Schema(description = "SKU ID")
    private Long skuId;   // 新增：SKU 维度

    @Schema(description = "秒杀商品ID")
    private Long seckillGoodsId;

    @Schema(description = "商品名称")
    private String goodsName;

    @Schema(description = "购买数量")
    private Integer quantity;

    @Schema(description = "单价（下单快照价）")
    private BigDecimal price;

    @Schema(description = "价格类型：0-原价，1-秒杀价")
    private Integer priceType;

    @Schema(description = "总价")
    private BigDecimal totalPrice;

    @Schema(description = "商品图片")
    private String goodsImage;

    @Schema(description = "规格属性快照(JSON字符串)")
    private String attrsJson;

    @Schema(description = "创建时间")
    private Date createTime;

    @Schema(description = "更新时间")
    private Date updateTime;

    @Schema(description = "软删标识：0-否，1-是")
    private Integer deleted;
}
