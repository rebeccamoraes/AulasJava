package atp39.scanner.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Leitura de arquivos utilizando Scanner
 */
public class LeituraArquivo {
    private Scanner scanner;

    public LeituraArquivo(String nomeArquivo) {
        try {
            this.scanner = new Scanner(new File(nomeArquivo));
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado ou sem permissão para escrita.");
        }
    }

    public String ler() {
        String texto = "";
        while(scanner.hasNextLine()) {
            texto += scanner.nextLine() + "\n";
        }
        return texto;
    }
}
