package com.webcontrol.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService {
    public static Retrofit retrofit;

    public static Retrofit getInstance(){
        retrofit = new Retrofit.Builder()
                .baseUrl("http://127.0.0.1:8080/HttpServletTest/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }

}
