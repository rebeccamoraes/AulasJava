package atividades.atp16;

public class CaixaEletronico {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        System.out.printf("Conta 1 criada. Saldo: R$%.2f\n", conta1.saldo());

        conta1.deposita(1000);
        System.out.printf("Depósito de R$1000,00 realizado na conta 1. Saldo: R$%.2f\n", conta1.saldo());

        ContaCorrente conta2 = new ContaCorrente();
        System.out.printf("Conta 2 criada. Saldo: R$%.2f\n", conta2.saldo());

        conta2.deposita(5000);
        System.out.printf("Depósito de R$5000,00 realizado na conta 2. Saldo: R$%.2f\n", conta2.saldo());

        //Teste transferência
        conta2.transfere(1000.00, conta1);
        System.out.println("Transferência de R$1000,00 realizada da conta 2 para a conta 1");

        System.out.printf("Saldo conta 1: R$%.2f\n", conta1.saldo());
        System.out.printf("Saldo conta 2: R$%.2f\n", conta2.saldo());

        //Teste da taxa de saque a cada 5 saques
        for (int i = 1; i <= 10; i++) {
            conta1.saca(100);
            System.out.printf("%do Saque de R$100,00 realizado na conta 1. Saldo: R$%.2f\n", i, conta1.saldo());
        }

    }
}
