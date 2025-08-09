package com.pointer.stock.controller.admin;

import com.pointer.common.result.Result;
import com.pointer.stock.dto.admin.StockAdjustDTO;
import com.pointer.stock.dto.admin.StockDTO;
import com.pointer.stock.dto.admin.StockQueryDTO;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@Tag(name = "Admin-库存", description = "后台库存管理接口")
@RestController
@RequestMapping("/api/admin/v1/stock")
public class StockAdminController {

    @PostMapping("/adjust")
    public Result<Boolean> adjust(@RequestBody StockAdjustDTO req) {
        return Result.success(Boolean.TRUE);
    }

    @PostMapping("/query")
    public Result<?> query(@RequestBody StockQueryDTO req) {
        return Result.success(Collections.<StockDTO>emptyList());
    }
} 