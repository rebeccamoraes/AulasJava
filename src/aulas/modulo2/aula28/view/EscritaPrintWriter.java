package aulas.modulo2.aula28.view;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EscritaPrintWriter {
    public static void main(String[] args) {
        PrintWriter ps = null;
        try {
            ps = new PrintWriter("./src/modulo2/aula28/dados/molhos.txt");
            ps.println("Sugo");
            ps.println("Branco");
            ps.println("Bolonhesa");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        } finally {
            ps.close();
        }
    }
}
