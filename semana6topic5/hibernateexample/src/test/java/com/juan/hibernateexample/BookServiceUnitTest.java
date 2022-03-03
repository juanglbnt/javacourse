package com.juan.hibernateexample;

import com.juan.hibernateexample.models.Book;
import com.juan.hibernateexample.services.BookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions.*;

import java.util.List;

@SpringBootTest
public class BookServiceUnitTest {

    @Autowired
    private BookService bookService;

    @Test
    public void AppCreatesInitialRecords() {
        List<Book> books = bookService.list();
        Assertions.assertEquals(books.size(), 3);

    }
}
