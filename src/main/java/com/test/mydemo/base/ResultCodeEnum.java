package com.test.mydemo.base;

/**
 * 响应状态码枚举
 *
 * @author
 */
public enum ResultCodeEnum {

    SUCCESS(200, "操作成功"),
    SYSTEM_EXCEPTION(500, "系统异常"),
    BUSINESS_EXCEPTION(510, "业务异常"),
    ILLEGAL_REQUEST(6000, "签名异常");

    private final Integer code;
    private final String describe;

    public Integer getCode() {
        return code;
    }

    public String getDescribe() {
        return describe;
    }

    ResultCodeEnum(final Integer code, final String describe) {
        this.code = code;
        this.describe = describe;
    }
}
