package com.max.recycleviewwithvolly.Adapter;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import com.max.recycleviewwithvolly.MainActivity;
import com.max.recycleviewwithvolly.MainActivity2;
import com.max.recycleviewwithvolly.R;

import java.util.List;


public class RecycleviewAdapter extends RecyclerView.Adapter{

    List<String> mydata;

    public RecycleviewAdapter(List<String> mydata) {
        this.mydata = mydata;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View  view = layoutInflater.inflate(R.layout.viewlist, parent, false);
            return new RecycleviewViewholder(view);


    }

    @Override
    public void onBindViewHolder( RecyclerView.ViewHolder holder, int position) {
            RecycleviewViewholder viewHolderOne = (RecycleviewViewholder) holder;
            viewHolderOne.textView.setText(mydata.get(position));

    }

    @Override
    public int getItemCount() {
        return mydata.size();
    }

    public class RecycleviewViewholder extends RecyclerView.ViewHolder {
        TextView textView;
Button button;
        public RecycleviewViewholder(View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.listtext);
            button = itemView.findViewById(R.id.listButton);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), MainActivity2.class);
                    v.getContext().startActivity(intent);

                }
            });
        }
    }

}
