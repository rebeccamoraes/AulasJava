package com.capgemini.rebecca.aula58.filmes.api;

import java.util.List;

import com.capgemini.rebecca.aula58.filmes.model.Genero;
import com.capgemini.rebecca.aula58.filmes.repository.GeneroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/genero")
public class GeneroAPI {
    @Autowired
    private GeneroRepository repository;

    @GetMapping
    public List<Genero> list() {
        return (List<Genero>) this.repository.findAll();
    }

    @PostMapping
    public String create(@RequestBody Genero entity) {
        this.repository.save(entity);
        return "Salvo com sucesso.";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id, @RequestBody Genero entity) {
        entity.setId(id);
        this.repository.save(entity);
        return "Alterado com sucesso";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        this.repository.deleteById(id);
        return "Deletado com sucesso.";
    }
}
