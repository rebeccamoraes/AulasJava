package atividades.atp31.controller;

import java.util.ArrayList;

import atividades.atp31.model.Produto;

/**
 * Controller de produtos, extendido de BaseControler
 */
public class ProdutosController extends BaseController<Produto> {
    /**
     * Busca produto pelo id
     * 
     * @param id inteiro a ser buscado
     * @return produto correspondente ao id.
     * @throws IllegalArgumentException caso o id não seja localizado na lista
     */
    public Produto findById(int id) {
        ArrayList<Produto> lista = this.read();
        
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i) instanceof Produto) {
                Produto item = (Produto) lista.get(i);
                if (item.getId() == id) return item;
            }
        }
        throw new IllegalArgumentException("Id inválido. Não há itens na lista com o Id informado");
    }
}
