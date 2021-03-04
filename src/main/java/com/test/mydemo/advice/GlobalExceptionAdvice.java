package com.test.mydemo.advice;


import com.test.mydemo.base.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author: zhangyingcong
 * @Description:
 * @Date: 2021/3/4 15:36
 * @Param:
 * @Return:
 */
@RestControllerAdvice
public class GlobalExceptionAdvice {
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionAdvice.class);

    private BaseResponse<String> Exception(){
        return BaseResponse.fail("系统异常");
    }

}
