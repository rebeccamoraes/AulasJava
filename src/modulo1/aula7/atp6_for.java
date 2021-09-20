package modulo1.aula7;

import java.util.Scanner;

/**
 * Atividade Prática 6
 *
 */
public class atp6_for {
    public static void main(String[] args) {
        exercicio1();
    }

    public static void exercicio1() {
        String nome = "", sobrenome = "";
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Exercício 1 ---");

        System.out.print("Nome: ");
        nome = sc.nextLine();

        System.out.print("Sobrenome: ");
        sobrenome = sc.nextLine();

        System.out.println("Escrevendo o nome 10x, usando while.");
        while(contador < 10) {
            System.out.printf("%s %s\n", nome, sobrenome);
            contador++;
        }

        System.out.println("Escrevendo o nome 10x, usando for.");
        for (contador = 0; contador < 10; contador++) {
            System.out.printf("%s %s\n", nome, sobrenome);
        }

        System.out.println("\n--- Fim do exercício 1 ---");
    }
}
