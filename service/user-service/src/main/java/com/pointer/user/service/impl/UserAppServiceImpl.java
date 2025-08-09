package com.pointer.user.service.impl;

import com.pointer.common.result.Result;
import com.pointer.common.result.ResultCodeEnum;
import com.pointer.common.util.EmailValidatorUtil;
import com.pointer.user.dto.app.LoginDTO;
import com.pointer.user.dto.app.RegisterDTO;
import com.pointer.user.dto.app.UserProfileDTO;
import com.pointer.user.entity.User;
import com.pointer.user.mapper.UserAppMapper;
import com.pointer.user.service.UserAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserAppServiceImpl implements UserAppService {

    @Autowired
    private UserAppMapper userAppMapper;

    @Override
    public Result addUser(RegisterDTO registerDTO) {
        User user = new User();
        // 获取账号密码
        String email = registerDTO.getEmail();
        // 对密码进行加密
        String password = new BCryptPasswordEncoder().encode(registerDTO.getPassword());

        // 判断邮箱是否正确
        boolean valid = EmailValidatorUtil.isValid(email);
        if (!valid) {
            return Result.fail(ResultCodeEnum.EMAIL_INVALID);
        }

        // 组装user信息
        user.setUserName(registerDTO.getUserName());
        user.setEmail(email);
        user.setPhone(registerDTO.getPhone());
        user.setPassword(password);
        user.setStatus(1);
        user.setRegisterTime(new Date());
        user.setDeleted(0);
        userAppMapper.addUser(user);

        return Result.success(null);
    }

    @Override
    public Result login(LoginDTO loginDTO) {

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        // 验证用户是否存在
        User user = userAppMapper.selectByEmail(loginDTO.getEmail());
        if (user == null) {
            return Result.fail(ResultCodeEnum.USER_NOT_EXIST.getMessage());
        }

        // 验证密码
        if (!encoder.matches(loginDTO.getPassword(), user.getPassword())) {
            return Result.fail(ResultCodeEnum.PASSWORD_ERROR.getMessage());
        }

        // 检查用户状态
        if (user.getStatus() == 0) {
            return Result.fail(ResultCodeEnum.USER_DISABLE.getMessage());
        }

        // 更新最后登录时间
        user.setLastLoginTime(new Date());
        userAppMapper.updateLastLoginTime(user.getUserId(),new Date());

        // 组装用于返回前端的用户信息
        UserProfileDTO userProfileDTO = new UserProfileDTO();
        userProfileDTO.setUserId(user.getUserId());
        userProfileDTO.setUserName(user.getUserName());
        userProfileDTO.setEmail(loginDTO.getEmail());
        userProfileDTO.setPhone(user.getPhone());
        userProfileDTO.setStatus(user.getStatus());
        userProfileDTO.setRegisterTime(user.getRegisterTime());
        userProfileDTO.setLastLoginTime(user.getLastLoginTime());

        return Result.success(userProfileDTO);
    }
}
