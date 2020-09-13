package com.example.myapplicationdata.view_picture.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplicationdata.Database.Entity.CommentsEntity;
import com.example.myapplicationdata.R;

import java.util.ArrayList;
import java.util.List;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class CommentsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final Context context;
    List<CommentsEntity> list = new ArrayList<>();

    public CommentsAdapter(Context context, List<CommentsEntity> list) { // you can pass other parameters in constructor
        this.context = context;
        this.list = list;
    }

    private class CustomAdapterItemView extends RecyclerView.ViewHolder {
        final TextView textView;
        CustomAdapterItemView(final View itemView) {
            super(itemView);
            textView=(TextView)itemView.findViewById(R.id.tv_comments);

        }

        void bind(int position) {
            textView.setText(list.get(position).getComments().get(position));
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.custom_row, parent, false);
        CustomAdapterItemView viewHolder = new CustomAdapterItemView(listItem);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((CustomAdapterItemView) holder).bind(position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    // Add your other methods here
}

