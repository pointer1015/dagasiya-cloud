package com.pointer.activity.entity;

import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Date;

@Data
@Schema(name = "秒杀令牌", description = "用于秒杀风控与下单幂等的令牌")
public class SeckillToken {

    @Schema(description = "令牌ID")
    private String tokenId;

    @Schema(description = "用户ID")
    private Long userId;

    @Schema(description = "活动ID")
    private Long activityId;

    @Schema(description = "秒杀商品ID")
    private Long seckillGoodsId;

    @Schema(description = "创建时间")
    private Date createTime;

    @Schema(description = "过期时间")
    private Date expireTime;

    @Schema(description = "状态：0-未使用，1-已使用")
    private Integer status;

    @Schema(description = "幂等请求ID")
    private String requestId;

    @Schema(description = "客户端IP")
    private String ip;

    @Schema(description = "User-Agent")
    private String userAgent;

    @Schema(description = "分片键")
    private String shardKey;

    @Schema(description = "使用时间")
    private Date usedTime;
}
