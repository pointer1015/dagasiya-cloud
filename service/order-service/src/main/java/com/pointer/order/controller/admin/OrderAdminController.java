package com.pointer.order.controller.admin;

import com.pointer.common.dto.PageResponseDTO;
import com.pointer.common.result.Result;
import com.pointer.order.dto.admin.OrderQueryDTO;
import com.pointer.order.dto.app.OrderDetailDTO;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Admin-订单", description = "后台订单管理接口")
@RestController
@RequestMapping("/api/admin/v1/orders")
public class OrderAdminController {

    @PostMapping("/query")
    public Result<PageResponseDTO<OrderDetailDTO>> query(@RequestBody OrderQueryDTO req) {
        PageResponseDTO<OrderDetailDTO> page = new PageResponseDTO<>();
        page.setTotal(0L);
        page.setPageNum(req.getPageNum());
        page.setPageSize(req.getPageSize());
        return Result.success(page);
    }
} 