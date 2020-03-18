package com.kira.bellmantask.viewmodel;

import android.annotation.SuppressLint;
import android.util.Log;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;
import com.kira.bellmantask.data.ApiClient;
import com.kira.bellmantask.model.BellmanData;
import com.kira.bellmantask.model.Data;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CategoryDataViewModel extends ViewModel {
    public MutableLiveData<Data> categoryMutableLiveData = new MutableLiveData<>();
    private static final String TAG = "CategoryDataViewModel_error";

    public void getBellmanData() {
        Call<BellmanData> categoryDataCall = ApiClient
                .getInstance().getApi().getCategoryData();
        categoryDataCall.enqueue(new Callback<BellmanData>() {
            @Override
            public void onResponse(Call<BellmanData> call, Response<BellmanData> response) {

                categoryMutableLiveData.setValue(response.body().getData());

            }

            @SuppressLint("LongLogTag")
            @Override
            public void onFailure(Call<BellmanData> call, Throwable t) {
                Log.d(TAG, "onFailure error: "+t.getMessage());
            }
        });

    }
}