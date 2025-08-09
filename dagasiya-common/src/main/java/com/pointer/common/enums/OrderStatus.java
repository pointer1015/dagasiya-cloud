package com.pointer.common.enums;

public enum OrderStatus {
    PENDING_PAY(0),
    PAID(1),
    CANCELED(2);

    public final int code;
    OrderStatus(int code) { this.code = code; }
} 