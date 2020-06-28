package com.tal.base.core;

import com.tal.base.constants.ResCode;

import java.io.Serializable;

public class ResultData<T> implements Serializable {

    private int code;
    private String msg;
    private String debugInfo;
    private T data;

    public ResultData() {
    }

    public ResultData(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public boolean isSuccess() {
        return ResCode.SUCCESS.getCode().equals(code);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDebugInfo() {
        return debugInfo;
    }

    public void setDebugInfo(String debugInfo) {
        this.debugInfo = debugInfo;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> ResultData<T> buildSuccessResult(T data) {
        ResultData resultData = new ResultData<>();
        resultData.setCode(ResCode.SUCCESS.getCode());
        resultData.setMsg(ResCode.SUCCESS.getMsg());
        resultData.setData(data);
        return resultData;
    }
}
