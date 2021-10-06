package atp21;

/**
 * 
 * 1. Crie uma classe Conta Corrente com os atributos privados: 
 *    taxa transferência, taxa manutenção e número de transferências. 
 * 2. Defina um valor padrão para taxa de transferência de R$10.50, 
 *    um valor de R$2.50 para taxa de manutenção e 0 para o número de transferências;
 * 3. A classe Conta Corrente deve herdar da classe Conta.
 */

public class ContaCorrente extends Conta {
    private double taxaTransferencia = 10.50;
    private double taxaManutencao = 2.50;
    private int numeroTransferencias = 0;
}
