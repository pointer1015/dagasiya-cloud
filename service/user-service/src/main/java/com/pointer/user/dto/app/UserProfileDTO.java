package com.pointer.user.dto.app;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

@Data
public class UserProfileDTO {
    private Long userId;
    private String userName;
    private String phone;
    private String email;
    private Integer status;
    private Integer userType;
    private Date registerTime;
    private Date lastLoginTime;
} 