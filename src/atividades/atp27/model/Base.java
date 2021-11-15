package atividades.atp27.model;

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
}
