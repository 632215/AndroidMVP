package com.mvp.a32.androidmvp.view.activity;

import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.mvp.a32.androidmvp.R;
import com.mvp.a32.androidmvp.base.BaseActivity;
import com.mvp.a32.androidmvp.presenter.MainPresenter;
import com.mvp.a32.androidmvp.view.viewinterface.MainView;

import butterknife.Bind;
import butterknife.OnClick;

public class MainActivity extends BaseActivity<MainView,MainPresenter> implements MainView{
    @Bind(R.id.textView)
    TextView textView;
    @Override
    public int getContenViewId() {
        return R.layout.activity_main;
    }

    @Override
    public MainPresenter initPresenter() {
        return new MainPresenter();
    }

    @Override
    protected void initView() {

    }

    @Override
    public void showMessage() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public Object getUserName() {
        return textView.getText();
    }

    @OnClick(R.id.textView)
    public void requestData(View view){
        Log.i("32:userName","323232323232");

        presenter.login();
    }
}
