package com.example.myapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    EditText et_mine,et_com,et_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        et_mine = findViewById(R.id.et_mine);
        et_com = findViewById(R.id.et_com);
        et_result = findViewById(R.id.et_result);

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { myClick(); }
        });
    }
    public void myClick() {
        String me = String.valueOf(et_mine.getText());
        String comp = String.valueOf(et_com.getText());
        double b = Math.random();
        System.out.println(b);
        if (b < 0.5) {
            comp = "짝";
        } else {
            comp = "홀";
        }

        et_com.setText(comp);

        if(me.equals(comp)) {
            et_result.setText("나의 승리");
        } else {
            et_result.setText("컴퓨터의 승리");
        }
    }

    public void click(){
        String mine = et_mine.getText().toString();
        String com = "";
        String result = "";

        double rnd = Math.random();
        if(rnd > 0.5) {
            com = "홀";
        } else {
            com = "짝";
        }
        if(mine.equals(com)) {
            result = "이김";
        } else {
            result = "짐";
        }

        et_com.setText(com);
        et_result.setText(result);
    }
}