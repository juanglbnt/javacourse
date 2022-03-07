package com.juan.library.view;

import com.juan.library.dao.BookDao;
import com.juan.library.model.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

public class MainMenu {


    Scanner scan = new Scanner(System.in);
    Scanner scanString = new Scanner(System.in);

    public void startMenu() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
        BookDao dao = appContext.getBean("bookDao", BookDao.class);
        BookView bookView = appContext.getBean("view", BookView.class);
        int opc;
        int idBook;
        int numberBook;
        String bookName;
        String authorBook;
        int yearBook;
        List<Book> listOfBooks;

        do {
            System.out.println("options: \n1. list all books\n2. search a book" +
                    "\n3. search books for name\n4. register a book\n5. delete a book");
            opc = scan.nextInt();
            switch (opc) {
                case 1:
                    System.out.println(bookView.showAllBooks(dao.getAllBooks()));
                    break;

                case 2:
                    System.out.print("enter the id: ");
                    idBook = scan.nextInt();
                    System.out.println(dao.getBookNameForId(idBook));
                break;

                case 3:
                    System.out.println("enter the name");
                    bookName = scanString.nextLine();
                    System.out.println(bookView.showAllBooks(dao.getBookForName(bookName)));
                    break;

                case 4:
                    System.out.println("enter the id, name, author and year (separated by enter): ");
                    idBook = scan.nextInt();
                    bookName = scanString.nextLine();
                    authorBook = scanString.nextLine();
                    yearBook = scan.nextInt();

                    System.out.println("you will register: " + idBook + ", " + bookName + ", " + authorBook + ", " + yearBook);
                    dao.insertBook(new Book(idBook, bookName, authorBook, yearBook));
                    break;

                case 5:
                    listOfBooks = dao.getAllBooks();
                    System.out.println(bookView.showAllBooks(listOfBooks));
                    System.out.print("select the number of the book delete: ");
                    numberBook = scan.nextInt();

                    try{
                        idBook = listOfBooks.get(numberBook).getId();
                        dao.deleteBook(idBook);
                        System.out.println(listOfBooks.get(idBook).getId() + " DELETED");
                    }catch (IndexOutOfBoundsException e) {
                        System.out.println("invalid selection");
                    }

                    break;

                default:
                    System.out.println("not a valid option");
                    break;
            }
        } while (opc != 0);

    }
}
