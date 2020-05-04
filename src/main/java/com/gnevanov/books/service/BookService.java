package com.gnevanov.books.service;

import com.gnevanov.books.model.Book;

import java.util.List;

public interface BookService {
    List<Book> allBooks();
    void add(Book book);
    void delete(Book book);
    void edit(Book book);
    Book getById(int id);
}
