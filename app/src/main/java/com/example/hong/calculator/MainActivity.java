package com.example.hong.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Number1;
    EditText Number2;
    TextView Result;

    private int num1;
    private int num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Number1 = (EditText) findViewById(R.id.Number1);
        Number2 = (EditText) findViewById(R.id.Number2);
        Result = (TextView) findViewById(R.id.Result);
    }

    public void add_onClick(View v) {
        this.num1 = Integer.parseInt(Number1.getText().toString());
        this.num2 = Integer.parseInt(Number2.getText().toString());
        Result.setText(Integer.toString(num1 + num2));
    }

    public void sub_onClick(View v) {
        this.num1 = Integer.parseInt(Number1.getText().toString());
        this.num2 = Integer.parseInt(Number2.getText().toString());
        Result.setText(Integer.toString(num1 - num2));
    }

    public void mul_onClick(View v) {
        this.num1 = Integer.parseInt(Number1.getText().toString());
        this.num2 = Integer.parseInt(Number2.getText().toString());
        Result.setText(Integer.toString(num1 * num2));
    }

    public void div_onClick(View v) {
        this.num1 = Integer.parseInt(Number1.getText().toString());
        this.num2 = Integer.parseInt(Number2.getText().toString());
        Result.setText(Integer.toString(num1 / num2));
    }

    public void clr_onClick(View v) {
        Number1.setText("");
        Number2.setText("");
        Result.setText("");
    }
}
