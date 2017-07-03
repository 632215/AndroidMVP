package com.mvp.a32.androidmvp.service;

import com.mvp.a32.androidmvp.service.OnRequestListener;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/7/3.
 */

public interface RequestAPI {
    void request(OnRequestListener listener, HashMap hashMap);
}
