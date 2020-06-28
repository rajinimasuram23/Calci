package com.example.calci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button zero, one, two, three, four, five, six, seven, eight, nine, dot, equal, plus, minus;
    private Button into,by,del,delall;
    private TextView input;
    private TextView result;
    final char ADD = '+';
    final char SUB = '-';
    final char MUL = 'x';
    final char DIV = '/';
    final char EQU = 0;
    float val1 = Float.NaN;
    float val2;
    char ACTION;
    public String a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero =  findViewById(R.id.btn0);
        one = findViewById(R.id.btn1);
        two = findViewById(R.id.btn2);
        three = findViewById(R.id.btn3);
        four = findViewById(R.id.btn4);
        five = findViewById(R.id.btn5);
        six = findViewById(R.id.btn6);
        seven = findViewById(R.id.btn7);
        eight = findViewById(R.id.btn8);
        nine = findViewById(R.id.btn9);
        plus = findViewById(R.id.btnadd);
        minus = findViewById(R.id.btnsub);
        into = findViewById(R.id.btnmul);
        by = findViewById(R.id.btndiv);
        dot = findViewById(R.id.btndot);
        equal = findViewById(R.id.btneq);
        input =  findViewById(R.id.input);
        result = findViewById(R.id.result);
        del = findViewById(R.id.btnclear);
        delall = findViewById(R.id.btnclearall);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    a = String.format("%s0", input.getText().toString());
                    input.setText(a);
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = String.format("%s1", input.getText().toString());
                input.setText(a);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = String.format("%s2", input.getText().toString());
                input.setText(a);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = String.format("%s3", input.getText().toString());
                input.setText(a);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = String.format("%s4", input.getText().toString());
                input.setText(a);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = String.format("%s5", input.getText().toString());
                input.setText(a);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = String.format("%s6", input.getText().toString());
                input.setText(a);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = String.format("%s7", input.getText().toString());
                input.setText(a);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = String.format("%s8", input.getText().toString());
                input.setText(a);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = String.format("%s9", input.getText().toString());
                input.setText(a);
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = String.format("%s.", input.getText().toString());
                input.setText(a);

            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoOperations();
                ACTION = EQU;
                a = String.format("%s%s=%s", result.getText().toString(), val2, val1);
                result.setText(a);
                input.setText(null);
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoOperations();
                ACTION = ADD;
                a = String.format("%s+", String.valueOf(val1));
                result.setText(a);
                input.setText(null);

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoOperations();
                ACTION = SUB;
                a = String.format("%s-", String.valueOf(val1));
                result.setText(a);
                input.setText(null);
            }
        });
        by.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoOperations();
                ACTION = DIV;
                a = String.format("%s/", String.valueOf(val1));
                result.setText(a);
                input.setText(null);
            }
        });
        into.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoOperations();
                ACTION = MUL;
                a = String.format("%sx", String.valueOf(val1));
                result.setText(a);
                input.setText(null);
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input.getText().length()>0){
                    CharSequence name = input.getText().toString();
                    CharSequence nam = name.subSequence(0, name.length()-1);
                    input.setText(nam);
                }
                else {
                    val1 = Float.NaN;
                    val2 = Float.NaN;
                    input.setText(null);
                    result.setText(null);
                }
            }
        });

        delall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.NaN;
                val2 = Float.NaN;
                input.setText(null);
                result.setText(null);
            }
        });
    }
    public void DoOperations(){

        if(!Double.isNaN(val1)){
            val2 = Float.parseFloat(input.getText().toString());
            switch (ACTION){
                case ADD :
                    val1 = val1 + val2;
                    break;
                case SUB :
                    val1 = val1 - val2;
                   break;
                case MUL :
                    val1 = val1 * val2;
                   break;
                case DIV :
                    val1 = val1 / val2;
                   break;
                case EQU :
                    break;
                default:
                    break;
            }

        }
        else {
            val1 = Float.parseFloat(input.getText().toString());
        }
    }
}
