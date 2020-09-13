package com.example.myapplicationdata.Database.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.myapplicationdata.Database.Entity.CommentsEntity;
import com.example.myapplicationdata.Database.comments_dao.CommentsDao;
import com.example.myapplicationdata.Database.database.CommentsDatabase;

import java.util.List;


@Entity(tableName = "comments_entity")
public class CommentsRepository {

    private CommentsDao mWordDao;
    private LiveData<List<CommentsEntity>> mAllWords;

    public CommentsRepository(Application application) {
        CommentsDatabase db = CommentsDatabase.getDatabase(application);
        mWordDao = db.wordDao();
        mAllWords = mWordDao.readComments();
    }


    public LiveData<List<CommentsEntity>> getAllWords() {
        return mAllWords;
    }

    // You must call this on a non-UI thread or your app will throw an exception. Room ensures
    // that you're not doing any long running operations on the main thread, blocking the UI.
    public void insert(final CommentsEntity word) {
        CommentsDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                mWordDao.addComments(word);
            }
        });
    }
}
