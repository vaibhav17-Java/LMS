package com.library.model;

public abstract class Book {

    // Book attributes
    private String title;
    private String author;
    private int ISBN;
    private int publicationYear;

    // Methods
    protected abstract void addBook();
    protected abstract void removeBook();
    protected abstract void updateBook();
    protected abstract void searchBook();
    protected abstract void borrowBook();
    protected abstract void returnBook();

    public Book(String title, String author, int ISBN, int publicationYear) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

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

    public void displayBookDetails(Book book) {
        System.out.println("Book Name: " + book.getTitle());
        System.out.println("Author Name: " + book.getAuthor());
        System.out.println("ISBN Number: " + book.getISBN());
        System.out.println("Publication Year: " + book.getPublicationYear());
    }

}
