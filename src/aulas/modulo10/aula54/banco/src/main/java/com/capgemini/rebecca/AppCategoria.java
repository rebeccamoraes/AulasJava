package com.capgemini.rebecca;

import com.capgemini.rebecca.repository.CategoriaRepository;
import com.capgemini.rebecca.model.Categoria;

public class AppCategoria 
{
    public static void main( String[] args )
    {
        CategoriaRepository dao = new CategoriaRepository();
        Categoria model = new Categoria();
        
        System.out.println( "Sistema de banco" );
        
        model.setNome("Teste 123");
        model.setDescricao("descricao");
        dao.create(model);
        
        System.out.println("Depois de criar nova categoria.");
        for (Categoria categoria: dao.read()) {
            System.out.printf("ID: %d; Nome: %s; Descrição: %s\n", categoria.getId(), categoria.getNome(), categoria.getDescricao());
        }

        // model.setId(id);
        // model.setNome("Atualizada");
        // model.setDescricao("descricao 2 cxxx");
        // dao.update(model);
        
        // System.out.println("Depois de atualizar categoria.");
        // for (Categoria categoria: dao.read()) {
        //     System.out.printf("ID: %d; Nome: %s; Descrição: %s\n", categoria.getId(), categoria.getNome(), categoria.getDescricao());
        // }

        // dao.delete(id);
        // System.out.println("Depois de excluir categoria.");
        // for (Categoria categoria: dao.read()) {
        //     System.out.printf("ID: %d; Nome: %s; Descrição: %s\n", categoria.getId(), categoria.getNome(), categoria.getDescricao());
        // }
    }
}
