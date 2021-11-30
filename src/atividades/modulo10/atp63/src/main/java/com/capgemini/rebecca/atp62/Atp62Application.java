package com.capgemini.rebecca.atp62;

import com.capgemini.rebecca.atp62.model.Cliente;
import com.capgemini.rebecca.atp62.repository.ClienteRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Atp62Application implements CommandLineRunner {
	ClienteRepository repository;

	public Atp62Application(ClienteRepository repository) {
		this.repository = repository;
	}
	public static void main(String[] args) {
		SpringApplication.run(Atp62Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cliente entity = new Cliente();
		entity.setNome("Rebecca Moraes");
		entity.setIdade(26);
		entity.setCpf("123.456.789-10");

		this.repository.save(entity);

		this.repository.findAll().forEach(cliente->System.out.printf("Cliente %d: %s, %d anos, CPF %s\n", 
		cliente.getId(), cliente.getNome(), cliente.getIdade(), cliente.getCpf()));
	}

}
