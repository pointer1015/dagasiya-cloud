package com.pointer.goods.controller.app;

import com.pointer.common.dto.PageRequestDTO;
import com.pointer.common.dto.PageResponseDTO;
import com.pointer.common.result.Result;
import com.pointer.goods.dto.app.AppGoodsBriefDTO;
import com.pointer.goods.dto.app.AppGoodsDetailDTO;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@Tag(name = "App-商品", description = "用户端商品接口")
@RestController
@RequestMapping("/api/app/v1/goods")
public class GoodsAppController {

    @GetMapping("/{goodsId}")
    public Result<AppGoodsDetailDTO> getGoodsDetail(@PathVariable Long goodsId) {
        return Result.success(null);
    }

    @PostMapping("/page")
    public Result<PageResponseDTO<AppGoodsBriefDTO>> pageGoods(@RequestBody PageRequestDTO req) {
        PageResponseDTO<AppGoodsBriefDTO> page = new PageResponseDTO<>();
        page.setTotal(0L);
        page.setPageNum(req.getPageNum());
        page.setPageSize(req.getPageSize());
        return Result.success(page);
    }
} 