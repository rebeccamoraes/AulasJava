package atp25;

/**
 * Atividade Prática 25 - Herança, conversão e sobrescrita
 * 
 * 1. Crie uma classe notebook que herda de computador com os atributos públicos: 
 * bateria, velocidade wifi e versão bluetooth.
 */
public class Notebook extends Computador {
    public String bateria;
    public String velocidadeWifi;
    public String versaoBluetooth;

    @Override
    public String toString() {
        String texto = super.toString();
        texto += "\nBateria: " + this.bateria + "\nVelocidade wifi: " + this.velocidadeWifi
              + "\nVersão bluetooth: " + this.versaoBluetooth + "\n";
        return texto;
    }
}
