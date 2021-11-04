package atp39.buffer.controller;

import java.util.Scanner;

public class LeituraTerminal {
    Scanner scanner;
    
    public LeituraTerminal() {
        this.scanner = new Scanner(System.in);
    }
    
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
