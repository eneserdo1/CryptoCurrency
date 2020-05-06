package com.eneserdogan.kriptoretrofit.service;

import com.eneserdogan.kriptoretrofit.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {


    @GET("prices?key=...")
    Observable<List<CryptoModel>> getData();
}
