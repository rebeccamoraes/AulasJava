package atividades.atp18;

/**
 * Atividade Prática 18 - Orientação a Objetos
 * 1. Crie uma classe Conta Corrente com os atributos Agência, Numero, Codigo do Cliente e Saldo.
 * 2. Todos os atributos da classe Conta Corrente devem ser privados.
 * 3. Construa os métodos get e set para cada um dos atributos da classe.
 */
public class ContaCorrente {
    private int agencia;
    private int numero;
    private String codigoCliente;
    private double saldo;

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getAgencia() {
        return this.agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return this.numero;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    public String getCodigoCliente() {
        return this.codigoCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return this.saldo;
    }
}
