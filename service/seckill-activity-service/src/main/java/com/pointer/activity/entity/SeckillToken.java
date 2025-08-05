package com.pointer.activity.entity;

import lombok.Data;

import java.util.Date;

@Data
public class SeckillToken {

    private String tokenId;
    private Long userId;
    private Long activityId;
    private Long seckillGoodsId;
    private Date createTime;
    // 过期时间
    private Date expireTime;
    // 状态: 0-未使用, 1-已使用
    private Integer status;


}
