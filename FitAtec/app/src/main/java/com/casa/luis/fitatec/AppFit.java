package com.casa.luis.fitatec;

import android.app.Application;

import com.casa.luis.fitatec.modelo.Database;
import com.casa.luis.fitatec.modelo.Exercicio;
import com.casa.luis.fitatec.modelo.PlanoPessoal;

import java.util.ArrayList;

/**
 * Created by atecdroid on 7/26/16.
 */
public class AppFit extends Application {
    ArrayList<PlanoPessoal> planosPessoais;
    PlanoPessoal planoEscolhido;
    ArrayList <Exercicio> exercicios;

    public ArrayList<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(ArrayList<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        planosPessoais = Database.loadPlanos();
    }

    public ArrayList<PlanoPessoal> getPlanosPessoais() {
        return planosPessoais;
    }

    public void setPlanosPessoais(ArrayList<PlanoPessoal> planosPessoais) {
        this.planosPessoais = planosPessoais;
    }

    public PlanoPessoal getPlanoEscolhido() {
        return planoEscolhido;
    }

    public void setPlanoEscolhido(PlanoPessoal planoEscolhido) {
        this.planoEscolhido = planoEscolhido;
    }
}
