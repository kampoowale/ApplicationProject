package com.example.myapplicationdata.module.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplicationdata.R;
import com.example.myapplicationdata.module.model.MyArray;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private List<MyArray> dataList;
    private Context context;

    public CustomAdapter(Context context,List<MyArray> dataList){
        this.context = context;
        this.dataList = dataList;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        public final View mView;
        TextView txtTitle;
        TextView population;
        TextView borders;


        CustomViewHolder(View itemView) {
            super(itemView);
            mView = itemView;

            txtTitle = (TextView) mView.findViewById(R.id.title);
            population = (TextView) mView.findViewById(R.id.population);
            borders = (TextView) mView.findViewById(R.id.borders);
        }
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.custom_row, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        holder.txtTitle.setText(dataList.get(position).getCapital());
        try {
            holder.population.setText(String.valueOf(dataList.get(position).getPopulation()));
        }
        catch(Exception e){

        }
        try {
            holder.borders.setText(dataList.get(position).getBorders().toString());
        }
        catch(Exception e){

        }

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
