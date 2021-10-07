package atp22;

/**
 * Atividade Prática 22 - Sobrecarga, Sobrescrita e Construtores
 * 
 * 1. Crie uma classe Tela com um método main.
 * 2. Crie na classe Tela, 2 objetos da classe Aluno.
 * 3. Chame os métodos setters para inserir valores 
 * 4. Imprima os objetos utilizando o método toString.
 */
public class Tela {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.setNomeCompleto("Cíntia Maria Belém");
        aluno1.setIdade(28);
        aluno1.setMatricula("1111");

        aluno2.setNomeCompleto("Daniela Salvador");
        aluno2.setIdade(27);
        aluno2.setMatricula("2222");

        System.out.println(aluno1);
        System.out.println(aluno2);
        
    }
}
