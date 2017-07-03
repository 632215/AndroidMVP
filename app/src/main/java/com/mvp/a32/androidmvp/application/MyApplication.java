package com.mvp.a32.androidmvp.application;

import android.app.Application;

/**
 * Created by Administrator on 2017/7/3.
 */

public class MyApplication extends Application {
    private static MyApplication application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }

    public static MyApplication getInstance() {
        return application;
    }
}