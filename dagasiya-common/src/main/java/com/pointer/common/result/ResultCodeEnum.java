package com.pointer.common.result;

import lombok.Getter;

@Getter
public enum ResultCodeEnum {

    SUCCESS(200,"成功"),
    FAIL(201, "失败"),
    DATA_ERROR(204, "数据异常"),
    ILLEGAL_REQUEST(205, "非法请求"),
    REPEAT_SUBMIT(206, "重复提交"),

    LOGIN_AUTH(208, "未登陆"),
    PERMISSION(209, "没有权限"),

    ORDER_PRICE_ERROR(210, "订单商品价格变化"),
    ORDER_STOCK_FALL(204, "订单库存锁定失败"),
    CREATE_ORDER_FAIL(210, "创建订单失败"),


    FETCH_USERINFO_ERROR( 219, "获取用户信息失败"),

    SKU_LIMIT_ERROR(230, "购买个数不能大于限购个数"),


    /* 系统错误码 */
    SYSTEM_ERROR(500, "系统异常"),
    SERVICE_UNAVAILABLE(503, "服务不可用"),

    /* 客户端错误码 */
    BAD_REQUEST(400, "参数错误"),
    UNAUTHORIZED(401, "未授权"),
    FORBIDDEN(403, "禁止访问"),
    NOT_FOUND(404, "资源不存在"),

    /* 业务错误码 */
    SECKILL_NOT_START(1001, "秒杀未开始"),
    SECKILL_ENDED(1002, "秒杀已结束"),
    STOCK_NOT_ENOUGH(1003, "库存不足"),
    REPEAT_ORDER(1004, "重复下单");

    ;

    private Integer code;

    private String message;

    private ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
