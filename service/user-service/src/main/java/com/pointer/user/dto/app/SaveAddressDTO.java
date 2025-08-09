package com.pointer.user.dto.app;

import lombok.Data;

@Data
public class SaveAddressDTO {
    private Long addressId; // 编辑时携带
    private String receiver;
    private String phone;
    private String province;
    private String city;
    private String district;
    private String detail;
    private Integer isDefault;
} 