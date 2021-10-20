package atp27.model;

public class Filme {
    public int id;
    public String titulo;
    public int ano;

    @Override
    public String toString() {
        String texto = "---- Filme ----"
                     + "\nTítulo: " + this.titulo
                     + "\nAno: " + this.ano
                     + "\nId: " + this.id;
        return texto;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Filme) {
            Filme outroFilme = (Filme) obj;
            return this.id == outroFilme.id;
        }
        return false;
    }
}
