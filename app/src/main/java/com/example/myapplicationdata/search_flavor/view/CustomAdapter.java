package com.example.myapplicationdata.search_flavor.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplicationdata.R;
import com.example.myapplicationdata.search_flavor.model.MyArray;
import com.example.myapplicationdata.view_picture.view.FlavourDetailsActivity;
import com.squareup.picasso.Picasso;

public class CustomAdapter extends BaseAdapter {
    private Context mContext;
    private  MyArray response;

    // Constructor


    public CustomAdapter(Context mContext,MyArray response) {
        this.mContext = mContext;
        this.response=response;
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return response.getData().size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View grid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            grid = new View(mContext);
            grid = inflater.inflate(R.layout.search_result_custom_adapter, null);
            TextView textView = (TextView) grid.findViewById(R.id.grid_text);
            TextView heading =(TextView)grid.findViewById(R.id.heading);

            ImageView imageView = (ImageView)grid.findViewById(R.id.grid_image);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    navigateToFlavourDetailsActivity(position,response.getData().get(position).getTitle(),
                            response.getData()
                                    .get(position).getImages().get(0).getLink());
                }


            });
            if (response.getData().get(position).getImages()!=null&&response.getData()
                    .get(position).getImages().get(0).getLink() != null) {
                Picasso
                        .with(mContext)
                        .load(response.getData().get(position).getImages().get(0).getLink())
                        .into(imageView);
            }
        } else {
            grid = (View) convertView;
        }

        return grid;
    }
    private void navigateToFlavourDetailsActivity(int position,String title,String url) {
        Intent intent=new Intent(mContext, FlavourDetailsActivity.class);
        Bundle data= new Bundle();
        data.putString("title", title);
        data.putString("url", url);

        intent.putExtras(data);
        intent.putExtra("position", position);
        intent.putExtra("title", title);
        intent.putExtra("url", url);

        mContext.startActivity(intent);
    }
}