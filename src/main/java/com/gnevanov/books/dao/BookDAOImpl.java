package com.gnevanov.books.dao;

import com.gnevanov.books.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAOImpl implements BookDAO{
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Book> allBooks() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Book").list();
    }

    @Override
    public void add(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(book);
    }

    @Override
    public void delete(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(book);
    }

    @Override
    public void edit(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.update(book);
    }

    @Override
    public Book getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Book.class, id);
    }
}
