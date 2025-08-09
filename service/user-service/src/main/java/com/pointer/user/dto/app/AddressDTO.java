package com.pointer.user.dto.app;

import lombok.Data;

@Data
public class AddressDTO {
    private Long addressId;
    private String receiver;
    private String phone;
    private String province;
    private String city;
    private String district;
    private String detail;
    private Integer isDefault;
} 