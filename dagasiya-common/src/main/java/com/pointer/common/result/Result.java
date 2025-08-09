package com.pointer.common.result;

import lombok.Data;

@Data
public class Result<T> {

    // 响应码
    private Integer code;

    // 响应信息
    private String message;

    // 响应数据
    private T data;

    // 构造私有化
    private Result() {
    }

    ;

    // 构建返回值
    // 设置数据,返回对象和方法
    public static <T> Result<T> build(T data, ResultCodeEnum resultCodeEnum) {
        // 创建Result对象，构建返回值
        Result<T> result = new Result<>();
        if (data != null) {
            result.setData(data);
        }

        // 设置响应码
        result.setCode(resultCodeEnum.getCode());
        // 设置返回信息
        result.setMessage(resultCodeEnum.getMessage());

        return result;

    }

    public static<T> Result<T> build(T data, Integer code, String message) {
        Result<T> result = new Result<>();
        if (data != null) {
            result.setData(data);
        }

        result.setCode(code);
        result.setMessage(message);

        return result;
    }

    // 成功
    public static<T> Result<T> success(T data) {
        Result<T> result = build(data, ResultCodeEnum.SUCCESS);
        return result;
    }

    // 失败
    public static<T> Result<T> fail(T data) {
        Result<T> result = build(data, ResultCodeEnum.FAIL);
        return result;
    }
}
