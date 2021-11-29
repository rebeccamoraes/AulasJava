package com.capgemini.rebecca.repository;

import com.capgemini.rebecca.model.Categoria;

import java.util.List;

public class CategoriaRepository extends BaseRepository<Categoria> {
    public List<Categoria> read() {
        return this.getEntityManager()
            .createQuery("SELECT c FROM Categoria c ORDER BY id ASC", Categoria.class)
            .getResultList();
    }

    public void delete(int id) {
        Categoria model = this.getEntityManager().find(Categoria.class, id);
        if (model != null)
        this.getEntityManager().getTransaction().begin();
        this.getEntityManager().remove(model);
        this.getEntityManager().getTransaction().commit();
    }
}
