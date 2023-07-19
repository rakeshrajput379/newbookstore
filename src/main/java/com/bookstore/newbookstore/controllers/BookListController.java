package com.bookstore.newbookstore.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookListController {
    @GetMapping("/getBookLists")
    private String getBookLists(){

        return "book list working";
    }
}
