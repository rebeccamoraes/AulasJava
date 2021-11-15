package atividades.atp22;

/**
 * 
 * 1. Crie uma classe Tela Banco que contenha um método main.
 * 2. Crie um objeto da classe Conta Corrente, inserindo as informações no construtor;
 * 3. Realize um saque e um depósito;
 * 4. Imprima saldo, taxa saque e codigo de cliente usando toString;
 */

public class TelaBanco {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(2000.00, "1234");

        conta.saque(50.00);
        conta.deposito(100.00);

        System.out.println(conta);
    }
}
