package com.library.model;

import java.util.ArrayList;
import java.util.List;

public class Library {

    String library_name;
    String library_location;
    List<Book> bookList;
    List<User> userList;

    public Library(String library_name, String library_location) {
        userList = new ArrayList<>();
        bookList = new ArrayList<>();
        this.library_location = library_location;
        this.library_name = library_name;
    }

    public String getLibrary_name() {
        return library_name;
    }

    public void setLibrary_name(String library_name) {
        this.library_name = library_name;
    }

    public String getLibrary_location() {
        return library_location;
    }

    public void setLibrary_location(String library_location) {
        this.library_location = library_location;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(Book book) {
        bookList.add(book);
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(User user) {
        userList.add(user);
    }

    public void displayLibraryDetails() {
        System.out.println("Library Name: " + library_name);
        System.out.println("Library Location: " + library_location);
        for (Book book : bookList) {
            System.out.println("Book Name: " + book.getTitle());
            System.out.println("Author Name: " + book.getAuthor());
            System.out.println("ISBN Number: " + book.getISBN());
            System.out.println("Publication Year: " + book.getPublicationYear());
        }
        for (User user : userList) {
            System.out.println("User ID: " + user.getUserId());
            System.out.println("User Name: " + user.getUserName());
        }
    }
}
