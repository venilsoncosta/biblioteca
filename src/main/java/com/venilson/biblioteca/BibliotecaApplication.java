package com.venilson.biblioteca;

import com.venilson.biblioteca.entities.Livro;
import com.venilson.biblioteca.repositories.LivroRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BibliotecaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);
	}

	@Bean
    public CommandLineRunner LoadData(LivroRepository livroRepository){
        return args -> {
            livroRepository.save(
					new Livro(null, "Dias Perfeitos", "Raphael Montes", "Louise", 388));
			livroRepository.save(
					new Livro(null, "Jantar Secreto", "Raphael Montes", "Louise", 276));
			livroRepository.save(
					new Livro(null, "Uma Família Feliz", "Raphael Montes", "Louise", 351));

		};
    }

}
