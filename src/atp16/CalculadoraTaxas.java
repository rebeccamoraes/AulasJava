package atp16;

/**
 * Atividade Prática 16 - CalculadoraTaxas 
 * Deve possuir dois métodos de cálculo de taxas:
 * 1. Taxa sobre transações bancárias, aplica uma taxa de 0,001% sobre o valor transferido;
 * 2. Taxa de saque de R$1.30 a cada 5 saques realizados.
 */

public class CalculadoraTaxas {
    private double taxaTransferencia = 0.00001;
    private double taxaSaque = 1.3;
    private int limiteSaque = 5;
    private int saquesRealizados = 0;

    public double calculaTaxaTransferencia(double valor) {
        double taxa = valor * taxaTransferencia;
        return taxa;
    }

    public double calculaTaxaSaque(double valor) {
        double taxa = 0;
        this.saquesRealizados ++;
        //cobra a taxa quando o limite de saques gratis é atingido
        if (saquesRealizados % limiteSaque == 0) {
            taxa = taxaSaque;
        }

        return taxa;
    }

    public int getSaquesRealizados() {
        return this.saquesRealizados;
    }
}
