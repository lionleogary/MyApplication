package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class Bmi extends AppCompatActivity{
    private TextView hei;
    private TextView wei;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bir);
        show();



    }
    public void show ( ){
        NumberFormat nf=NumberFormat.getInstance();
        Bundle bundle=getIntent().getExtras();
        String bh=bundle.getString("bh");
        String bw=bundle.getString("bw");
        hei=findViewById(R.id.heightbmi);
        wei=findViewById(R.id.weightbmi);
        hei.setText(bh);
        wei.setText(bw);

    }


    public void finished(View v){
        super.finish();
    }
}