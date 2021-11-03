package modulo2.aula28.view;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class EscritaFileWriter {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("./src/modulo2/aula28/dados/molhos.txt", true);
            fw.write("Verde\n");
            fw.write("Madeira\n");
            fw.write("Carbonara\n");
            fw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        } catch (IOException e) {
            System.out.println("Não foi possível escrever no arquivo");
        }
    }
}
