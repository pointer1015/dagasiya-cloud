package com.pointer.common.dto;

import lombok.Data;

import java.util.List;

@Data
public class PageResponseDTO<T> {
    private Long total;
    private Integer pageNum;
    private Integer pageSize;
    private List<T> list;
} 