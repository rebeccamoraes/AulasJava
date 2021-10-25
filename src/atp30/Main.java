package atp30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            opcao = menu(scanner);

            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());

            switch(opcao) {
                case 1:
                    //soma(num1, num2);
                    break;

                case 2:
                    //subtracao(num1, num2);
                    break;

                case 3:
                    //multiplicacao(num1, num2);
                    break;

                case 4: 
                    //divisao(num1, num2);
                    break;
            }
        } while (voltarAoMenu(scanner));

        scanner.close();
    }

        /**
     * Exibe o menu e lê uma opção
     * 
     * @param scanner entrada de dados
     * @return opção escolhida
     */
    private static int menu(Scanner scanner) {
        int opcao = 0;
        boolean opcaoInvalida = false;

        do {
            System.out.println("----- Calculadora -----\n");
            System.out.printf("\t1. Soma \n\t2. Subtração \n\t3. Multiplicação \n\t4. Divisão \n\t0. Sair\n");
            System.out.print("\nEscolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            opcaoInvalida = opcao < 0 || opcao > 4;

            if (opcaoInvalida) {
                System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcaoInvalida);

        return opcao;
    }

    private static boolean voltarAoMenu(Scanner scanner) {
        char resposta = ' ';

        System.out.println("\nDeseja voltar ao menu? (S\\N)");
        resposta = scanner.nextLine().toUpperCase().charAt(0);
        System.out.println();

        return resposta == 'S';
    }
}
