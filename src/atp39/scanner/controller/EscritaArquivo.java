package atp39.scanner.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscritaArquivo {
    private FileWriter writer;
    private String fileName;

    public EscritaArquivo(String nomeArquivo) {
        this.fileName = nomeArquivo;
    }

    public void escrever(String texto) {
        if(this.abreArquivo()) {
            try {
                this.writer.write(texto);
                this.writer.close();
            } catch (IOException e) {
                System.out.println("Erro na escrita.");
            }
        }
    }

    private boolean abreArquivo() {
        try {
            this.writer = new FileWriter(new File(this.fileName), true);
            return true;
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado.");
            return false;
        }
    }
}
