package com.capgemini.rebecca.vendas.model;

public class Produto {
    private int id;
	private String nome;
    private String descricao;
    private float preco;
    private int idCategoria;

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
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public int getIdCategoria() {
        return idCategoria;
    }
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public String toString() {
        String format = "Produto: %s (%d)\nDescrição: %s\nPreço: R$ %.2f\nCategoria: %d\n";
        String texto = String.format(format, this.nome, this.id, this.descricao, this.preco, this.idCategoria);
        return texto;
    }
}
