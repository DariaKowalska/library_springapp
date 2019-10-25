package com.myproject.library_springapp.repository;

import com.myproject.library_springapp.model.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book, Long> {
}
