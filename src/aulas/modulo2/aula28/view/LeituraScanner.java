package aulas.modulo2.aula28.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeituraScanner {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("./src/modulo2/aula28/dados/molhos.txt"));
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Não foi possível encontrar o arquivo.");
        }
        
    }
}
