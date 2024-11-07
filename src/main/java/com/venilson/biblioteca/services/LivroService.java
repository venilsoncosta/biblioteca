package com.venilson.biblioteca.services;

import com.venilson.biblioteca.entities.Livro;
import com.venilson.biblioteca.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> listarLivros(){
        return livroRepository.findAll();
    }

    public Optional<Livro> buscarLivroPorId(Long id){
        Optional<Livro> livro = livroRepository.findById(id);
        return livro;
    }

    public void adicionarLivro(Livro livro){
        livroRepository.save(livro);
    }

    public void deletarLivro(Long id){
        livroRepository.deleteById(id);
    }

}
