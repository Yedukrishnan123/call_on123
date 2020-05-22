package com.example.callon;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.myViewHolder>
{
    private int[] listimages,coverpics;
    private String[] listnames;
    private Context context;
    public RecyclerAdapter (int[] listimages, String[] listnames,Context context,int[] coverpics)
    {
        this.listimages=listimages;
        this.listnames=listnames;
        this.context=context;
        this.coverpics=coverpics;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, final int position) {
        holder.listImageview.setImageResource(listimages[position]);
        holder.listTextView.setText(listnames[position]);
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,individualListActivity.class);
                intent.putExtra("abc",coverpics[position]);
                context.startActivity(intent);

            }
        });


    }

    @Override

    public int getItemCount() {
        return listimages.length;
    }
    public static class myViewHolder extends RecyclerView.ViewHolder
    {
        ImageView listImageview;
        TextView listTextView;
        LinearLayout linearLayout;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            listImageview=itemView.findViewById(R.id.listImageViewID);
            listTextView=itemView.findViewById(R.id.listTextViewId);
            linearLayout=itemView.findViewById(R.id.linearLayout);
        }
    }

}
