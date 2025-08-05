package com.pointer.order.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItem {

    private Long orderId;
    private String orderItemId;
    private Long goodsId;
    private Long seckillGoodsId;
    private String goodsName;
    // 购买数量
    private Integer quantity;
    // 单价
    private BigDecimal price;
    // 总价
    private BigDecimal totalPrice;
    private String goodsImage;
}
