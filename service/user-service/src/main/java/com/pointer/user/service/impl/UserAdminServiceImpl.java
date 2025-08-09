package com.pointer.user.service.impl;

import com.pointer.common.result.Result;
import com.pointer.common.result.ResultCodeEnum;
import com.pointer.user.dto.admin.AdminLoginDTO;
import com.pointer.user.dto.app.UserProfileDTO;
import com.pointer.user.entity.User;
import com.pointer.user.mapper.UserAppMapper;
import com.pointer.user.service.UserAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserAdminServiceImpl implements UserAdminService {

    @Autowired
    private UserAppMapper userAppMapper;

    @Override
    public Result login(AdminLoginDTO loginDTO) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        // 验证用户是否存在
        User user = userAppMapper.selectByEmail(loginDTO.getEmail());
        if (user == null) {
            return Result.fail("用户不存在");
        }

        // 验证密码
        if (!encoder.matches(loginDTO.getPassword(), user.getPassword())) {
            return Result.fail("密码错误");
        }

        // 检查用户状态
        if (user.getStatus() == 0) {
            return Result.fail("用户被禁用");
        }

        // 验证是否为管理员
        if (user.getUserType() != 2) {
            return Result.fail(ResultCodeEnum.PERMISSION.getMessage());
        }

        // 更新最后登录时间
        user.setLastLoginTime(new Date());
        userAppMapper.updateLastLoginTime(user.getUserId(), new Date());

        // 组装返回信息
        UserProfileDTO userProfileDTO = new UserProfileDTO();
        userProfileDTO.setUserId(user.getUserId());
        userProfileDTO.setUserName(user.getUserName());
        userProfileDTO.setEmail(user.getEmail());
        userProfileDTO.setPhone(user.getPhone());
        userProfileDTO.setStatus(user.getStatus());
        userProfileDTO.setUserType(user.getUserType());
        userProfileDTO.setRegisterTime(user.getRegisterTime());
        userProfileDTO.setLastLoginTime(user.getLastLoginTime());

        return Result.success(userProfileDTO);
    }

    @Override
    public Result<UserProfileDTO> getProfile() {
        // 这里需要从当前登录用户上下文中获取用户信息
        // 暂时返回null，后续可以通过JWT token或session获取
        return Result.success(null);
    }
}