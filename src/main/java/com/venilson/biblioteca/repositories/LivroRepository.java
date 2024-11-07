package com.venilson.biblioteca.repositories;

import com.venilson.biblioteca.entities.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
