package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText height;
    private EditText weight;
    private EditText email;
    private EditText age;

    private RadioGroup rr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.editText);
        height=findViewById(R.id.editText2);
        weight=findViewById(R.id.editText4);
        email=findViewById(R.id.editText3);
        rr=(RadioGroup) findViewById(R.id.RRR);
        age=findViewById(R.id.editText11);
    }

    public void Bsa(View v){
        Intent intent=new Intent(this,Bsa.class);
        Bundle bundle=new Bundle();
        int bh=Integer.parseInt(height.getText().toString());
        int bw=Integer.parseInt(weight.getText().toString());
        bundle.putInt("bh",bh);
        bundle.putInt("bw",bw);
        intent.putExtras(bundle);
        startActivity(intent);

    }
    public void ibw(View v){
        Intent intent=new Intent(this,Ibw.class);
        Bundle bundle=new Bundle();
        int bh=Integer.parseInt(height.getText().toString());
        int bw=Integer.parseInt(weight.getText().toString());
        bundle.putInt("bh",bh);
        bundle.putInt("bw",bw);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void Bir(View v){

        Intent intent=new Intent(this,Bir.class);
        Bundle bundle=new Bundle();
        int bh=Integer.parseInt(height.getText().toString());
        int bw=Integer.parseInt(weight.getText().toString());
        int aa=Integer.parseInt(age.getText().toString());
        String em=email.getText().toString();
        String nam=name.getText().toString();
        bundle.putString("name",nam);
        bundle.putInt("bh",bh);
        bundle.putInt("aa",aa);
        bundle.putInt("bw",bw);


        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void KKK(View v){

        switch( rr.getCheckedRadioButtonId()){
            case R.id.radioButton:
                name.setText("IIIIBBBBB");
                break;
            case R.id.radioButton2:
                name.setText("Igggggggg");
                break;
        }
    }

}


