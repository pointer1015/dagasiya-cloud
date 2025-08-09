package com.pointer.activity.dto.app;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class AppSeckillActivityDTO {
    private Long activityId;
    private String activityName;
    private Date startTime;
    private Date endTime;
    private Date preheatTime;
    private Integer status;

    private List<AppSeckillGoodsDTO> goods;
} 