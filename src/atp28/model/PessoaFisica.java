package atp28.model;

public class PessoaFisica extends Base {
    public String nome;
    public String cpf;
    public Endereco endereco;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        String texto = "PessoaFisica \nNome: " + nome + "\nCPF: " + cpf + "\n" + endereco + "\n";
        return texto;
    }
}
