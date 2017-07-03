package com.mvp.a32.androidmvp.presenter;

import android.util.Log;

import com.mvp.a32.androidmvp.application.MyApplication;
import com.mvp.a32.androidmvp.base.BasePresenter;
import com.mvp.a32.androidmvp.service.OnRequestListener;
import com.mvp.a32.androidmvp.service.RequestAPI;
import com.mvp.a32.androidmvp.service.iml.MainRequsetIml;
import com.mvp.a32.androidmvp.view.viewinterface.MainView;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/7/3.
 */

public class MainPresenter extends BasePresenter<MainView> implements OnRequestListener{
    private RequestAPI requestAPI;

    public MainPresenter() {
        requestAPI = new MainRequsetIml(MyApplication.getInstance());
    }

    public void login() {
        mView.getUserName();
        Log.i("32:userName",mView.getUserName().toString());
        requestAPI.request(this,new HashMap());
    }

    @Override
    public void onSuccess(Object o) {
        Log.i("32:onSuccess",o.toString());
    }

    @Override
    public void onError(Object code, Object message) {
        Log.i("32:onError",code.toString()+"---"+message.toString());
    }
}
