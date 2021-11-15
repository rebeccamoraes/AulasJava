package atividades.atp28.model;

public class PessoaFisica extends Pessoa {
    public String nome;
    public String cpf;

    /**
     * Construtor gerando apenas id
     */
    public PessoaFisica() {
        super();
    }

    /**
     * Construtor gerando id e salvando demais atributos
     * @param nome
     * @param cpf
     * @param endereco
     */
    public PessoaFisica(String nome, String cpf, Endereco endereco) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    /**
     * Retorna os dados de pessoa
     */
    @Override
    public String toString() {
        String texto = "PessoaFisica \nNome: " + nome + "\nCPF: " + cpf + "\n" + endereco + "\n";
        return texto;
    }
}
