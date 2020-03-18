package com.kira.bellmantask.data;

import com.kira.bellmantask.model.BellmanData;


import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("home")
    Call<BellmanData> getCategoryData();
}
