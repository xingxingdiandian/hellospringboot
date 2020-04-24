package com.example.hellospringboot.common.result;

/**
 * @author shangli
 * @description: TODO 返回结果工具类
 * @date create in 2020/4/16 17:00
 */
public class ResultUtil {

    /**
     * 成功
     */
    public static <V> Result<V> success() {
        return new Result<>(ResultType.SUCCESS.getCode(), ResultType.SUCCESS.getMessage(), null);
    }

    /**
     * 成功--带返回信息
     */
    public static <V> Result<V> success(String message) {
        return ResultUtil.success(message, null);
    }

    /**
     * 成功--带返回数据
     */
    public static <V> Result<V> success(V data) {
        return ResultUtil.success(null, data);
    }

    /**
     * 成功--带返回信息+数据
     */
    public static <V> Result<V> success(String message, V data) {
        return new Result<>(ResultType.SUCCESS.getCode(), message, data);
    }

    /**
     * 失败
     */
    public static <V> Result<V> fail() {
        return new Result<>(ResultType.ERROR.getCode(), ResultType.ERROR.getMessage(), null);
    }

    /**
     * 失败--带返回信息
     */
    public static <V> Result<V> fail(String message) {
        return ResultUtil.fail(message, null);
    }

    /**
     * 失败--带返回数据
     */
    public static <V> Result<V> fail(V data) {
        return ResultUtil.fail((String) null, data);
    }

    /**
     * 失败--带返回信息+数据
     */
    public static <V> Result<V> fail(String message, V data) {
        return new Result<>(ResultType.ERROR.getCode(), message, data);
    }

    /**
     * 失败--ResultType+返回数据
     * @Param resultType 系统错误枚举（code-message）
     */
    public static <V> Result<V> fail(ResultType resultType, V data) {
        return new Result<>(resultType.getCode(), resultType.getMessage(), data);
    }
    /**
     * 失败--ResultType
     * @Param resultType 系统错误枚举（code-message）
     */
    public static <V> Result<V> fail(ResultType resultType) {
        return ResultUtil.fail(resultType, null);
    }

}
