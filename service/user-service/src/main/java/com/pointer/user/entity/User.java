package com.pointer.user.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private Long userId;
    private String userName;
    private String password;
    private String phone;
    private String email;
    private Integer status;
    private Date registerTime;
    private Date lastLoginTime;
}
