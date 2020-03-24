package com.demo.mall.util;

import java.util.Properties;

public class Result {
    public static final Properties properties = ReadPropertiesUtil.getProperties(System.getProperty("user.dir") + "/mall/src/main/resources/response.properties");

    /**
     * 返回代码
     */
    private String code;

    /**
     * 返回信息
     */
    private String message;

    /**
     * 返回数据
     */
    private Object data;


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Result() {
    }

    /**
     * 构造一个返回操作正确的返回代码和信息
     */
    public static Result success() {
        Result res = new Result();
        res.setCode(properties.getProperty(ReturnCode.SUCCESS.val()));
        res.setMessage(properties.getProperty(ReturnCode.SUCCESS.msg()));
        return res;
    }

    /**
     * 构造一个返回特定代码的ReturnVO对象
     *
     * @param code
     */
    public static Result response(ReturnCode code) {
        Result res = new Result();
        res.setCode(properties.getProperty(code.val()));
        res.setMessage(properties.getProperty(code.msg()));
        return res;
    }

    /**
     * 默认值返回，默认返回正确的code和message
     *
     * @param data
     */
    public static Result successWithData(Object data) {
        Result res = new Result();
        res.setCode(properties.getProperty(ReturnCode.SUCCESS.val()));
        res.setMessage(properties.getProperty(ReturnCode.SUCCESS.msg()));
        res.setData(data);
        return res;
    }

    /**
     * 构造返回代码，以及自定义的错误信息
     *
     * @param code
     * @param message
     */
    public static Result error(ReturnCode code, String message) {
        Result res = new Result();
        res.setCode(properties.getProperty(code.val()));
        res.setMessage(message);
        return res;
    }

    public static Result error(String code, String message) {
        Result res = new Result();
        res.setCode(code);
        res.setMessage(message);
        return res;
    }

    public static Result error(ReturnCode code) {
        Result res = new Result();
        res.setCode(properties.getProperty(code.val()));
        res.setMessage(properties.getProperty(code.msg()));
        return res;
    }

    /**
     * 构造自定义的code，message，以及data
     *
     * @param code
     * @param message
     * @param data
     */
    public static Result responseWithData(ReturnCode code, String message, Object data) {
        Result res = new Result();
        res.setCode(code.val());
        res.setMessage(message);
        res.setData(data);
        return res;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
