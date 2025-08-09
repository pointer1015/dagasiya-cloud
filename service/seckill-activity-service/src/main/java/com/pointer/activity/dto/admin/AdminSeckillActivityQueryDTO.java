package com.pointer.activity.dto.admin;

import com.pointer.common.dto.PageRequestDTO;
import lombok.Data;

import java.util.Date;

@Data
public class AdminSeckillActivityQueryDTO extends PageRequestDTO {
    private String activityName;
    private Integer status;
    private Integer publishStatus;
    private String sessionId;
    private Date startFrom;
    private Date endTo;
} 