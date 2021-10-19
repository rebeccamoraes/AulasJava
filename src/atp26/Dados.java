package atp26;

/**
 * Atividade Prática 26 - Conversão, sobrescrita e arrays
 * 
 * 1. Crie uma classe Dados com um atributo privado do tipo array de Object.
 * 2. Crie uma inicialização do array para 5 posições dentro do do método construtor da classe.
 */
public class Dados {
    private Object[] lista;

    public Dados() {
        this.lista = new Object[5];
    }
}
