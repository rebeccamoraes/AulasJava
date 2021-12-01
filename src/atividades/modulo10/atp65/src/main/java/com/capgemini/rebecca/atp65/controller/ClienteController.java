package com.capgemini.rebecca.atp65.controller;

import java.util.List;

import com.capgemini.rebecca.atp65.model.Cliente;
import com.capgemini.rebecca.atp65.repository.ClienteRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClienteController {
    private ClienteRepository repository;

    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/cliente/cadastrar")
    public String cadastrar(Model req) {
        Cliente cliente = new Cliente();
        req.addAttribute("cliente", cliente);
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

    @GetMapping("/cliente/editar/{id}")
    public String editar(@PathVariable int id, Model req) {
        Cliente cliente = this.repository.findById(id).get();
        req.addAttribute("cliente", cliente);
        return "cliente-form";
    }

    @GetMapping("/cliente/excluir/{id}")
    public String deletar(@PathVariable int id) {
        this.repository.deleteById(id);
        return "redirect:/cliente/listar";
    }
}
