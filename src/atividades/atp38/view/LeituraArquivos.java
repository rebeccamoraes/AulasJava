package atividades.atp38.view;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeituraArquivos {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("./src/atp38/dados/dinossauros.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            while(br.ready()) {
                System.out.println(br.readLine());
            }

            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        } catch (IOException e) {
            System.out.println("Erro na leitura.");
        }
    }
}
