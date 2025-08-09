package com.pointer.common.util;

import java.util.regex.Pattern;

public class EmailValidatorUtil {
    // 常用邮箱正则表达式
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"
    );

    /**
     * 校验邮箱格式是否正确
     * @param email 邮箱字符串
     * @return true=格式正确，false=格式错误
     */
    public static boolean isValid(String email) {
        if (email == null) {
            return false;
        }
        return EMAIL_PATTERN.matcher(email).matches();
    }
} 