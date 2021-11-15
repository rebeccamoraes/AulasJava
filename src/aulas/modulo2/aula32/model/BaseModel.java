package aulas.modulo2.aula32.model;

import java.util.Random;

public class BaseModel {
    public int id;

    public BaseModel() {
        Random gerador = new Random();
        this.id = gerador.nextInt(1000);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof BaseModel) {
            BaseModel outro = (BaseModel)obj;
            return outro.id == this.id;
        }
        return false;
    }
}
