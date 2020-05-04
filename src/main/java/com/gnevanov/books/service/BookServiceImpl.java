package com.gnevanov.books.service;

import com.gnevanov.books.dao.BookDAO;
import com.gnevanov.books.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private BookDAO bookDAO;

    @Autowired
    public void setBookDAO(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Override
    @Transactional
    public List<Book> allBooks() {
        return bookDAO.allBooks();
    }

    @Override
    @Transactional
    public void add(Book book) {
        bookDAO.add(book);
    }

    @Override
    @Transactional
    public void delete(Book book) {
        bookDAO.delete(book);
    }

    @Override
    @Transactional
    public void edit(Book book) {
        bookDAO.edit(book);
    }

    @Override
    @Transactional
    public Book getById(int id) {
        return bookDAO.getById(id);
    }
}
