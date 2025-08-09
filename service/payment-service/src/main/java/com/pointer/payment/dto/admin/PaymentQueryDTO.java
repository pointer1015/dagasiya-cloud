package com.pointer.payment.dto.admin;

import com.pointer.common.dto.PageRequestDTO;
import lombok.Data;

import java.util.Date;

@Data
public class PaymentQueryDTO extends PageRequestDTO {
    private String orderId;
    private Integer status;
    private Integer paymentMethod;
    private Date startFrom;
    private Date endTo;
} 