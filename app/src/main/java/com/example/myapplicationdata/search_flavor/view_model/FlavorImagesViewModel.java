package com.example.myapplicationdata.search_flavor.view_model;

import android.app.Application;
import android.app.ProgressDialog;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.myapplicationdata.Database.Entity.CommentsEntity;
import com.example.myapplicationdata.Database.repository.CommentsRepository;
import com.example.myapplicationdata.base.APIEndPoints;
import com.example.myapplicationdata.base.RestApiService;
import com.example.myapplicationdata.search_flavor.model.MyArray;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FlavorImagesViewModel extends AndroidViewModel {
    APIEndPoints service = RestApiService.getRetrofitInstance().create(APIEndPoints.class);
    private MutableLiveData<MyArray> livedata = new MutableLiveData<>();
    private MutableLiveData<String> validateSearch = new MutableLiveData<>();

    public FlavorImagesViewModel(@NonNull Application application) {
        super(application);

    }
    public void validateSearch(String search){
        if(search.trim().equalsIgnoreCase(""))
            validateSearch.postValue("Please enter your flavor");
      else
        getResponse(search);
    }

    public void getResponse(String search) {
    Call<MyArray> callPost = service.getDetails(search);
    callPost.enqueue(new Callback<MyArray>() {
        @Override
        public void onResponse(Call<MyArray> call, Response<MyArray> response) {
            Log.e("Success response","");

            livedata.postValue(response.body());
        }

        @Override
        public void onFailure(Call<MyArray> call, Throwable t) {
            t.printStackTrace();

            Log.e("FAILED",t.getMessage());

        }
    });
}

    public MutableLiveData<MyArray>getPostMutableLiveData(){
        return livedata;
    }

    public MutableLiveData<String>validateSearch(){
        return validateSearch;
    }


}

