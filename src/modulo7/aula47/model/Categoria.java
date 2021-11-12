package modulo7.aula47.model;

public class Categoria {
    private int id;
    private String nome;

    public Categoria(int id) {
        this.id = id;
    }    

    public Categoria(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
