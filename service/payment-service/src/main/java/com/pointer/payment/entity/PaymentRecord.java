package com.pointer.payment.entity;

import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Schema(name = "支付记录", description = "支付记录实体")
public class PaymentRecord {
    @Schema(description = "支付ID")
    private String paymentId;      // 支付ID (UUID)

    @Schema(description = "订单ID")
    private String orderId;        // 订单ID

    @Schema(description = "订单类型：0-普通，1-秒杀")
    private Integer orderType;     // 订单类型：0-普通，1-秒杀

    @Schema(description = "支付金额")
    private BigDecimal amount;     // 支付金额

    @Schema(description = "货币代码")
    private String currency;       // 货币

    @Schema(description = "支付方式：0-支付宝,1-微信,2-银行卡")
    private Integer paymentMethod; // 支付方式

    @Schema(description = "支付状态：0-待支付,1-成功,2-失败")
    private Integer status;        // 状态

    @Schema(description = "创建时间")
    private Date createTime;       // 创建时间

    @Schema(description = "完成时间")
    private Date completeTime;     // 完成时间

    @Schema(description = "更新时间")
    private Date updateTime;       // 更新时间

    @Schema(description = "第三方交易ID")
    private String transactionId;  // 第三方交易ID

    @Schema(description = "支付信息（JSON字符串）")
    private String paymentInfo;    // 支付信息(JSON)

    @Schema(description = "回调时间")
    private Date notifyTime;

    @Schema(description = "回调状态：0-未通知,1-成功,2-失败")
    private Integer notifyStatus;  // 0-未通知,1-通知成功,2-通知失败

    @Schema(description = "付款方ID")
    private String payerId;

    @Schema(description = "幂等键")
    private String idempotentKey;

    @Schema(description = "错误码")
    private String errorCode;

    @Schema(description = "错误信息")
    private String errorMsg;

    @Schema(description = "软删标识：0-否，1-是")
    private Integer deleted;
}
