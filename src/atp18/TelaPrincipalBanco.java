package atp18;
/**
 * Atividade Prática 18 - Orientação a Objetos
 * 1. Crie uma classe Tela Principal Banco que contenha um método main. Nesta classe: 
 * a) crie um objeto da Conta Corrente
 * b) realize a chamada a todos os métodos set e get, 
 * c)ao final da execução, imprima o valor de todos os atributos da classe.
 */
public class TelaPrincipalBanco {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        conta.setAgencia(1234);
        conta.setNumero(123456);
        conta.setCodigoCliente("111");
        conta.setSaldo(2000);

        System.out.println("---- Conta Corrente ----");
        System.out.printf("Codigo do cliente: %s \nAgencia: %d\n", conta.getCodigoCliente(), conta.getAgencia());
        System.out.printf("Conta Corrente: %d \nSaldo: R$%.2f", conta.getNumero(), conta.getSaldo());
    }    
}
