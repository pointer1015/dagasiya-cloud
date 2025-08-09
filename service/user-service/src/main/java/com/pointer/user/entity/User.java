package com.pointer.user.entity;

import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Date;

@Data
@Schema(name = "用户", description = "用户实体")
public class User {

    @Schema(description = "用户ID")
    private Long userId;

    @Schema(description = "用户名")
    private String userName;

    @Schema(description = "密码(加密存储)")
    private String password;

    @Schema(description = "手机号")
    private String phone;

    @Schema(description = "邮箱")
    private String email;

    @Schema(description = "状态：0-禁用，1-启用")
    private Integer status;

    @Schema(description = "用户类型：1-普通用户，2-管理员")
    private Integer userType;

    @Schema(description = "注册时间")
    private Date registerTime;

    @Schema(description = "最后登录时间")
    private Date lastLoginTime;

    @Schema(description = "更新时间")
    private Date updateTime;

    @Schema(description = "软删标识：0-否，1-是")
    private Integer deleted;
}
