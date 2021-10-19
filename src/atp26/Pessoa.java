package atp26;

/**
 * Atividade Prática 26 - 
 * 
 * 1. Crie uma classe Pessoa com os atributos públicos: nome, sobrenome e idade
 * 2. Crie uma sobrescrita do método equals para comparar os dados especificos da classe.
 */
public class Pessoa {
    public String nome;
    public String sobrenome;
    public int idade;

    @Override
    public boolean equals(Object obj) {
        Pessoa pessoa = (Pessoa) obj;

        boolean ehIgual = (this.nome == pessoa.nome 
                        && this.sobrenome == pessoa.sobrenome 
                        && this.idade == pessoa.idade);

        return ehIgual;
    }
}
