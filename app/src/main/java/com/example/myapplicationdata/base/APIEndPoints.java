package com.example.myapplicationdata.base;
import com.example.myapplicationdata.module.model.MyArray;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface APIEndPoints {
    @GET("/3/gallery/search/1?q=vanilla")
    Call<List<MyArray>> getDetails();
}
