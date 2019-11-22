package com.study.foundation.advice;

import com.alibaba.fastjson.JSONObject;
import com.study.foundation.common.exception.BaseException;
import com.study.foundation.common.exception.MsgCode;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.TypeMismatchException;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;
import java.sql.SQLException;

import static com.study.foundation.common.exception.CommMsgCode.DB_ERROR;
import static com.study.foundation.common.exception.CommMsgCode.NOT_FOUND;
import static com.study.foundation.common.exception.CommMsgCode.NOT_SUPPORTED;
import static com.study.foundation.common.exception.CommMsgCode.PARAM_ERROR;
import static com.study.foundation.common.exception.CommMsgCode.SERVER_ERROR;

/**
 * 全局异常处理
 */

@RestControllerAdvice
@Slf4j
public class ExceptionAdvice {

    /**
     * 405 not support异常
     */
    @ExceptionHandler(value = HttpRequestMethodNotSupportedException.class)
    @ResponseStatus(value = HttpStatus.METHOD_NOT_ALLOWED)
    public ErrorResp onException(HttpRequestMethodNotSupportedException e,
                                 HttpServletRequest request) {
        String uri = request.getRequestURI();
        log.error("uri:{},code:{},message:{}", uri, NOT_SUPPORTED.getCode(), e.getMessage());

        return createErrorResp(NOT_SUPPORTED, null);
    }

    /**
     * 404 异常
     */
    @ExceptionHandler(value = NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResp onException(NoHandlerFoundException e, HttpServletRequest request) {
        String uri = request.getRequestURI();
        log.error("uri:{},code:{},message:{}", uri, NOT_FOUND.getCode(), e.getMessage());

        return createErrorResp(NOT_FOUND, null);
    }

    @ExceptionHandler(value = Exception.class)
    public ErrorResp onException(Exception e, HttpServletRequest request) {
        String uri = request.getRequestURI();
        String params = JSONObject.toJSONString(request.getParameterMap());

        if (e instanceof SQLException || e instanceof DataAccessException) {
            createLog(e, uri, params);
            return createErrorResp(DB_ERROR, null);
        } else if (e instanceof BaseException) {
            BaseException ex = (BaseException) e;
            log.error("uri:{},params:{},code:{},message:{}", uri, params, ex.getMsgCode().getCode(),
                    ex.getMessage());
            return createErrorResp(ex.getMsgCode(), ex.getMessage());
        } else if (e instanceof MissingServletRequestParameterException
                || e instanceof BindException
                || e instanceof ConstraintViolationException
                || e instanceof TypeMismatchException
                || e instanceof ServletRequestBindingException) {
            createLog(e, uri, params);
            return createErrorResp(PARAM_ERROR, null);
        } else {
            createLog(e, uri, params);
            return createErrorResp(SERVER_ERROR, null);
        }
    }

    private ErrorResp createErrorResp(MsgCode msgCode, String message) {
        return new ErrorResp(msgCode.getCode(), StringUtils.isEmpty(message) ? message : msgCode.getMessage());
    }

    private void createLog(Exception e, String uri, String params) {
        log.error("uri:" + uri + ",params:" + params, e);
    }


    @Data
    private class ErrorResp {

        private int code;
        private String msg;

        public ErrorResp(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }
    }
}
