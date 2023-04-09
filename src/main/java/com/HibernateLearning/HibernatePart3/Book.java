package com.HibernateLearning.HibernatePart3;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
    int book_id;
    String book_name;

    @OneToOne(mappedBy = "book")
    //@ManyToOne
    //@JoinColumn(name = "author_id")
    private Author author;

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
