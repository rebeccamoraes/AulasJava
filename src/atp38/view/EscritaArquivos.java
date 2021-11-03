package atp38.view;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class EscritaArquivos {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("./src/atp38/dados/dinossauros-herbivoros.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            bw.write("Braquiossauro");
            bw.newLine();
            bw.write("Estegossauro\n");
            bw.write("Triceratops\n");
            bw.close();
        } catch (IOException e) {
            System.out.println("Erro na escrita.");
        }
    }
}
