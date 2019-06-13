package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;


    public class Bsa extends AppCompatActivity {
        private EditText hei;

        private TextView tt;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.bsa);




        }

        public void finished(View v){
            super.finish();
        }
    }

