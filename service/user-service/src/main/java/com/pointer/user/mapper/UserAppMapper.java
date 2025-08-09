package com.pointer.user.mapper;

import com.pointer.user.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface UserAppMapper {

    void addUser(@Param("user") User user);

    User selectByEmail(@Param("email") String email);

    void updateLastLoginTime(@Param("userId") Long userId, @Param("date") Date date);
}
