package atp27.view;

import atp27.controller.FilmesController;
import atp27.controller.SeriesController;
import atp27.model.Filme;
import atp27.model.Serie;

/**
 * Atividade Prática 27 - MVC e Generics
 */
public class Main {
    public static void main(String[] args) {
        testaCrudFilmes();
        testaCrudSeries();
    }

    /**
     * Testando CRUD de filmes
     */
    private static void testaCrudFilmes() {
        FilmesController filmes = new FilmesController();

        Filme filme = new Filme("The flintstones, o filme", 1994);

        // Create
        filmes.create(filme);
        filmes.create(new Filme("Patrulha Canina: O filme", 2021));
        filmes.create(new Filme("Luca", 2021));

        // Read
        System.out.println(filmes.read());

        // Update
        filme.titulo = "Os Flintstones";
        filme.ano = 1995;
        filmes.update(filme);
        System.out.println("\n\nApós o update\n");
        System.out.println(filmes.read());

        // Delete
        filmes.delete(filme);
        System.out.println("\n\nApós o delete\n");
        System.out.println(filmes.read());

    }

    /**
     * Testando CRUD de series
     */
    private static void testaCrudSeries() {
        SeriesController series = new SeriesController();

        Serie serie = new Serie("Grey's anatomy", 17);

        // Create
        series.create(serie);
        series.create(new Serie("Atypical", 4));
        series.create(new Serie("Lupin", 2));
        series.create(new Serie("Bom dia, Verônica", 1));
        series.create(new Serie("Better Call Saul", 5));

        // Read
        System.out.println(series.read());

        // Update
        serie.titulo = "A Anatomia de Grey";
        serie.temporadas = 18;
        series.update(serie);
        System.out.println("\n\nApós o update\n");
        System.out.println(series.read());

        // Delete
        series.delete(serie);
        System.out.println("\n\nApós o delete\n");
        System.out.println(series.read());
    }
}
