package com.pointer.user.service;

import com.pointer.common.result.Result;
import com.pointer.user.dto.app.LoginDTO;
import com.pointer.user.dto.app.RegisterDTO;
import com.pointer.user.entity.User;

public interface UserAppService {
    Result addUser(RegisterDTO registerDTO);

    Result login(LoginDTO loginDTO);
}
