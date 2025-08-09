package com.pointer.stock.dto.admin;

import com.pointer.common.dto.PageRequestDTO;
import lombok.Data;

@Data
public class StockQueryDTO extends PageRequestDTO {
    private Long goodsId;
    private Long skuId;
} 