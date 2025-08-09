package com.pointer.goods.controller.admin;

import com.pointer.common.dto.PageResponseDTO;
import com.pointer.common.result.Result;
import com.pointer.goods.dto.admin.AdminGoodsQueryDTO;
import com.pointer.goods.dto.admin.AdminGoodsSaveDTO;
import com.pointer.goods.dto.app.AppGoodsBriefDTO;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Admin-商品", description = "后台商品管理接口")
@RestController
@RequestMapping("/api/admin/v1/goods")
public class GoodsAdminController {

    @PostMapping("/save")
    public Result<Boolean> save(@RequestBody AdminGoodsSaveDTO dto) {
        return Result.success(Boolean.TRUE);
    }

    @PostMapping("/query")
    public Result<PageResponseDTO<AppGoodsBriefDTO>> query(@RequestBody AdminGoodsQueryDTO req) {
        PageResponseDTO<AppGoodsBriefDTO> page = new PageResponseDTO<>();
        page.setTotal(0L);
        page.setPageNum(req.getPageNum());
        page.setPageSize(req.getPageSize());
        return Result.success(page);
    }
} 