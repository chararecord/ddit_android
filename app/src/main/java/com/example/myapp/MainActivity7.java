package com.example.myapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity7 extends AppCompatActivity {

    EditText etMine,etCom,etResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        etMine = findViewById(R.id.etMine);
        etCom = findViewById(R.id.etCom);
        etResult = findViewById(R.id.etResult);

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { myClick(); }
        });
    }
    public void myClick() {

        String[] comArr = {"가위", "바위", "보"};
        String mine = etMine.getText().toString();
        String result = "";
        String com = comArr[(int)(Math.random()*3)];

        if(mine.equals(com)) {
            result = "비김";
        } else if (mine.equals("가위") && com.equals("바위") ||
                    mine.equals("바위") && com.equals("보") ||
                    mine.equals("보") && com.equals("가위")) {
            result = "내가 짐";
        } else {
            result = "내가 이김";
        }

        etCom.setText(com);
        etResult.setText(result);
    }
}