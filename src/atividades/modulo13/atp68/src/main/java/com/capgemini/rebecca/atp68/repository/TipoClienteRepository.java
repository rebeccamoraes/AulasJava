package com.capgemini.rebecca.atp68.repository;

import com.capgemini.rebecca.atp68.model.TipoCliente;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface TipoClienteRepository extends PagingAndSortingRepository<TipoCliente, Integer> {
    
}
