package com.example.hw04_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        edt=findViewById(R.id.edtText);
        edt.setText(Float.toString(convertFTC(Float.parseFloat(edt.getText().toString()))));
        super.onCreate(savedInstanceState);
        edt.setText(Float.toString(convertFTC(Float.parseFloat(edt.getText().toString()))));
        setContentView(R.layout.activity_main);
    }
    float convertFTC(float f){
        return f;
    }
}