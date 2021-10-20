package atp27.model;

public class Filme  extends Base {
    public String titulo;
    public int ano;

    public Filme () {
        super();
    }

    public Filme(String titulo, int ano) {
        super();
        this.titulo = titulo;
        this.ano = ano;
    }

    @Override
    public String toString() {
        String texto = "\n---- Filme ----"
                     + "\nTítulo: " + this.titulo
                     + "\nAno: " + this.ano
                     + "\nId: " + this.getId();
        return texto;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Filme) {
            Filme outroFilme = (Filme) obj;
            return this.getId() == outroFilme.getId();
        }
        return false;
    }
}
