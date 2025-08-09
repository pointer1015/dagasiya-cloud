package com.pointer.common.dto;

import lombok.Data;

@Data
public class PageRequestDTO {
    private Integer pageNum = 1;
    private Integer pageSize = 10;
    private String sortBy;
    private Boolean asc;
} 