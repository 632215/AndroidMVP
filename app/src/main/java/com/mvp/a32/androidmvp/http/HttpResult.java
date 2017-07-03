package com.mvp.a32.androidmvp.http;

import java.util.List;

/**
 * Created by liukun on 16/3/5.
 */
public class HttpResult<T> {

    private String errcode;
    private String errmsg;
    private String pageInfo;
    private List<T> data;

    public String getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(String pageInfo) {
        this.pageInfo = pageInfo;
    }


    public int getErrcode() {

        return Integer.parseInt(errcode);
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "HttpResult{" +
                "errcode=" + errcode +
                ", errmsg='" + errmsg + '\'' +
                ", data=" + data +
                '}';
    }
}
