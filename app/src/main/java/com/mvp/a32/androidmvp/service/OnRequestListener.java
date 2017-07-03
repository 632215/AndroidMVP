package com.mvp.a32.androidmvp.service;

public interface OnRequestListener<T>{
    void onSuccess(T t);
    void onError(T code,T message);
}