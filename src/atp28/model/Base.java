package atp28.model;

import java.util.Random;

public abstract class Base {
    private int id;

    public Base() {
        Random geradorID = new Random();
        this.id = geradorID.nextInt(10000);
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Base) {
            Base outro = (Base) obj;
            return this.id == outro.id;
        }
        return false;
    }
}
