package com.pointer.order.dto.admin;

import com.pointer.common.dto.PageRequestDTO;
import lombok.Data;

import java.util.Date;

@Data
public class OrderQueryDTO extends PageRequestDTO {
    private Long userId;
    private Integer status;
    private Integer orderType;
    private Date startFrom;
    private Date endTo;
} 