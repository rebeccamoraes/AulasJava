package atp19;

/**
 * Atividade Prática 19 - Arrays
 * 1. Crie uma classe Pessoa Física com os atributos código, nome, sobrenome, idade, rg e cpf.
 * 2. Todos os atributos da classe Pessoa Física devem ser privados.
 * 3. Construa os métodos get e set para cada um dos atributos da classe.
 */
public class PessoaFisica {
    private String codigo;
    private String nome;
    private String sobrenome;
    private int idade;
    private String rg;
    private String cpf;

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
}
