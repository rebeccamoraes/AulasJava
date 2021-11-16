package atividades.modulo8.atp51.view;

import atividades.modulo8.atp51.dao.CategoriaDAO;
import atividades.modulo8.atp51.model.Categoria;

public class View4Delete {
    public static void main(String[] args) {
        CategoriaDAO dao = new CategoriaDAO();
        Categoria categoria = new Categoria();

        categoria.setId(25);

        int linhas = dao.delete(categoria);
        
        System.out.println("Linhas atualizadas: " + linhas);
    }
}
