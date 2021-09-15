package modulo1.aula4;

import java.util.Scanner;

/**
 * Aula 4 - Atividade Prática 3
 *
 * Cadastro de filmes, séries e documentários, utilizando switch-case.
 *
 * - O cadastro de filmes deve conter nome, descrição, genero e ano de lançamento.
 * _ O cadastro de serie deve conter o nome, ano de lançamento e produtora.
 * _ O cadastro de documentario deve conter o nome, ano de lançamento e tema.
 */
public class Capflix {
    public static void main(String[] args) {
        String nome, descricao, genero, produtora, tema;
        short anoLancamento;
        byte opcao;

        Scanner scanner = new Scanner(System.in);

        System.out.println("CAPFLIX - Filmes, Séries e Documentários");

        System.out.println("Escolha uma das opções de cadastro:\n1 - Filmes \n2 - Séries \n3 - Documentários \n4 - Sair");

        opcao = scanner.nextByte();
        scanner.nextLine();

        switch (opcao){
            case 1:
                System.out.println("\nCadastro de filme");
                System.out.print("Nome: ");
                nome = scanner.nextLine();
                System.out.print("Descrição: ");
                descricao = scanner.nextLine();
                System.out.print("Gênero: ");
                genero = scanner.nextLine();
                System.out.print("Ano de lançamento: ");
                anoLancamento = scanner.nextShort();
                System.out.println("Filme cadastrado com sucesso!");
                break;
            case 2:
                System.out.println("\nCadastro de série");
                System.out.print("Nome: ");
                nome = scanner.nextLine();
                System.out.print("Ano de lançamento: ");
                anoLancamento = scanner.nextShort();
                scanner.nextLine();
                System.out.print("Produtora: ");
                produtora = scanner.nextLine();
                System.out.println("Série cadastrado com sucesso!");
                break;
            case 3:
                System.out.println("\nCadastro de documentário");
                System.out.print("Nome: ");
                nome = scanner.nextLine();
                System.out.print("Ano de lançamento: ");
                anoLancamento = scanner.nextShort();
                scanner.nextLine();
                System.out.print("Tema: ");
                tema = scanner.nextLine();
                System.out.println("Documentário cadastrado com sucesso!");
                break;
            case 4:
                System.out.println("Aplicação finalizada.");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
