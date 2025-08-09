package com.pointer.stock.entity;

import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Date;

@Data
@Schema(name = "库存", description = "SKU 维度库存实体")
public class Stock {

    @Schema(description = "库存ID")
    private Long stockId;          // 库存ID

    @Schema(description = "商品ID（兼容字段）")
    private Long goodsId;          // 商品ID（建议逐步废弃，使用 skuId）

    @Schema(description = "SKU ID")
    private Long skuId;            // 新增：SKU 维度

    @Schema(description = "总库存")
    private Integer totalStock;    // 总库存

    @Schema(description = "可用库存")
    private Integer availableStock; // 可用库存

    @Schema(description = "锁定库存")
    private Integer lockStock;     // 锁定库存

    @Schema(description = "版本号（乐观锁）")
    private Integer version;

    @Schema(description = "更新时间")
    private Date updateTime;

    @Schema(description = "软删标识：0-否，1-是")
    private Integer deleted;
}
