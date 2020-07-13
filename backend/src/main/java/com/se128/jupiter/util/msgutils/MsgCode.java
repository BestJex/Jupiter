package com.se128.jupiter.util.msgutils;

public enum MsgCode {
    SUCCESS(MsgUtil.SUCCESS, MsgUtil.SUCCESS_MSG),
    ERROR(MsgUtil.ERROR, MsgUtil.ERROR_MSG),
    DATA_SUCCESS(MsgUtil.SUCCESS, MsgUtil.DATA_SUCCESS_MSG),
    DATA_ERROR(MsgUtil.SUCCESS, MsgUtil.DATA_ERR_MSG),
    LOGIN_USER_ERROR(MsgUtil.LOGIN_USER_ERROR, MsgUtil.LOGIN_USER_ERROR_MSG),
    NOT_LOGGED_IN_ERROR(MsgUtil.NOT_LOGGED_IN_ERROR, MsgUtil.NOT_LOGGED_IN_ERROR_MSG),
    REGISTER_USER_ERROR(MsgUtil.REGISTER_USER_ERROR, MsgUtil.REGISTER_USER_ERROR_MSG);

    private int status;
    private String msg;

    public int getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    private MsgCode(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }
}
