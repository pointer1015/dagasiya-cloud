package com.pointer.order.dto.app;

import lombok.Data;

import java.util.List;

@Data
public class CreateOrderRequestDTO {
    private Integer orderType;     // 0-普通，1-秒杀
    private String shippingAddress; // 或者 addressId
    private String remark;

    private List<OrderItemCreateDTO> items;

    // 秒杀专用
    private String seckillToken;
} 