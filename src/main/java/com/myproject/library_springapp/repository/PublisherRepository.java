package com.myproject.library_springapp.repository;

import com.myproject.library_springapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
