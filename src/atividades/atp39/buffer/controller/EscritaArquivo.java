package atividades.atp39.buffer.controller;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Escrita de textos em arquivos
 */
public class EscritaArquivo {
    BufferedWriter writer;

    /**
     * Cria instancia de BufferedWriter para o arquivo passado.
     * 
     * @param nomeArquivo String indicando o caminho e nome do arquivo para escrita.
     */
    public EscritaArquivo(String nomeArquivo) {
        try {
            FileOutputStream fos = new FileOutputStream(nomeArquivo);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            this.writer = new BufferedWriter(osw);
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }
    }

    /**
     * Grava o texto passado no arquivo indicado na instanciação
     * 
     * @param texto String a ser gravada no arquivo.
     */
    public void escrever(String texto) {
        try {
            writer.write(texto);
            writer.close();
        } catch (IOException e) {
            System.out.println("Erro na escrita.");
        }
    }
}
