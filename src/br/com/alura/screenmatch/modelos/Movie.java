package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Movie extends Titulo implements Classificavel {

    private String diretor;

    public Movie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    /*public Movie(String duracao) {
        this.setDuracaoDeMinutos(duracao);
    }*/

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "(" + getAnoDeLancamento() + ")";
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
