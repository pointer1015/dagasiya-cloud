package com.pointer.activity.dto.app;

import lombok.Data;

import java.util.Date;

@Data
public class SeckillTokenDTO {
    private String tokenId;
    private Date expireTime;
} 