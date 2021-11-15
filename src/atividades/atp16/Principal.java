package atividades.atp16;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        CalculadoraTaxas calculadora = new CalculadoraTaxas();        
        double taxa = 0, valor = 0;
        short opcao = 0;
        
        Scanner scanner = new Scanner(System.in);

        do {
            opcao = menu(scanner);
            switch(opcao) {
                case 1:
                    System.out.println("---- Transferência ----");
                    valor = lerDouble("Informe o valor: ", scanner);
                    taxa = calculadora.calculaTaxaTransferencia(valor);
                    System.out.printf("Taxa da transferência: R$%.2f\n", taxa);
                    break;
    
                case 2:
                    System.out.println("---- Saque ----");
                    valor = lerDouble("Informe o valor: ", scanner);
                    taxa = calculadora.calculaTaxaSaque(valor);
                    System.out.printf("Taxa do saque: R$%.2f\n", taxa);
                    System.out.printf("Saques realizados: %d", calculadora.getSaquesRealizados());
                    break;
    
                case 0:
                    System.out.println("Aplicação finalizada.");
                    break;
            }       
        } while(voltarAoMenu(scanner));
           
        scanner.close();
    }

    static short menu(Scanner scanner) {
        short opcao = 0;
        boolean valorInvalido = false;

        do {
            System.out.println("---- Menu ----");
            System.out.println("1. Transferência");
            System.out.println("2. Saque");
            System.out.println("0. Sair");

            System.out.print("\nInforme a opção desejada: ");
            opcao = Short.parseShort(scanner.nextLine());

            valorInvalido = opcao < 0 || opcao > 2;

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

    static double lerDouble(String mensagem, Scanner scanner) {
        double valor = 0;
        
        System.out.print("Informe o valor: ");
        valor = Double.parseDouble(scanner.nextLine());

        return valor;
    }
}
