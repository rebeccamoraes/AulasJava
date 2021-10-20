package atp27.model;

public class Serie {
    public int id;
    public String titulo;
    public int temporadas;

    @Override
    public String toString() {
        String texto = "---- Série ----"
                     + "\nTítulo: " + this.titulo
                     + "\nTemporadas: " + this.temporadas
                     + "\nId: " + this.id;
        return texto;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Serie) {
            Serie outraSerie = (Serie) obj;
            return this.id == outraSerie.id;
        }
        return false;
    }
}
