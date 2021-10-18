package atp25;

/**
 * Atividade Prática 25 - Herança, conversão e sobrescrita
 * 1. Crie uma classe computador com atributos públicos: marca, memoria ram, processador e disco rigido.
 */
public class Computador {
    public String marca;
    public String memoriaRam;
    public String processador;
    public String discoRigido;

    @Override
    public String toString() {
        String texto = "Marca: " + this.marca + "\nMemoria RAM: " + this.memoriaRam
                     + "\nProcessador: " + this.processador + "\nDisco rígido: " + this.discoRigido;
        return texto;
    }
}
