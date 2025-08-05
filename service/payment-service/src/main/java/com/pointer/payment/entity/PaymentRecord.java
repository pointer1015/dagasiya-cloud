package com.pointer.payment.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PaymentRecord {
    private String paymentId;      // 支付ID (UUID)
    private String orderId;        // 订单ID
    private BigDecimal amount;     // 支付金额
    private Integer paymentMethod; // 支付方式: 0-支付宝, 1-微信, 2-银行卡
    private Integer status;        // 状态: 0-待支付, 1-支付成功, 2-支付失败
    private Date createTime;       // 创建时间
    private Date completeTime;     // 完成时间
    private String transactionId;  // 第三方交易ID
    private String paymentInfo;    // 支付信息(JSON)
}
