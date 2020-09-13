package com.example.myapplicationdata.view_picture.view;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import com.example.myapplicationdata.Database.Entity.CommentsEntity;
import com.example.myapplicationdata.R;
import com.example.myapplicationdata.view_picture.view_model.FlavourDetailsViewModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class FlavourDetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
         final FlavourDetailsViewModel mWordViewModel;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flavour_details);
        getSupportActionBar().setTitle( getIntent().getStringExtra("title"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ImageView imageView=(ImageView)findViewById(R.id.iv_picture);
        final Button btnSubmit=(Button)findViewById(R.id.btn_submit);
        final EditText etComments=(EditText) findViewById(R.id.et_add_comments);

        final RecyclerView rvAddComments=(RecyclerView)findViewById(R.id.rv_comments);
        rvAddComments.setLayoutManager(new LinearLayoutManager(FlavourDetailsActivity.this));
        mWordViewModel = new ViewModelProvider(this).get(FlavourDetailsViewModel.class);
        mWordViewModel.getAllWords().observe(this, new Observer<List<CommentsEntity>>() {


            @Override
            public void onChanged(@Nullable final List<CommentsEntity> words) {

                {
                    if(words.size()>0) {
                        CommentsAdapter commentsAdapter = new CommentsAdapter
                                (FlavourDetailsActivity.this, words);
                        rvAddComments.setAdapter(commentsAdapter);
                    }
                }
            }
        });
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getList()!=null) {
                    setList((etComments.getText().toString()));

                }
                CommentsEntity word = new CommentsEntity(0,etComments.getText().toString(),getList());
                mWordViewModel.insert(word);





//                CommentsAdapter commentsAdapter=new CommentsAdapter
//                        (FlavourDetailsActivity.this,);
//                rvAddComments.setAdapter(commentsAdapter);
            }
        });
        Picasso
                .with(FlavourDetailsActivity.this)
                .load(getIntent().getStringExtra("url"))
                .into(imageView);


    }
    List<String> list = new ArrayList<>();

    void setList(String data){

        list.add(data);
    }
    List<String> getList(){
        return list;
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

}
