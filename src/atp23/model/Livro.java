package atp23.model;

import java.util.Random;

public class Livro {
    private int id;
    private String titulo;
    private String autores;
    private String editora;

    public Livro() {
        this.id = geraId();
    }

    public Livro(String titulo, String autores, String editora) {
        this.id = geraId();
        this.titulo = titulo;
        this.autores = autores;
        this.editora = editora;
    }

    public int getId() {
        return id;
    }
    public int geraId() {
        Random generator = new Random();
        return generator.nextInt(10000);
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }
    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public boolean equals(Object obj) {
        Livro outroLivro = (Livro) obj;

        boolean ehIgual = this.id == outroLivro.id;

        return ehIgual;
    }

    @Override
    public String toString() {
        String texto =  "Id: " + this.id
                     + "\nTítulo: " + this.titulo
                     + "\nAutores: " + this.autores
                     + "\nEditora: " + this.editora + "\n";
        return texto;
    }
}
