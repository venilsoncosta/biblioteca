package com.venilson.biblioteca.controllers;

import com.venilson.biblioteca.entities.Livro;
import com.venilson.biblioteca.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<Livro> listarLivros(){
        return livroService.listarLivros();
    }

    @GetMapping("{id}")
    public void buscarLivroPorId(@PathVariable Long id){
        livroService.buscarLivroPorId(id);
    }

    @PostMapping
    public void adicionarLivro(Livro livro){
        livroService.adicionarLivro(livro);
    }

    @DeleteMapping("{id}")
    public void deletarLivro(@PathVariable Long id){
        livroService.deletarLivro(id);
    }
}
