package com.juan.library.view;

import com.juan.library.model.Book;

import java.util.List;

public class BookView {


    public String showAllBooks(List<Book> books) {
        String bookList = "";

        for(int i = 0; i < books.size(); i++) {
            bookList += i +":\n" + "id: [" + books.get(i).getId() + "]\n"
                    + "title: [" + books.get(i).getName() + "]\n"
                    + "author: [" + books.get(i).getAuthor() + "]\n"
                    + "year: [" + books.get(i).getYear() + "]\n"
                    + "--------------------\n";
        }

        return bookList;
    }
}
