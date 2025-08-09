package com.pointer.order.entity;

import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.print.DocFlavor;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Schema(name = "订单", description = "订单主实体")
public class Order {

    @Schema(description = "订单ID")
    private String orderId;

    @Schema(description = "用户ID")
    private Long userId;

    @Schema(description = "订单类型：0-普通，1-秒杀")
    private Integer orderType;

    @Schema(description = "原始金额合计")
    private BigDecimal originalAmount;

    @Schema(description = "折扣金额")
    private BigDecimal discountAmount;

    @Schema(description = "下单金额（历史字段）")
    private BigDecimal amount;

    @Schema(description = "实付金额")
    private BigDecimal payAmount;

    @Schema(description = "运费")
    private BigDecimal freight;

    @Schema(description = "货币代码")
    private String currency;

    @Schema(description = "订单状态：0-待支付，1-已支付，2-已取消")
    private Integer status;

    @Schema(description = "创建时间")
    private Date createTime;

    @Schema(description = "更新时间")
    private Date updateTime;

    @Schema(description = "支付时间")
    private Date payTime;

    @Schema(description = "超时关闭时间")
    private Date expireTime;

    @Schema(description = "收货地址（JSON字符串）")
    private String shippingAddress;

    @Schema(description = "支付ID")
    private String paymentId;

    @Schema(description = "订单来源：APP/H5/PC 等")
    private String source;

    @Schema(description = "备注")
    private String remark;

    @Schema(description = "软删标识：0-否，1-是")
    private Integer deleted;
}
