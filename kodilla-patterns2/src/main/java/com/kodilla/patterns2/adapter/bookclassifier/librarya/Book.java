package com.kodilla.patterns2.adapter.bookclassifier.librarya;

public class Book {
    private final String author;
    private final String title;
    private final int publlicationYear;
    private final String signature;

    public Book(String author, String title, int publlicationYear, String signature) {
        this.author = author;
        this.title = title;
        this.publlicationYear = publlicationYear;
        this.signature = signature;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPubllicationYear() {
        return publlicationYear;
    }

    public String getSignature() {
        return signature;
    }
}
