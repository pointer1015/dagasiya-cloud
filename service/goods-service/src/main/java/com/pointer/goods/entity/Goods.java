package com.pointer.goods.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Goods {

    private Long goodsId;
    private String goodsName;
    private String description;
    private BigDecimal price;
    private String category;
    private String brand;
    // 主图url
    private String imageUrl;
    // 详情页url
    private String detailImageUrl;
    // 状态，0为下架，1为上架
    private Integer status;
    private Date createTime;

}
