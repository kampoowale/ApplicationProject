package com.example.myapplicationdata.view_picture.view_model;

import android.app.Application;
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

public class FlavourDetailsViewModel extends AndroidViewModel {

    public FlavourDetailsViewModel(@NonNull Application application) {
        super(application);
        mRepository = new CommentsRepository(application);
        mAllWords = mRepository.getAllWords();

    }



    private CommentsRepository mRepository;

    private LiveData<List<CommentsEntity>> mAllWords;

    public LiveData<List<CommentsEntity>> getAllWords() { return mAllWords; }

    public void insert(CommentsEntity word) { mRepository.insert(word); }
}

