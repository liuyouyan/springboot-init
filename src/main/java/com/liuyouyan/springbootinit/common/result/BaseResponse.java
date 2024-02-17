package com.liuyouyan.springbootinit.common.result;

import java.io.Serializable;

import com.liuyouyan.springbootinit.common.enumeration.ErrorCodeEnum;
import lombok.Data;

/**
 * 通用返回类
 *
 * @param <T>
 * @author <a href="https://liuyouyan.com">刘有颜</a>
 * @from <a href="https://liuyouyan.com">刘有颜的博客</a>
 */
@Data
public class BaseResponse<T> implements Serializable {

    private int code;

    private T data;

    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(ErrorCodeEnum errorCodeEnum) {
        this(errorCodeEnum.getCode(), null, errorCodeEnum.getMessage());
    }
}
