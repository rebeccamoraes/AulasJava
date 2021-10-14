package atp23.controller;

import java.util.ArrayList;

import atp23.model.Livro;

public class LivrosController {
    private ArrayList<Livro> livros;

    public LivrosController() {
        this.livros = new ArrayList<Livro>();
    }

    public void create(Livro livro) {
        this.livros.add(livro);
    }

    public ArrayList<Livro> read() {
        return this.livros;
    }

    public void update(Livro livro) {
        if(this.livros.contains(livro)){
            delete(livro);
            create(livro);
        }
    }

    public void delete(Livro livro) {
        this.livros.remove(livro);
    }
}
