package atp39.scanner.view;

import atp39.scanner.controller.EscritaArquivo;
import atp39.scanner.controller.LeituraArquivo;

public class MainView {
    public static void main(String[] args) {
        String nomeArquivo = "./src/atp39/scanner/dados/frutas.txt";
        LeituraArquivo leitor = new LeituraArquivo(nomeArquivo);
        EscritaArquivo escritor = new EscritaArquivo(nomeArquivo);

        System.out.println("Lista antes de adicionar itens:");
        System.out.println(leitor.ler());
        
        escritor.escrever("\nCereja\nPessego\nAmeixa");

        System.out.println("Lista depois de adicionar itens:");
        System.out.println(leitor.ler());

    }
}
