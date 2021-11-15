package aulas.modulo1.aula6;

import java.util.Scanner;

public class a6_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, sobrenome;

        for(int i=0; i<4; i++) {
            System.out.printf("Cadastro %d\n", i+1);

            System.out.print("Nome: ");
            nome = scanner.nextLine();

            System.out.print("Sobrenome: ");
            sobrenome = scanner.nextLine();

            System.out.println("Cadastro realizado com sucesso.");
        }
    }
}
