package com.library.util;

import com.library.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagement extends Book {

    List<Book> listOfBooks = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public BookManagement() {}

    public BookManagement(String title, String author, int ISBN, int publicationYear) {
        super(title, author, ISBN, publicationYear);
    }

    @Override
    public void addBook() {
        System.out.println("Provide the below Book Details - ");
        System.out.println("Enter Book Name - ");
        String bookName = scanner.nextLine();
        System.out.println("Enter Author Name - ");
        String authorName = scanner.nextLine();
        System.out.println("Enter ISBN Number - ");
        int isbnNumber = scanner.nextInt();
        System.out.println("Enter Publication Year - ");
        int pubYear = scanner.nextInt();
        Book book = new BookManagement(bookName, authorName, isbnNumber, pubYear);
        listOfBooks.add(book);
    }

    @Override
    public void removeBook() {

    }

    @Override
    public void updateBook() {

    }

    @Override
    public void searchBook() {

    }
}
