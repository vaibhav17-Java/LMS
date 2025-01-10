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

    // Add Book
    public void setBookList(Book book) {
        bookList.add(book);
    }

    // Add User
    public void setUserList(User user) {
        userList.add(user);
    }

    // Update Book Details
    public void updateBookDetails(int bookId, Book updateBook) {
        for (Book book : bookList) {
            if (book.getBookId() == bookId) {
                book.setAuthor(updateBook.getAuthor());
                break;
            }
        }
        System.out.println("Book Details Updated");
    }

    // Update User Details
    public void updateUserDetails(int userId, User updateUser) {
        for (User user : userList) {
            if (user.getUserId() == userId) {
                user.setAddress(updateUser.getAddress());
                break;
            }
        }
        System.out.println("User Details Updated");
    }

    // Remove book
    public void removeBook(int bookId) {
        for (Book book : bookList) {
            if (book.getBookId() == bookId) {
                bookList.remove(book);
                break;
            }
        }
        System.out.println("Book Removed - Book ID " + bookId);
    }

    // Remove User
    public void removeUser(int userId) {
        for (User user : userList) {
            if (user.getUserId() == userId) {
                userList.remove(user);
                break;
            }
        }
        System.out.println("User Removed - User ID " + userId);
    }

    // Search Book
    public void searchBook(int bookId) {
        for (Book book : bookList) {
            if (book.getBookId() == bookId) {
                System.out.println("Book ID: " + book.getBookId());
                System.out.println("Book Name: " + book.getTitle());
                break;
            }
        }
    }

    // Borrow Book
    public void bookBorrow(Book bookBorrow) {
        for (Book book : bookList) {
            if (book.getBookId() == bookBorrow.getBookId()) {
                book.setBorrowerId(bookBorrow.getBorrowerId());
                book.setBorrowDate(bookBorrow.getBorrowDate());
                book.setAvailable(false);
                break;
            }
        }
        System.out.println("Book " + bookBorrow.getBookId() + " borrowed by " +bookBorrow.getBorrowerId()+" on " +bookBorrow.getBorrowDate());
        System.out.println();
    }

    // Return Book
    public void returnBook(Book bookReturn) {
        for (Book book : bookList) {
            if (book.getBookId() == bookReturn.getBookId()) {
                book.setAvailable(true);
                book.setBorrowerId(bookReturn.getBorrowerId());
                book.setBorrowDate(bookReturn.getBorrowDate());
                book.setReturnDate(bookReturn.getReturnDate());
                break;
            }
        }
        System.out.println("Book "+bookReturn.getBookId()+" returned by "+bookReturn.getBorrowerId()+" on " +bookReturn.getReturnDate());
        System.out.println();
    }

    public void displayLibraryDetails() {
        System.out.println("Library Name: " + library_name);
        System.out.println("Library Location: " + library_location);
    }

    public void displayAllBooksDetails() {
        for (Book book : bookList) {
            System.out.println("Book ID: " + book.getBookId());
            System.out.println("Book Name: " + book.getTitle());
            System.out.println("Author Name: " + book.getAuthor());
            System.out.println("ISBN Number: " + book.getISBN());
            System.out.println("Publication Year: " + book.getPublicationYear());
        }
    }

    public void displayAvailableBookDetails() {
        for (Book book : bookList) {
            if (book.isAvailable) {
                System.out.println("Book ID: " + book.getBookId());
                System.out.println("Book Name: " + book.getTitle());
                System.out.println("Is Book Available: " + book.isAvailable());
            }
        }
    }

    public void displayBorrowedBookDetails() {
        for (Book book : bookList) {
            if (!book.isAvailable) {
                System.out.println("Book ID: " + book.getBookId());
                System.out.println("Book Name: " + book.getTitle());
                System.out.println("Borrower ID: " + book.getBorrowerId());
                System.out.println("Borrow Date: " + book.getBorrowDate());
                System.out.println("Is Book Available: " + book.isAvailable);
            }
        }
    }

    public void displayUserDetails() {
        for (User user : userList) {
            System.out.println("User ID: " + user.getUserId());
            System.out.println("User Name: " + user.getUserName());
            System.out.println("User Address: " + user.getAddress());
        }
    }
}
