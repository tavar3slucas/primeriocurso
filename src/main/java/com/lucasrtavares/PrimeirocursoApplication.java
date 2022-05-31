package com.lucasrtavares;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lucasrtavares.domain.Categoria;
import com.lucasrtavares.repositories.CategoriaRepository;

@SpringBootApplication
public class PrimeirocursoApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(PrimeirocursoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		repo.saveAll(Arrays.asList(cat1,cat2));
	}
}
