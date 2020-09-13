package com.example.myapplicationdata.Database.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.myapplicationdata.Database.Converters;
import com.example.myapplicationdata.Database.Entity.CommentsEntity;
import com.example.myapplicationdata.Database.comments_dao.CommentsDao;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
@Database(version = 5, entities = {CommentsEntity.class},exportSchema = false)

@TypeConverters({Converters.class})
public abstract class CommentsDatabase extends RoomDatabase {
    public abstract CommentsDao wordDao();

    private static volatile CommentsDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    public static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);
    public static CommentsDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (CommentsDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            CommentsDatabase.class, "word_database").
                            fallbackToDestructiveMigration() .build();
                            //.build();
                }
            }
        }
        return INSTANCE;
    }
}
