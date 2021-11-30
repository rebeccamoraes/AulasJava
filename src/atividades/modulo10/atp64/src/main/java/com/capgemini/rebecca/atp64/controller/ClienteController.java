package com.capgemini.rebecca.atp64.controller;

import java.util.List;

import com.capgemini.rebecca.atp64.model.Cliente;
import com.capgemini.rebecca.atp64.repository.ClienteRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClienteController {
    private ClienteRepository repository;

    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/cliente/cadastrar")
    public String cadastrar() {
        return "cliente-form";
    }

    @PostMapping("/cliente/cadastrar")
    public String salvar(Cliente model) {
        this.repository.save(model);
        return "redirect:/cliente/listar";
    }

    @GetMapping("/cliente/listar")
    public String listar(Model req) {
        List<Cliente> clientes = (List<Cliente>)this.repository.findAll();
        req.addAttribute("clientes", clientes);
        return "cliente-lista";
    }
}
