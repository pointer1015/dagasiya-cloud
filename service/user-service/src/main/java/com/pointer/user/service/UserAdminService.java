package com.pointer.user.service;

import com.pointer.common.result.Result;
import com.pointer.user.dto.admin.AdminLoginDTO;
import com.pointer.user.dto.app.UserProfileDTO;

public interface UserAdminService {

    Result login(AdminLoginDTO loginDTO);

    Result<UserProfileDTO> getProfile();
}
