package ru.tulin.dao;


import ru.tulin.model.Book;

import java.util.List;

/**
 * @author Viktor Tulin
 * @version 1
 * @since 04.01.2017
 */
public interface BookDao {
    public void addBook(Book book);

    public void updateBook(Book book);

    public void removeBook(int id);

    public Book getBookById(int id);

    public List<Book> listBooks();
}
