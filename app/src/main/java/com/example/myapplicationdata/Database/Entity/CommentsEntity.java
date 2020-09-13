package com.example.myapplicationdata.Database.Entity;

import android.widget.LinearLayout;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.ArrayList;
import java.util.List;

@Entity(tableName = "comments_entity")


public class CommentsEntity {

    @PrimaryKey(autoGenerate = true)
    public int id;
    public String comments;
    public List<String> uPets = new ArrayList<>();
    //public List<CommentsEntity> entityList;

    public CommentsEntity(int id,String word,List<String> pets) {
        this.id=id;
        this.comments = word;
        this.uPets.addAll(pets);
    }

    public CommentsEntity() {
    }

//    public CommentsEntity(int id,List<CommentsEntity> word) {
//        this.entityList=word;
//        this.id=id;
//    }
public  int getFie_Id(){
        return id;
}
    public String getWord() {
        return this.comments;
    }
    public List<String>  getComments(){
        return this.uPets;
    }

}
