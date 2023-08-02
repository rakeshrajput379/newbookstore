package com.bookstore.newbookstore.services;

import com.bookstore.newbookstore.dto.BookDto;
import com.bookstore.newbookstore.model.Book;
import com.bookstore.newbookstore.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    @InjectMocks
    private BookService bookService;

    @Mock
    private BookRepository bookRepository;

    @Mock
    private ModelMapper modelMapper;

    @Test
    void shouldReturnBookDTOWhenCalledBookServiceAPI(){
        List<Book> books = new ArrayList<>();
        Book book = getBook();
        books.add(book);
        BookDto bookDto = getBookDto();
        when(bookRepository.findAll()).thenReturn(books);
        when(modelMapper.map(book, BookDto.class)).thenReturn(bookDto);
        List<BookDto> bookDtos = bookService.getBooks();
        assertThat(1).isEqualTo(bookDtos.size());
        assertThat(bookDtos.get(0)).isNotNull();


    }

    private Book getBook() {

        return Book.builder().title("test title").description("description").id(UUID.randomUUID()).releaseYear(2020).build();
    }

    private BookDto getBookDto() {

        return BookDto.builder().title("test title").description("description").id(UUID.randomUUID()).releaseYear(2020).build();
    }


}
