package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,button17;
EditText editText1;
float mvalueone,mvaluetwo;
boolean maddition,msubtract,mmul,mdiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);
        button5=(Button) findViewById(R.id.button5);
        button6=(Button) findViewById(R.id.button6);
        button7=(Button) findViewById(R.id.button7);
        button8=(Button) findViewById(R.id.button8);
        button9=(Button) findViewById(R.id.button9);
        button10=(Button) findViewById(R.id.button10);
        button11=(Button) findViewById(R.id.button11);
        button12=(Button) findViewById(R.id.button12);
        button13=(Button) findViewById(R.id.button13);
        button14=(Button) findViewById(R.id.button14);
        button15=(Button) findViewById(R.id.button15);
        button16=(Button) findViewById(R.id.button16);
        button17=(Button) findViewById(R.id.button17);
        editText1= (EditText) findViewById(R.id.textView);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText()+"3");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText()+"4");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText()+"5");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText()+"6");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText()+"7");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText()+"8");
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText()+".");
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText()+"9");
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText()+"0");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText1==null) {
                    editText1.setText("");
                }
                else {
                    mvalueone=Float.parseFloat(editText1.getText()+"");
                    maddition=true;
                    editText1.setText((null));
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText1==null) {
                    editText1.setText("");
                }
                else {
                    mvalueone=Float.parseFloat(editText1.getText()+"");
                    msubtract=true;
                    editText1.setText((null));
                }
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText1==null) {
                    editText1.setText("");
                }
                else {
                    mvalueone=Float.parseFloat(editText1.getText()+"");
                    mmul=true;
                    editText1.setText((null));
                }
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText1==null) {
                    editText1.setText("");
                }
                else {
                    mvalueone=Float.parseFloat(editText1.getText()+"");
                    mdiv=true;
                    editText1.setText((null));
                }
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText("");
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mvaluetwo=Float.parseFloat(editText1.getText()+"");
                if(maddition==true) {
                    editText1.setText(mvalueone+mvaluetwo+"");
                    maddition=false;
                }
                if(msubtract==true) {
                    editText1.setText(mvalueone-mvaluetwo+"");
                    msubtract=false;
                }
                if(mmul==true) {
                    editText1.setText(mvalueone*mvaluetwo+"");
                    mmul=false;
                }
                if(mdiv==true) {
                    editText1.setText(mvalueone/mvaluetwo+"");
                    mdiv=false;
                }
                }
        });
    }
}