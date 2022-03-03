package com.juan.hibernateexample.services;

import com.juan.hibernateexample.models.Book;
import com.juan.hibernateexample.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> list() {
        return bookRepository.findAll();
    }
}
