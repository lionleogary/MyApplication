package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class Bir extends AppCompatActivity{
    private EditText hei;
    private EditText wei;

    private TextView tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bir);
        hei=findViewById(R.id.height);
        wei=findViewById(R.id.editText5);
        show();



    }
    public void show ( ){
        NumberFormat nf=NumberFormat.getInstance();
        Bundle bundle=getIntent().getExtras();
        int bh=bundle.getInt("bh");
        int bw=bundle.getInt("bw");

        hei.setText(nf.format(bh));
        wei.setText(nf.format(bw));

    }
    public void Bmi(View v){

        Intent intent=new Intent(this,Bmi.class);
        Bundle bundle=new Bundle();
       String bh=hei.getText().toString();
        String bw=wei.getText().toString();
       /* bundle.putString("bh",bh);
        bundle.putString("bw",bw);
        intent.putExtras(bundle);*/
        startActivity(intent);
    }

    public void finished(View v){
        super.finish();
    }
}