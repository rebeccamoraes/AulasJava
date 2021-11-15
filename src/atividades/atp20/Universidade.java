package atividades.atp20;

/**
 * Atividade Prática 20 - Herança
 * 1. Crie uma classe Universidade, adicione um método main
 * 2. Crie um objeto de Funcionario, um objeto de Coordenador e um objeto de Aluno.
 * 3. Utilize os métodos set dos objetos de Funcionario, Coordenador e Aluno para inserir valores.
 * 4. Imprima todos os dados dos objetos, utilizando seu metodos get, ao final da execução.
 */
public class Universidade {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Coordenador coordenador = new Coordenador();
        Aluno aluno = new Aluno();

        funcionario.setNome("Rodolfo");
        funcionario.setSobrenome("Silva");
        funcionario.setMatricula("11111");
        funcionario.setDepartament("Fundamentos da computação");
        funcionario.setSalario(3000);

        coordenador.setNome("Janaina");
        coordenador.setSobrenome("Magalhães");
        coordenador.setMatricula("22222");
        coordenador.setDepartament("Redes");
        coordenador.setSalario(6000);
        coordenador.setCursoCoordenado("Engenharia de Software");
        coordenador.setBonus(1000);

        aluno.setNome("Cristina");
        aluno.setSobrenome("Cunha");
        aluno.setMatricula("202100123");
        aluno.setTurma("ES2021");
        aluno.setCurso("Engenharia de Software");

        System.out.println("---- Funcionario ----");
        System.out.printf("Nome: %s %s\n", funcionario.getNome(), funcionario.getSobrenome());
        System.out.printf("Matrícula: %s\n", funcionario.getMatricula());
        System.out.printf("Departamento: %s\n", funcionario.getDepartament());
        System.out.printf("Salário: R$%.2f\n", funcionario.getSalario());        

        
        System.out.println("---- Coordenador ----");
        System.out.printf("Nome: %s %s\n", coordenador.getNome(), coordenador.getSobrenome());
        System.out.printf("Matrícula: %s\n", coordenador.getMatricula());
        System.out.printf("Departamento: %s\n", coordenador.getDepartament());
        System.out.printf("Curso coordenado: %s\n", coordenador.getCursoCoordenado());
        System.out.printf("Salário: R$%.2f\n", coordenador.getSalario()); 
        System.out.printf("Bônus: R$%.2f\n", coordenador.getBonus());

        System.out.println("---- Aluno ----");
        System.out.printf("Nome: %s %s\n", aluno.getNome(), aluno.getSobrenome());
        System.out.printf("Matrícula: %s\n", aluno.getMatricula());
        System.out.printf("Turma: %s\n", aluno.getTurma());
        System.out.printf("Curso: %s\n", aluno.getCurso());
    }
}
