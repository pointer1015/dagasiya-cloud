package com.pointer.common.exception;

import com.pointer.common.result.ResultCodeEnum;
import lombok.Data;

@Data
public class DagasiyaException extends RuntimeException{

    // 异常状态码
    private Integer code;

    /**
     * 通过状态码判断错误类型
     * @param message
     * @param code
     */
    public DagasiyaException(String message,Integer code) {
        super(message);
        this.code = code;
    }

    /**
     * 直接接收枚举类
     * @param resultCodeEnum
     */
    public DagasiyaException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code= resultCodeEnum.getCode();
    }

    @Override
    public String toString() {
        return "Exception{" +
                "code=" + code +
                ", message=" + this.getMessage() +
                '}';
    }
}
