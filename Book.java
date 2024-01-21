package com.gj.lms;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "book_table")
public class Book {
    @Id
    private int id;
    @Column(name = "book_name")
    private String name;
    private int page;
    private String author;

    public Book() {
        super();
    }

    public Book(int id, String name, int page, String author) {
        this.id = id;
        this.name = name;
        this.page = page;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
