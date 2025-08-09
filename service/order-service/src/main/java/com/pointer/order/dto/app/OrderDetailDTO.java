package com.pointer.order.dto.app;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class OrderDetailDTO {
    private String orderId;
    private Integer orderType;
    private Integer status;
    private BigDecimal amount;
    private BigDecimal payAmount;
    private String shippingAddress;
    private Date createTime;
    private Date payTime;

    private List<OrderItemDTO> items;
} 