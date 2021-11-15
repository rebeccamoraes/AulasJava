package aulas.modulo2.aula32.model;

public class Pessoa extends BaseModel {
    public String nome;
    public String sobrenome;

    public Pessoa(String pessoaString) {
        String[] dados = pessoaString.split(";");
        this.id = Integer.parseInt(dados[0]);
        this.nome = dados[1];
        this.sobrenome = dados[2];
    }

    @Override
    public String toString() {
        String texto = String.format("%s;%s;%s", super.toString(), this.nome, this.sobrenome);
        return texto;
    }
}
