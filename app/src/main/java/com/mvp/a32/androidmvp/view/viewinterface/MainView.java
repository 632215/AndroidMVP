package com.mvp.a32.androidmvp.view.viewinterface;

import com.mvp.a32.androidmvp.base.BaseView;

/**
 * Created by Administrator on 2017/7/3.
 */

public interface MainView<T> extends BaseView {
    //在MainActivity中可能用到的方法
    T getUserName();

}
