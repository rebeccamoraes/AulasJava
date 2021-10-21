package atp28.controller;

import java.util.ArrayList;

/**
 * Controller genérico com operações CRUD.
 */
public class BaseController<T> {
    ArrayList<T> lista;

    /**
     * Instancia lista
     */
    public BaseController() {
        this.lista = new ArrayList<T>();
    }

    /**
     * Adiciona um item à lista
     * @param item objeto a ser adicionado
     */
    public void create(T item) {
        this.lista.add(item);
    }
}
