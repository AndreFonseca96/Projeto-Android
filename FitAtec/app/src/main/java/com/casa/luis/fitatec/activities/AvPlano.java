package com.casa.luis.fitatec.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.CountDownTimer;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.casa.luis.fitatec.AppFit;
import com.casa.luis.fitatec.R;
import com.casa.luis.fitatec.modelo.Exercicio;
import com.casa.luis.fitatec.modelo.PlanoPessoal;

import java.util.ArrayList;

public class AvPlano extends AppCompatActivity {

    AppFit mApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plano);

        ArrayList<PlanoPessoal> pp = ((AppFit) getApplication()).getPlanosPessoais();

        LinearLayout llexercicios = (LinearLayout) findViewById(R.id.ll_exercicios);

        mApp = (AppFit) getApplication();

        Log.i("BLA", mApp.getPlanoEscolhido().getNome());

        ArrayList<PlanoPessoal> planos = mApp.getPlanosPessoais();
        for (final PlanoPessoal p : planos) {

            if (p.getNome().equals(mApp.getPlanoEscolhido().getNome())){


                for (final Exercicio exec : mApp.getPlanoEscolhido().getAl()) {


                    LinearLayout ll = new LinearLayout(this);
                    ll.setOrientation(LinearLayout.HORIZONTAL);
                    ll.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));

                    ImageView iv = new ImageView(this);

                    iv.setImageResource(exec.getImagem());
                    iv.setLayoutParams( new LinearLayout.LayoutParams(300,300));

                    ll.addView(iv);

                    LinearLayout ll2 = new LinearLayout(this);
                    ll2.setOrientation(LinearLayout.VERTICAL);
                    ll2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));


                    // Nome

                    TextView tv = new TextView(this);
                    tv.setText(exec.getNome());
                    tv.setTextSize(28);
                    tv.setTypeface(null, Typeface.BOLD);
                    tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

                    //Repeticoes

                    TextView tv2 = new TextView(this);
                    tv2.setText("Repeticoes: " +(((Integer) exec.getRepeticoes()).toString()));
                    tv2.setTextSize(28);


                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

                    layoutParams.setMargins(0,10, 0, 0);
                    tv2.setLayoutParams(layoutParams);


                    // Series

                    TextView tv3 = new TextView(this);
                    tv3.setText("Series: " +(((Integer) exec.getSeries()).toString()));
                    tv3.setTextSize(28);

                    layoutParams.setMargins(0,10, 0, 0);
                    tv3.setLayoutParams(layoutParams);

                    // Peso

                    TextView tv4 = new TextView(this);
                    tv4.setText("Peso: " +(((Integer) exec.getPeso()).toString()));
                    tv4.setTextSize(28);

                    layoutParams.setMargins(0,10, 0, 0);
                    tv4.setLayoutParams(layoutParams);


                    Button bt = new Button(this);
                    bt.setText("Descanso");
                    bt.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));


                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            count(view);
                        }
                    });

                    ll2.addView(tv);
                    ll2.addView(tv2);
                    ll2.addView(tv3);
                    ll2.addView(tv4);
                    ll2.addView(bt);



                    ll.addView(ll2);
                    llexercicios.addView(ll);

                }

            }


        }

    }


    /*
    private LinearLayout getViewExercicio(Exercicio ex) {
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.HORIZONTAL);
        ll.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        ImageView iv = new ImageView(this);
        iv.setImageResource(ex.getImagem());

        ll.addView(iv);
    }
    */

    public void count (final View v) {

        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                ((Button) v).setText("" + millisUntilFinished / 1000);
                //here you can have your logic to set text to edittext
                ((Button) v).setEnabled(false);
            }

            public void onFinish() {
                ((Button) v).setText("Descanso");
                ((Button) v).setEnabled(true);
            }

        }.start();


    }
}
