package com.pointer.order.entity;

import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Date;

@Data
@Schema(name = "秒杀占位订单", description = "用于防重复与高并发占位的轻量记录")
public class SeckillOrder {
    @Schema(description = "主键ID")
    private Long id;

    @Schema(description = "用户ID")
    private Long userId;

    @Schema(description = "活动ID")
    private Long activityId;

    @Schema(description = "SKU ID")
    private Long skuId;

    @Schema(description = "状态：0-INIT，1-SUCCESS，2-FAILED")
    private Integer status;   // 0-INIT,1-SUCCESS,2-FAILED

    @Schema(description = "正式订单ID")
    private String orderId;   // 正式订单ID

    @Schema(description = "创建时间")
    private Date createTime;
} 