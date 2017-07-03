package com.mvp.a32.androidmvp.service.iml;

import android.content.Context;

import com.mvp.a32.androidmvp.http.HttpMethods;
import com.mvp.a32.androidmvp.http.HttpResult;
import com.mvp.a32.androidmvp.http.ProgressSubscriber;
import com.mvp.a32.androidmvp.http.SubscriberOnNextListener;
import com.mvp.a32.androidmvp.model.LoginBean;
import com.mvp.a32.androidmvp.service.OnRequestListener;
import com.mvp.a32.androidmvp.service.RequestAPI;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/7/3.
 */

public class MainRequsetIml implements RequestAPI {
    private Context mContext;

    public MainRequsetIml(Context mContext) {
        this.mContext = mContext;
    }


    @Override
    public void request(final OnRequestListener listener, HashMap hashMap) {
        SubscriberOnNextListener onNextListener = new SubscriberOnNextListener<List<LoginBean>>() {
            @Override
            public void onNext(List<LoginBean> bean) {
                listener.onSuccess(bean);
            }

            @Override
            public void onError(String Code, String Msg) {
                listener.onError(Code,Msg);
            }
        };
        hashMap.put("userName", "admin");
        hashMap.put("pwd", "123456");
        HttpMethods.getInstance().getVerificationPhone(new ProgressSubscriber<HttpResult<LoginBean>>(onNextListener, mContext), hashMap);

    }
}
