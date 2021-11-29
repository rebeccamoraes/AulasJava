package com.capgemini.rebecca.repository;

import javax.persistence.EntityManager;

import com.capgemini.rebecca.model.Categoria;

import java.util.List;

public class CategoriaRepository {
    private EntityManager entityManager;

    public CategoriaRepository() {
        this.entityManager = new ConnectionFactory().getConnection();
    }

    public int create(Categoria model) {
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(model);
        this.entityManager.getTransaction().commit();
        return model.getId();
    }

    public List<Categoria> read() {
        return this.entityManager
            .createQuery("SELECT c FROM Categoria c ORDER BY id ASC", Categoria.class)
            .getResultList();
    }

    public void update(Categoria model) {
        this.entityManager.getTransaction().begin();
        this.entityManager.merge(model);
        this.entityManager.getTransaction().commit();
    }

    public void delete(int id) {
        Categoria model = this.entityManager.find(Categoria.class, id);
        if (model != null)
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(model);
        this.entityManager.getTransaction().commit();
    }
}
