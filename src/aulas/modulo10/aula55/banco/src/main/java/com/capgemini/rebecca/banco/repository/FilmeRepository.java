package com.capgemini.rebecca.banco.repository;

import com.capgemini.rebecca.banco.model.Filme;

import org.springframework.data.repository.CrudRepository;

public interface FilmeRepository extends CrudRepository<Filme, Integer> {
    
}
