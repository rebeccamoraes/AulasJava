package com.capgemini.rebecca.atp68.api;

import java.util.List;

import com.capgemini.rebecca.atp68.model.Cliente;
import com.capgemini.rebecca.atp68.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteAPI {
    @Autowired
    private ClienteRepository repository;

    @PostMapping("/api/cliente")
    public Cliente create(@RequestBody Cliente model) {
        Cliente cliente = this.repository.save(model);
        return cliente;
    }

    @GetMapping("/api/cliente")
    public List<Cliente> read(@RequestParam(required = false) String nome) {
        List<Cliente> clientes;
        if(nome != null) {
            clientes = (List<Cliente>) this.repository.findByNome(nome);
        } else {
            clientes = (List<Cliente>)this.repository.findAll();
        }
        return clientes;
    }

    @PutMapping("/api/cliente/{id}")
    public String update(@PathVariable int id, @RequestBody Cliente model) {
        model.setId(id);
        this.repository.save(model);
        return "Cliente alterado com sucesso.";
    }

    @DeleteMapping("/api/cliente/{id}")
    public String delete(@PathVariable int id) {
        this.repository.deleteById(id);
        return "Cliente excluído com sucesso.";
    }
}
