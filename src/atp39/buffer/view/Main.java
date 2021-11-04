package atp39.buffer.view;

import atp39.buffer.controller.LeituraTerminal;

public class Main {
    public static void main(String[] args) {
        LeituraTerminal leitor = new LeituraTerminal();
        System.out.println("Digite o texto abaixo, para sair insira q e aperte 'enter':");

        String texto = leitor.ler();
        System.out.println("Texto inserido: \n" + texto);
    }
}
