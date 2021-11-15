package atividades.atp30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        Calculadora calculadora = new Calculadora();

        do {
            opcao = menu(scanner);
            
            int num1 = lerInteiro(scanner, "Primeiro número: ");
            int num2 = lerInteiro(scanner, "Segundo número: ");

            switch(opcao) {
                case 1:
                    System.out.printf("%d + %d = %d\n", num1, num2, calculadora.soma(num1, num2));
                    break;

                case 2:
                    System.out.printf("%d - %d = %d\n", num1, num2, calculadora.subtracao(num1, num2));
                    break;

                case 3:
                    System.out.printf("%d * %d = %d\n", num1, num2, calculadora.multiplicacao(num1, num2));
                    break;

                case 4:
                    try {
                        System.out.printf("%d / %d = %.2f\n", num1, num2, calculadora.divisao(num1, num2));
                    } catch (ArithmeticException e) {
                        System.out.println("Erro." + e.getMessage());
                    }
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
            String mensagem = "----- Calculadora -----\n"
                            + "\t1. Soma \n\t2. Subtração \n\t3. Multiplicação \n\t4. Divisão \n\t0. Sair\n"
                            + "\nEscolha uma opção: ";
            
            opcao = lerInteiro(scanner, mensagem);

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

    private static int lerInteiro(Scanner scanner, String mensagem) {
        boolean numeroInvalido = false;
        int numero = 0;
        do {
            try {
                System.out.print(mensagem);
                numero = Integer.parseInt(scanner.nextLine());
                numeroInvalido = false; 
            } catch (NumberFormatException e) {
                System.out.println("Erro. O número precisa ser inteiro.");
                numeroInvalido = true;
            }
        } while (numeroInvalido);
        return numero;
    }
}
