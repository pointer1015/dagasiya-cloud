package com.pointer.user.dto.app;

import lombok.Data;

@Data
public class RegisterDTO {
    private String userName;
    private String phone;
    private String email;
    private String password;
//    private String code; // 短信/邮箱验证码
} 