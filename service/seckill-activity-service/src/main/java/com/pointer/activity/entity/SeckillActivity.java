package com.pointer.activity.entity;

import lombok.Data;

import java.util.Date;

@Data
public class SeckillActivity {
    private Long activityId;
    private String activityName;
    private String description;
    private Date startTime;
    private Date endTime;
    private Integer status;
    // 促销规则 JSON
    private String promotionRules;
    // 每人限购数量
    private Integer limitPerUser;
}
