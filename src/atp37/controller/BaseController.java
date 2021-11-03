package atp37.controller;

import java.util.ArrayList;

/**
 * Controller com CRUD genérico
 */
public abstract class BaseController<T> {
    ArrayList<T> lista;

    /**
     * Instancia lista
     */
    public BaseController() {
        this.lista = new ArrayList<T>();
    }

    /**
     * Adiciona um novo item à lista
     * 
     * @param item objeto a ser adicionado
     */
    public void create(T item) {
        this.lista.add(item);
    }

    /**
     * Obtém a lista de itens
     * 
     * @return lista ArrayList com os itens adicionados
     */
    public ArrayList<T> read() {
        return this.lista;
    }

    /**
     * Atualiza um item da lista
     * 
     * @param item objeto a ser atualizado
     */
    public void update(T item) {
        if(this.lista.contains(item)) {
            delete(item);
            create(item);
        }
    }

    /**
     * Remove um item da lista com base no id
     * 
     * @param item a ser removido
     */
    public void delete(T item) {
        this.lista.remove(item);
    }
}
