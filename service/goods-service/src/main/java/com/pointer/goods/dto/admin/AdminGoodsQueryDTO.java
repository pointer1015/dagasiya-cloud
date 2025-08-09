package com.pointer.goods.dto.admin;

import com.pointer.common.dto.PageRequestDTO;
import lombok.Data;

@Data
public class AdminGoodsQueryDTO extends PageRequestDTO {
    private String keyword;
    private String category;
    private String brand;
    private Integer status;
} 