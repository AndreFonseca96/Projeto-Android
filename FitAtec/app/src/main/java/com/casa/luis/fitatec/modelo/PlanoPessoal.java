package com.casa.luis.fitatec.modelo;

import java.util.ArrayList;

/**
 * Created by atecdroid on 7/26/16.
 */
public class PlanoPessoal {
    String nome;
    ArrayList<Exercicio> al;

    public PlanoPessoal(String nome, ArrayList<Exercicio> al) {
        al = new ArrayList<Exercicio>();

        this.nome = nome;
        this.al = al;
    }

    public PlanoPessoal() {
        al = new ArrayList<Exercicio>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Exercicio> getAl() {
        return al;
    }

    public void setAl(ArrayList<Exercicio> al) {
        this.al = al;
    }
}

