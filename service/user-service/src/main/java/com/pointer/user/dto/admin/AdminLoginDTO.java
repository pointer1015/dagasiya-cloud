package com.pointer.user.dto.admin;

import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;

@Data
@Schema(name = "管理员登录", description = "管理员登录DTO")
public class AdminLoginDTO {

    @Schema(description = "邮箱")
    private String email;

    @Schema(description = "密码")
    private String password;
}