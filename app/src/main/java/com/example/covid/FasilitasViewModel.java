package com.example.covid;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.covid.fasilitas.DataItem;
import com.example.covid.fasilitas.FasilitasResponse;
import com.example.covid.service.Api;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FasilitasViewModel extends ViewModel {
    private Api api;
    private MutableLiveData<ArrayList<DataItem>> listDataRS = new MutableLiveData<>();

    public void setDataRS() {
        if(this.api == null) {
            api = new Api();
        }

        api.getApiDataCovid().getDataRS().enqueue(new Callback<FasilitasResponse>() {
            @Override
            public void onResponse(Call<FasilitasResponse> call, Response<FasilitasResponse> response) {
                FasilitasResponse responseDataRS = response.body();
                if(responseDataRS != null && responseDataRS.getData() != null) {
                    ArrayList<DataItem> dataRS = responseDataRS.getData();
                    listDataRS.postValue(dataRS);
                    Log.d("FasilitasViewModel", "onSuccess: "+response.body());
                }
            }

            @Override
            public void onFailure(Call<FasilitasResponse> call, Throwable t) {
                Log.e("FasilitasViewModel", "onFailure: "+t.getMessage());
            }
        });
    }

    public LiveData<ArrayList<DataItem>> getDataRS() {
        return listDataRS;
    }
}
