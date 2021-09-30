package atp16;

public class ContaCorrente {
    private double saldo;
    private CalculadoraTaxas calculadora;

    public ContaCorrente() {
        this.calculadora = new CalculadoraTaxas();
        this.saldo = 0;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        double valorComTaxa = valor + calculadora.calculaTaxaSaque(valor);
        this.saldo -= valorComTaxa;
    }

    public void transfere(double valor, ContaCorrente destino) {
        double valorComTaxa = valor + calculadora.calculaTaxaTransferencia(valor);
        this.saldo -= valorComTaxa;
        destino.deposita(valor);
    }

    public double saldo () {
        return this.saldo;
    }
}
