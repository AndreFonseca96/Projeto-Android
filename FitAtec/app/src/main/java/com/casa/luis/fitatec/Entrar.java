package com.casa.luis.fitatec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Entrar extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrar);
    }

    public void onClick(View v) {

        Intent intent = new Intent(Entrar.this, Menu.class);
        startActivity(intent);

    }
}
