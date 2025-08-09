package com.pointer.activity.controller.app;

import com.pointer.common.dto.PageRequestDTO;
import com.pointer.common.dto.PageResponseDTO;
import com.pointer.common.result.Result;
import com.pointer.activity.dto.app.AppSeckillActivityDTO;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@Tag(name = "App-秒杀", description = "用户端秒杀接口")
@RestController
@RequestMapping("/api/app/v1/seckill")
public class SeckillAppController {

    @PostMapping("/activities/page")
    public Result<PageResponseDTO<AppSeckillActivityDTO>> pageActivities(@RequestBody PageRequestDTO req) {
        PageResponseDTO<AppSeckillActivityDTO> page = new PageResponseDTO<>();
        page.setTotal(0L);
        page.setPageNum(req.getPageNum());
        page.setPageSize(req.getPageSize());
        return Result.success(page);
    }

    @GetMapping("/activities/{id}")
    public Result<AppSeckillActivityDTO> getActivity(@PathVariable Long id) {
        return Result.success(null);
    }
} 