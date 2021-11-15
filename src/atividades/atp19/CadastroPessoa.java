package atividades.atp19;

import java.util.Scanner;

/**
 * Atividade Prática 19 - Arrays
 * 1. Crie uma classe Cadastro de Pessoas que contenha um método main.
 * 2. Nesta classe, crie um array de Pessoa com 5 posições.
 * 3. Crie 5 objetos da classe pessoa, chame os método set para atribuir valores diferente para cada pessoa e salve cada objeto em uma posição do array.
 * 4. Imprima todos os dados das 5 pessoas utilizando o laço de repetição foreach.
 */
public class CadastroPessoa {
    public static void main(String[] args) {
        PessoaFisica[] pessoas = new PessoaFisica[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < pessoas.length; i++) {
            System.out.printf("---- Pessoa %d ----", i+1);
            pessoas[i] = new PessoaFisica();

            System.out.print("\nNome: ");
            pessoas[i].setNome(scanner.nextLine());

            System.out.print("Sobrenome: ");
            pessoas[i].setSobrenome(scanner.nextLine());

            System.out.print("Idade: ");
            pessoas[i].setIdade(Integer.parseInt(scanner.nextLine()));

            System.out.print("CPF: ");
            pessoas[i].setCpf(scanner.nextLine());

            System.out.print("RG: ");
            pessoas[i].setRg(scanner.nextLine());

            System.out.print("Codigo: ");
            pessoas[i].setCodigo(scanner.nextLine());
        }

        scanner.close();

    System.out.println("---- Pessoas cadastradas ----");
        for (PessoaFisica pessoa : pessoas) {
            System.out.printf("\n%s %s, %d anos, CPF %s, RG %s, Código %s",
                pessoa.getNome(), pessoa.getSobrenome(), pessoa.getIdade(),
                pessoa.getCpf(), pessoa.getRg(), pessoa.getCodigo());
        }

    }
}
