package atp31.model;

import java.util.Random;

/**
 * Estrutura basica de classes com id
 */
public abstract class Base {
    private int id;

    public Base() {
        this.id = geraID();
    }

    private int geraID() {
        Random gerador = new Random();
        return gerador.nextInt(1000);
    }

    public int getId() {
        return id;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Base) {
            Base outro = (Base) obj;
            return outro.id == this.id;
        }
        return false;
    }
}
