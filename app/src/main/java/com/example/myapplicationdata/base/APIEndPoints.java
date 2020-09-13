package com.example.myapplicationdata.base;
import com.example.myapplicationdata.search_flavor.model.MyArray;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIEndPoints {
    @GET("/3/gallery/search/1?")
    Call<MyArray> getDetails(@Query("q") String one);
}
