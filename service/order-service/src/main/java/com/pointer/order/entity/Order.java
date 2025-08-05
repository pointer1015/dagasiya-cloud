package com.pointer.order.entity;

import lombok.Data;

import javax.print.DocFlavor;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class Order {

    private String orderId;
    private Long userId;
    private BigDecimal amount;
    // 状态: 0-待支付, 1-已支付, 2-已取消
    private Integer status;
    private Date createTime;
    private Date payTime;
    // 收货地址 JSON
    private String shoppingAddress;
    // 支付Id(关联支付服务)
    private String paymentId;


}
