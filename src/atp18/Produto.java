package atp18;

/**
 * Atividade Prática 18 - Orientação a Objetos
 * 1. Crie uma classe produto com os atributos Código, Nome, Descrição e Valor.
 * 2. Todos os atributos da classe produtos devem ser privados.
 * 3. Construa os métodos get e set para cada um dos atributos.
 */
public class Produto {
    private String codigo;
    private String nome;
    private String descricao;
    private double valor;

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setDescricao(String descricao   ) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }
}
