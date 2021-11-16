package atividades.modulo8.atp51.view;

import atividades.modulo8.atp51.dao.CategoriaDAO;
import atividades.modulo8.atp51.model.Categoria;

public class View2Create {
    public static void main(String[] args) {
        CategoriaDAO dao = new CategoriaDAO();
        Categoria categoria = new Categoria();
        
        categoria.setNome("Smartphones");
        categoria.setDescricao("Celulares inteligentes.");

        categoria.setId(dao.create(categoria));

        System.out.println(categoria);
    }
}
