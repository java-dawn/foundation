package com.study.foundation.common.exception;

/**
 * 通用错误码定义
 *
 * @author bjf
 * @date 2017/11/27
 */
public enum CommMsgCode implements MsgCode {

    /**
     * 协议级返回码
     */
    UPGRADE(100, "您当前版本需要升级"),
    UPGRADE_DATA(101, "需更新配置或数据"),
    SUCCESS(200, "操作成功"),
    REDIRECT(302, "重定向"),
    PARAM_ERROR(400, "请求参数错误"),
    UNAUTHORIZED(401, "没有权限"),
    NOT_FOUND(404, "资源不存在"),
    NOT_SUPPORTED(405, "Method Not SUPPORTED"),
    SERVER_ERROR(500, "内部服务器错误"),
    ROUTER(700, "路由"),

    /**
     * 系统级错误码
     */
    SYSTEM_ERROR(1001, "系统错误"),
    SERVICE_PAUSE(1002, "服务暂停"),
    SERVICE_BUSY(1003, "服务器忙"),

    /**
     * 业务级错误码
     */
    WEB_ERROR(110000, "服务端web异常"),
    SERVICE_ERROR(120000, "服务端service异常"),
    DAO_ERROR(130000, "服务端dao异常"),
    DB_ERROR(140000, "数据库访问异常"),
    IO_ERROR(150000, "IO操作异常"),
    CACHE_ERROR(160000, "cache操作异常"),

    /**
     * 其它错误码
     */
    OTHER_ERROR(900000, "其它错误");

    private int code;
    private String message;

    CommMsgCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
