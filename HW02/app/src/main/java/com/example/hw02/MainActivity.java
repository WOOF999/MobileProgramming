package com.example.hw02;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView text1,text2;
    Switch chkAgree;
    RadioGroup rGroup1;

    ImageView imgPet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("안드로이드 사진보기");

        text1=(TextView) findViewById(R.id.Text1);
        chkAgree=(Switch) findViewById(R.id.ChkAgree);

        text2=(TextView) findViewById(R.id.Text2);
        rGroup1=(RadioGroup) findViewById(R.id.Rgroup1);


        imgPet=(ImageView) findViewById(R.id.ImgPet);


        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(chkAgree.isChecked()==true){
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);


                }else{
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);


                }

            }
        });




        rGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkId) {
                Log.d("woof","onCheckChangeListener "+checkId);
                if(checkId==R.id.RdoCat){
                    imgPet.setImageResource(R.drawable.s12);
                    //imgAnd.setVisibility(View.VISIBLE);
                }else if(checkId==R.id.RdoRabbit){
                    imgPet.setImageResource(R.drawable.r11);
                    //imgAnd.setVisibility(View.VISIBLE);
                }else{
                    imgPet.setImageResource(R.drawable.q10);
                    //imgAnd.setVisibility(View.VISIBLE);
                }
            }
        });

    }

}











