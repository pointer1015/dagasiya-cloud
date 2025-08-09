package com.pointer.stock.entity;

import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Date;

@Data
@Schema(name = "库存流水", description = "库存变更流水记录")
public class StockLog {
    @Schema(description = "流水ID")
    private Long logId;            // 流水ID

    @Schema(description = "商品ID（兼容字段）")
    private Long goodsId;          // 商品ID

    @Schema(description = "SKU ID")
    private Long skuId;            // 新增：SKU 维度

    @Schema(description = "订单ID")
    private String orderId;        // 订单ID (可为空)

    @Schema(description = "活动ID")
    private Long activityId;       // 活动ID (可为空)

    @Schema(description = "变更类型：0-预扣,1-回滚,2-实际扣减")
    private Integer changeType;    // 变更类型: 0-预扣, 1-回滚, 2-实际扣减

    @Schema(description = "变更数量")
    private Integer changeAmount;  // 变更数量

    @Schema(description = "操作人：system/user")
    private String operator;       // 操作者: system/user

    @Schema(description = "状态：0-INIT，1-SUCCESS，2-FAIL")
    private Integer status;        // 状态：0-INIT，1-SUCCESS，2-FAIL

    @Schema(description = "业务类型：SECKILL/ORDER/CANCEL 等")
    private String bizType;        // 业务类型：SECKILL/ORDER/CANCEL 等

    @Schema(description = "幂等键")
    private String requestId;      // 幂等键

    @Schema(description = "链路追踪ID")
    private String traceId;        // 调用链追踪ID

    @Schema(description = "备注")
    private String remark;         // 备注

    @Schema(description = "创建时间")
    private Date createTime;       // 创建时间
}
