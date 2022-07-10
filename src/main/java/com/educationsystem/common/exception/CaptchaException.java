package com.educationsystem.common.exception;


/**
 * 自定义认证异常
 */

import org.springframework.security.core.AuthenticationException;

public class CaptchaException extends AuthenticationException {

    public CaptchaException(String msg) {
        super(msg);
    }
}
