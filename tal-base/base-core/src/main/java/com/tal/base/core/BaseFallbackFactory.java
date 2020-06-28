package com.tal.base.core;

import com.tal.base.constants.ResCodeConst;

/**
 * @author tal
 */
public class BaseFallbackFactory {

    private boolean isDebug = true;

    protected <T> ResultData<T> getExceptionResultData(Throwable cause) {
        ResultData<T> resultData = new ResultData<>();
        resultData.setCode(ResCodeConst.REMOTE_ERROR);
        if (isDebug) {
            resultData.setMsg(cause.getMessage());
            resultData.setDebugInfo(cause.getMessage());
        } else {
            resultData.setMsg("系统开小差了~~");
        }
        return resultData;
    }

    <T> ResultData<T> getSuccessResultData(Throwable cause) {
        ResultData<T> resultData = new ResultData<>();
        resultData.setCode(ResCodeConst.SUCCESS);
        if (isDebug) {
            resultData.setMsg(cause.getMessage());
        } else {
            resultData.setMsg("远程调用失败,降级处理");
        }
        return resultData;
    }
}