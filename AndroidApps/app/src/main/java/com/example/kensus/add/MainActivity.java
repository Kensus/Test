package com.example.kensus.add;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText operand1;
    private EditText operand2;
    private TextView answer;
    private Button add;
    private Button btnIncrease;
    private Button btnDecrease;
    private TextView tvValue;
    int napTime = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        addition();
        increaseValue();
        decreaseValue();


    }

    public void init() {
        operand1 = (EditText) findViewById(R.id.etOperand1);
        operand2 = (EditText) findViewById(R.id.etOperand2);
        add = (Button) findViewById(R.id.btnAdd);
        answer = (TextView) findViewById(R.id.tvAnswer);
        btnDecrease = (Button) findViewById(R.id.btnMinusValue);
        btnIncrease = (Button) findViewById(R.id.btnAddValue);
        tvValue = (TextView) findViewById(R.id.tvShowValue);

    }

    private void addition() {
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(operand1.getText().toString());
                int number2 = Integer.parseInt(operand2.getText().toString());
                int sum = number1 + number2;
                // answer.setText(" answer" + String.valueOf(sum));

                answer.setText(String.format(" answer %s", sum));

            }
        });


    }

    public void increaseValue() {

        btnIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                napTime = napTime + 1;
                tvValue.setText(String.format("%s", napTime));
            }
        });


    }

    public void decreaseValue() {

        btnDecrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                napTime = napTime - 1;
                tvValue.setText(String.format("%s", napTime));


            }
        });

    }


}
