package com.pointer.stock.entity;

import lombok.Data;

import java.util.Date;

@Data
public class StockLog {
    private Long logId;            // 流水ID
    private Long goodsId;          // 商品ID
    private String orderId;        // 订单ID (可为空)
    private Long activityId;       // 活动ID (可为空)
    private Integer changeType;    // 变更类型: 0-预扣, 1-回滚, 2-实际扣减
    private Integer changeAmount;  // 变更数量
    private String operator;       // 操作者: system/user
    private Date createTime;       // 创建时间
}
