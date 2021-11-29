package com.capgemini.rebecca;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.rebecca.model.Categoria;

public class App 
{
    public static void main( String[] args ) {
        Categoria categoria = new Categoria();
        categoria.setNome("Móveis");
        categoria.setDescricao("Artigos em geral");

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("banco");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(categoria);
        entityManager.getTransaction().commit();

        System.out.printf("Categoria cadastrada com sucesso!\n%s", categoria);
    }
}
