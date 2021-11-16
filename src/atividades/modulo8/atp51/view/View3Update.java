package atividades.modulo8.atp51.view;

import atividades.modulo8.atp51.dao.CategoriaDAO;
import atividades.modulo8.atp51.model.Categoria;

public class View3Update {
    public static void main(String[] args) {
        CategoriaDAO dao = new CategoriaDAO();
        Categoria categoria = new Categoria();

        categoria.setId(24);
        categoria.setNome("Telefonia");
        categoria.setDescricao("Smartphones e celulares antigos.");

        int linhas = dao.update(categoria);
        
        System.out.println("Linhas atualizadas: " + linhas);
    }
}
