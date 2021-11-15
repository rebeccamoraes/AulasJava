package aulas.modulo1.aula4;

import java.util.Scanner;

/**
 * Aula 4 - Atividade Prática 2
 */

public class Cliente {

    public static void main(String[] args) {
        String nome, sobrenome;
        short idade;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        nome = scanner.next();

        System.out.print("Sobrenome: ");
        sobrenome = scanner.next();

        System.out.print("Idade: ");
        idade = scanner.nextShort();

        if (idade < 18) {
            System.out.println("Não foi possível realizar o cadastro. Cliente menor de idade.");
        } else {
            System.out.printf("O cliente %s %s, %d anos, foi cadastrado com sucesso.", nome, sobrenome, idade);
        }


    }
}
