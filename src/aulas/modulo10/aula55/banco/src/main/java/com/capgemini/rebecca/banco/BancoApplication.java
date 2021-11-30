package com.capgemini.rebecca.banco;

import com.capgemini.rebecca.banco.model.Filme;
import com.capgemini.rebecca.banco.repository.FilmeRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoApplication implements CommandLineRunner {
	private FilmeRepository repository;

	public BancoApplication(FilmeRepository repository) {
		this.repository = repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Filme model = new Filme();

		model.setId(3);
		model.setNome("Soul");
		model.setNomeDiretor("Pete Docter, Kemp Powers");
		model.setGenero("Drama");
		
		repository.save(model);

		// List<Filme> filmes = (List<Filme>)repository.findAll();

		// for (Filme filme : filmes) {
			// 	System.out.printf("%d - %s\n", filme.getId(), filme.getNome());
		// }
			
		System.out.println("\n\nLista de filmes");
		repository.findAll().forEach(filme->System.out.printf("%d - %s\n", filme.getId(), filme.getNome()));
		System.out.println("\n\n");
	}

}
