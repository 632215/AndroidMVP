package com.mvp.a32.androidmvp.base;

/**
 * Created by Administrator on 2017/7/3.
 */

public abstract class BasePresenter<T> {
    public T mView;
    public void attach(T mView){
        this.mView =mView;
    }

    public void dettach(){
        mView =null;
    }
}
