package atividades.atp17;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        CalculadoraImpostos calculadora = new CalculadoraImpostos();
        double imposto = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            short opcao = menu(scanner);
            double valor = lerDouble("Informe o valor: ", scanner);
            switch(opcao) {
                case 1:
                    System.out.println("---- ISS ----");
                    imposto = calculadora.calculaISS(valor);
                    System.out.printf("O valor do imposto é R$%.2f.\n", imposto);
                    break;

                case 2:
                    System.out.println("---- IOF ----");
                    imposto = calculadora.calculaIOF(valor);
                    System.out.printf("O valor do imposto é R$%.2f.\n", imposto);
                    break;

                case 3:
                    System.out.println("---- IR ----");
                    imposto = calculadora.calculaIR(valor);
                    System.out.printf("O valor do imposto é R$%.2f.\n", imposto);
                    break;

                case 0:
                    System.out.println("Aplicação finalizada.");
                    break;
            }     
        } while(voltarAoMenu(scanner));
        
        scanner.close();
    }
    static double lerDouble(String mensagem, Scanner scanner) {
        double valor = 0;
        
        System.out.print("Informe o valor: ");
        valor = Double.parseDouble(scanner.nextLine());

        return valor;
    }

    
    static short menu(Scanner scanner) {
        short opcao = 0;
        boolean valorInvalido = false;

        do {
            System.out.println("---- Menu ----");
            System.out.println("1. ISS");
            System.out.println("2. IOF");
            System.out.println("3. IR");
            System.out.println("0. Sair");

            System.out.print("\nInforme a opção desejada: ");
            opcao = Short.parseShort(scanner.nextLine());

            valorInvalido = opcao < 0 || opcao > 3;

            if (valorInvalido) {
                System.out.println("Valor inválido.");
            }
        } while (valorInvalido);


        return opcao;
    }

    static boolean voltarAoMenu(Scanner scanner) {
        char resposta = ' ';

        System.out.println("\nDeseja voltar ao menu? (S\\N)");
        resposta = scanner.nextLine().toUpperCase().charAt(0);

        return resposta == 'S';
    }
}
