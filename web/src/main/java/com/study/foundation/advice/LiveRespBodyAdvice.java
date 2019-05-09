package com.study.foundation.advice;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.core.annotation.Order;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@ControllerAdvice
@Order(1)
@Slf4j
public class LiveRespBodyAdvice implements ResponseBodyAdvice<Object> {

    public static final String LIFE_PACKAGE = "com.study.foundation.web";

    @Override
    public boolean supports(MethodParameter methodParameter,
                            Class<? extends HttpMessageConverter<?>> converterType) {
        String className = methodParameter.getContainingClass().getName();
        return className.startsWith(LIFE_PACKAGE)
                && !className.contains("ExceptionAdvice")
                && !LiveResp.class.isAssignableFrom(methodParameter.getParameterType())
                && !String.class.isAssignableFrom(methodParameter.getParameterType());
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType,
                                  MediaType selectedContentType,
                                  Class<? extends HttpMessageConverter<?>> selectedConverterType,
                                  ServerHttpRequest request, ServerHttpResponse response) {

        String path = request.getURI().getPath();
        log.debug("uri:{},response data:{}", path, JSONObject.toJSONString(body));
        return new LiveResp(body != null ? body : "");
    }
}