package com.example.myapplicationdata.search_flavor.view;


import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.myapplicationdata.R;
import com.example.myapplicationdata.search_flavor.model.MyArray;
import com.example.myapplicationdata.search_flavor.view_model.FlavorImagesViewModel;

//import butterknife.BindView;

public class MainActivity extends AppCompatActivity {
    private FlavorImagesViewModel postViewModel;
    //@BindView(R.id.etSearch) EditText etSearch;
    ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pd = new ProgressDialog(MainActivity.this);

        initilizePostViewModel();

        setContentView(R.layout.activity_main);

        final EditText etSearch = (EditText) findViewById(R.id.etSearch);

        etSearch.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    getProgressDialog();
                    postViewModel.validateSearch(etSearch.getText().toString());

                    return true;
                }
                return false;
            }
        });
    }

    private void initilizePostViewModel() {
        postViewModel = ViewModelProviders.of(this).get(FlavorImagesViewModel.class);
        postViewModel.getPostMutableLiveData().observe(this, new Observer<MyArray>() {
            @Override
            public void onChanged(@Nullable MyArray response) {
                if (response.getData().size() > 0) {
                    hideProgressDialog();

                    generateDataList(response);
                } else {
                    hideProgressDialog();
                    Toast.makeText(MainActivity.this, "No results", Toast.LENGTH_LONG).show();

                }
            }
        });
        postViewModel.validateSearch().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String message) {
                hideProgressDialog();
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
            }
        });

    }

    private CustomAdapter adapter;


    private void generateDataList(MyArray responseData) {
        GridView gridview = (GridView) findViewById(R.id.gridview);
        adapter = new CustomAdapter(this, responseData);
        gridview.setAdapter(adapter);
    }

    void getProgressDialog() {
        pd.setMessage("loading");
        pd.show();
    }

    void hideProgressDialog() {
        if (pd != null)
            pd.dismiss();
    }
}
