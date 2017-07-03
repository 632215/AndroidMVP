package com.mvp.a32.androidmvp.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/7/3.
 */

public abstract class BaseActivity<V, T extends BasePresenter<V>> extends FragmentActivity {
    public T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContenViewId());
        ButterKnife.bind(this);
        presenter = initPresenter();
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.attach((V) this);
        initView();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.dettach();
        ButterKnife.unbind(this);
    }

    /*
    * 初始化Presenter
    * */
    public abstract int getContenViewId();

    public abstract T initPresenter();

    protected abstract void initView();
}
