package aulas.modulo1.aula7;

import java.util.Scanner;

/**
 * Atividade Prática 6 - Comando FOR
 */
public class atp6_for {
    public static void main(String[] args) {
        short exercicio = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nEscolha um dos exercícios: ");
            System.out.println("1 - Nome e sobrenome 10x");
            System.out.println("2 - Pares e Primos");
            System.out.println("3 - Juros compostos");
            System.out.println("0 - Sair");
            exercicio = scanner.nextShort();
            scanner.nextLine();

            switch (exercicio) {
                case 1:
                    exercicio1();
                    break;

                case 2:
                    exercicio2();
                    break;

                case 3:
                    exercicio3();
                    break;

                case 0:
                    System.out.println("Aplicação finalizada.");
                    break;

                default:
                    System.out.println("Valor inválido.");
            }
        } while (exercicio != 0);
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

    /**
     * Exercício 2
     * - Imprima todos o números pares até 100 utilizando o laço FOR.
     * - Imprima todos os números primos até 150 utilizando o laço FOR.
     */
    public static void exercicio2() {
        System.out.println("--- Exercicio 2 ---");

        System.out.println("Números pares até 100, usando for.");
        for (int i = 0; i <=100; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d ", i);
            }
        }

        System.out.println("\nNúmeros primos até 150, usando for.");

        for(int i = 2; i <=150; i++) {
            if(primo(i)){
                System.out.printf("%d ", i);
            }
        }

        //Solução alternativa

        /*
            for (int i = 2; i <= 150; i++) {
                boolean primo = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        primo = false;
                        break;
                    }
                }
                if(primo) {
                    System.out.printf("%d ", i);
                }
            }
        */

        System.out.println("\n--- Fim do exercício 2 ---");
    }

    public static boolean primo(int num) {
        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Exercício 3
     * Calcule o retorno total de um investimento de R$ 5.000,00
     * durante 24 meses a uma taxa de juros de 2% ao mês.
     * Utilize o laço FOR para imprimir o valor do retorno mês a mês.
     */
    public static void exercicio3() {
        double investimento = 5000.00, juros = 0.02, retorno = 0;
        int duracao = 24;

        System.out.println("--- Exercício 3 - Juros ---");
        for (int i = 1; i <= duracao; i++) {
            retorno = investimento * juros;
            System.out.printf("Retorno mês %d: %.2f\n", i, retorno);
            investimento += retorno;
        }

        System.out.printf("Investimento + retorno total: %.2f\n", investimento);

        System.out.println("\n--- Fim do exercício 3 ---");

    }
}
