package modulo2.aula9;

import java.util.Scanner;

public class a9_1_metodos {
    public static void main(String[] args) {
        cabecalho();
        imprimeMenu();
        escolhaMenu();
    }

    static void cabecalho() {
        System.out.println("======= Calculadora ==========");
    }

    static void imprimeMenu() {
        System.out.println("1- Soma");
        System.out.println("2- Subtração");
        System.out.println("3- Divisão");
        System.out.println("4- Multiplicação");
        System.out.println("5- Sair");
    }

    static void escolhaMenu() {
        int opcao = (int) lerNumero("Digite uma opção do menu: ");
        double resultado = 0, n1 = 0, n2 = 0;

        if (opcao != 5) {
            n1 = lerNumero("Primeiro número: ");
            n2 = lerNumero("Segundo número: ");
        }

        switch (opcao) {
            case 1:
                resultado = soma(n1, n2);
                break;
            case 2:
                resultado = subtracao(n1, n2);
                break;
            case 3:
                resultado = divisao(n1, n2);
                break;
            case 4:
                resultado = multiplicacao(n1, n2);
                break;
            case 5:
                System.out.println("Aplicação finalizada.");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        if (opcao != 5) {
            System.out.printf("O resultado é %.2f.\n", resultado);
        }
    }

    static double lerNumero(String mensagem) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(mensagem);
        double numero = Double.parseDouble(scanner.nextLine());
        scanner.close();
        return numero;
    }

    static double soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        return resultado;
    }

    static double subtracao(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        return resultado;
    }

    static double divisao(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        return resultado;
    }

    static double multiplicacao(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        return resultado;
    }


}
