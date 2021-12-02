package com.capgemini.rebecca.aula58.filmes.repository;

import com.capgemini.rebecca.aula58.filmes.model.Serie;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface SerieRepository extends PagingAndSortingRepository<Serie, Integer> {
    
}
