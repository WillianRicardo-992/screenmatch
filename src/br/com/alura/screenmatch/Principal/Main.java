package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendado;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Interestelar", 2014);
        myMovie.setGenero("Ficção cientifica");
        myMovie.setAnoDeLancamento(2014);
       // myMovie.somaDasAvaliacoes = 8.6;
       // myMovie.totalDeAvaliacoes = 9;

       //myMovie.exibeFichaTécnica();

        myMovie.exibeFichaTécnica();
        myMovie.avalia(9);
        myMovie.avalia(8);
        myMovie.avalia(6);
        myMovie.avalia(4);
        System.out.println("Total de avaliações " + myMovie.getSomaDasAvaliacoes());
        /*System.out.println(myMovie.getTotalDeAvaliacoes());
        System.out.println("Média " + myMovie.pegaMedia());*/

        Serie lost = new Serie("Lost", 2000);
        lost.setGenero("Suspense");
        lost.exibeFichaTécnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoDeMinutos());

        Movie anotherMovie = new Movie("Matrix", 1999);
        anotherMovie.setDuracaoDeMinutos(150);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(myMovie);
        calculadora.inclui(anotherMovie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendado filtro = new FiltroRecomendado();
        filtro.filtra(myMovie);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(320);
        filtro.filtra(episodio);

        var filmedoWillian = new Movie("O Senhor dos Anéis", 2001);
        filmedoWillian.setDuracaoDeMinutos(178);
        filmedoWillian.setGenero("aventura");
        filmedoWillian.avalia(10);

        ArrayList<Movie> Filmes = new ArrayList<>();
        Filmes.add(filmedoWillian);
        Filmes.add(myMovie);
        Filmes.add(anotherMovie);
        System.out.println("Tamanho da lista: " + Filmes.size());
        System.out.println("Primeiro Filme: " + Filmes.get(0).getNome());
        System.out.println("Duração do Primeiro Filme: " + Filmes.get(0).getDuracaoDeMinutos() + " minutos");
        System.out.println("Genero do Filme: " + Filmes.get(0).getGenero());
        System.out.println(Filmes);
        System.out.println("toString do filme: " + Filmes.get(0).toString());


    }
}
