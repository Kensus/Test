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
    private Button  add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        addition();

    }

    public void init(){

        operand1 = (EditText)findViewById(R.id.etOperand1);
        operand2 = (EditText)findViewById(R.id.etOperand2);
        add      = (Button)findViewById(R.id.btnAdd);
        answer   = (TextView)findViewById(R.id.tvAnswer);

    }

    private void addition() {
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(operand1.getText().toString());
                int number2 = Integer.parseInt(operand2.getText().toString());
                int sum = number1 + number2;
               // answer.setText(" answer" + String.valueOf(sum));

                answer.setText(String.format(" answer %s",sum));


            }
        });


    }
}
