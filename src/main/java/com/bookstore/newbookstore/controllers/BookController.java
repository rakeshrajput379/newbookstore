package com.bookstore.newbookstore.controllers;

import com.bookstore.newbookstore.dto.BookDto;
import com.bookstore.newbookstore.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public ResponseEntity<List<BookDto>> getBook() {
        List<BookDto> books = bookService.getBooks();
        return ResponseEntity.ok(books);
    }
}
