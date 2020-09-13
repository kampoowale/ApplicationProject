package com.example.myapplicationdata.Database.comments_dao;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myapplicationdata.Database.Entity.CommentsEntity;

import java.util.List;

@Dao
public interface CommentsDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void addComments(CommentsEntity comments);

    @Query("SELECT * FROM comments_entity ORDER BY id ASC")
    LiveData<List<CommentsEntity>> readComments();

    @Update
    void update(List<CommentsEntity> task);
}
