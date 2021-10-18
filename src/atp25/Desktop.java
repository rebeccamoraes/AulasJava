package atp25;

/**
 * Atividade Prática 25 - Herança, conversão e sobrescrita
 * 
 * 1. Crie uma classe desktop que herda de computador com os atributos públicos: 
 * tamanho gabinete, monitor externo e fonte.
 */
public class Desktop extends Computador {
    public String tamanhoGabinete;
    public String monitorExterno;
    public String fonte;

    @Override
    public String toString() {
        String texto = super.toString();
        texto += "Tamanho do gabinete: " + this.tamanhoGabinete
              + "\nMonitor externo: " + this.monitorExterno
              + "\nFonte: " + this.fonte + "\n";
        return texto;
    }
}
