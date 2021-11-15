package atividades.atp31.controller;

import java.util.ArrayList;

import atividades.atp31.model.Base;

public class BaseController<T> {
    private ArrayList<T> lista;

    /**
     * Construtor com instanciação do ArrayList.
     */
    public BaseController() {
        this.lista = new ArrayList<T>();
    }

    /**
     * Adiciona um item à lista
     * @param item objeto a ser adicionado.
     */
    public void create(T item) {
        this.lista.add(item);
    }

    /**
     * Retorna a lista
     * @return ArrayList
     */
    public ArrayList<T> read() {
        return this.lista;
    }

    /**
     * Atualiza um item da lista
     * 
     * @param item objeto a ser atualizado
     * @throws IllegalArgumentException caso o item não seja encontrado na lista
     */
    public void update(T item) {
        if(this.lista.contains(item)) {
            delete(item);
            create(item);
        } else {
            String tipo = item.getClass().getName();
            throw new IllegalArgumentException(tipo + " não encontrado. Id inválido.");
        }
    }

    /**
     * Exclui um item da lista
     * 
     * @param item objeto a ser excluído
     * @throws IllegalArgumentException caso o item não seja encontrado na lista
     */
    public void delete(T item) {
        if(this.lista.contains(item)) {
            this.lista.remove(item);
        } else {
            String tipo = item.getClass().getName();
            throw new IllegalArgumentException(tipo + " não encontrado. Id inválido.");
        }
    }

    /**
     * Busca item pelo id
     * 
     * @param id inteiro a ser buscado
     * @return item do tipo Base, correspondente ao id.
     * @throws IllegalArgumentException caso o id não seja localizado na lista
     */
    public Base findById(int id) {
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i) instanceof Base) {
                Base item = (Base) lista.get(i);
                if (item.getId() == id) return item;
            }
        }
        throw new IllegalArgumentException("Id inválido. Não há itens na lista com o Id informado");
    }
}
