package com.liuyouyan.springbootinit.handler;

import com.liuyouyan.springbootinit.common.exception.BusinessException;
import com.liuyouyan.springbootinit.common.exception.ErrorCode;
import com.liuyouyan.springbootinit.common.result.BaseResponse;
import com.liuyouyan.springbootinit.common.result.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 *
 * @author <a href="https://liuyouyan.com">刘有颜</a>
 * @from <a href="https://liuyouyan.com">刘有颜的博客</a>
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public BaseResponse<?> businessExceptionHandler(BusinessException e) {
        log.error("BusinessException", e);
        return ResultUtils.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public BaseResponse<?> runtimeExceptionHandler(RuntimeException e) {
        log.error("RuntimeException", e);
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR, "系统错误");
    }
}
