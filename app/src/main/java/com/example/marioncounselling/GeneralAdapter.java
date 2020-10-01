package com.example.marioncounselling;

import android.graphics.Movie;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class GeneralAdapter extends RecyclerView.Adapter<GeneralAdapter.MyViewHolder> {
    private List<General> generalList;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.genquote_list_row, viewGroup, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        General general = generalList.get(i);
        myViewHolder.title.setText(general.getGenquotes());

    }

    @Override
    public int getItemCount() {
        return generalList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
        }
    }
    public GeneralAdapter(List<General> generalList) {
        this.generalList = generalList;
    }


}
