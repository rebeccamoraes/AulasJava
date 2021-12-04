package com.capgemini.rebecca.atp68.repository;

import java.util.List;

import com.capgemini.rebecca.atp68.model.Cliente;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClienteRepository extends PagingAndSortingRepository<Cliente, Integer> {
    @Override
    default Iterable<Cliente> findAll() {
        return findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    List<Cliente> findByNome(String nome);
}
