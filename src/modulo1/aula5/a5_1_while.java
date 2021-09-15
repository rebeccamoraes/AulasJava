package modulo1.aula5;

import java.util.Scanner;

public class a5_1_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        boolean invalido = false;

         do {
             System.out.println("Digite o nome do produto: ");
             nome = scanner.nextLine();
             if (nome.length() < 5) {
                 System.out.println("O nome deve ter mais que 5 caracteres.");
                 invalido = true;
             } else {
                 invalido = false;
             }

        } while (invalido);
    }
}
