package com.pointer.user.entity;

import lombok.Data;

@Data
public class UserAddress {

    private Long addressId;
    private Long userId;
    private String receiver;
    private String phone;
    private String province;
    private String city;
    private String district;
    private String detail;
    // 是否为默认地址，0表示否，1表示是
    private Integer isDefault;


}
