package atp26;

/**
 * Atividade Prática 26 - Conversão, sobrescrita e arrays
 * 
 * 1. Crie uma classe Main com um método main, neste método, crie um objeto da classe Pessoa, 
 *    um da classe Aluno e atribua valores para as propriedade de cada objeto.
 * 2. Crie um objeto da classe Dados e chame o metodo para adicionar os objetos de Pessoa e Aluno ao array.
 * 3. Crie um novo objeto para Pessoa e atribua os mesmos dados da pessoa criada anteriormente.
 * 4. Verifique se o segundo objeto de pessoa já está salvo no array,utilizando o método da classe Dados.
 * 5. Remova o aluno do array, utilizando o método da classe Dados.

 */
public class Main {
    public static void main(String[] args) {
        //1. crie um objeto da classe Pessoa, um da classe Aluno e atribua valores para suas propriedades.
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();

        pessoa.nome = "Rebecca";
        pessoa.sobrenome = "Moraes";
        pessoa.idade = 26;

        aluno.nome = "Malcolm";
        aluno.sobrenome = "Acevedo";
        aluno.idade = 4;
        aluno.matricula = "202101234";
        aluno.turma = "D2";
        aluno.curso = "Educação Infantil";

        //2. Crie um objeto da classe Dados e chame o metodo para adicionar os objetos de Pessoa e Aluno ao array.
        Dados lista = new Dados();

        lista.add(pessoa);
        lista.add(aluno);
    }
}
