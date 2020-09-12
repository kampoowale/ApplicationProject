package com.example.myapplicationdata.module.view;


import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplicationdata.R;
import com.example.myapplicationdata.module.view_model.CountryDetailsViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private CountryDetailsViewModel postViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView callApi =(TextView)findViewById(R.id.textHello);
        callApi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initilizePostViewModel();
            }
        });
        EditText etSearch=(EditText)findViewById(R.id.etSearch);

        etSearch.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    //performSearch();
                    return true;
                }
                return false;
            }
        });
    }

    private void initilizePostViewModel(){
        postViewModel = ViewModelProviders.of(this).get(CountryDetailsViewModel.class);
//        postViewModel.getPostMutableLiveData().observe(this, new Observer<List<MyArray>>() {
//            @Override
//            public void onChanged(@Nullable List<MyArray> response) {
//                generateDataList(response);
//            }
//        });
    }

    private CustomAdapter adapter;
    private RecyclerView recyclerView;
//    private void generateDataList(List<MyArray> responseData) {
//        recyclerView = findViewById(R.id.customRecyclerView);
//        adapter = new CustomAdapter(this,responseData);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setAdapter(adapter);
//    }
}
