package com.capgemini.rebecca.aula58.filmes.repository;

import com.capgemini.rebecca.aula58.filmes.model.Genero;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface GeneroRepository extends PagingAndSortingRepository<Genero, Integer> {
    
}
