package com.example.callon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class firstActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerAdapter recyclerAdapter;

    private int[] listimages={R.drawable.power,R.drawable.burger,R.drawable.police,R.drawable.shop};
    private String[] listnames={"ELECTRICITY","FOOD","SECURITY","SHOP"};
    private int[] coverpics={R.drawable.electricitycover,R.drawable.foodcover,R.drawable.securitycover,R.drawable.shopcoverpic};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityfirst);
        recyclerView=findViewById(R.id.recyclerview);
        recyclerAdapter=new RecyclerAdapter(listimages,listnames,firstActivity.this,coverpics);
        layoutManager=new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(recyclerAdapter);
    }
}
