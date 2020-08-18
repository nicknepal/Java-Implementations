package com.example.java_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        Button btnDot,btnEqual,btnClear,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnDiv,btnMul,btnSub,btnAdd;
        TextView ed1;
        float Res1,Res2;
        boolean Add,Sub,Div,Mul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button)findViewById(R.id.button16);
        btn2=(Button)findViewById(R.id.button17);
        btn3=(Button)findViewById(R.id.button18);
        btn4=(Button)findViewById(R.id.button15);
        btn5=(Button)findViewById(R.id.button14);
        btn6=(Button)findViewById(R.id.button13);
        btn7=(Button)findViewById(R.id.button8);
        btn8=(Button)findViewById(R.id.button9);
        btn9=(Button)findViewById(R.id.button10);
        btn0=(Button)findViewById(R.id.button5);
        btnDot=(Button)findViewById(R.id.button2);
        btnClear=(Button)findViewById(R.id.button20);
        btnMul=(Button)findViewById(R.id.button12);
        btnDiv=(Button)findViewById(R.id.button6);
        btnSub=(Button)findViewById(R.id.button11);
        btnAdd=(Button)findViewById(R.id.button21);
        btnEqual=(Button)findViewById(R.id.button19);
        ed1= (TextView)findViewById(R.id.textView);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"1");
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"7");
            }
        });


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"8");
            }
        });


        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"9");
            }
        });


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"0");
            }
        });


        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+".");
            }
        });


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed1==null){
                    ed1.setText("");
                }
                else {
                    Res1=Float.parseFloat(ed1.getText()+"");
                    Add=true;
                    ed1.setText("");
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed1==null){
                    ed1.setText("");
                }
                else {
                    Res1=Float.parseFloat(ed1.getText()+"");
                    Mul=true;
                    ed1.setText("");
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed1==null){
                    ed1.setText("");
                }
                else {
                    Res1=Float.parseFloat(ed1.getText()+"");
                    Sub=true;
                    ed1.setText("");
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed1==null){
                    ed1.setText("");
                }
                else {
                    Res1=Float.parseFloat(ed1.getText()+"");
                    Div=true;
                    ed1.setText("");
                }
            }
        });


        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Res2=Float.parseFloat(ed1.getText()+"");
                if (Add=true){
                    ed1.setText(Res1+Res2+"");
                    Add=false;
                }

                if (Sub=true){
                    ed1.setText(Res1-Res2+"");
                    Sub=false;
                }

                if (Mul=true){
                    ed1.setText(Res1*Res2+"");
                    Mul=false;
                }

                if (Div=true){
                    ed1.setText(Res1/Res2+"");
                    Div=false;
                }
            }
        });


        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText("");
            }
        });
    }
}