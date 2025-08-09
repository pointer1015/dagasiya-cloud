package com.pointer.activity.entity;

import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Date;

@Data
@Schema(name = "秒杀活动", description = "秒杀活动实体")
public class SeckillActivity {
    @Schema(description = "活动ID")
    private Long activityId;

    @Schema(description = "活动名称")
    private String activityName;

    @Schema(description = "活动描述")
    private String description;

    @Schema(description = "开始时间")
    private Date startTime;

    @Schema(description = "结束时间")
    private Date endTime;

    @Schema(description = "预热时间")
    private Date preheatTime;      // 预热时间

    @Schema(description = "活动状态：0-未开始/草稿，1-进行中/已发布，2-已下线")
    private Integer status;

    @Schema(description = "发布状态：0-草稿，1-已发布，2-下线")
    private Integer publishStatus;

    @Schema(description = "场次ID")
    private String sessionId;

    @Schema(description = "QPS限流")
    private Integer qpsLimit;

    @Schema(description = "并发限流")
    private Integer concurrencyLimit;

    @Schema(description = "促销规则（JSON字符串）")
    private String promotionRules;

    @Schema(description = "每人限购数量")
    private Integer limitPerUser;  // 活动级

    @Schema(description = "创建时间")
    private Date createTime;

    @Schema(description = "更新时间")
    private Date updateTime;

    @Schema(description = "软删标识：0-否，1-是")
    private Integer deleted;
}
