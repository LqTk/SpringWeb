package com.webcontrol.network;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.Map;

public interface NetworkApi {

    @POST("Login")
    Call<BaseInfo> login(@Body Map<String,String> params);

    @POST("GetGoodsInfo")
    Call<BaseInfo> getGoodsInfo(@Body Map<String,String> params);
}
