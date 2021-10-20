package atp26;

/**
 * Atividade Prática 26 - Conversão, sobrescrita e arrays
 * 
 * 1. Crie uma classe Aluno que herda de pessoa e que possua os atributos públicos: matricula, turma e curso
 * 2. Crie uma sobrescrita do método equals para comparar os dados especificos da classe.
 */
public class Aluno extends Pessoa {
    public String matricula;
    public String turma;
    public String curso;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Aluno) {
            Aluno aluno = (Aluno) obj;

            boolean ehIgual = super.equals(obj)
                            && this.matricula == aluno.matricula
                            && this.turma == aluno.turma
                            && this.curso == aluno.curso;
            return ehIgual;
        }
        return false;
    }

    @Override
    public String toString() {
        String texto = super.toString()
                     + "Matrícula: " + this.matricula
                     + "\nTurma: " + this.turma
                     + "\nCurso: " + this.curso + "\n";
        return texto;
    }
}
