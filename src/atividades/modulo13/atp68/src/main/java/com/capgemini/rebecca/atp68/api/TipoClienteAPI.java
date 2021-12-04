package com.capgemini.rebecca.atp68.api;

import java.util.List;

import com.capgemini.rebecca.atp68.model.TipoCliente;
import com.capgemini.rebecca.atp68.repository.TipoClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TipoClienteAPI {
    @Autowired
    TipoClienteRepository repository;
    
    @PostMapping("/api/tipocliente")
    public TipoCliente create(@RequestBody TipoCliente tipoCliente) {
        return this.repository.save(tipoCliente);
    }

    @GetMapping("/api/tipocliente")
    public List<TipoCliente> list() {
        List<TipoCliente> lista = (List<TipoCliente>) this.repository.findAll();
        return lista;
    }

    @PutMapping("/api/tipocliente/{id}")
    public String update(@PathVariable int id, @RequestBody TipoCliente entity) {
        entity.setId(id);
        this.repository.save(entity);
        return "Tipo alterado com sucesso.";
    }

    @DeleteMapping("/api/tipocliente/{id}")
    public String delete(@PathVariable int id) {
        this.repository.deleteById(id);
        return "Tipo deletado com sucesso.";
    }

}
