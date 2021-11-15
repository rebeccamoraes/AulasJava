package atividades.atp39.buffer.controller;

import java.util.Scanner;

/**
 * Leitura de dados via terminal
 */
public class LeituraTerminal {
    Scanner scanner;
    
    /**
     * Cria instancia de scanner para ler dados via terminal
     */
    public LeituraTerminal() {
        this.scanner = new Scanner(System.in);
    }
    
    /**
     * Lê dados do terminal e retorna em uma string
     * 
     * @return String com dados lidos via terminal
     */
    public String ler() {
        String texto = "";

        while(scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();

            if(nextLine.equals("q")) {
                return texto;
            } else {
                texto += nextLine + "\n";
            }
        }
        return texto;
    }
}
