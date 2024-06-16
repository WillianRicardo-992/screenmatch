package br.com.alura.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>  {

    private String nome;
    private String genero;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoDeMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoDeMinutos() {
        return duracaoDeMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoDeMinutos(int duracaoDeMinutos) {
        this.duracaoDeMinutos = duracaoDeMinutos;
    }

    public void exibeFichaTécnica() {
        System.out.println("Nome" + nome);
        System.out.println("Genero " + genero);
        System.out.println("Ano de lançamento " + anoDeLancamento);
        System.out.println("Duração em minutos " + duracaoDeMinutos);
        System.out.println("Avaliação " + somaDasAvaliacoes);
        System.out.println("Total da avaliação " + totalDeAvaliacoes);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}


