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

    public Livro findById(int id) throws Exception {
        for (int i = 0; i < livros.size(); i++) {
            Livro livro = livros.get(i);

            if(livro.getId() == id) {
                return livro;
            }
        }
        throw new Exception("Livro não encontrado.");
    }
}
