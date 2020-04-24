package com.example.hellospringboot.common.result;

import lombok.Data;

/**
 * @author shangli
 * @description: TODO 响应对象
 * @date create in 2020/4/16 16:55
 */
@Data
public class Result<T> {
    /**
     * 响应编码
     */
    private int code;
    /**
     * 响应信息
     */
    private String message;
    /**
     * 数据
     */
    private T data;

    public Result() {
    }

    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
