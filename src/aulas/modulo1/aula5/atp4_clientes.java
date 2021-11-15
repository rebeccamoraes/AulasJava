package aulas.modulo1.aula5;

import java.util.Scanner;

/**
 * Atividade Prática 4 - Cadastro de clientes
 * - exibir menu com as opções: cadastrar, listar e sair
 * - utilizar switch-case para o menu
 * - o cadastro deve conter nome, sobrenome, rg e cpf
 * - nome e sobrenome deve ter no mínimo 3 caracteres
 * - rg deve conter no mínimo 4 caracteres e cpf 11 no total
 */
public class atp4_clientes {
    public static void main(String[] args) {
        short opcao, qtd=0;
        String nome = "", sobrenome = "", rg = "", cpf = "";
        boolean campoInvalido = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("*** Cadastro de clientes ***");

        do {
            System.out.println("Escolha uma opção: 1 - Cadastrar; 2 - Listar; 3 - Sair");
            opcao = sc.nextByte();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    do {
                        System.out.println("Nome:");
                        nome = sc.nextLine();

                        campoInvalido = nome.length() < 3;
                        if(campoInvalido) {
                            System.out.println("Valor inválido. Nome precisa ter 3 ou mais caracteres.");
                        }
                    } while (campoInvalido);

                    do {
                        System.out.println("Sobrenome:");
                        sobrenome = sc.nextLine();

                        campoInvalido = sobrenome.length() < 3;

                        if(campoInvalido) {
                            System.out.println("Valor inválido. Sobrenome precisa ter 3 ou mais caracteres.");
                        }
                    } while (campoInvalido);

                    do {
                        System.out.println("RG:");
                        rg = sc.nextLine();

                        campoInvalido = rg.length() < 4;

                        if(campoInvalido) {
                            System.out.println("Valor inválido. RG precisa ter mais de 3 caracteres.");
                        }
                    } while (campoInvalido);

                    do {
                        System.out.println("CPF:");
                        cpf = sc.nextLine();

                        campoInvalido = cpf.length() != 11;

                        if(campoInvalido) {
                            System.out.println("Valor inválido. CPF precisa ter 11 caracteres.");
                        }
                    } while (campoInvalido);

                    System.out.println("Cliente cadastrado com sucesso!");
                    qtd++;
                    break;

                case 2:
                    if (qtd == 0) {
                        System.out.println("Não há clientes cadastrados.");
                    } else {
                        System.out.println("Lista de clientes cadastrados:");
                        System.out.println("Cliente 1");
                        System.out.printf("Nome: %s \nSobrenome: %s \nRG: %s \nCPF: %s", nome, sobrenome, rg, cpf);
                    }
                    break;

                case 3:
                    System.out.println("Aplicação finalizada.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 3);

    }
}
