package atividades.atp22;

/**
 * Atividade Prática 22 - Sobrecarga, Sobrescrita e Construtores
 * 
 * 1. Crie uma classe Aluno com os atributos privados nome completo, idade e matricula.
 * 2. Crie os métodos getters e setters para cada atributo da classe Aluno.
 * 3. Crie o método toString na classe Aluno, fazendo um override no método padrão da classe Object.
 */

public class Aluno {
    private String nomeCompleto;
    private int idade;
    private String matricula;

    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        String texto = "Aluno(a): " + this.nomeCompleto 
                     + "\nIdade: " + this.idade
                     + "\nMatrícula: " + this.matricula + "\n";
        return texto;
    }
}
