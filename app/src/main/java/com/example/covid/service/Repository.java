package com.example.covid.service;

import com.example.covid.fasilitas.FasilitasResponse;
import com.example.covid.kasus.KasusResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Repository {
    @GET("rekapitulasi_v2/jabar/harian")
    Call<KasusResponse> getDataCovid();

    @GET("sebaran_v2/jabar/faskes")
    Call<FasilitasResponse> getDataRS();
}
