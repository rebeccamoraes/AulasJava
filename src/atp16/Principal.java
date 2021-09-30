package atp16;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        CalculadoraTaxas calculadora = new CalculadoraTaxas();        
        double taxa = 0, valor = 0;
        short opcao = 0;

        do {
            opcao = menu();
            switch(opcao) {
                case 1:
                    System.out.println("---- Transferência ----");
                    valor = lerDouble("Informe o valor: ");
                    taxa = calculadora.calculaTaxaTransferencia(valor);
                    System.out.printf("Taxa da transferência: R$%.2f\n", taxa);
                    break;
    
                case 2:
                    System.out.println("---- Saque ----");
                    valor = lerDouble("Informe o valor: ");
                    taxa = calculadora.calculaTaxaSaque(valor);
                    System.out.printf("Taxa do saque: R$%.2f\n", taxa);
                    System.out.printf("Saques realizados: %d", calculadora.getSaquesRealizados());
                    break;
    
                case 0:
                    System.out.println("Aplicação finalizada.");
                    break;
            }       
        } while(voltarAoMenu());
           
        
    }

    static short menu() {
        Scanner scanner = new Scanner(System.in);
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

    static void menuHandler(short opcao) {

        
    }

    static boolean voltarAoMenu() {
        Scanner scanner = new Scanner(System.in);
        char resposta = ' ';

        System.out.println("\nDeseja voltar ao menu? (S\\N)");
        resposta = scanner.nextLine().toUpperCase().charAt(0);

        return resposta == 'S';
    }

    static double lerDouble(String mensagem) {
        Scanner scanner = new Scanner(System.in);
        double valor = 0;
        
        System.out.print("Informe o valor: ");
        valor = Double.parseDouble(scanner.nextLine());

        return valor;
    }
}
