package com.example.covid;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.covid.kasus.ContentItem;
import com.example.covid.kasus.KasusResponse;
import com.example.covid.service.Api;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class KasusViewModel extends ViewModel {
    private Api api;
    private MutableLiveData<ArrayList<ContentItem>> listDataCovid = new MutableLiveData<>();

    public void setDataCovid() {
        if(this.api == null) {
            api = new Api();
        }

        api.getApiDataCovid().getDataCovid().enqueue(new Callback<KasusResponse>() {
            @Override
            public void onResponse(Call<KasusResponse> call, Response<KasusResponse> response) {
                KasusResponse responseDataCovid = response.body();
                if(responseDataCovid != null && responseDataCovid.getData().getContent() != null) {
                    ArrayList<ContentItem> datacovidItems = responseDataCovid.getData().getContent();
                    listDataCovid.postValue(datacovidItems);
                    Log.d("DataCovidViewModel", "onSuccess: "+response.body());
                }
            }

            @Override
            public void onFailure(Call<KasusResponse> call, Throwable t) {
                Log.e("DataCovidViewModel", "onFailure: "+t.getMessage());
            }
        });
    }

    public LiveData<ArrayList<ContentItem>> getDataCovid() {
        return listDataCovid;
    }
}
