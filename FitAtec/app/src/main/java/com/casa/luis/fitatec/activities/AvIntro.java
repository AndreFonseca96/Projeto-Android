package com.casa.luis.fitatec.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.casa.luis.fitatec.Entrar;
import com.casa.luis.fitatec.R;


public class AvIntro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);


    }


        public void muda(View v) {

            Intent intent = new Intent(AvIntro.this, Entrar.class);
            startActivity(intent);
        }

}
