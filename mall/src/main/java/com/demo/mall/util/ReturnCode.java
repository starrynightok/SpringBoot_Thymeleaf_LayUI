package com.demo.mall.util;

public enum ReturnCode {
    /**
     * 操作成功
     */
    SUCCESS("SUCCESS_CODE", "SUCCESS_MSG"),

    /**
     * 操作失败
     */
    FAIL("FAIL_CODE", "FAIL_MSG"),

    /**
     * 空指针异常
     */
    NullpointerException("NULL_POINT_EX_CODE", "NULL_POINT_EX_MSG"),

    /**
     * 空参数异常
     */
    NullParamsException("NULL_PARAMS_EX_CODE", "NULL_PARAMS_EX_MSG"),

    /**
     * 参数异常
     */
    ParseParamsException("PARSE_PARAMS_EX_CODE", "PARSE_PARAMS_EX_MSG");


    private ReturnCode(String value, String msg) {
        this.val = value;
        this.msg = msg;
    }

    public String val() {
        return val;
    }

    public String msg() {
        return msg;
    }

    private String val;
    private String msg;
}
