package atp21;

/**
 * 
 * 1. Crie uma classe Conta Corrente com os atributos privados: 
 *    taxa transferência, taxa manutenção e número de transferências. 
 * 2. Defina um valor padrão para taxa de transferência de R$10.50, 
 *    um valor de R$2.50 para taxa de manutenção e 0 para o número de transferências;
 * 3. A classe Conta Corrente deve herdar da classe Conta.
 * 4. Altere a classe Conta Corrente construindo um método para sobrescrever o método de transfêrencia, 
 *    da classe Conta.
 * 5. O novo método deve utilizar as funções do método principal, além de debitar a taxa de transferência 
 *    do saldo da conta.
 * 6. O método de transferência da Conta Corrente também deve armazenar, no atributo número de transferencias,
 *    a quantidade de transferências realizadas e a cada 5 transferências deve debitar do saldo,
 *    o valor da taxa de manutenção de conta.
 */

public class ContaCorrente extends Conta {
    private double taxaTransferencia = 10.50;
    private double taxaManutencao = 2.50;
    private int numeroTransferencias = 0;

    @Override
    public void transferencia(double valor) {
        super.transferencia(valor + taxaTransferencia);
        this.numeroTransferencias++;

        if (this.numeroTransferencias % 5 == 0) {
            this.setSaldo(this.getSaldo() - taxaManutencao);
        }
    }
}
