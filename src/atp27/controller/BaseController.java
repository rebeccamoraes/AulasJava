package atp27.controller;

import java.util.ArrayList;

/**
 * CRUD genérico para filmes e séries
 */
public class BaseController<T> {
    private ArrayList<T> lista;

    public BaseController() {
        this.lista = new ArrayList<T>();
    }

    /**
     * Adiciona item à lista
     * @param item objeto a ser adicionado
     */
    public void create(T item) {
        this.lista.add(item);
    }

    /**
     * Retorna a lista dos itens
     */
    public ArrayList<T> read() {
        return this.lista;
    }

    /**
     * Atualiza atributos de item da lista
     * @param item objeto a ser atualizado
     */
    public void update(T item) {
        int index = this.lista.indexOf(item);

        if (index >=0) {
            this.lista.remove(index);
            this.lista.add(item);
        } else {
            System.err.println("Item não encontrado");
        }
    }

    /**
     * Remove um item da lista
     * @param item objeto a ser removido
     */
    public void delete(T item) {
        this.lista.remove(item);
    }
}
