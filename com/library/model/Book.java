package com.library.model;

import java.util.Date;

public class Book {

    // Book attributes
    private int bookId;
    private String bookName;
    private String authorName;
    private int ISBN;
    private int publicationYear;
    boolean isAvailable;

    private int borrowerId;
    private Date borrowDate;
    private Date returnDate;
    private boolean pendingReturn;

    public Book(int bookId, String title, String author, int ISBN, int publicationYear, boolean isAvailable) {
        this.bookId = bookId;
        this.bookName = title;
        this.authorName = author;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
        this.isAvailable = isAvailable;
    }

    public Book () {}

    public Book (int bookId, int borrowerId, Date borrowDate, Date returnDate, boolean pendingReturn) {
        this.bookId = bookId;
        this.borrowerId = borrowerId;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.pendingReturn = pendingReturn;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return bookName;
    }

    public void setTitle(String title) {
        this.bookName = title;
    }

    public String getAuthor() {
        return authorName;
    }

    public void setAuthor(String author) { this.authorName = author; }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(int borrowerId) {
        this.borrowerId = borrowerId;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isPendingReturn() {
        return pendingReturn;
    }

    public void setPendingReturn(boolean pendingReturn) {
        this.pendingReturn = pendingReturn;
    }
}
