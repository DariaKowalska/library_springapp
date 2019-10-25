package com.myproject.library_springapp.repository;

import com.myproject.library_springapp.model.Author;
import org.springframework.data.repository.CrudRepository;


public interface AuthorRepository extends CrudRepository<Author, Long> {
}
