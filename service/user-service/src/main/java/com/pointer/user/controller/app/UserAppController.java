package com.pointer.user.controller.app;

import com.pointer.common.result.Result;
import com.pointer.common.result.ResultCodeEnum;
import com.pointer.common.util.EmailValidatorUtil;
import com.pointer.user.dto.app.*;
import com.pointer.user.entity.User;
import com.pointer.user.service.UserAppService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@Tag(name = "App-用户", description = "用户端用户接口")
@RestController
@RequestMapping("/api/app/v1/user")
public class UserAppController {

    @Autowired
    private UserAppService userAppService;

    @Operation(summary = "用户注册", description = "用户通过邮箱、手机号等信息进行注册")
    @PostMapping("/register")
    public Result register(@RequestBody RegisterDTO registerDTO) {
        return userAppService.addUser(registerDTO);
    }

    @Operation(summary = "用户登录", description = "用户通过账号密码进行登录")
    @PostMapping("/login")
    public Result login(@RequestBody LoginDTO loginDTO) {
        return userAppService.login(loginDTO);
    }

    @Operation(summary = "获取个人资料", description = "获取当前登录用户的个人资料信息")
    @GetMapping("/profile")
    public Result<UserProfileDTO> profile() {
        return Result.success(null);
    }

    @Operation(summary = "获取收货地址列表", description = "获取当前登录用户的所有收货地址")
    @GetMapping("/addresses")
    public Result<List<AddressDTO>> listAddresses() {
        return Result.success(Collections.emptyList());
    }

    @Operation(summary = "保存收货地址", description = "新增或更新用户的收货地址")
    @PostMapping("/addresses")
    public Result<Boolean> saveAddress(@RequestBody SaveAddressDTO req) {
        return Result.success(Boolean.TRUE);
    }

    @Operation(summary = "删除收货地址", description = "根据地址ID删除指定的收货地址")
    @DeleteMapping("/addresses/{addressId}")
    public Result<Boolean> deleteAddress(@PathVariable Long addressId) {
        return Result.success(Boolean.TRUE);
    }
} 