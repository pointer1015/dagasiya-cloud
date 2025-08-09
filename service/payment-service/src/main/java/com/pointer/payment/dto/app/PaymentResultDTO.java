package com.pointer.payment.dto.app;

import lombok.Data;

@Data
public class PaymentResultDTO {
    private String paymentId;
    private Integer status;       // 0-待支付, 1-成功, 2-失败
    private String transactionId;
    private String payUrl;        // 二次拉起链接（如需）
} 