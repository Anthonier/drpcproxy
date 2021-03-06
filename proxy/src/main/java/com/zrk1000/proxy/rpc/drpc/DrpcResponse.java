package com.zrk1000.proxy.rpc.drpc;

import com.zrk1000.proxy.utils.SerializableUtil;

/**
 * Created by zrk-PC on 2017/4/11.
 */
public class DrpcResponse {

    private int code;

    private String msg;

    private Object data;

    private String exception;


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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public void setException(Throwable exception) {
        this.exception = SerializableUtil.ObjToStr(exception);
    }

    public boolean hasException() {
        return exception != null;
    }

}
