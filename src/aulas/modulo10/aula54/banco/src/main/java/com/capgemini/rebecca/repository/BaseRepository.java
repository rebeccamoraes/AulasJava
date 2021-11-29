package com.capgemini.rebecca.repository;

import javax.persistence.EntityManager;

public abstract class BaseRepository<T> {
    private EntityManager entityManager;

    public BaseRepository() {
        this.entityManager = new ConnectionFactory().getConnection();
    }

    public void create(T model) {
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(model);
        this.entityManager.getTransaction().commit();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void update(T model) {
        this.getEntityManager().getTransaction().begin();
        this.getEntityManager().merge(model);
        this.getEntityManager().getTransaction().commit();
    }
}
