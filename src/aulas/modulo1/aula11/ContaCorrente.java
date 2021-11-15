package aulas.modulo1.aula11;

public class ContaCorrente {
    private double saldo;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }
}
