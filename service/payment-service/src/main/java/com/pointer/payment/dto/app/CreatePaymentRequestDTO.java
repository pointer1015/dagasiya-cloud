package com.pointer.payment.dto.app;

import lombok.Data;

@Data
public class CreatePaymentRequestDTO {
    private String orderId;
    private Integer orderType;   // 0-普通，1-秒杀
    private Integer paymentMethod; // 0-支付宝, 1-微信, 2-银行卡
} 