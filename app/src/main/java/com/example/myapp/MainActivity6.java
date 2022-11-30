package com.example.myapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity6 extends AppCompatActivity {

    EditText et;
    TextView tv_disp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        et = findViewById(R.id.et1);
        tv_disp = findViewById(R.id.tv_disp);
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click();
            }
        });
    }
    public void click() {
        String danStr = et.getText().toString();
        int dan = Integer.parseInt(danStr);
        String txt = "";

//        txt += danStr + "*" + 1 + "=" + (dan*1) + "\n";
//        txt += danStr + "*" + 2 + "=" + (dan*2) + "\n";
//        txt += danStr + "*" + 3 + "=" + (dan*3) + "\n";
//        txt += danStr + "*" + 4 + "=" + (dan*4) + "\n";
//        txt += danStr + "*" + 5 + "=" + (dan*5) + "\n";
//        txt += danStr + "*" + 6 + "=" + (dan*6) + "\n";
//        txt += danStr + "*" + 7 + "=" + (dan*7) + "\n";
//        txt += danStr + "*" + 8 + "=" + (dan*8) + "\n";
//        txt += danStr + "*" + 9 + "=" + (dan*9) + "\n";

        for(int i=1; i<=9; i++) {
            txt += danStr + "*" + i + "=" + (dan*i) + "\n";
        }

        tv_disp.setText(txt);
    }
}