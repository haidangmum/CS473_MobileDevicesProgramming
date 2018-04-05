package com.example.nguyenhaidang.lesson3lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button convertBtn;
    private EditText input;
    private EditText output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        convertBtn = findViewById(R.id.buttonConvert);
        input = findViewById(R.id.lbInput);
        output = findViewById(R.id.lbOutput);

        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputText = input.getText().toString();
                double inputValue = Double.parseDouble(inputText);
                double outputValue = inputValue * 0.45359237;
                output.setText(String.valueOf(outputValue));
            }
        });
    }

}
