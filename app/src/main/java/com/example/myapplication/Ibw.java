package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;


public class Ibw extends AppCompatActivity {
    private EditText hei;
    private EditText wei;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bsa);
        hei=findViewById(R.id.heightibw);
        wei=findViewById(R.id.heightibw);
        //show();


    }
    public void show ( ){
        NumberFormat nf=NumberFormat.getInstance();
        Bundle bundle=getIntent().getExtras();
        int bh=bundle.getInt("bh");
        int bw=bundle.getInt("bw");

        hei.setText(nf.format(bh));
        wei.setText(nf.format(bw));

    }

    public void finished(View v){
        super.finish();
    }
}
