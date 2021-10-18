package atp25;

/**
 * Atividade Prática 25 - Herança, conversão e sobrescrita
 * 
 * 1. Crie uma classe Main com um método main.
 * 2. Crie um objeto da classe Computador, um da classe Notebook, um da classe Desktop 
 *    e atribua valores para as propriedade de cada objeto.
 * 3. Crie um objeto da classe Object através da instância da classe Computador.
 * 4. Crie um objeto da classe Object através da instância da classe Notebook.
 * 5. Crie um objeto da classe Object através da instância da classe Desktop.
 */
public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador();
        Notebook note = new Notebook();
        Desktop desktop = new Desktop();

        pc.discoRigido = "1tb";
        pc.marca = "Positivo";
        pc.memoriaRam = "4gb";
        pc.processador = "i3";

        note.discoRigido = "500gb";
        note.marca = "Lenovo";
        note.memoriaRam = "6gb";
        note.processador = "i5";
        note.bateria = "32Wh";
        note.velocidadeWifi = "800mbps";
        note.versaoBluetooth = "4.0";

        desktop.discoRigido = "2tb";
        desktop.marca = "Dell";
        desktop.memoriaRam = "8gb";
        desktop.processador = "i7";
        desktop.fonte = "220v";
        desktop.tamanhoGabinete = "22\"";

        //3. Crie um objeto da classe Object através da instância da classe Computador.
        Object objPC = pc;
        
        //4. Crie um objeto da classe Object através da instância da classe Notebook.
        Object objNote = note;

        //5. Crie um objeto da classe Object através da instância da classe Desktop.
        Object objDesktop = desktop;

    }
}
