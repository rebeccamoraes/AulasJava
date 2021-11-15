package atividades.atp39.scanner.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Leitura de arquivos utilizando Scanner
 */
public class LeituraArquivo {
    private Scanner scanner;
    private String fileName;

    public LeituraArquivo(String nomeArquivo) {
        this.fileName = nomeArquivo;
    }

    public String ler() {
        String texto = "";

        if(this.abreArquivo()) {
            while(scanner.hasNextLine()) {
                texto += scanner.nextLine() + "\n";
            }
        }
        
        return texto;
    }

    private boolean abreArquivo() {
        try {
            this.scanner = new Scanner(new File(this.fileName));
            return true;
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado ou sem permissão para escrita.");
            return false;
        }
    }
}
