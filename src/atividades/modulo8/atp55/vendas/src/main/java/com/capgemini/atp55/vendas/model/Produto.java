package com.capgemini.atp55.vendas.model;

public class Produto {
    private int id;
    private String nome;
    private float valor;
    private int id_categoria;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public int getIdCategoria() {
        return id_categoria;
    }
    public void setIdCategoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }
    
    @Override
    public String toString() {
        String texto = String.format("Produto\nId: %d\nNome: %s\nValor: %.2f\nCategoria: %d\n", 
        id, nome, valor, id_categoria);
        return texto;
    }
}
