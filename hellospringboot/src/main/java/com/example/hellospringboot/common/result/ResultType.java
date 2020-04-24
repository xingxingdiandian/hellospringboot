package com.example.hellospringboot.common.result;

/**
 * @author shangli
 * @description: TODO 响应code-message枚举
 * @date create in 2020/4/16 17:03
 */
public enum ResultType {
    SUCCESS(0,"处理成功"),
    ERROR(1,"系统繁忙");

    private int code;
    private String message;

    public int getCode(){
        return this.code;
    }
    public String getMessage(){
        return this.message;
    }

    ResultType(int code, String message){
        this.code = code;
        this.message = message;
    }
}
