package com.example.callon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class individualListActivity extends AppCompatActivity {

    ImageView coverpicimageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual_list);

        coverpicimageView=(ImageView)findViewById(R.id.coverpicsid);
        int coverpic=getIntent().getIntExtra("abc",0);

        coverpicimageView.setImageResource(coverpic);
    }
}