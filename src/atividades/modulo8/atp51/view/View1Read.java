package atividades.modulo8.atp51.view;

import atividades.modulo8.atp51.model.Categoria;
import atividades.modulo8.atp51.dao.CategoriaDAO;

public class View1Read {
    public static void main(String[] args) {
        CategoriaDAO dao = new CategoriaDAO();

        for (Categoria categoria : dao.read()) {
            System.out.println(categoria);
        }
    }
}
