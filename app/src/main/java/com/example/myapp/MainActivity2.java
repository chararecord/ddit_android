package com.example.myapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        /* 쓰앵님꺼 */
        TextView tv = findViewById(R.id.tv);
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = (String) tv.getText();
                int aa = Integer.parseInt(a);
                aa++;
                tv.setText(Integer.toString(aa));
            }
        });

        /*
        내꼬
        TextView tv = findViewById(R.id.tv);
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numStr = (String) tv.getText();
                int num = Integer.parseInt(numStr);
                num++;
                tv.setText(Integer.toString(num));
            }
        });
         */
    }
}