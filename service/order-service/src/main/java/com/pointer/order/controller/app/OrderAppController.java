package com.pointer.order.controller.app;

import com.pointer.common.dto.PageRequestDTO;
import com.pointer.common.dto.PageResponseDTO;
import com.pointer.common.result.Result;
import com.pointer.order.dto.app.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@Tag(name = "App-订单", description = "用户端订单接口")
@RestController
@RequestMapping("/api/app/v1/orders")
public class OrderAppController {

    @PostMapping
    public Result<OrderDetailDTO> create(@RequestBody CreateOrderRequestDTO req) {
        return Result.success(null);
    }

    @PostMapping("/page")
    public Result<PageResponseDTO<OrderSummaryDTO>> page(@RequestBody PageRequestDTO req) {
        PageResponseDTO<OrderSummaryDTO> page = new PageResponseDTO<>();
        page.setTotal(0L);
        page.setPageNum(req.getPageNum());
        page.setPageSize(req.getPageSize());
        return Result.success(page);
    }

    @GetMapping("/{orderId}")
    public Result<OrderDetailDTO> detail(@PathVariable String orderId) {
        return Result.success(null);
    }
} 