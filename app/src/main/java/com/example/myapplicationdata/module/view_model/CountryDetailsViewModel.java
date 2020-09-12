package com.example.myapplicationdata.module.view_model;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.myapplicationdata.base.APIEndPoints;
import com.example.myapplicationdata.base.RestApiService;
import com.example.myapplicationdata.module.model.MyArray;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CountryDetailsViewModel extends AndroidViewModel {
    APIEndPoints service = RestApiService.getRetrofitInstance().create(APIEndPoints.class);
    private MutableLiveData<List<MyArray>> livedata = new MutableLiveData<>();

    public CountryDetailsViewModel(@NonNull Application application) {
        super(application);
        getResponse();
    }

    public void getResponse() {
    Call<List<MyArray>> callPost = service.getDetails();
    callPost.enqueue(new Callback<List<MyArray>>() {
        @Override
        public void onResponse(Call<List<MyArray>> call, Response<List<MyArray>> response) {
            Log.e("Success response","");

            livedata.postValue(response.body());
        }

        @Override
        public void onFailure(Call<List<MyArray>> call, Throwable t) {

            Log.e("FAILED","");
        }
    });
}

    public MutableLiveData<List<MyArray>>getPostMutableLiveData(){
        return livedata;
    }
}
