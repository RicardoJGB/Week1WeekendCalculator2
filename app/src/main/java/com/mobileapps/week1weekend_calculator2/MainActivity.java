package com.mobileapps.week1weekend_calculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonadd,
            buttonsubstract,buttonmultiply,buttondivide,buttonequal,buttondot, buttonsqrt;

    EditText et;

    float firstvalue, secondvalue;

    boolean add1,sub1,mul1,div1,sqrt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0=(Button)findViewById(R.id.Button0);
        button1=(Button)findViewById(R.id.Button1);
        button2=(Button)findViewById(R.id.Button2);
        button3=(Button)findViewById(R.id.Button3);
        button4=(Button)findViewById(R.id.Button4);
        button5=(Button)findViewById(R.id.Button5);
        button6=(Button)findViewById(R.id.Button6);
        button7=(Button)findViewById(R.id.Button7);
        button8=(Button)findViewById(R.id.Button8);
        button9=(Button)findViewById(R.id.Button9);
        buttondot=(Button)findViewById(R.id.DotButton);
        buttonadd=(Button)findViewById(R.id.AddButton);
        buttonsubstract=(Button)findViewById(R.id.SubButton);
        buttonmultiply=(Button)findViewById(R.id.MulButton);
        buttondivide=(Button)findViewById(R.id.DivButton);
        buttonequal=(Button)findViewById(R.id.EqButton);
        buttonsqrt=(Button)findViewById(R.id.SqrtButton);
        et=(EditText)findViewById(R.id.et1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"1");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"0");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "9");
            }
        });
        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+".");
            }
        });
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et==null){
                    et.setText("");
                }
                else{
                    firstvalue= Float.parseFloat(et.getText()+"");
                    add1=true;
                    et.setText(null);
                }
            }
        });
        buttonsubstract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstvalue = Float.parseFloat(et.getText()+"");
                sub1=true;
                et.setText(null);
            }
        });
        buttondivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstvalue= Float.parseFloat(et.getText()+"");
                div1=true;
                et.setText(null);
            }
        });
        buttonmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstvalue= Float.parseFloat(et.getText()+"");
                mul1=true;
                et.setText(null);
            }
        });
        buttonsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstvalue=Float.parseFloat(et.getText()+"");
                sqrt1=true;
                et.setText(null);
            }
        });

        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondvalue=Float.parseFloat(et.getText()+"");

                if (add1){
                    et.setText(firstvalue + secondvalue + "");
                    add1=false;
                }
                if (sub1){
                    et.setText(firstvalue-secondvalue+"");
                    sub1=false;
                }
                if(mul1){
                    et.setText(firstvalue*secondvalue+"");
                    mul1=false;
                }
                if(div1){
                    et.setText(firstvalue/secondvalue+"");
                    div1=false;
                }
                if(sqrt1){
                    et.setText(Math.sqrt(firstvalue)+"");
                    sqrt1=false;
                }
            }
        });
        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"");
            }
        });
    }
}
