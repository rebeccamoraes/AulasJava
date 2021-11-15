package atividades.atp28.controller;

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

    /**
     * Retorna a lista
     */
    public ArrayList<T> read() {
        return this.lista;
    }

    /**
     * Atualiza atributos de item da lista
     * @param item objeto a ser atualizado
     */
    public void update(T item) {
        if(lista.contains(item)) {
            this.lista.remove(item);
            this.lista.add(item);
        } else {
            System.err.println("Item não encontrado");
        }
    }

    /**
     * Remove item da lista
     * @param item objeto a ser removido
     */
    public void delete(T item) {
        if(lista.contains(item)) {
            this.lista.remove(item);
        } else {
            System.err.println("Item não encontrado");
        }
    }
}
