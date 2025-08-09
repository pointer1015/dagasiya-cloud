package com.pointer.user.entity;

import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Date;

@Data
@Schema(name = "用户地址", description = "用户收货地址实体")
public class UserAddress {

    @Schema(description = "地址ID")
    private Long addressId;

    @Schema(description = "用户ID")
    private Long userId;

    @Schema(description = "收件人")
    private String receiver;

    @Schema(description = "联系电话")
    private String phone;

    @Schema(description = "省份")
    private String province;

    @Schema(description = "城市")
    private String city;

    @Schema(description = "区/县")
    private String district;

    @Schema(description = "详细地址")
    private String detail;

    @Schema(description = "是否默认地址：0-否，1-是")
    private Integer isDefault;

    @Schema(description = "创建时间")
    private Date createTime;

    @Schema(description = "更新时间")
    private Date updateTime;

    @Schema(description = "软删标识：0-否，1-是")
    private Integer deleted;
}
