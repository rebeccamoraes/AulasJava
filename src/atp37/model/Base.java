package atp37.model;

import java.util.Random;

/**
 * Estrutura basica de classes com id
 */
public abstract class Base {
    private int id;

    /**
     * Construtor com inicialização do id
     */
    public Base() {
        this.id = geraID();
    }

    /**
     * Gera um id
     * 
     * @return id inteiro menor que 1000
     */
    private int geraID() {
        Random gerador = new Random();
        return gerador.nextInt(1000);
    }

    /**
     * Obtém o id
     * 
     * @return id inteiro
     */
    public int getId() {
        return id;
    }
    
    /**
     * Define um novo valor para id
     * @param id novo id inteiro
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Compara dois objetos com base no id
     * 
     * @return true se os ids são iguais ou false caso contrário.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Base) {
            Base outro = (Base) obj;
            return outro.id == this.id;
        }
        return false;
    }
}
