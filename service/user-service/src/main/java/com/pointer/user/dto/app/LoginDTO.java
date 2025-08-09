package com.pointer.user.dto.app;

import lombok.Data;

@Data
public class LoginDTO {
    private String email;  // 用户名/手机号/邮箱
    private String password;
} 