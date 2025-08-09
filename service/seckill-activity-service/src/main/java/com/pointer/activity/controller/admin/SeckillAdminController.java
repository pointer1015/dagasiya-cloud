package com.pointer.activity.controller.admin;

import com.pointer.common.dto.PageResponseDTO;
import com.pointer.common.result.Result;
import com.pointer.activity.dto.admin.AdminSeckillActivityQueryDTO;
import com.pointer.activity.dto.admin.AdminSeckillActivitySaveDTO;
import com.pointer.activity.dto.app.AppSeckillActivityDTO;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Admin-秒杀", description = "后台秒杀活动管理接口")
@RestController
@RequestMapping("/api/admin/v1/seckill")
public class SeckillAdminController {

    @PostMapping("/activity/save")
    public Result<Boolean> saveActivity(@RequestBody AdminSeckillActivitySaveDTO dto) {
        return Result.success(Boolean.TRUE);
    }

    @PostMapping("/activity/query")
    public Result<PageResponseDTO<AppSeckillActivityDTO>> queryActivities(@RequestBody AdminSeckillActivityQueryDTO req) {
        PageResponseDTO<AppSeckillActivityDTO> page = new PageResponseDTO<>();
        page.setTotal(0L);
        page.setPageNum(req.getPageNum());
        page.setPageSize(req.getPageSize());
        return Result.success(page);
    }
} 