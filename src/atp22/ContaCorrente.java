package atp22;

/**
 * Atividade Prática 22 - Sobrecarga, Sobrescrita e Construtores
 * 
 * 1. Crie uma classe Conta Corrente com os atributos privados: saldo, taxa saque e codigo de cliente.
 * 2. Crie um método Construtor na classe Conta Corrente que receba o valor do saldo e do código do cliente;
 * 3. Crie um método saque que recebe um valor double e que debita do saldo o valor mais a taxa de saque.
 * 4. Crie um método depósito que recebe um valor double e soma ao valor do saldo.
 * 5. Adicione um valor fixo ao atributo taxa saque;
 * 6. Imprima saldo, taxa saque e codigo de cliente usando toString;
 */
public class ContaCorrente {
    private double saldo;
    private double taxaSaque = 5.00;
    private String codigoCliente;

    public ContaCorrente(double saldo, String codigoCliente) {
        this.saldo = saldo;
        this.codigoCliente = codigoCliente;
    }

    public void saque(double valor) {
        this.saldo -= (valor + this.taxaSaque);
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }
//Imprima saldo, taxa saque e codigo de cliente usando toString;
    @Override
    public String toString() {
        String texto = "Cliente: " + this.codigoCliente + "\n"
                     + "Taxa de saque: R$" + this.taxaSaque + "\n"
                     + "Saldo: R$" + this.saldo + "\n";
        return texto;
    }
}
