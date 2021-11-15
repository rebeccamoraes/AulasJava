package atividades.atp19;

import java.util.Scanner;

/**
 * Atividade Prática 19 - Arrays
 * 
 * 1. Crie uma classe Números com um método main.
 * 2. Crie nesta classe um array de números inteiros com 10 posições.
 * 3. Adicione um valor para cada posição do array.
 * 4. Imprima ao final da execução do main, todas as posições do array utilizando o laço de repetição for.
 */
public class Numeros {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Informe o %do número: ", i+1);
            numeros[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Números digitados:");
        for (int numero : numeros) {
            System.out.printf("%d ", numero);            
        }

        scanner.close();
    }
}
