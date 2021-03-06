package com.capgemini.rebecca.aula58.filmes.controller;

import java.util.List;

import com.capgemini.rebecca.aula58.filmes.model.Filme;
import com.capgemini.rebecca.aula58.filmes.repository.FilmeRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FilmeController {
    FilmeRepository repository;

    public FilmeController(FilmeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/filme")
    public String filmes(Model req, String nome) {
        List<Filme> lista;
        if(nome != null) {
            lista = (List<Filme>) this.repository.findByNome(nome);
        } else {
            lista = (List<Filme>) this.repository.findAll();
        }
        req.addAttribute("filmes", lista);
        return "filmes";
    }

    @GetMapping("/filme/form")
    public String formulario(Model req) {
        Filme model = new Filme();
        req.addAttribute("filme", model);
        return "filmes-form";
    }

    @PostMapping("/filme/salvar")
    public String salvar(Filme model) {
        System.out.println(model.getNome());
        repository.save(model);
        return "redirect:/filme";
    }

    @GetMapping("/filme/deletar/{id}")
    public String deletar(@PathVariable int id) {
        repository.deleteById(id);
        return "redirect:/filme";
    }

    @GetMapping("/filme/editar/{id}")
    public String editar(@PathVariable int id, Model req) {
        Filme model = repository.findById(id).get();
        req.addAttribute("filme", model);
        return "/filmes-form";
    }
}
