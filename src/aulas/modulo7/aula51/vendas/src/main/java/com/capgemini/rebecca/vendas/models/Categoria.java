package com.capgemini.rebecca.vendas.models;
public class Categoria {
    private int id;
    private String nome;
    private String descricao;
    
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        String texto = String.format("Categoria\nNome: %s\nDescricao: %s\nId: %d", nome, descricao, id);
        return texto;
    }
}
