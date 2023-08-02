package com.bookstore.newbookstore.services;

import com.bookstore.newbookstore.dto.BookDto;
import com.bookstore.newbookstore.model.Book;
import com.bookstore.newbookstore.repository.BookRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final ModelMapper modelMapper;

    public BookService(BookRepository bookRepository,ModelMapper modelMapper){
        this.bookRepository = bookRepository;
        this.modelMapper = modelMapper;
    }

    public List<BookDto> getBooks() {

        Iterable<Book> all = bookRepository.findAll();

        return StreamSupport.stream(all.spliterator(),false).map(book -> modelMapper.map(book, BookDto.class)).collect(Collectors.toList());
    }
}
