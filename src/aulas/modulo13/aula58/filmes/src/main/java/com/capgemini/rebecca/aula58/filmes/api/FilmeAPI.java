package com.capgemini.rebecca.aula58.filmes.api;

import java.util.List;

import com.capgemini.rebecca.aula58.filmes.model.Filme;
import com.capgemini.rebecca.aula58.filmes.repository.FilmeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmeAPI {
    @Autowired //substitiu o construtor - injeção de dependência
    FilmeRepository repository;

    @GetMapping("/api/filme")
    public List<Filme> filmes() {
        List<Filme> lista = (List<Filme>)repository.findAll();
        return lista;
    }

    @PostMapping("/api/filme")
    public String salvar(@RequestBody Filme model) {
        repository.save(model);
        return "Salvo com sucesso.";
    }

    @DeleteMapping("/api/filme/{id}")
    public String delete(@PathVariable int id) {
        repository.deleteById(id);
        return "Deletado com sucesso.";
    }

    @PutMapping("/api/filme/{id}")
    public String update(@RequestBody Filme model, @PathVariable int id) {
        if(model.getId() == id) {
            repository.save(model);
            return "Alterado com sucesso.";
        }
        return "Id da url diferente do body.";
    }
}
