package com.myproject.library_springapp.controllers;

import com.myproject.library_springapp.repository.AuthorRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class AuthorController {

    public AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model) {

        model.addAttribute("authors", authorRepository.findAll());
        return "authors";
    }
}
