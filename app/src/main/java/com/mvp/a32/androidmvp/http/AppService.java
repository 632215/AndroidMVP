package com.mvp.a32.androidmvp.http;

import com.mvp.a32.androidmvp.model.LoginBean;

import java.util.Map;

import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by liukun on 16/3/9.
 */
public interface AppService {
    @FormUrlEncoded
    @POST("CommonController/login")
    Observable<HttpResult<LoginBean>> getVerificationPhone(@FieldMap Map<String, String> map);


}
