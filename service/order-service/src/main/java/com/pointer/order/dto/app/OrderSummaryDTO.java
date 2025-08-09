package com.pointer.order.dto.app;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class OrderSummaryDTO {
    private String orderId;
    private Integer status;
    private BigDecimal payAmount;
    private Date createTime;
} 