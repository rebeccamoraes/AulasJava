package atividades.modulo8.atp51.model;

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
    public boolean equals(Object obj) {
        if (obj instanceof Categoria) {
            Categoria outra = (Categoria) obj;
            return this.getId() == outra.getId();
        }
        return false;
    }

    @Override
    public String toString() {
        String texto = String.format("Categoria %s (%d) - %s", this.nome, this.id, this.descricao);
        return texto;
    }
}
