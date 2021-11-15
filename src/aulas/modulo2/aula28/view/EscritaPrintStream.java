package aulas.modulo2.aula28.view;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class EscritaPrintStream {
    public static void main(String[] args) {
        PrintStream ps = null;
        try {
            ps = new PrintStream("./src/modulo2/aula28/dados/molhos.txt");
            ps.println("Sugo");
            ps.println("Branco");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        } finally {
            ps.close();
        }
    }
}
