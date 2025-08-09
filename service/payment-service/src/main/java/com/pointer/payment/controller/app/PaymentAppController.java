package com.pointer.payment.controller.app;

import com.pointer.common.result.Result;
import com.pointer.payment.dto.app.CreatePaymentRequestDTO;
import com.pointer.payment.dto.app.PaymentResultDTO;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@Tag(name = "App-支付", description = "用户端支付接口")
@RestController
@RequestMapping("/api/app/v1/payments")
public class PaymentAppController {

    @PostMapping
    public Result<PaymentResultDTO> createPayment(@RequestBody CreatePaymentRequestDTO req) {
        return Result.success(null);
    }

    @GetMapping("/{paymentId}")
    public Result<PaymentResultDTO> getPayment(@PathVariable String paymentId) {
        return Result.success(null);
    }
} 