package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class Bir extends AppCompatActivity{
    private EditText hei;

    private TextView tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bir);
        show();



    }
    public void show ( ){
        NumberFormat nf=NumberFormat.getInstance();
        Bundle bundle=getIntent().getExtras();
        int n=bundle.getInt("bh");
        hei=findViewById(R.id.height);
        tt=findViewById(R.id.textView);
        hei.setText(nf.format(n));

    }
    public void finished(View v){
        super.finish();
    }
}