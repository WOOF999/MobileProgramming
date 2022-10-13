package com.example.hw04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1,edit2;
    Button btnAdd,btnSub,btnMul,btnDiv,btnMod;
    TextView textResult;
    String num1,num2;
    Float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("초간단 계산기");

        edit1=(EditText) findViewById(R.id.Edit1);
        edit2=(EditText) findViewById(R.id.Edit2);

        btnAdd=(Button) findViewById(R.id.BtnAdd);
        btnSub=(Button) findViewById(R.id.BtnSub);
        btnMul=(Button) findViewById(R.id.BtnMul);
        btnDiv=(Button) findViewById(R.id.BtnDiv);
        btnMod=(Button) findViewById(R.id.BtnMod);

        textResult=(TextView) findViewById(R.id.TextResult);

        btnAdd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                if(num1.length()==0||num2.length()==0){
                    Toast.makeText(getApplicationContext(),"값을 모두 입력해주세요",Toast.LENGTH_LONG).show();
                    return false;
                }
                result=Float.parseFloat(num1)+Float.parseFloat(num2);
                textResult.setText("계산 결과 : "+result.toString());
                return false;
            }
        });
        btnSub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                if(num1.length()==0||num2.length()==0){
                    Toast.makeText(getApplicationContext(),"값을 모두 입력해주세요",Toast.LENGTH_LONG).show();
                return false;
                }
                result=Float.parseFloat(num1)-Float.parseFloat(num2);
                textResult.setText("계산 결과 : "+result.toString());
                return false;
            }
        });
        btnMul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                if(num1.length()==0||num2.length()==0){
                    Toast.makeText(getApplicationContext(),"값을 모두 입력해주세요",Toast.LENGTH_LONG).show();
                    return false;
                }
                result=Float.parseFloat(num1)*Float.parseFloat(num2);
                textResult.setText("계산 결과 : "+result.toString());
                return false;
            }
        });
        btnDiv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                if(num1.length()==0||num2.length()==0){
                    Toast.makeText(getApplicationContext(),"값을 모두 입력해주세요",Toast.LENGTH_LONG).show();
                    return false;
                }
                else if(Float.parseFloat(num2)==0||Float.parseFloat(num1)==0){
                    Toast.makeText(getApplicationContext(),"0으로 나눌 수 없습니다.",Toast.LENGTH_LONG).show();
                    return false;
                }
                float result_2=Float.parseFloat(num1)/Float.parseFloat(num2);
                textResult.setText("계산 결과 : "+result_2);
                return false;
            }
        });
        btnMod.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                if(num1.length()==0||num2.length()==0){
                    Toast.makeText(getApplicationContext(),"값을 모두 입력해주세요",Toast.LENGTH_LONG).show();
                    return false;
                }

                result=Float.parseFloat(num1)%Float.parseFloat(num2);
                textResult.setText("계산 결과 : "+result);
                return false;
            }
        });

    }
}