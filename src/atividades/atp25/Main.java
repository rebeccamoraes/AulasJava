package atividades.atp25;

/**
 * Atividade Prática 25 - Herança, conversão e sobrescrita
 * 
 * 1. Crie uma classe Main com um método main.
 * 2. Crie um objeto da classe Computador, um da classe Notebook, um da classe Desktop 
 *    e atribua valores para as propriedade de cada objeto.
 * 3. Crie um objeto da classe Object através da instância da classe Computador.
 * 4. Crie um objeto da classe Object através da instância da classe Notebook.
 * 5. Crie um objeto da classe Object através da instância da classe Desktop.
 * 6. Converta o primeiro objeto da Object novamente para um novo objeto da classe Computador.
 * 7. Converta o segundo objeto da Object novamente para um novo objeto da classe Notebook.
 * 8. Converta o terceiro objeto da Object novamente para um novo objeto da classe Desktop.
 * 9. Imprima todos dos dados do objeto de Computador convertido através do toString.
 * 10. Imprima todos dos dados do objeto de Notebook convertido através do toString.
 * 11. Imprima todos dos dados do objeto de Desktop convertido através do toString.
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

        //6. Converta o primeiro objeto da Object novamente para um novo objeto da classe Computador.
        Computador pcObj = (Computador) objPC;

        //7. Converta o segundo objeto da Object novamente para um novo objeto da classe Notebook.
        Notebook noteObj = (Notebook) objNote;

        //8. Converta o terceiro objeto da Object novamente para um novo objeto da classe Desktop.
        Desktop deskObj = (Desktop) objDesktop;

        //9. Imprima todos dos dados do objeto de Computador convertido através do toString.
        System.out.printf("\n---- Computador ----\n%s", pcObj);

        //10. Imprima todos dos dados do objeto de Notebook convertido através do toString.
        System.out.printf("\n---- Notebook ----\n%s", noteObj);

        //11. Imprima todos dos dados do objeto de Desktop convertido através do toString.
        System.out.printf("\n---- Desktop ----\n%s", deskObj);
    }
}
