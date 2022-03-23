package com.juan.bookstore.controller;

import com.juan.bookstore.model.Book;
import com.juan.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("addBook")
    public Book addBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @GetMapping("books")
    public List<Book> getAllBook() {
        return bookService.getAllBooks();
    }

    @GetMapping("/")
    public String listAllBooks(Model model) {
        List<Book> listOfBooks = getAllBook();
        model.addAttribute("title", "list of books");
        model.addAttribute("list", listOfBooks);
        return "home";
    }
}
