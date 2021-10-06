package atp21;

/**
 * Atividade Prática 21 - Herança e sobrescrita de métodos
 * 
 * 1. Crie uma classe Conta que deve possuir os atributos privados: saldo e código do cliente.
 * 2. Crie os métodos set e get para os atributos privados da classe Conta.
 */
public class Conta {
    private double saldo;
    private String codigoCliente;

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }
    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }    
}
