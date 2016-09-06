package com.casa.luis.fitatec;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.casa.luis.fitatec.activities.AvPlano;
import com.casa.luis.fitatec.modelo.PlanoPessoal;

import java.util.ArrayList;

public class Menu extends AppCompatActivity {
    AppFit mApp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mApp = (AppFit) getApplication();

        LinearLayout llplanos = (LinearLayout) findViewById(R.id.ll_menuPlanos);

        ArrayList<PlanoPessoal> planos = mApp.getPlanosPessoais();
        for (final PlanoPessoal p : planos) {
            Button bt = new Button(this);
            bt.setText(p.getNome());
            bt.setBackgroundColor(Color.parseColor("#232323"));
            bt.setTextColor(Color.WHITE);
            bt.setTypeface(Typeface.create("serif", Typeface.NORMAL));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            layoutParams.setMargins(0,35, 0, 0);

            bt.setLayoutParams(layoutParams);

            bt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Menu.this, AvPlano.class);
                    mApp.setPlanoEscolhido(p);
                    startActivity(intent);
                }
            });

            llplanos.addView(bt);
        }
    }

    /*
    private LinearLayout getViewPlano(PlanoPessoal pp) {
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));



    }
*/
    public void plano (View v) {

    }
}
