package com.example.hw06_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnPrev,btnNext;
        final ViewFlipper vf;
        btnPrev=(Button)findViewById(R.id.btnPrev);
        btnNext=(Button)findViewById(R.id.btnNext);
        vf=(ViewFlipper)findViewById(R.id.viewFli1);
        ImageView a1=(ImageView)findViewById(R.id.cat1);
        ImageView a2=(ImageView)findViewById(R.id.dog1);
        ImageView a3=(ImageView)findViewById(R.id.rab1);
        ImageView a4=(ImageView)findViewById(R.id.horse1);
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vf.setFlipInterval(1000);
                vf.startFlipping();
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vf.stopFlipping();
            }
        });
    }
}