package com.pointer.common.enums;

public enum PublishStatus {
    DRAFT(0),
    PUBLISHED(1),
    OFFLINE(2);

    public final int code;
    PublishStatus(int code) { this.code = code; }
} 