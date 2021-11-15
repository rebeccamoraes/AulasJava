package atividades.atp31.model;

public class Produto extends Base {
    private String nome;
    private String descricao;
    private double preco;
    private Categoria categoria;
    
    /**
     * Construtor genérico de Produto
     * Gera id e instancia categoria.
     */
    public Produto() {
        super();
        this.categoria = new Categoria();
    }

    /**
     * Construtor completo, com inicialização dos atributos
     * 
     * @param nome 
     * @param descricao
     * @param preco
     * @param categoria
     */
    public Produto(String nome, String descricao, double preco, String categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = new Categoria(categoria);
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria.setDescricao(categoria);;
    }

    @Override
    public String toString() {
        String texto = String.format("---- Produto ---- \nID: %d\nNome: %s\nDescrição: %s\nPreço: R$%.2f\n%s", 
        this.getId(), this.nome, this.descricao, this.preco, this.categoria);

        return texto;
    }
}
