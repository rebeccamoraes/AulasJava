package atp37.model;

public class Prato extends Base {
    private String nome;
    private double valor;

    /**
     * Gera id
     */
    public Prato() {
        super();
    }

    /**
     * Gera id e inicializa atributos nome e valor
     * 
     * @param nome descreve o prato
     * @param valor preço do prato
     */
    public Prato(String nome, double valor) {
        super();
        this.nome = nome;
        this.valor = valor;
    }

    /**
     * Obtém o nome do prato
     * 
     * @return String nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Atualiza o nome do prato
     * 
     * @param nome String novo nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o valor do prato
     * 
     * @return double valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * Atualiza o valor do prato
     * 
     * @param valor double novo valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        String texto = String.format("Prato: %s\nValor: R$%.2f\nId: %d\n", this.nome, this.valor, this.getId());
        return texto;
    }
}
