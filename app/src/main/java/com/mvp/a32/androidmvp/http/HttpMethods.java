package com.mvp.a32.androidmvp.http;



import com.mvp.a32.androidmvp.model.LoginBean;

import java.util.Map;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by liukun on 16/3/9.
 */
public class HttpMethods {
    private Api api;
    private AppService service;

    //构造方法私有
    private HttpMethods() {
        api = Api.getInstance();
        service = api.getService();
    }

    //在访问HttpMethods时创建单例
    private static class SingletonHolder {
        private static final HttpMethods INSTANCE = new HttpMethods();
    }

    //获取单例
    public static HttpMethods getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * 获取支付参数
     *
     * @param subscriber
     * @param map
     */
    public void getVerificationPhone(Subscriber<HttpResult<LoginBean>> subscriber, Map<String, String> map) {
        Observable observable = service.getVerificationPhone(map);
        api.toSubscribe(observable, subscriber);
    }


}
