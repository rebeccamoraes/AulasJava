package com.capgemini.rebecca.repository;

import com.capgemini.rebecca.model.ContaCorrente;

import java.util.List;

public class ContaCorrenteRepository extends BaseRepository<ContaCorrente> {
    public List<ContaCorrente> read() {
        return this.getEntityManager()
            .createQuery("SELECT c FROM ContaCorrente c ORDER BY id ASC", ContaCorrente.class)
            .getResultList();
    }

    public void delete(int id) {
        ContaCorrente model = this.getEntityManager().find(ContaCorrente.class, id);
        if (model != null)
        this.getEntityManager().getTransaction().begin();
        this.getEntityManager().remove(model);
        this.getEntityManager().getTransaction().commit();
    }
}
