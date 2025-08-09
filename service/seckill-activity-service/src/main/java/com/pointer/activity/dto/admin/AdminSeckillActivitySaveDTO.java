package com.pointer.activity.dto.admin;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class AdminSeckillActivitySaveDTO {
    private Long activityId;          // 编辑时携带
    private String activityName;
    private String description;
    private Date startTime;
    private Date endTime;
    private Date preheatTime;
    private Integer publishStatus;    // 0/1/2
    private String sessionId;
    private Integer qpsLimit;
    private Integer concurrencyLimit;
    private String promotionRules;
    private Integer limitPerUser;

    private List<AdminSeckillGoodsSaveDTO> goodsList;
} 