package com.casa.luis.fitatec.modelo;

/**
 * Created by atecdroid on 7/26/16.
 */
    public class Exercicio {
        String nome;
        int peso,repeticoes,series,imagem;

        public Exercicio (String n, int p, int r, int s, int i)
        {
            this.nome = n;
            this.peso = p;
            this.repeticoes = r;
            this.series = s;
            this.imagem = i;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setPeso(int peso) {
            this.peso = peso;
        }

        public void setRepeticoes(int repeticoes) {
            this.repeticoes = repeticoes;
        }

        public void setSeries(int series) {
            this.series = series;
        }

        public void setImagem(int imagem) {
            this.imagem = imagem;
        }

        public String getNome() {
            return nome;
        }

        public int getPeso() {
            return peso;
        }

        public int getRepeticoes() {
            return repeticoes;
        }

        public int getSeries() {
            return series;
        }

        public int getImagem() {
            return imagem;
        }
}

