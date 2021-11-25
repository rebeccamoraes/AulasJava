package com.capgemini.rebecca;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.rebecca.dao.CategoriaDao;
import com.capgemini.rebecca.model.Categoria;

public class App 
{
    public static void main( String[] args )
    {
        CategoriaDao dao = new CategoriaDao();
        Categoria model = new Categoria();
        
        System.out.println( "Sistema de banco" );
        
        model.setNome("Teste 123");
        model.setDescricao("descricao");
        int id = dao.create(model);
        
        System.out.println("Depois de criar nova categoria.");
        for (Categoria categoria: dao.read()) {
            System.out.printf("ID: %d; Nome: %s; Descrição: %s\n", categoria.getId(), categoria.getNome(), categoria.getDescricao());
        }

        model.setId(id);
        model.setNome("Atualizada");
        model.setDescricao("descricao 2 cxxx");
        dao.update(model);
        
        System.out.println("Depois de atualizar categoria.");
        for (Categoria categoria: dao.read()) {
            System.out.printf("ID: %d; Nome: %s; Descrição: %s\n", categoria.getId(), categoria.getNome(), categoria.getDescricao());
        }

        dao.delete(id);
        System.out.println("Depois de excluir categoria.");
        for (Categoria categoria: dao.read()) {
            System.out.printf("ID: %d; Nome: %s; Descrição: %s\n", categoria.getId(), categoria.getNome(), categoria.getDescricao());
        }

    }
}
