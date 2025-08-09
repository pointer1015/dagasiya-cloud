package com.pointer.common.enums;

public enum SeckillStatus {
    DRAFT(0),
    PUBLISHED(1),
    OFFLINE(2);

    public final int code;
    SeckillStatus(int code) { this.code = code; }
} 