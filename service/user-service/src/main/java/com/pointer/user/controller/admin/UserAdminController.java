package com.pointer.user.controller.admin;

import com.pointer.common.result.Result;
import com.pointer.user.dto.admin.AdminLoginDTO;
import com.pointer.user.dto.app.UserProfileDTO;
import com.pointer.user.service.UserAdminService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Admin-管理员", description = "管理员接口")
@RestController
@RequestMapping("/api/admin/v1/auth")
public class UserAdminController {

    @Autowired
    private UserAdminService userAdminService;

    @Operation(summary = "管理员登录", description = "管理员通过用户名密码登录")
    @PostMapping("/login")
    public Result<UserProfileDTO> login(@RequestBody AdminLoginDTO loginDTO) {
        return userAdminService.login(loginDTO);
    }

    @Operation(summary = "获取管理员资料", description = "获取当前登录管理员的信息")
    @GetMapping("/profile")
    public Result<UserProfileDTO> profile() {
        return userAdminService.getProfile();
    }
}