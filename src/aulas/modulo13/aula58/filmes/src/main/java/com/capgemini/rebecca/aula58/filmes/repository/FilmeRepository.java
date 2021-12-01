package com.capgemini.rebecca.aula58.filmes.repository;

import com.capgemini.rebecca.aula58.filmes.model.Filme;

import org.springframework.data.repository.CrudRepository;

public interface FilmeRepository extends CrudRepository<Filme, Integer> {
    
}
