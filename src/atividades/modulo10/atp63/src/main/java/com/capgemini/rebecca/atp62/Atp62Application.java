package com.capgemini.rebecca.atp62;

import com.capgemini.rebecca.atp62.model.Agencia;
import com.capgemini.rebecca.atp62.repository.AgenciaRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Atp62Application implements CommandLineRunner {
	AgenciaRepository repository;

	public Atp62Application(AgenciaRepository repository) {
		this.repository = repository;
	}
	public static void main(String[] args) {
		SpringApplication.run(Atp62Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Agencia entity = new Agencia();
		entity.setNome("Norte");
		entity.setNumero(7654);
		
		repository.save(entity);

		repository.findAll().forEach(agencia->System.out.println(agencia));

		entity.setId(6);
		entity.setNumero(1111);
		repository.save(entity);

		repository.findAll().forEach(agencia->System.out.println(agencia));

		repository.delete(entity);

		repository.findAll().forEach(agencia->System.out.println(agencia));
	}

}
