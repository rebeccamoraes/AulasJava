package com.capgemini.rebecca.atp62.repository;

import com.capgemini.rebecca.atp62.model.Cliente;

import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
    
}
