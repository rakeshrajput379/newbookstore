package com.bookstore.newbookstore.repository;

import com.bookstore.newbookstore.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface BookRepository extends CrudRepository<Book, UUID> {
}
