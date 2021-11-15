package atividades.atp31.model;

public class Categoria extends Base {
    private String descricao;

    public Categoria() {
        super();
    }
    public Categoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Categoria: " + this.descricao + "\n";
    }
    
}
