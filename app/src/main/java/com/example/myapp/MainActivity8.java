package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity8 extends AppCompatActivity {

    EditText et_f,et_l;
    TextView tv_disp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        et_f = findViewById(R.id.et_f);
        et_l = findViewById(R.id.et_l);
        tv_disp = findViewById(R.id.tv_disp);

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { click(); }
        });
    }
    public void myClick() {

        String fStr = et_f.getText().toString();
        String lStr = et_l.getText().toString();
        int fStar = Integer.parseInt(fStr);
        int lStar = Integer.parseInt(lStr);
        StringBuilder sb = new StringBuilder();

//        거꾸로하는법
//        for (int i = 1; i <=fStar; i++) {
//            for (int j = i; j <= i; j++) {

        for (int i = fStar; i <=lStar; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
    tv_disp.setText(sb);
    }

    // 쌤

    public String drawLine(int cnt){
        String ret = "";
        for (int i=0; i<cnt; i++){
            ret += "*";
        }
        ret += "\n";
        return ret;
    }

    public void click(){
        int a = Integer.parseInt(et_f.getText().toString());
        int b = Integer.parseInt(et_l.getText().toString());
        String txt = "";

        for(int i=a; i<=b; i++){
            txt += drawLine(i);
        }
        tv_disp.setText(txt);
    }
}