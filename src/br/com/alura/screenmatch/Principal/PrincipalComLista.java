package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.sql.SQLOutput;
import java.util.*;

public class PrincipalComLista {
    public static void main(String[] args) {

        Movie myMovie = new Movie("Interestelar", 2014);
        myMovie.avalia(10);
        Serie lost = new Serie("Lost", 2000);
        Movie anotherMovie = new Movie("Matrix", 1999);
        anotherMovie.avalia(9.8);
        var filmedoWillian = new Movie("O Senhor dos Anéis", 2001);
        filmedoWillian.avalia(9.9);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmedoWillian);
        lista.add(myMovie);
        lista.add(anotherMovie);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Movie filme && filme.getClassificacao() > 2)
                System.out.println("Classificação " + filme.getClassificacao());

         List<String> buscaPorArtista = new LinkedList<>();
         buscaPorArtista.add("Adam Sandler");
         buscaPorArtista.add("Willian");
         buscaPorArtista.add("Ricardo");

            System.out.println(buscaPorArtista);

            Collections.sort(buscaPorArtista);
            System.out.println(buscaPorArtista);
            System.out.println("Lista de titulo ordenados");
            Collections.sort(lista);
            System.out.println(lista);
            System.out.println("Ordenendo por ano");
            lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
            System.out.println(lista);
        }


    }
}
