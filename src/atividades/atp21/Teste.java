package atividades.atp21;

/**
 * Atividade Prática 21
 * 1. Crie uma classe Teste, adicione um método main, crie um objeto de Conta e um objeto de Conta Corrente.
 * 2. Utilize os métodos set para inserir os valores de saldo e de código de cliente para os dois objetos.
 * 3. Realize uma transferência em cada uma das contas.
 * 4. Imprima os dados de código de cliente, saldo e de saldo após a transferência, para cada objeto
 * 5. Altere a classe Teste, para realizar mais de 5 transferências na Conta Corrente, 
 *    antes de imprimir os resultados.
 */
public class Teste {
    public static void main(String[] args) {
        Conta conta = new Conta();
        ContaCorrente cc = new ContaCorrente();

        conta.setCodigoCliente("1111");
        conta.setSaldo(2000);

        cc.setCodigoCliente("2222");
        cc.setSaldo(4000);

        System.out.println("Saldo antes das transferências");
        System.out.printf("Conta do cliente %s, saldo R$%.2f\n", conta.getCodigoCliente(), conta.getSaldo());
        System.out.printf("Conta Corrente do cliente %s, saldo R$%.2f\n", cc.getCodigoCliente(), cc.getSaldo());

        for (int i = 0; i < 5; i++) {
            conta.transferencia(50);
            cc.transferencia(50);
            System.out.println("Transferência de 500 reais realizada em cada conta.");   
        }

        System.out.println("\nSaldo depois das transferências");
        System.out.printf("Conta do cliente %s, saldo R$%.2f\n", conta.getCodigoCliente(), conta.getSaldo());
        System.out.printf("Conta Corrente do cliente %s, saldo R$%.2f\n", cc.getCodigoCliente(), cc.getSaldo());

    }
    
}
